package typings.expressFileupload.mod

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://github.com/richardgirges/express-fileupload#available-options}
  */
trait Options
  extends /* property */ StringDictionary[js.Any] {
  /**
    * Returns a HTTP 413 when the file is bigger than the size limit if `true`.
    * Otherwise, it will add a `truncated = true` to the resulting file structure.
    * @default false
    */
  var abortOnLimit: js.UndefOr[Boolean] = js.undefined
  /** Automatically creates the directory path specified in `.mv(filePathName)` */
  var createParentPath: js.UndefOr[Boolean] = js.undefined
  /**
    * Turn on/off upload process logging.
    * Can be useful for troubleshooting.
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * User defined limit handler which will be invoked if the file is bigger than configured limits.
    */
  var limitHandler: js.UndefOr[Boolean | RequestHandler[ParamsDictionary]] = js.undefined
  /**
    * By default, `req.body` and `req.files`
    * are flattened like this: `{'name': 'John', 'hobbies[0]': 'Cinema', 'hobbies[1]': 'Bike'}`
    *
    * When this option is enabled they are parsed in order to be nested like this:
    * `{'name': 'John', 'hobbies': ['Cinema', 'Bike']}`
    */
  var parseNested: js.UndefOr[Boolean] = js.undefined
  /**
    * Preserves filename extension when using safeFileNames option.
    * If set to `true`, will default to an extension length of 3.
    * If set to `Number`, this will be the max allowable extension length. If an extension is smaller than the extension length, it remains untouched. If the extension is longer, it is shifted.
    */
  var preserveExtension: js.UndefOr[Boolean | Double] = js.undefined
  /**
    * Response which will be send to client if file size limit exceeded when `abortOnLimit` set to `true`.
    */
  var responseOnLimit: js.UndefOr[String] = js.undefined
  /**
    * Strips characters from the upload's filename.
    * You can use custom regex to determine what to strip.
    * If set to true, non-alphanumeric characters except dashes and underscores will be stripped.
    * This option is off by default.
    */
  var safeFileNames: js.UndefOr[Boolean | RegExp] = js.undefined
  /**
    * Path to store temporary files.
    * Used along with the `useTempFiles` option.
    * By default this module uses 'tmp' folder in the current working directory.
    * You can use trailing slash, but it is not necessary.
    */
  var tempFileDir: js.UndefOr[String] = js.undefined
  /**
    * @default 60000
    */
  var uploadTimeout: js.UndefOr[Double] = js.undefined
  /**
    * Applies uri decoding to file names if set true.
    * @default false
    */
  var uriDecodeFileNames: js.UndefOr[Boolean] = js.undefined
  /**
    * By default this module uploads files into RAM.
    * Setting this option to True turns on using temporary files instead of utilising RAM. This avoids memory overflow issues when uploading large files
    * or in case of uploading lots of files at same time.
    */
  var useTempFiles: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    StringDictionary: /* property */ StringDictionary[js.Any] = null,
    abortOnLimit: js.UndefOr[Boolean] = js.undefined,
    createParentPath: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    limitHandler: Boolean | RequestHandler[ParamsDictionary] = null,
    parseNested: js.UndefOr[Boolean] = js.undefined,
    preserveExtension: Boolean | Double = null,
    responseOnLimit: String = null,
    safeFileNames: Boolean | RegExp = null,
    tempFileDir: String = null,
    uploadTimeout: Int | Double = null,
    uriDecodeFileNames: js.UndefOr[Boolean] = js.undefined,
    useTempFiles: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(abortOnLimit)) __obj.updateDynamic("abortOnLimit")(abortOnLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(createParentPath)) __obj.updateDynamic("createParentPath")(createParentPath.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (limitHandler != null) __obj.updateDynamic("limitHandler")(limitHandler.asInstanceOf[js.Any])
    if (!js.isUndefined(parseNested)) __obj.updateDynamic("parseNested")(parseNested.asInstanceOf[js.Any])
    if (preserveExtension != null) __obj.updateDynamic("preserveExtension")(preserveExtension.asInstanceOf[js.Any])
    if (responseOnLimit != null) __obj.updateDynamic("responseOnLimit")(responseOnLimit.asInstanceOf[js.Any])
    if (safeFileNames != null) __obj.updateDynamic("safeFileNames")(safeFileNames.asInstanceOf[js.Any])
    if (tempFileDir != null) __obj.updateDynamic("tempFileDir")(tempFileDir.asInstanceOf[js.Any])
    if (uploadTimeout != null) __obj.updateDynamic("uploadTimeout")(uploadTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(uriDecodeFileNames)) __obj.updateDynamic("uriDecodeFileNames")(uriDecodeFileNames.asInstanceOf[js.Any])
    if (!js.isUndefined(useTempFiles)) __obj.updateDynamic("useTempFiles")(useTempFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

