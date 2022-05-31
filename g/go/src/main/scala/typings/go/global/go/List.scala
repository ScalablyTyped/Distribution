package typings.go.global.go

import typings.go.mod.Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An ordered iterable collection.
  * It optionally enforces the type of elements that may be added to the List.
  */
@JSGlobal("go.List")
@js.native
/**
  * This creates a List that may check the types of the values.
  * @param {string=} type if supplied, this must be one of: 'number', 'string', 'boolean', or 'function' for the value type.
  */
class List[T] ()
  extends typings.go.mod.List[T] {
  def this(`type`: String) = this()
  /**
    * This creates a List that checks the type of the values to be instances of a particular kind of Object.
    * @param {function(...)} type this must be a class function/constructor.
    */
  def this(`type`: Constructor) = this()
}
