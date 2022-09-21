package typings.go.global.go

import typings.go.mod.Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An unordered iterable collection of key/value pairs that cannot contain two instances of the
  * same key.
  * It optionally enforces the type of the key and the type of the associated value.
  */
@JSGlobal("go.Map")
@js.native
/**
  * This creates a Map that may check the types of the keys and/or values.
  * @param {string=} keytype if supplied, this must be one of: 'number' or 'string' for the key type.
  * @param {string=} valtype if supplied, this must be one of: 'number', 'string', 'boolean', or 'function' for the value type.
  */
open class Map[K, V] ()
  extends typings.go.mod.Map[K, V] {
  def this(keytype: String) = this()
  def this(keytype: String, valtype: String) = this()
  /**
    * This creates a Map that may check the types of the keys and/or values.
    * @param {string=} keytype if supplied, this must be one of: 'number' or 'string' for the key type.
    * @param {function(...)} valtype if supplied, this must be a class function/constructor.
    */
  def this(keytype: String, valtype: Constructor) = this()
  def this(keytype: Unit, valtype: String) = this()
  /**
    * This creates a Map that may check the types of the keys and/or values.
    * @param {function(...)} keytype if supplied, this must be a class function/constructor.
    * @param {string} valtype if supplied, this must be one of: 'number', 'string', 'boolean', or 'function' for the value type.
    */
  def this(keytype: Constructor, valtype: String) = this()
  /**
    * This creates a Map that may check the types of the keys and/or values.
    * @param {function(...)} keytype if supplied, this must be a class function/constructor.
    * @param {function(...)} valtype if supplied, this must be a class function/constructor.
    */
  def this(keytype: Constructor, valtype: Constructor) = this()
}
