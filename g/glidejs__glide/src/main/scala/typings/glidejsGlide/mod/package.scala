package typings.glidejsGlide

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * The component is a simple function that returns an object. Each component
    * has a single responsibility and communicates with other components using
    * events.
    */
  type ComponentFunction = js.Function3[
    /* glide */ typings.glidejsGlide.mod.Static, 
    /* components */ js.Object, 
    /* events */ js.Any, 
    typings.glidejsGlide.anon.Mount
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.glidejsGlide.glidejsGlideStrings.Greaterthansign
    - typings.glidejsGlide.glidejsGlideStrings.Lessthansign
    - typings.glidejsGlide.glidejsGlideStrings.GreaterthansignGreaterthansign
    - typings.glidejsGlide.glidejsGlideStrings.LessthansignLessthansign
    - java.lang.String
  */
  type Pattern = typings.glidejsGlide.mod._Pattern | java.lang.String
  
  type TransformerFunction = js.Function3[
    /* glide */ typings.glidejsGlide.mod.Static, 
    /* components */ js.Object, 
    /* events */ js.Any, 
    typings.glidejsGlide.anon.Modify
  ]
}
