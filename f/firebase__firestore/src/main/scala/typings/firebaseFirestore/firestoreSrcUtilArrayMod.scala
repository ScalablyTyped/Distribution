package typings.firebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firestoreSrcUtilArrayMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/util/array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def diffArrays[T](
    before: js.Array[T],
    after: js.Array[T],
    comparator: js.Function2[/* l */ T, /* r */ T, Double],
    onAdd: js.Function1[/* entry */ T, Unit],
    onRemove: js.Function1[/* entry */ T, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diffArrays")(before.asInstanceOf[js.Any], after.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any], onAdd.asInstanceOf[js.Any], onRemove.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def findIndex[A](array: js.Array[A], predicate: js.Function1[/* value */ A, Boolean]): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(array.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  
  inline def includes[T](array: js.Array[T], value: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def some[T](array: js.Array[T], predicate: js.Function1[/* t */ T, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(array.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
