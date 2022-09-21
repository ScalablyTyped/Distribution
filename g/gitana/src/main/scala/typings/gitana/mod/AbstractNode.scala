package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "AbstractNode")
@js.native
open class AbstractNode protected () extends AbstractRepositoryObject {
  def this(branch: Any, `object`: Any) = this()
  
  def addFeature(featureId: String, featureConfig: Any): Any = js.native
  
  def attach(attachmentId: String, contentType: Any, data: Any, filename: Any): NodeAttachment = js.native
  
  def attachment(attachmentId: String): NodeAttachment = js.native
  
  def attachmentDownloadUri(attachmentId: String): String = js.native
  
  def changeQName(qname: Any): Any = js.native
  
  def changeTypeQName(typeQName: Any): Any = js.native
  
  def getBranch(): Branch = js.native
  
  def getBranchId(): String = js.native
  
  def getFeature(featureId: String): Any = js.native
  def getFeature(featureId: String, callback: Any): Any = js.native
  
  def getFeatureIds(callback: Any): Any = js.native
  
  def getPreviewUri(name: Any, config: Any): String = js.native
  
  def getQName(): String = js.native
  
  def getTypeQName(): String = js.native
  
  def hasFeature(featureId: Any, callback: Any): Any = js.native
  
  def isAssociation(): Boolean = js.native
  
  def isContainer(): Boolean = js.native
  
  def listAttachments(): NodeAttachmentMap = js.native
  def listAttachments(local: Any): NodeAttachmentMap = js.native
  
  def refresh(): this.type = js.native
  
  def removeFeature(featureId: String): Any = js.native
  
  def stats(): Any = js.native
  
  def touch(): this.type = js.native
  
  def unattach(attachmentId: String): this.type = js.native
}
object AbstractNode {
  
  @JSImport("gitana", "AbstractNode")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(_instance: Any, _static: Any, args: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")((List(_instance.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  /* static member */
  inline def forEach(`object`: Any, block: Any, context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(`object`.asInstanceOf[js.Any], block.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def implement(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  /* static member */
  inline def toString_(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[Any]
  
  /* static member */
  inline def valueOf_(`type`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("valueOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
}
