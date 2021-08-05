package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "AbstractMap")
@js.native
class AbstractMap protected () extends AbstractPersistable {
  def this(driver: js.Any, `object`: js.Any) = this()
  
  def asArray(): js.Array[js.Any] = js.native
  
  def buildObject(json: js.Any): Unit = js.native
  
  def clear(): Unit = js.native
  
  def count(callback: js.Any): js.Any = js.native
  
  def each(callback: eachCB[this.type, js.Any]): this.type = js.native
  
  def eachX(callback: eachCB[this.type, js.Any]): this.type = js.native
  
  def filter(callback: js.Any): js.Any = js.native
  
  def get(key: js.Any): js.Any = js.native
  
  def keepOne(emptyHandler: js.Any): js.Any = js.native
  
  def limit(size: js.Any): js.Any = js.native
  
  def offset(callback: js.Any): js.Any = js.native
  
  def paginate(pagination: js.Any): js.Any = js.native
  
  def refs(): js.Any = js.native
  
  def select(key: js.Any): js.Any = js.native
  
  def size(callback: js.Any): Double = js.native
  
  def sort(comparator: js.Any): js.Any = js.native
  
  def totalRows(callback: js.Any): js.Any = js.native
}
object AbstractMap {
  
  @JSImport("gitana", "AbstractMap")
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
