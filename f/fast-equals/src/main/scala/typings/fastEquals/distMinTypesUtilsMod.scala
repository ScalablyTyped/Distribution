package typings.fastEquals

import typings.fastEquals.distMinTypesInternalTypesMod.AnyEqualityComparator
import typings.fastEquals.distMinTypesInternalTypesMod.Dictionary
import typings.fastEquals.distMinTypesInternalTypesMod.State
import typings.fastEquals.distMinTypesInternalTypesMod.TypeEqualityComparator
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMinTypesUtilsMod {
  
  @JSImport("fast-equals/dist/min/types/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combineComparators[Meta](comparatorA: AnyEqualityComparator[Meta], comparatorB: AnyEqualityComparator[Meta]): js.Function3[/* a */ Any, /* b */ Any, /* state */ State[Meta], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineComparators")(comparatorA.asInstanceOf[js.Any], comparatorB.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* a */ Any, /* b */ Any, /* state */ State[Meta], Boolean]]
  
  inline def createIsCircular[AreItemsEqual /* <: TypeEqualityComparator[Any, Any] */](areItemsEqual: AreItemsEqual): AreItemsEqual = ^.asInstanceOf[js.Dynamic].applyDynamic("createIsCircular")(areItemsEqual.asInstanceOf[js.Any]).asInstanceOf[AreItemsEqual]
  
  inline def getStrictProperties(`object`: Dictionary[Any]): js.Array[String | js.Symbol] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStrictProperties")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[String | js.Symbol]]
  
  inline def hasOwn(o: js.Object, v: PropertyKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwn")(o.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def sameValueZeroEqual(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("sameValueZeroEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
