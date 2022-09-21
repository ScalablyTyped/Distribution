package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Activity")
@js.native
open class Activity protected () extends StObject {
  def this(datastore: Any, `object`: Any) = this()
  
  def base(): Unit = js.native
  
  def del(): Any = js.native
  
  def getObjectDataStoreId(): Any = js.native
  
  def getObjectDataStoreTitle(): Any = js.native
  
  def getObjectDataStoreTypeId(): Any = js.native
  
  def getObjectId(): Any = js.native
  
  def getObjectTitle(): Any = js.native
  
  def getObjectTypeId(): Any = js.native
  
  def getOtherDataStoreId(): Any = js.native
  
  def getOtherDataStoreTitle(): Any = js.native
  
  def getOtherDataStoreTypeId(): Any = js.native
  
  def getOtherId(): Any = js.native
  
  def getOtherTitle(): Any = js.native
  
  def getOtherTypeId(): Any = js.native
  
  def getTimestamp(): Any = js.native
  
  def getType(): Any = js.native
  
  def getUri(): Any = js.native
  
  def getUserDomainId(): Any = js.native
  
  def getUserEmail(): Any = js.native
  
  def getUserId(): Any = js.native
  
  def getUserName(): Any = js.native
  
  def getUserTitle(): Any = js.native
  
  def reload(): Any = js.native
  
  def update(): Any = js.native
}
object Activity {
  
  @JSImport("gitana", "Activity")
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
