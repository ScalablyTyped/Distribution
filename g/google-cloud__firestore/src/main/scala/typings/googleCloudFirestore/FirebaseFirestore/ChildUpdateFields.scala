package typings.googleCloudFirestore.FirebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  // Only allow nesting for map values
V extends std.Record<string, unknown> ? // Recurse into the map and add the prefix in front of each key
// (e.g. Prefix 'bar.' to create: 'bar.baz' and 'bar.qux'.
@google-cloud/firestore.FirebaseFirestore.AddPrefixToKeys<K, @google-cloud/firestore.FirebaseFirestore.UpdateData<V>> : // UpdateData is always a map of values.
never
  }}}
  */
@js.native
trait ChildUpdateFields[K /* <: String */, V] extends StObject
