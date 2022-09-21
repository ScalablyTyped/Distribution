package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "AbstractMap")
@js.native
open class AbstractMap protected () extends AbstractPersistable {
  def this(driver: Any, `object`: Any) = this()
  
  def asArray(): js.Array[Any] = js.native
  
  def buildObject(json: Any): Unit = js.native
  
  def clear(): Unit = js.native
  
  def count(callback: Any): Any = js.native
  
  def each(callback: eachCB[this.type, Any]): this.type = js.native
  
  def eachX(callback: eachCB[this.type, Any]): this.type = js.native
  
  def filter(callback: Any): Any = js.native
  
  def get(key: Any): Any = js.native
  
  def keepOne(emptyHandler: Any): Any = js.native
  
  def limit(size: Any): Any = js.native
  
  def offset(callback: Any): Any = js.native
  
  def paginate(pagination: Any): Any = js.native
  
  def refs(): Any = js.native
  
  def select(key: Any): Any = js.native
  
  def size(callback: Any): Double = js.native
  
  def sort(comparator: Any): Any = js.native
  
  def totalRows(callback: Any): Any = js.native
}
object AbstractMap {
  
  @JSImport("gitana", "AbstractMap")
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
