package typings.go.global.go

import typings.go.mod.Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An unordered iterable collection that cannot contain two instances of the same kind of value.
  * It optionally enforces the type of elements that may be added to the Set.
  */
@JSGlobal("go.Set")
@js.native
/**
  * This creates a Set that may check the types of the values.
  * @param {string=} type if supplied, this must be one of: 'number' or 'string' for the key type.
  */
open class Set[T] ()
  extends typings.go.mod.Set[T] {
  def this(`type`: String) = this()
  /**
    * This creates a Set that checks the type of the values.
    * @param {function(...)} type this must be a class function/constructor.
    */
  def this(`type`: Constructor) = this()
}
