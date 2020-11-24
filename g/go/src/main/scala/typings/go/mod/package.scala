package typings.go

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /** A string in place of a Brush object is treated as a Solid Brush of that color. */
  type BrushLike = typings.go.mod.Brush | java.lang.String
  
  /** A constructor */
  type Constructor = org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, js.Object]
  
  /** A Key is the type of the unique identifier managed by Models for each node data object. */
  type Key = java.lang.String | scala.Double
  
  /** A number in place of a Margin object is treated as a uniform Margin with that thickness */
  type MarginLike = typings.go.mod.Margin | scala.Double
  
  /** Either name a property or get the value of a property from an object. */
  type PropertyAccessor = java.lang.String | (js.Function2[/* data */ js.Any, /* newval */ js.Any, js.Any])
}
