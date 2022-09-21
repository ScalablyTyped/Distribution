package typings.firebaseFirestore

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseFirestore.anon.MockUserToken
import typings.firebaseFirestore.firebaseFirestoreStrings.ASCENDING
import typings.firebaseFirestore.firebaseFirestoreStrings.CONTAINS
import typings.firebaseFirestore.firebaseFirestoreStrings.DESCENDING
import typings.firebaseFirestore.firestoreSrcLiteApiDatabaseMod.Firestore
import typings.firebaseFirestore.srcModelFieldIndexMod.FieldIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcApiIndexConfigurationMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/api/index_configuration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connectFirestoreEmulator(firestore: Firestore, host: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(firestore.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectFirestoreEmulator(firestore: Firestore, host: String, port: Double, options: MockUserToken): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(firestore.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parseIndexes(jsonOrConfiguration: String): js.Array[FieldIndex] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseIndexes")(jsonOrConfiguration.asInstanceOf[js.Any]).asInstanceOf[js.Array[FieldIndex]]
  inline def parseIndexes(jsonOrConfiguration: IndexConfiguration): js.Array[FieldIndex] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseIndexes")(jsonOrConfiguration.asInstanceOf[js.Any]).asInstanceOf[js.Array[FieldIndex]]
  
  inline def setIndexConfiguration(
    firestore: typings.firebaseFirestore.srcApiDatabaseMod.Firestore,
    configuration: IndexConfiguration
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setIndexConfiguration")(firestore.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setIndexConfiguration(firestore: typings.firebaseFirestore.srcApiDatabaseMod.Firestore, json: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setIndexConfiguration")(firestore.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait Index
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    /** The ID of the collection to index. */
    val collectionGroup: String
    
    /** A list of fields to index. */
    val fields: js.UndefOr[js.Array[IndexField]] = js.undefined
  }
  object Index {
    
    inline def apply(collectionGroup: String): Index = {
      val __obj = js.Dynamic.literal(collectionGroup = collectionGroup.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    extension [Self <: Index](x: Self) {
      
      inline def setCollectionGroup(value: String): Self = StObject.set(x, "collectionGroup", value.asInstanceOf[js.Any])
      
      inline def setFields(value: js.Array[IndexField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFieldsVarargs(value: IndexField*): Self = StObject.set(x, "fields", js.Array(value*))
    }
  }
  
  trait IndexConfiguration
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    /** A list of all Firestore indexes. */
    val indexes: js.UndefOr[js.Array[Index]] = js.undefined
  }
  object IndexConfiguration {
    
    inline def apply(): IndexConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndexConfiguration]
    }
    
    extension [Self <: IndexConfiguration](x: Self) {
      
      inline def setIndexes(value: js.Array[Index]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
      
      inline def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
      
      inline def setIndexesVarargs(value: Index*): Self = StObject.set(x, "indexes", js.Array(value*))
    }
  }
  
  trait IndexField
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    /**
      * What type of array index to create. Set to `CONTAINS` for `array-contains`
      * and `array-contains-any` indexes.
      *
      * Only one of `arrayConfig` or `order` should be set;
      */
    val arrayConfig: js.UndefOr[CONTAINS] = js.undefined
    
    /** The field path to index. */
    val fieldPath: String
    
    /**
      * What type of array index to create. Set to `ASCENDING` or 'DESCENDING` for
      * `==`, `!=`, `<=`, `<=`, `in` and `not-in` filters.
      *
      * Only one of `arrayConfig` or `order` should be set.
      */
    val order: js.UndefOr[ASCENDING | DESCENDING] = js.undefined
  }
  object IndexField {
    
    inline def apply(fieldPath: String): IndexField = {
      val __obj = js.Dynamic.literal(fieldPath = fieldPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexField]
    }
    
    extension [Self <: IndexField](x: Self) {
      
      inline def setArrayConfig(value: CONTAINS): Self = StObject.set(x, "arrayConfig", value.asInstanceOf[js.Any])
      
      inline def setArrayConfigUndefined: Self = StObject.set(x, "arrayConfig", js.undefined)
      
      inline def setFieldPath(value: String): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
      
      inline def setOrder(value: ASCENDING | DESCENDING): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
}
