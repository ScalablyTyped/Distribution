package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "AbstractMap")
@js.native
class AbstractMap protected () extends AbstractPersistable {
  def this(driver: js.Any, `object`: js.Any) = this()
  
  def asArray(): js.Array[_] = js.native
  
  def buildObject(json: js.Any): Unit = js.native
  
  def clear(): Unit = js.native
  
  def count(callback: js.Any): js.Any = js.native
  
  def each(callback: eachCB[this.type, _]): this.type = js.native
  
  def eachX(callback: eachCB[this.type, _]): this.type = js.native
  
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
  
  /* static member */
  @JSImport("gitana", "AbstractMap.extend")
  @js.native
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "AbstractMap.forEach")
  @js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("gitana", "AbstractMap.implement")
  @js.native
  def implement(args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "AbstractMap.toString")
  @js.native
  def toString_(): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "AbstractMap.valueOf")
  @js.native
  def valueOf_(`type`: js.Any): js.Any = js.native
}
