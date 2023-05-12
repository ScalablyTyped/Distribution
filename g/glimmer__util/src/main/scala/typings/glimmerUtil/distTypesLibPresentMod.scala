package typings.glimmerUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibPresentMod {
  
  @JSImport("@glimmer/util/dist/types/lib/present", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertPresent[T](list: js.Array[T]): /* asserts list is TsTypeRef(Comments(1),TsQIdent(IArray(TsIdentSimple(any))),IArray())*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("assertPresent")(list.asInstanceOf[js.Any]).asInstanceOf[/* asserts list is TsTypeRef(Comments(1),TsQIdent(IArray(TsIdentSimple(any))),IArray())*/ Boolean]
  inline def assertPresent[T](list: js.Array[T], message: String): /* asserts list is TsTypeRef(Comments(1),TsQIdent(IArray(TsIdentSimple(any))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPresent")(list.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts list is TsTypeRef(Comments(1),TsQIdent(IArray(TsIdentSimple(any))),IArray())*/ Boolean]
  
  inline def ifPresent[T, U, V](
    list: js.Array[T],
    ifPresent: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PresentArray<T> */ /* input */ Any, 
      U
    ],
    otherwise: js.Function0[V]
  ): U | V = (^.asInstanceOf[js.Dynamic].applyDynamic("ifPresent")(list.asInstanceOf[js.Any], ifPresent.asInstanceOf[js.Any], otherwise.asInstanceOf[js.Any])).asInstanceOf[U | V]
  
  inline def isPresent[T](list: js.Array[T]): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PresentArray<T> * / any */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPresent")(list.asInstanceOf[js.Any]).asInstanceOf[/* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PresentArray<T> * / any */ Boolean]
  
  inline def mapPresent[T, U](
    list: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PresentArray<T> */ Any,
    callback: js.Function1[/* input */ T, U]
  ): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PresentArray<U> */ Any) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("mapPresent")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PresentArray<U> */ Any) | Null]
  inline def mapPresent[T, U](list: Null, callback: js.Function1[/* input */ T, U]): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PresentArray<U> */ Any) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("mapPresent")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PresentArray<U> */ Any) | Null]
  
  inline def mapPresent_TU_Any[T, U](
    list: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PresentArray<T> */ Any,
    callback: js.Function1[/* input */ T, U]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mapPresent")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def toPresentOption[T](list: js.Array[T]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toPresentOption")(list.asInstanceOf[js.Any]).asInstanceOf[Any]
}
