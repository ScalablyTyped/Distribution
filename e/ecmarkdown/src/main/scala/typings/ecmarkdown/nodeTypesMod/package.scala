package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.anon.Location
import typings.ecmarkdown.ecmarkdownStrings.contents
import typings.ecmarkdown.ecmarkdownStrings.location
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActualOmit[T, K /* <: String */] = Omit[T, K]

/* Inlined std.Exclude<ecmarkdown.ecmarkdown/dist/node-types.Token, ecmarkdown.ecmarkdown/dist/node-types.EOFToken> */
type NotEOFToken = contents

type Unlocated[T /* <: Location */] = ActualOmit[T, location]
