package typings.go.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** A string in place of a Brush object is treated as a Solid Brush of that color. */
type BrushLike = Brush | String

/** A constructor */
type Constructor = Instantiable1[/* args (repeated) */ Any, js.Object]

/** A Key is the type of the unique identifier managed by Models for each node data object. */
type Key = String | Double

/** A number in place of a Margin object is treated as a uniform Margin with that thickness */
type MarginLike = Margin | Double

/** Either name a property or get the value of a property from an object. */
type PropertyAccessor = String | (js.Function2[/* data */ Any, /* newval */ Any, Any])
