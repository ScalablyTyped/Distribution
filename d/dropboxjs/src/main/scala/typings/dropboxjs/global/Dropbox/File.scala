package typings.dropboxjs.global.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.File")
@js.native
object File extends js.Object {
  @js.native
  class CopyReference ()
    extends typings.dropboxjs.Dropbox.File.CopyReference
  
  @js.native
  class ShareUrl ()
    extends typings.dropboxjs.Dropbox.File.ShareUrl
  
  @js.native
  class Stat ()
    extends typings.dropboxjs.Dropbox.File.Stat
  
  /* static members */
  @js.native
  object CopyReference extends js.Object {
    def parse(refData: String): typings.dropboxjs.Dropbox.File.CopyReference = js.native
    def parse(refData: js.Object): typings.dropboxjs.Dropbox.File.CopyReference = js.native
  }
  
  /* static members */
  @js.native
  object ShareUrl extends js.Object {
    def parse(urlData: String, isDirect: Boolean): typings.dropboxjs.Dropbox.File.ShareUrl = js.native
    def parse(urlData: js.Object, isDirect: Boolean): typings.dropboxjs.Dropbox.File.ShareUrl = js.native
  }
  
  /* static members */
  @js.native
  object Stat extends js.Object {
    def parse(metadata: js.Object): typings.dropboxjs.Dropbox.File.Stat = js.native
  }
  
}

