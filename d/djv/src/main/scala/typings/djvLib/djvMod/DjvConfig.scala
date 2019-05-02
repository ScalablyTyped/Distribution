package typings
package djvLib.djvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DjvConfig extends js.Object {
  /** a handler to use for generating custom error messages */
  var errorHandler: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** an object containing list of formatters to add for environment */
  var formats: js.UndefOr[
    stdLib.Record[java.lang.String, js.Function1[/* repeated */ java.lang.String, java.lang.String]]
  ] = js.undefined
  /**
    * generating object should be considered as inner
    *
    * Default value is `false`/`undefined`. If `true`, then it avoid creating variables in a
    * generated function body, however without proper wrapper function approach will not work.
    */
  var inner: js.UndefOr[scala.Boolean] = js.undefined
  /** defines which version of json-schema draft to use, draft-04 by default */
  var version: js.UndefOr[java.lang.String] = js.undefined
  /** handler to apply for environment version */
  var versionConfigure: js.UndefOr[js.Function1[/* object */ js.Object, scala.Unit]] = js.undefined
}

object DjvConfig {
  @scala.inline
  def apply(
    errorHandler: () => scala.Unit = null,
    formats: stdLib.Record[java.lang.String, js.Function1[/* repeated */ java.lang.String, java.lang.String]] = null,
    inner: js.UndefOr[scala.Boolean] = js.undefined,
    version: java.lang.String = null,
    versionConfigure: /* object */ js.Object => scala.Unit = null
  ): DjvConfig = {
    val __obj = js.Dynamic.literal()
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(js.Any.fromFunction0(errorHandler))
    if (formats != null) __obj.updateDynamic("formats")(formats)
    if (!js.isUndefined(inner)) __obj.updateDynamic("inner")(inner)
    if (version != null) __obj.updateDynamic("version")(version)
    if (versionConfigure != null) __obj.updateDynamic("versionConfigure")(js.Any.fromFunction1(versionConfigure))
    __obj.asInstanceOf[DjvConfig]
  }
}

