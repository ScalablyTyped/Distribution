package typings.djv.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DjvConfig extends js.Object {
  /** a handler to use for generating custom error messages */
  var errorHandler: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** an object containing list of formatters to add for environment */
  var formats: js.UndefOr[Record[String, js.Function1[/* repeated */ String, String]]] = js.undefined
  /**
    * generating object should be considered as inner
    *
    * Default value is `false`/`undefined`. If `true`, then it avoid creating variables in a
    * generated function body, however without proper wrapper function approach will not work.
    */
  var inner: js.UndefOr[Boolean] = js.undefined
  /** defines which version of json-schema draft to use, draft-04 by default */
  var version: js.UndefOr[String] = js.undefined
  /** handler to apply for environment version */
  var versionConfigure: js.UndefOr[js.Function1[/* object */ js.Object, Unit]] = js.undefined
}

object DjvConfig {
  @scala.inline
  def apply(
    errorHandler: () => Unit = null,
    formats: Record[String, js.Function1[/* repeated */ String, String]] = null,
    inner: js.UndefOr[Boolean] = js.undefined,
    version: String = null,
    versionConfigure: /* object */ js.Object => Unit = null
  ): DjvConfig = {
    val __obj = js.Dynamic.literal()
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(js.Any.fromFunction0(errorHandler))
    if (formats != null) __obj.updateDynamic("formats")(formats.asInstanceOf[js.Any])
    if (!js.isUndefined(inner)) __obj.updateDynamic("inner")(inner.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (versionConfigure != null) __obj.updateDynamic("versionConfigure")(js.Any.fromFunction1(versionConfigure))
    __obj.asInstanceOf[DjvConfig]
  }
}

