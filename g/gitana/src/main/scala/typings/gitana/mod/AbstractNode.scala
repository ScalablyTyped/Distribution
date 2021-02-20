package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "AbstractNode")
@js.native
class AbstractNode protected () extends AbstractRepositoryObject {
  def this(branch: js.Any, `object`: js.Any) = this()
  
  def addFeature(featureId: String, featureConfig: js.Any): js.Any = js.native
  
  def attach(attachmentId: String, contentType: js.Any, data: js.Any, filename: js.Any): NodeAttachment = js.native
  
  def attachment(attachmentId: String): NodeAttachment = js.native
  
  def attachmentDownloadUri(attachmentId: String): String = js.native
  
  def changeQName(qname: js.Any): js.Any = js.native
  
  def changeTypeQName(typeQName: js.Any): js.Any = js.native
  
  def getBranch(): Branch = js.native
  
  def getBranchId(): String = js.native
  
  def getFeature(featureId: String): js.Any = js.native
  def getFeature(featureId: String, callback: js.Any): js.Any = js.native
  
  def getFeatureIds(callback: js.Any): js.Any = js.native
  
  def getPreviewUri(name: js.Any, config: js.Any): String = js.native
  
  def getQName(): String = js.native
  
  def getTypeQName(): String = js.native
  
  def hasFeature(featureId: js.Any, callback: js.Any): js.Any = js.native
  
  def isAssociation(): Boolean = js.native
  
  def isContainer(): Boolean = js.native
  
  def listAttachments(): NodeAttachmentMap = js.native
  def listAttachments(local: js.Any): NodeAttachmentMap = js.native
  
  def refresh(): this.type = js.native
  
  def removeFeature(featureId: String): js.Any = js.native
  
  def stats(): js.Any = js.native
  
  def touch(): this.type = js.native
  
  def unattach(attachmentId: String): this.type = js.native
}
object AbstractNode {
  
  /* static member */
  @JSImport("gitana", "AbstractNode.extend")
  @js.native
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "AbstractNode.forEach")
  @js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("gitana", "AbstractNode.implement")
  @js.native
  def implement(args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "AbstractNode.toString")
  @js.native
  def toString_(): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "AbstractNode.valueOf")
  @js.native
  def valueOf_(`type`: js.Any): js.Any = js.native
}
