package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "SystemMetadata")
@js.native
class SystemMetadata () extends Base {
  
  def base(): Unit = js.native
  
  def get(key: js.Any): js.Any = js.native
  
  def getChangesetId(): String = js.native
  
  def getCreatedBy(): String = js.native
  
  def getCreatedByPrincipalDomainId(): String = js.native
  
  def getCreatedByPrincipalId(): String = js.native
  
  def getCreatedOn(): Timestamp = js.native
  
  def getModifiedBy(): String = js.native
  
  def getModifiedByPrincipalDomainId(): String = js.native
  
  def getModifiedByPrincipalId(): String = js.native
  
  def getModifiedOn(): Timestamp = js.native
  
  def updateFrom(json: js.Any): Unit = js.native
}
object SystemMetadata {
  
  @JSImport("gitana", "SystemMetadata")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(_instance.asInstanceOf[js.Any], _static.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* static member */
  inline def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(`object`.asInstanceOf[js.Any], block.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def implement(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /* static member */
  inline def toString_(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[js.Any]
  
  /* static member */
  inline def valueOf_(`type`: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("valueOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
