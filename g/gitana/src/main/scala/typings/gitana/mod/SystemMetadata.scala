package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "SystemMetadata")
@js.native
open class SystemMetadata () extends Base {
  
  def base(): Unit = js.native
  
  def get(key: Any): Any = js.native
  
  def getChangesetId(): String = js.native
  
  def getCreatedBy(): String = js.native
  
  def getCreatedByPrincipalDomainId(): String = js.native
  
  def getCreatedByPrincipalId(): String = js.native
  
  def getCreatedOn(): Timestamp = js.native
  
  def getModifiedBy(): String = js.native
  
  def getModifiedByPrincipalDomainId(): String = js.native
  
  def getModifiedByPrincipalId(): String = js.native
  
  def getModifiedOn(): Timestamp = js.native
  
  def updateFrom(json: Any): Unit = js.native
}
object SystemMetadata {
  
  @JSImport("gitana", "SystemMetadata")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(_instance: Any, _static: Any, args: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")((scala.List(_instance.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  /* static member */
  inline def forEach(`object`: Any, block: Any, context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(`object`.asInstanceOf[js.Any], block.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def implement(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  /* static member */
  inline def toString_(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[Any]
  
  /* static member */
  inline def valueOf_(`type`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("valueOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
}
