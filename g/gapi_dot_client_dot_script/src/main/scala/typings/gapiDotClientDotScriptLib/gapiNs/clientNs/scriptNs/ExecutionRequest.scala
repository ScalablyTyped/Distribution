package typings
package gapiDotClientDotScriptLib.gapiNs.clientNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ExecutionRequest extends js.Object {
  /**
               * If `true` and the user is an owner of the script, the script runs at the
               * most recently saved version rather than the version deployed for use with
               * the Execution API. Optional; default is `false`.
               */
  var devMode: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * The name of the function to execute in the given script. The name does not
               * include parentheses or parameters.
               */
  var function: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The parameters to be passed to the function being executed. The object type
               * for each parameter should match the expected type in Apps Script.
               * Parameters cannot be Apps Script-specific object types (such as a
               * `Document` or a `Calendar`); they can only be primitive types such as
               * `string`, `number`, `array`, `object`, or `boolean`. Optional.
               */
  var parameters: js.UndefOr[js.Array[_]] = js.undefined
  /**
               * For Android add-ons only. An ID that represents the user's current session
               * in the Android app for Google Docs or Sheets, included as extra data in the
               * [`Intent`](https://developer.android.com/guide/components/intents-filters.html)
               * that launches the add-on. When an Android add-on is run with a session
               * state, it gains the privileges of a
               * [bound](https://developers.google.com/apps-script/guides/bound) script &mdash;
               * that is, it can access information like the user's current cursor position
               * (in Docs) or selected cell (in Sheets). To retrieve the state, call
               * `Intent.getStringExtra("com.google.android.apps.docs.addons.SessionState")`.
               * Optional.
               */
  var sessionState: js.UndefOr[java.lang.String] = js.undefined
}

