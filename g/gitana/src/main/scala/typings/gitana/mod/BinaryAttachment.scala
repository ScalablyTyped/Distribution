package typings.gitana.mod

import org.scalablytyped.runtime.StObject
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
object BinaryAttachment {
  
  /* static member */
  @JSImport("gitana", "BinaryAttachment.extend")
  @js.native
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "BinaryAttachment.forEach")
  @js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("gitana", "BinaryAttachment.implement")
  @js.native
  def implement(args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "BinaryAttachment.toString")
  @js.native
  def toString_(): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "BinaryAttachment.valueOf")
  @js.native
  def valueOf_(`type`: js.Any): js.Any = js.native
}
