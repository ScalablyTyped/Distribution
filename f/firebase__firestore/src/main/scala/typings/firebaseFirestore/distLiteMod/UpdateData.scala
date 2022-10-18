package typings.firebaseFirestore.distLiteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends @firebase/firestore.@firebase/firestore/dist/lite.Primitive ? T : T extends {} ? {[ K in keyof T ]:? @firebase/firestore.@firebase/firestore/dist/lite.UpdateData<T[K]> | @firebase/firestore.@firebase/firestore/dist/lite.FieldValue} & @firebase/firestore.@firebase/firestore/dist/lite.NestedUpdateFields<T> : std.Partial<T>
  }}}
  */
@js.native
trait UpdateData[T] extends StObject
