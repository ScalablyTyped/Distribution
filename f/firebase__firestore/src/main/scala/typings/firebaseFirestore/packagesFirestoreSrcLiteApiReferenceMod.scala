package typings.firebaseFirestore

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.firebaseFirestore.firebaseFirestoreStrings.collection
import typings.firebaseFirestore.firebaseFirestoreStrings.query
import typings.firebaseFirestore.firestoreSrcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.firestoreSrcModelPathMod.ResourcePath
import typings.firebaseFirestore.packagesFirestoreSrcLiteApiDatabaseMod.Firestore
import typings.firebaseFirestore.packagesFirestoreSrcLiteApiSnapshotMod.FirestoreDataConverter
import typings.firebaseFirestore.packagesFirestoreSrcLiteApiTypesMod.NestedUpdateFields
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packagesFirestoreSrcLiteApiReferenceMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/lite-api/reference", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/lite-api/reference", "CollectionReference")
  @js.native
  open class CollectionReference[T] protected () extends Query[T] {
    def this(firestore: Firestore, converter: Null, _path: ResourcePath) = this()
    /** @hideconstructor */
    def this(firestore: Firestore, converter: FirestoreDataConverter[T], _path: ResourcePath) = this()
    
    val _path: ResourcePath = js.native
    
    /** The collection's identifier. */
    def id: String = js.native
    
    /**
      * A reference to the containing `DocumentReference` if this is a
      * subcollection. If this isn't a subcollection, the reference is null.
      */
    def parent: DocumentReference[DocumentData] | Null = js.native
    
    /**
      * A string representing the path of the referenced collection (relative
      * to the root of the database).
      */
    def path: String = js.native
    
    /** The type of this Firestore reference. */
    @JSName("type")
    val type_CollectionReference: /* "collection" */ String = js.native
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/lite-api/reference", "DocumentReference")
  @js.native
  open class DocumentReference[T] protected () extends StObject {
    def this(
      firestore: Firestore,
      /**
      * If provided, the `FirestoreDataConverter` associated with this instance.
      */
    converter: Null,
      _key: DocumentKey
    ) = this()
    /** @hideconstructor */
    def this(
      firestore: Firestore,
      /**
      * If provided, the `FirestoreDataConverter` associated with this instance.
      */
    converter: FirestoreDataConverter[T],
      _key: DocumentKey
    ) = this()
    
    val _key: DocumentKey = js.native
    
    def _path: ResourcePath = js.native
    
    /**
      * If provided, the `FirestoreDataConverter` associated with this instance.
      */
    val converter: FirestoreDataConverter[T] | Null = js.native
    
    /**
      * The {@link Firestore} instance the document is in.
      * This is useful for performing transactions, for example.
      */
    val firestore: Firestore = js.native
    
    /**
      * The document's identifier within its collection.
      */
    def id: String = js.native
    
    /**
      * The collection this `DocumentReference` belongs to.
      */
    def parent: CollectionReference[T] = js.native
    
    /**
      * A string representing the path of the referenced document (relative
      * to the root of the database).
      */
    def path: String = js.native
    
    /** The type of this Firestore reference. */
    val `type`: /* "document" */ String = js.native
    
    /**
      * Removes the current converter.
      *
      * @param converter - `null` removes the current converter.
      * @returns A `DocumentReference<DocumentData>` that does not use a converter.
      */
    def withConverter(converter: Null): DocumentReference[DocumentData] = js.native
    /**
      * Applies a custom data converter to this `DocumentReference`, allowing you
      * to use your own custom model objects with Firestore. When you call {@link
      * @firebase/firestore/lite#(setDoc:1)}, {@link @firebase/firestore/lite#getDoc}, etc. with the returned `DocumentReference`
      * instance, the provided converter will convert between Firestore data and
      * your custom type `U`.
      *
      * @param converter - Converts objects to and from Firestore.
      * @returns A `DocumentReference<U>` that uses the provided converter.
      */
    def withConverter[U](converter: FirestoreDataConverter[U]): DocumentReference[U] = js.native
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/lite-api/reference", "Query")
  @js.native
  open class Query[T] protected () extends StObject {
    def this(
      firestore: Firestore,
      /**
      * If provided, the `FirestoreDataConverter` associated with this instance.
      */
    converter: Null,
      _query: typings.firebaseFirestore.firestoreSrcCoreQueryMod.Query
    ) = this()
    /** @hideconstructor protected */
    def this(
      firestore: Firestore,
      /**
      * If provided, the `FirestoreDataConverter` associated with this instance.
      */
    converter: FirestoreDataConverter[T],
      _query: typings.firebaseFirestore.firestoreSrcCoreQueryMod.Query
    ) = this()
    
    val _query: typings.firebaseFirestore.firestoreSrcCoreQueryMod.Query = js.native
    
    /**
      * If provided, the `FirestoreDataConverter` associated with this instance.
      */
    val converter: FirestoreDataConverter[T] | Null = js.native
    
    /**
      * The `Firestore` instance for the Firestore database (useful for performing
      * transactions, etc.).
      */
    val firestore: Firestore = js.native
    
    /** The type of this Firestore reference. */
    val `type`: query | collection = js.native
    
    /**
      * Removes the current converter.
      *
      * @param converter - `null` removes the current converter.
      * @returns A `Query<DocumentData>` that does not use a converter.
      */
    def withConverter(converter: Null): Query[DocumentData] = js.native
    /**
      * Applies a custom data converter to this query, allowing you to use your own
      * custom model objects with Firestore. When you call {@link getDocs} with
      * the returned query, the provided converter will convert between Firestore
      * data and your custom type `U`.
      *
      * @param converter - Converts objects to and from Firestore.
      * @returns A `Query<U>` that uses the provided converter.
      */
    def withConverter[U](converter: FirestoreDataConverter[U]): Query[U] = js.native
  }
  
  inline def collection(firestore: Firestore, path: String, pathSegments: String*): CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(firestore.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CollectionReference[DocumentData]]
  inline def collection(reference: CollectionReference[Any], path: String, pathSegments: String*): CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CollectionReference[DocumentData]]
  inline def collection(reference: DocumentReference[DocumentData], path: String, pathSegments: String*): CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CollectionReference[DocumentData]]
  
  inline def collectionGroup(firestore: Firestore, collectionId: String): Query[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectionGroup")(firestore.asInstanceOf[js.Any], collectionId.asInstanceOf[js.Any])).asInstanceOf[Query[DocumentData]]
  
  inline def doc(firestore: Firestore, path: String, pathSegments: String*): DocumentReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(firestore.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DocumentReference[DocumentData]]
  inline def doc(reference: DocumentReference[Any], path: String, pathSegments: String*): DocumentReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DocumentReference[DocumentData]]
  inline def doc[T](reference: CollectionReference[T], path: String, pathSegments: String*): DocumentReference[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DocumentReference[T]]
  inline def doc[T](reference: CollectionReference[T], path: Unit, pathSegments: String*): DocumentReference[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DocumentReference[T]]
  
  inline def queryEqual[T](left: Query[T], right: Query[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("queryEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def refEqual[T](left: CollectionReference[T], right: CollectionReference[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def refEqual[T](left: CollectionReference[T], right: DocumentReference[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def refEqual[T](left: DocumentReference[T], right: CollectionReference[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def refEqual[T](left: DocumentReference[T], right: DocumentReference[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("refEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type DocumentData = /** A mapping between a field and its value. */
  StringDictionary[Any]
  
  type PartialWithFieldValue[T] = Partial[T] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? @firebase/firestore.@firebase/firestore/dist/packages/firestore/src/lite-api/reference.PartialWithFieldValue<T[K]> | @firebase/firestore.@firebase/firestore/dist/packages/firestore/src/lite-api/field_value.FieldValue}
    */ typings.firebaseFirestore.firebaseFirestoreStrings.PartialWithFieldValue & TopLevel[T]) | T
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.anon.Merge
    - typings.firebaseFirestore.anon.`33`
  */
  trait SetOptions extends StObject
  object SetOptions {
    
    inline def `33`(): typings.firebaseFirestore.anon.`33` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.firebaseFirestore.anon.`33`]
    }
    
    inline def Merge(): typings.firebaseFirestore.anon.Merge = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.firebaseFirestore.anon.Merge]
    }
  }
  
  type UpdateData[T] = Partial[T] | (typings.firebaseFirestore.firebaseFirestoreStrings.UpdateData & TopLevel[T] & NestedUpdateFields[T]) | T
  
  type WithFieldValue[T] = T | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: @firebase/firestore.@firebase/firestore/dist/packages/firestore/src/lite-api/reference.WithFieldValue<T[K]> | @firebase/firestore.@firebase/firestore/dist/packages/firestore/src/lite-api/field_value.FieldValue}
    */ typings.firebaseFirestore.firebaseFirestoreStrings.WithFieldValue & TopLevel[T])
}
