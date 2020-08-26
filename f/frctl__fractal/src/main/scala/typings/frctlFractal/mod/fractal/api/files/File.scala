package typings.frctlFractal.mod.fractal.api.files

import typings.frctlFractal.frctlFractalBooleans.`true`
import typings.node.Buffer
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends js.Object {
  var base: String = js.native
  val contents: Buffer = js.native
  var cwd: String = js.native
  var dir: String = js.native
  var editorMode: String = js.native
  var editorScope: String = js.native
  var ext: String = js.native
  var githubColor: String = js.native
  var handle: String = js.native
  var id: String = js.native
  val isAsset: js.UndefOr[scala.Nothing] = js.native
  var isBinary: Boolean = js.native
  val isCollection: js.UndefOr[scala.Nothing] = js.native
  val isComponent: js.UndefOr[scala.Nothing] = js.native
  val isDoc: js.UndefOr[scala.Nothing] = js.native
  val isFile: `true` = js.native
  val isImage: Boolean = js.native
  val isVariant: js.UndefOr[scala.Nothing] = js.native
  var lang: String = js.native
  var mime: String = js.native
  var name: String = js.native
  var path: String = js.native
  var relPath: String = js.native
  var stat: Stats | Null = js.native
  def getContent(): js.Promise[String] = js.native
  def getContentSync(): String = js.native
  def getContext(): js.Any = js.native
  def read(): js.Promise[String] = js.native
  def readSync(): String = js.native
  def toVinyl(): typings.vinyl.mod.File = js.native
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
    toVinyl: () => typings.vinyl.mod.File
  ): File = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], editorMode = editorMode.asInstanceOf[js.Any], editorScope = editorScope.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], getContent = js.Any.fromFunction0(getContent), getContentSync = js.Any.fromFunction0(getContentSync), getContext = js.Any.fromFunction0(getContext), githubColor = githubColor.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isBinary = isBinary.asInstanceOf[js.Any], isFile = isFile.asInstanceOf[js.Any], isImage = isImage.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], read = js.Any.fromFunction0(read), readSync = js.Any.fromFunction0(readSync), relPath = relPath.asInstanceOf[js.Any], toVinyl = js.Any.fromFunction0(toVinyl))
    __obj.asInstanceOf[File]
  }
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
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
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def setContents(value: Buffer): Self = this.set("contents", value.asInstanceOf[js.Any])
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditorMode(value: String): Self = this.set("editorMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditorScope(value: String): Self = this.set("editorScope", value.asInstanceOf[js.Any])
    @scala.inline
    def setExt(value: String): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetContent(value: () => js.Promise[String]): Self = this.set("getContent", js.Any.fromFunction0(value))
    @scala.inline
    def setGetContentSync(value: () => String): Self = this.set("getContentSync", js.Any.fromFunction0(value))
    @scala.inline
    def setGetContext(value: () => js.Any): Self = this.set("getContext", js.Any.fromFunction0(value))
    @scala.inline
    def setGithubColor(value: String): Self = this.set("githubColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandle(value: String): Self = this.set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsBinary(value: Boolean): Self = this.set("isBinary", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFile(value: `true`): Self = this.set("isFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsImage(value: Boolean): Self = this.set("isImage", value.asInstanceOf[js.Any])
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def setMime(value: String): Self = this.set("mime", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setRead(value: () => js.Promise[String]): Self = this.set("read", js.Any.fromFunction0(value))
    @scala.inline
    def setReadSync(value: () => String): Self = this.set("readSync", js.Any.fromFunction0(value))
    @scala.inline
    def setRelPath(value: String): Self = this.set("relPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setToVinyl(value: () => typings.vinyl.mod.File): Self = this.set("toVinyl", js.Any.fromFunction0(value))
    @scala.inline
    def setStat(value: Stats): Self = this.set("stat", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatNull: Self = this.set("stat", null)
  }
  
}

