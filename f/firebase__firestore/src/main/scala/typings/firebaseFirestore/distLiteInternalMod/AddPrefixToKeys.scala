package typings.firebaseFirestore.distLiteInternalMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ K in keyof T & string as / * template literal string: ${Prefix}.${K} * / string ]:? T[K]}
  }}}
  */
@js.native
trait AddPrefixToKeys[Prefix /* <: String */, T /* <: Record[String, Any] */] extends StObject
