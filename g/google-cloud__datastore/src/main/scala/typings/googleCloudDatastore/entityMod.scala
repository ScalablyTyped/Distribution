package typings.googleCloudDatastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityMod {
  
  trait DatastoreCoords extends StObject {
    
    var latitude: Double
    
    var longitude: Double
  }
  object DatastoreCoords {
    
    inline def apply(latitude: Double, longitude: Double): DatastoreCoords = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatastoreCoords]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatastoreCoords] (val x: Self) extends AnyVal {
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    }
  }
  
  trait DatastoreDouble extends StObject {
    
    var value: String
  }
  object DatastoreDouble {
    
    inline def apply(value: String): DatastoreDouble = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatastoreDouble]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatastoreDouble] (val x: Self) extends AnyVal {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait DatastoreGeopoint extends StObject {
    
    var value: DatastoreCoords
  }
  object DatastoreGeopoint {
    
    inline def apply(value: DatastoreCoords): DatastoreGeopoint = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatastoreGeopoint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatastoreGeopoint] (val x: Self) extends AnyVal {
      
      inline def setValue(value: DatastoreCoords): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait DatastoreInt extends StObject {
    
    var value: String
  }
  object DatastoreInt {
    
    inline def apply(value: String): DatastoreInt = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatastoreInt]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatastoreInt] (val x: Self) extends AnyVal {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait DatastoreKey extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var kind: String
    
    var name: js.UndefOr[String] = js.undefined
    
    var parent: js.UndefOr[DatastoreKey] = js.undefined
    
    val path: DatastoreKeyPath
  }
  object DatastoreKey {
    
    inline def apply(kind: String, path: DatastoreKeyPath): DatastoreKey = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatastoreKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatastoreKey] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParent(value: DatastoreKey): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPath(value: DatastoreKeyPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: PathElement*): Self = StObject.set(x, "path", js.Array(value*))
    }
  }
  
  trait DatastoreKeyOptions extends StObject {
    
    var namespace: js.UndefOr[String] = js.undefined
    
    var path: DatastoreKeyPath
  }
  object DatastoreKeyOptions {
    
    inline def apply(path: DatastoreKeyPath): DatastoreKeyOptions = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatastoreKeyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatastoreKeyOptions] (val x: Self) extends AnyVal {
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setPath(value: DatastoreKeyPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: PathElement*): Self = StObject.set(x, "path", js.Array(value*))
    }
  }
  
  /**
    * DatastoreKeyPath is structured as [kind, identifier, kind, identifier, ...]
    * `kind` must be a string, `identifier` is a PathElement
    */
  type DatastoreKeyPath = js.Array[PathElement]
  
  trait DatastorePayload[T] extends StObject {
    
    // TODO Include possibility of 'raw data' with indexing options, etc
    var data: T | js.Object
    
    var excludeFromIndexes: js.UndefOr[js.Array[String]] = js.undefined
    
    var key: DatastoreKey
  }
  object DatastorePayload {
    
    inline def apply[T](data: T | js.Object, key: DatastoreKey): DatastorePayload[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatastorePayload[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatastorePayload[?], T] (val x: Self & DatastorePayload[T]) extends AnyVal {
      
      inline def setData(value: T | js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setExcludeFromIndexes(value: js.Array[String]): Self = StObject.set(x, "excludeFromIndexes", value.asInstanceOf[js.Any])
      
      inline def setExcludeFromIndexesUndefined: Self = StObject.set(x, "excludeFromIndexes", js.undefined)
      
      inline def setExcludeFromIndexesVarargs(value: String*): Self = StObject.set(x, "excludeFromIndexes", js.Array(value*))
      
      inline def setKey(value: DatastoreKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  type KEY_SYMBOL = js.Symbol
  
  /**
    * NB: TS does not support computed symbol keys (yet: https://github.com/Microsoft/TypeScript/pull/15473)
    * If using a raw T object, it MUST have a {@link Datastore_#KEY} symbol property of type {@link DatastoreKey}.
    */
  type ObjOrPayload[T] = T | DatastorePayload[T]
  
  type OneOrMany[T] = ObjOrPayload[T] | js.Array[ObjOrPayload[T]]
  
  type PathElement = String | Double | DatastoreInt
}
