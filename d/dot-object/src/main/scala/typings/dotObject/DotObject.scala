package typings.dotObject

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DotObject {
  
  @js.native
  trait Dot extends StObject {
    
    /**
      *
      * Copy a property from one object to another object.
      *
      * If the source path does not exist (undefined)
      * the property on the other object will not be set.
      *
      * @param {String} source
      * @param {String} target
      * @param {Object} obj1
      * @param {Object} obj2
      * @param {Function|Array} mods
      * @param {Boolean} merge
      */
    def copy(source: String, target: String, obj1: js.Any, obj2: js.Any): Unit = js.native
    def copy(
      source: String,
      target: String,
      obj1: js.Any,
      obj2: js.Any,
      mods: js.Array[ModifierFunctionWrapper]
    ): Unit = js.native
    def copy(
      source: String,
      target: String,
      obj1: js.Any,
      obj2: js.Any,
      mods: js.Array[ModifierFunctionWrapper],
      merge: Boolean
    ): Unit = js.native
    def copy(source: String, target: String, obj1: js.Any, obj2: js.Any, mods: Unit, merge: Boolean): Unit = js.native
    def copy(source: String, target: String, obj1: js.Any, obj2: js.Any, mods: ModifierFunctionWrapper): Unit = js.native
    def copy(
      source: String,
      target: String,
      obj1: js.Any,
      obj2: js.Any,
      mods: ModifierFunctionWrapper,
      merge: Boolean
    ): Unit = js.native
    
    /**
      *
      * Remove value from an object using dot notation.
      *
      * @param {String | Array<String>} path
      * @param {Object} obj
      * @return {Mixed} The removed value
      */
    def del(path: String, obj: js.Any): js.Any = js.native
    def del(path: js.Array[String], obj: js.Any): js.Any = js.native
    
    /**
      *
      * Delete value from an object using dot notation.
      *
      * @param {String | Array<String>} path
      * @param {Object} obj
      * @return {any} The removed value
      */
    def delete(path: String, obj: js.Any): js.Any = js.native
    def delete(path: js.Array[String], obj: js.Any): js.Any = js.native
    
    /**
      *
      * Convert object to dotted-key/value pair
      *
      * Usage:
      *
      *   var tgt = dot.dot(obj)
      * @param {Object} obj source object
      * @return {Object} result
      */
    def dot(obj: js.Any): js.Any = js.native
    /**
      *
      * Convert object to dotted-key/value pair
      *
      * Usage:
      *   var tgt = {}
      *   dot.dot(obj, tgt)
      *
      * @param {Object} obj source object
      * @param {Object} tgt target object
      */
    def dot(obj: js.Any, tgt: js.Any): Unit = js.native
    
    /**
      *
      * Keep array
      *
      * example:
      *
      * var obj = {
      *   "id": "my-id",
      *   "other": [1, 2, 3]
      *   "some": {
      *     "array": ["A", "B"]
      *   }
      * }
      *
      * if the keepArray property is true:
      *
      * {
      *   "id": "my-id",
      *   "other": [1, 2, 3],
      *   "some.array": ["A", "B"]
      * }
      */
    var keepArray: Boolean = js.native
    
    /**
      *
      * Move a property from one place to the other.
      *
      * If the source path does not exist (undefined)
      * the target property will not be set.
      *
      * @param {String} source
      * @param {String} target
      * @param {Object} obj
      * @param {Function|Array} mods
      * @param {Boolean} merge
      */
    def move(source: String, target: String, obj: js.Any): Unit = js.native
    def move(source: String, target: String, obj: js.Any, mods: js.Array[ModifierFunctionWrapper]): Unit = js.native
    def move(
      source: String,
      target: String,
      obj: js.Any,
      mods: js.Array[ModifierFunctionWrapper],
      merge: Boolean
    ): Unit = js.native
    def move(source: String, target: String, obj: js.Any, mods: Unit, merge: Boolean): Unit = js.native
    def move(source: String, target: String, obj: js.Any, mods: ModifierFunctionWrapper): Unit = js.native
    def move(source: String, target: String, obj: js.Any, mods: ModifierFunctionWrapper, merge: Boolean): Unit = js.native
    
    /**
      *
      * Converts an object with dotted-key/value pairs to it's expanded version
      *
      * Optionally transformed by a set of modifiers.
      *
      * Usage:
      *
      *   var row = {
      *     'nr': 200,
      *     'doc.name': '  My Document  '
      *   }
      *
      *   var mods = {
      *     'doc.name': [_s.trim, _s.underscored]
      *   }
      *
      *   dot.object(row, mods)
      *
      * @param {Object} obj
      * @param {Object} mods
      */
    def `object`(obj: js.Object): js.Object = js.native
    def `object`(obj: js.Object, mods: js.Array[ModifierFunctionWrapper]): js.Object = js.native
    def `object`(obj: js.Object, mods: ModifierFunctionWrapper): js.Object = js.native
    
    /**
      *
      * Pick a value from an object using dot notation.
      *
      * Optionally remove the value
      *
      * @param {String} path
      * @param {Object} obj
      * @param {Boolean} remove
      */
    def pick(path: String, obj: js.Any): js.Any = js.native
    def pick(path: String, obj: js.Any, remove: Boolean): js.Any = js.native
    
    /**
      *
      * Remove value from an object using dot notation.
      *
      * @param {String | Array<String>} path
      * @param {Object} obj
      * @return {Mixed} The removed value
      */
    def remove(path: String, obj: js.Any): js.Any = js.native
    def remove(path: js.Array[String], obj: js.Any): js.Any = js.native
    
    /**
      *
      * Replace/merge an object to an existing object property
      *
      * @param {String} path dotted path
      * @param {Object} v object to be set
      * @param {Object} obj object to be modified
      * @param {Boolean} merge optional merge
      */
    def set(path: String, v: js.Any, obj: js.Object): Unit = js.native
    def set(path: String, v: js.Any, obj: js.Object, merge: Boolean): Unit = js.native
    
    /**
      *
      * Replace/create with a string
      *
      * @param {String} path dotted path
      * @param {String} v value to be set
      * @param {Object} obj object to be modified
      * @param {Function|Array} mods optional modifier
      */
    def str(path: String, v: js.Any, obj: js.Object): Unit = js.native
    def str(path: String, v: js.Any, obj: js.Object, mods: js.Array[ModifierFunctionWrapper]): Unit = js.native
    def str(path: String, v: js.Any, obj: js.Object, mods: ModifierFunctionWrapper): Unit = js.native
    
    /**
      *
      * Transfer a property from one object to another object.
      *
      * If the source path does not exist (undefined)
      * the property on the other object will not be set.
      *
      * @param {String} source
      * @param {String} target
      * @param {Object} obj1
      * @param {Object} obj2
      * @param {Function|Array} mods
      * @param {Boolean} merge
      */
    def transfer(source: String, target: String, obj1: js.Any, obj2: js.Any): Unit = js.native
    def transfer(
      source: String,
      target: String,
      obj1: js.Any,
      obj2: js.Any,
      mods: js.Array[ModifierFunctionWrapper]
    ): Unit = js.native
    def transfer(
      source: String,
      target: String,
      obj1: js.Any,
      obj2: js.Any,
      mods: js.Array[ModifierFunctionWrapper],
      merge: Boolean
    ): Unit = js.native
    def transfer(source: String, target: String, obj1: js.Any, obj2: js.Any, mods: Unit, merge: Boolean): Unit = js.native
    def transfer(source: String, target: String, obj1: js.Any, obj2: js.Any, mods: ModifierFunctionWrapper): Unit = js.native
    def transfer(
      source: String,
      target: String,
      obj1: js.Any,
      obj2: js.Any,
      mods: ModifierFunctionWrapper,
      merge: Boolean
    ): Unit = js.native
    
    /**
      *
      * Transform an object
      *
      * Usage:
      *
      *   var obj = {
      *     "id": 1,
      *    "some": {
      *      "thing": "else"
      *    }
      *   }
      *
      *   var transform = {
      *     "id": "nr",
      *    "some.thing": "name"
      *   }
      *
      *   var tgt = dot.transform(transform, obj)
      *
      * @param {Object} recipe Transform recipe
      * @param {Object} obj Object to be transformed
      * @param {Array} mods modifiers for the target
      */
    def transform(recipe: js.Any, obj: js.Any): Unit = js.native
    def transform(recipe: js.Any, obj: js.Any, mods: js.Array[ModifierFunctionWrapper]): Unit = js.native
    def transform(recipe: js.Any, obj: js.Any, mods: ModifierFunctionWrapper): Unit = js.native
  }
  
  @js.native
  trait DotConstructor
    extends StObject
       with Dot
       with Instantiable1[/* separator */ String, Dot]
       with Instantiable2[/* separator */ String, /* override */ Boolean, Dot]
       with Instantiable3[
          /* separator */ String, 
          (/* override */ Boolean) | (/* override */ Unit), 
          /* useArray */ Boolean, 
          Dot
        ]
       with Instantiable4[
          /* separator */ String, 
          (/* override */ Boolean) | (/* override */ Unit), 
          (/* useArray */ Boolean) | (/* useArray */ Unit), 
          /* useBrackets */ Boolean, 
          Dot
        ]
  
  type ModifierFunctionWrapper = js.Function1[/* arg */ js.Any, js.Any]
}
