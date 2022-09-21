package typings.glidejsGlide.mod

import typings.glidejsGlide.anon.Modify
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * The component is a simple function that returns an object. Each component
  * has a single responsibility and communicates with other components using
  * events.
  */
type ComponentFunction[T /* <: Component */] = js.Function3[
/* glide */ Properties, 
/* components */ BuiltinComponentMap & (Record[String, js.UndefOr[Component]]), 
/* events */ EventsBus, 
T]

/* Rewritten from type alias, can be one of: 
  - typings.glidejsGlide.glidejsGlideStrings.Greaterthansign
  - typings.glidejsGlide.glidejsGlideStrings.Lessthansign
  - typings.glidejsGlide.glidejsGlideStrings.GreaterthansignGreaterthansign
  - typings.glidejsGlide.glidejsGlideStrings.LessthansignLessthansign
  - java.lang.String
*/
type Pattern = _Pattern | String

type TransformerFunction = js.Function3[
/* glide */ Properties, 
/* components */ BuiltinComponentMap & (Record[String, js.UndefOr[Component]]), 
/* events */ EventsBus, 
Modify]
