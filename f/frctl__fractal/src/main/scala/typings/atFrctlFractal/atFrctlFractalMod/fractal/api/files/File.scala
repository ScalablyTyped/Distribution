package typings.atFrctlFractal.atFrctlFractalMod.fractal.api.files

import typings.atFrctlFractal.atFrctlFractalNumbers.`true`
import typings.node.Buffer
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var base: String
  val contents: Buffer
  var cwd: String
  var dir: String
  var editorMode: String
  var editorScope: String
  var ext: String
  var githubColor: String
  var handle: String
  var id: String
  val isAsset: js.UndefOr[scala.Nothing] = js.undefined
  var isBinary: Boolean
  val isCollection: js.UndefOr[scala.Nothing] = js.undefined
  val isComponent: js.UndefOr[scala.Nothing] = js.undefined
  val isDoc: js.UndefOr[scala.Nothing] = js.undefined
  val isFile: `true`
  val isImage: Boolean
  val isVariant: js.UndefOr[scala.Nothing] = js.undefined
  var lang: String
  var mime: String
  var name: String
  var path: String
  var relPath: String
  var stat: Stats | Null
  def getContent(): js.Promise[String]
  def getContentSync(): String
  def getContext(): js.Any
  def read(): js.Promise[String]
  def readSync(): String
  def toVinyl(): typings.vinyl.vinylMod.File
}

object File {
  @scala.inline
  def apply(
    base: String,
    contents: Buffer,
    cwd: String,
    dir: String,
    editorMode: String,
    editorScope: String,
    ext: String,
    getContent: () => js.Promise[String],
    getContentSync: () => String,
    getContext: () => js.Any,
    githubColor: String,
    handle: String,
    id: String,
    isBinary: Boolean,
    isFile: `true`,
    isImage: Boolean,
    lang: String,
    mime: String,
    name: String,
    path: String,
    read: () => js.Promise[String],
    readSync: () => String,
    relPath: String,
    toVinyl: () => typings.vinyl.vinylMod.File,
    isAsset: js.UndefOr[scala.Nothing] = js.undefined,
    isCollection: js.UndefOr[scala.Nothing] = js.undefined,
    isComponent: js.UndefOr[scala.Nothing] = js.undefined,
    isDoc: js.UndefOr[scala.Nothing] = js.undefined,
    isVariant: js.UndefOr[scala.Nothing] = js.undefined,
    stat: Stats = null
  ): File = {
    val __obj = js.Dynamic.literal(base = base, contents = contents, cwd = cwd, dir = dir, editorMode = editorMode, editorScope = editorScope, ext = ext, getContent = js.Any.fromFunction0(getContent), getContentSync = js.Any.fromFunction0(getContentSync), getContext = js.Any.fromFunction0(getContext), githubColor = githubColor, handle = handle, id = id, isBinary = isBinary, isFile = isFile, isImage = isImage, lang = lang, mime = mime, name = name, path = path, read = js.Any.fromFunction0(read), readSync = js.Any.fromFunction0(readSync), relPath = relPath, toVinyl = js.Any.fromFunction0(toVinyl))
    if (!js.isUndefined(isAsset)) __obj.updateDynamic("isAsset")(isAsset)
    if (!js.isUndefined(isCollection)) __obj.updateDynamic("isCollection")(isCollection)
    if (!js.isUndefined(isComponent)) __obj.updateDynamic("isComponent")(isComponent)
    if (!js.isUndefined(isDoc)) __obj.updateDynamic("isDoc")(isDoc)
    if (!js.isUndefined(isVariant)) __obj.updateDynamic("isVariant")(isVariant)
    if (stat != null) __obj.updateDynamic("stat")(stat)
    __obj.asInstanceOf[File]
  }
}

