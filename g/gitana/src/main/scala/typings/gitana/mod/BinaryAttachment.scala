package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "BinaryAttachment")
@js.native
class BinaryAttachment protected () extends AbstractPersistable {
  def this(persistable: js.Any, attachment: js.Any) = this()
  
  def del(): js.Any = js.native
  
  def download(callback: js.Any): js.Any = js.native
  
  def getContentType(): String = js.native
  
  def getDownloadUri(): String = js.native
  
  def getFilename(): String = js.native
  
  def getId(): String = js.native
  
  def getLength(): Double | String = js.native
  
  def getPreviewUri(name: js.Any, config: js.Any): String = js.native
  
  def getUri(): String = js.native
  
  def stream(callback: js.Any): js.Any = js.native
}
/* static members */
@JSImport("gitana", "BinaryAttachment")
@js.native
object BinaryAttachment extends js.Object {
  
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  def implement(args: js.Any*): js.Any = js.native
  
  def valueOf(`type`: js.Any): js.Any = js.native
}
