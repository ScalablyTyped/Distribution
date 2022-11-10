package typings.ecmarkdown.distNodeTypesMod

import typings.ecmarkdown.anon.Location
import typings.ecmarkdown.ecmarkdownStrings.contents
import typings.ecmarkdown.ecmarkdownStrings.location
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends unknown ? std.Omit<T, K> : never
  }}}
  */
type ActualOmit[T, K /* <: String */] = Omit[T, K]

/* Inlined std.Exclude<ecmarkdown.ecmarkdown/dist/node-types.Token, ecmarkdown.ecmarkdown/dist/node-types.EOFToken> */
type NotEOFToken = contents

type Unlocated[T /* <: Location */] = ActualOmit[T, location]
