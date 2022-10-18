package typings.firebaseFirestore

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreSrcLiteApiTypesMod {
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T & string as / * template literal string: ${Prefix}.${K} * / string ]:? T[K]}
    }}}
    */
  @js.native
  trait AddPrefixToKeys[Prefix /* <: String */, T /* <: Record[String, Any] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    V extends std.Record<string, unknown> ? @firebase/firestore.@firebase/firestore/dist/lite/packages/firestore/src/lite-api/types.AddPrefixToKeys<K, @firebase/firestore.@firebase/firestore/dist/lite/packages/firestore/src/lite-api/reference.UpdateData<V>> : never
    }}}
    */
  @js.native
  trait ChildUpdateFields[K /* <: String */, V] extends StObject
  
  type NestedUpdateFields[T /* <: Record[String, Any] */] = UnionToIntersection[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T & string ]: @firebase/firestore.@firebase/firestore/dist/lite/packages/firestore/src/lite-api/types.ChildUpdateFields<K, T[K]>}[keyof T & string] */ js.Any
  ]
  
  type Primitive = js.UndefOr[String | Double | Boolean | Null]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    U extends unknown ? (k : U): void : never extends (k : infer I): void ? I : never
    }}}
    */
  @js.native
  trait UnionToIntersection[U] extends StObject
}
