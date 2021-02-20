package typings.ecmarkdown

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object nodeTypesMod {
  
  type ActualOmit[T, K /* <: java.lang.String */] = typings.std.Omit[T, K]
  
  /* Inlined std.Exclude<ecmarkdown.ecmarkdown/dist/node-types.Token, ecmarkdown.ecmarkdown/dist/node-types.EOFToken> */
  type NotEOFToken = typings.ecmarkdown.ecmarkdownStrings.contents
  
  type Unlocated[T /* <: typings.ecmarkdown.anon.Location */] = typings.ecmarkdown.nodeTypesMod.ActualOmit[T, typings.ecmarkdown.ecmarkdownStrings.location]
}
