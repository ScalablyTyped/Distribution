package typings.expressFileupload.mod

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://github.com/richardgirges/express-fileupload#available-options}
  */
@js.native
trait Options
  extends /* property */ StringDictionary[js.Any] {
  /**
    * Returns a HTTP 413 when the file is bigger than the size limit if `true`.
    * Otherwise, it will add a `truncated = true` to the resulting file structure.
    * @default false
    */
  var abortOnLimit: js.UndefOr[Boolean] = js.native
  /** Automatically creates the directory path specified in `.mv(filePathName)` */
  var createParentPath: js.UndefOr[Boolean] = js.native
  /**
    * Turn on/off upload process logging.
    * Can be useful for troubleshooting.
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * User defined limit handler which will be invoked if the file is bigger than configured limits.
    */
  var limitHandler: js.UndefOr[Boolean | (RequestHandler[ParamsDictionary, _, _, Query])] = js.native
  /**
    * By default, `req.body` and `req.files`
    * are flattened like this: `{'name': 'John', 'hobbies[0]': 'Cinema', 'hobbies[1]': 'Bike'}`
    *
    * When this option is enabled they are parsed in order to be nested like this:
    * `{'name': 'John', 'hobbies': ['Cinema', 'Bike']}`
    */
  var parseNested: js.UndefOr[Boolean] = js.native
  /**
    * Preserves filename extension when using safeFileNames option.
    * If set to `true`, will default to an extension length of 3.
    * If set to `Number`, this will be the max allowable extension length. If an extension is smaller than the extension length, it remains untouched. If the extension is longer, it is shifted.
    */
  var preserveExtension: js.UndefOr[Boolean | Double] = js.native
  /**
    * Response which will be send to client if file size limit exceeded when `abortOnLimit` set to `true`.
    */
  var responseOnLimit: js.UndefOr[String] = js.native
  /**
    * Strips characters from the upload's filename.
    * You can use custom regex to determine what to strip.
    * If set to true, non-alphanumeric characters except dashes and underscores will be stripped.
    * This option is off by default.
    */
  var safeFileNames: js.UndefOr[Boolean | RegExp] = js.native
  /**
    * Path to store temporary files.
    * Used along with the `useTempFiles` option.
    * By default this module uses 'tmp' folder in the current working directory.
    * You can use trailing slash, but it is not necessary.
    */
  var tempFileDir: js.UndefOr[String] = js.native
  /**
    * @default 60000
    */
  var uploadTimeout: js.UndefOr[Double] = js.native
  /**
    * Applies uri decoding to file names if set true.
    * @default false
    */
  var uriDecodeFileNames: js.UndefOr[Boolean] = js.native
  /**
    * By default this module uploads files into RAM.
    * Setting this option to True turns on using temporary files instead of utilising RAM. This avoids memory overflow issues when uploading large files
    * or in case of uploading lots of files at same time.
    */
  var useTempFiles: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAbortOnLimit(value: Boolean): Self = this.set("abortOnLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbortOnLimit: Self = this.set("abortOnLimit", js.undefined)
    @scala.inline
    def setCreateParentPath(value: Boolean): Self = this.set("createParentPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateParentPath: Self = this.set("createParentPath", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setLimitHandlerFunction3(
      value: (/* req */ Request[ParamsDictionary, _, _, Query], /* res */ Response[_], /* next */ NextFunction) => js.Any
    ): Self = this.set("limitHandler", js.Any.fromFunction3(value))
    @scala.inline
    def setLimitHandler(value: Boolean | (RequestHandler[ParamsDictionary, _, _, Query])): Self = this.set("limitHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimitHandler: Self = this.set("limitHandler", js.undefined)
    @scala.inline
    def setParseNested(value: Boolean): Self = this.set("parseNested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParseNested: Self = this.set("parseNested", js.undefined)
    @scala.inline
    def setPreserveExtension(value: Boolean | Double): Self = this.set("preserveExtension", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveExtension: Self = this.set("preserveExtension", js.undefined)
    @scala.inline
    def setResponseOnLimit(value: String): Self = this.set("responseOnLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseOnLimit: Self = this.set("responseOnLimit", js.undefined)
    @scala.inline
    def setSafeFileNames(value: Boolean | RegExp): Self = this.set("safeFileNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafeFileNames: Self = this.set("safeFileNames", js.undefined)
    @scala.inline
    def setTempFileDir(value: String): Self = this.set("tempFileDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTempFileDir: Self = this.set("tempFileDir", js.undefined)
    @scala.inline
    def setUploadTimeout(value: Double): Self = this.set("uploadTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadTimeout: Self = this.set("uploadTimeout", js.undefined)
    @scala.inline
    def setUriDecodeFileNames(value: Boolean): Self = this.set("uriDecodeFileNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUriDecodeFileNames: Self = this.set("uriDecodeFileNames", js.undefined)
    @scala.inline
    def setUseTempFiles(value: Boolean): Self = this.set("useTempFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseTempFiles: Self = this.set("useTempFiles", js.undefined)
  }
  
}

