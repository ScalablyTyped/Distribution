package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A default activity for handling intents that match a particular intent
  * filter.
  */
@js.native
trait Schema$PersistentPreferredActivity extends js.Object {
  /**
    * The intent actions to match in the filter. If any actions are included in
    * the filter, then an intent&#39;s action must be one of those values for
    * it to match. If no actions are included, the intent action is ignored.
    */
  var actions: js.UndefOr[js.Array[String]] = js.native
  /**
    * The intent categories to match in the filter. An intent includes the
    * categories that it requires, all of which must be included in the filter
    * in order to match. In other words, adding a category to the filter has no
    * impact on matching unless that category is specified in the intent.
    */
  var categories: js.UndefOr[js.Array[String]] = js.native
  /**
    * The activity that should be the default intent handler. This should be an
    * Android component name, e.g. com.android.enterprise.app/.MainActivity.
    * Alternatively, the value may be the package name of an app, which causes
    * Android Device Policy to choose an appropriate activity from the app to
    * handle the intent.
    */
  var receiverActivity: js.UndefOr[String] = js.native
}

object Schema$PersistentPreferredActivity {
  @scala.inline
  def apply(
    actions: js.Array[String] = null,
    categories: js.Array[String] = null,
    receiverActivity: String = null
  ): Schema$PersistentPreferredActivity = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (receiverActivity != null) __obj.updateDynamic("receiverActivity")(receiverActivity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PersistentPreferredActivity]
  }
}

