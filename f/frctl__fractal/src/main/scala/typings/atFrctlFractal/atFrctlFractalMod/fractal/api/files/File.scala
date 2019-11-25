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
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], editorMode = editorMode.asInstanceOf[js.Any], editorScope = editorScope.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], getContent = js.Any.fromFunction0(getContent), getContentSync = js.Any.fromFunction0(getContentSync), getContext = js.Any.fromFunction0(getContext), githubColor = githubColor.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isBinary = isBinary.asInstanceOf[js.Any], isFile = isFile.asInstanceOf[js.Any], isImage = isImage.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], read = js.Any.fromFunction0(read), readSync = js.Any.fromFunction0(readSync), relPath = relPath.asInstanceOf[js.Any], toVinyl = js.Any.fromFunction0(toVinyl))
    if (!js.isUndefined(isAsset)) __obj.updateDynamic("isAsset")(isAsset.asInstanceOf[js.Any])
    if (!js.isUndefined(isCollection)) __obj.updateDynamic("isCollection")(isCollection.asInstanceOf[js.Any])
    if (!js.isUndefined(isComponent)) __obj.updateDynamic("isComponent")(isComponent.asInstanceOf[js.Any])
    if (!js.isUndefined(isDoc)) __obj.updateDynamic("isDoc")(isDoc.asInstanceOf[js.Any])
    if (!js.isUndefined(isVariant)) __obj.updateDynamic("isVariant")(isVariant.asInstanceOf[js.Any])
    if (stat != null) __obj.updateDynamic("stat")(stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

