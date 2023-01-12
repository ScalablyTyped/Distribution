package typings.firebaseFirestoreCompat

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.firebaseFirestore.mod.AggregateField
import typings.firebaseFirestore.mod.DocumentSnapshot
import typings.firebaseFirestore.mod.FirestoreError
import typings.firebaseFirestore.mod.QuerySnapshot
import typings.firebaseFirestore.mod.Query_
import typings.firebaseFirestoreCompat.appCompatMod.FirebaseApp
import typings.firebaseFirestoreTypes.mod.FieldPath
import typings.firebaseFirestoreTypes.mod.FieldValue
import typings.firebaseFirestoreTypes.mod.FirebaseFirestore
import typings.firebaseFirestoreTypes.mod.LogLevel
import typings.firebaseFirestoreTypes.mod.Timestamp
import typings.firebaseUtil.mod.Compat
import typings.firebaseUtil.mod.EmulatorMockTokenOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Blob extends StObject {
    
    def apply(): FirebaseFirestore = js.native
    def apply(app: FirebaseApp): FirebaseFirestore = js.native
    
    var Blob: TypeofBlob = js.native
    
    var CollectionReference: Instantiable0[typings.firebaseFirestoreTypes.mod.CollectionReference[js.Object]] = js.native
    
    var DocumentReference: Instantiable0[typings.firebaseFirestoreTypes.mod.DocumentReference[js.Object]] = js.native
    
    var DocumentSnapshot: Instantiable0[typings.firebaseFirestoreTypes.mod.DocumentSnapshot[js.Object]] = js.native
    
    var FieldPath: TypeofFieldPath = js.native
    
    var FieldValue: TypeofFieldValue = js.native
    
    var Firestore: Instantiable0[FirebaseFirestore] = js.native
    
    var GeoPoint: Instantiable2[
        /* latitude */ Double, 
        /* longitude */ Double, 
        typings.firebaseFirestoreTypes.mod.GeoPoint
      ] = js.native
    
    var Query: Instantiable0[typings.firebaseFirestoreTypes.mod.Query[js.Object]] = js.native
    
    var QueryDocumentSnapshot: Instantiable0[typings.firebaseFirestoreTypes.mod.QueryDocumentSnapshot[js.Object]] = js.native
    
    var QuerySnapshot: Instantiable0[typings.firebaseFirestoreTypes.mod.QuerySnapshot[js.Object]] = js.native
    
    var Timestamp: TypeofTimestamp = js.native
    
    var Transaction: Instantiable0[typings.firebaseFirestoreTypes.mod.Transaction] = js.native
    
    var WriteBatch: Instantiable0[typings.firebaseFirestoreTypes.mod.WriteBatch] = js.native
    
    def setLogLevel(logLevel: LogLevel): Unit = js.native
    @JSName("setLogLevel")
    var setLogLevel_Original: js.Function1[/* logLevel */ LogLevel, Unit] = js.native
  }
  
  @js.native
  trait Call extends StObject {
    
    def apply(): FirebaseFirestore = js.native
    def apply(app: typings.firebaseFirestoreCompat.mod.firebaseAppCompatAugmentingMod.FirebaseApp): FirebaseFirestore = js.native
    
    var Blob: TypeofBlob = js.native
    
    var CollectionReference: Instantiable0[typings.firebaseFirestoreTypes.mod.CollectionReference[js.Object]] = js.native
    
    var DocumentReference: Instantiable0[typings.firebaseFirestoreTypes.mod.DocumentReference[js.Object]] = js.native
    
    var DocumentSnapshot: Instantiable0[typings.firebaseFirestoreTypes.mod.DocumentSnapshot[js.Object]] = js.native
    
    var FieldPath: TypeofFieldPath = js.native
    
    var FieldValue: TypeofFieldValue = js.native
    
    var Firestore: Instantiable0[FirebaseFirestore] = js.native
    
    var GeoPoint: Instantiable2[
        /* latitude */ Double, 
        /* longitude */ Double, 
        typings.firebaseFirestoreTypes.mod.GeoPoint
      ] = js.native
    
    var Query: Instantiable0[typings.firebaseFirestoreTypes.mod.Query[js.Object]] = js.native
    
    var QueryDocumentSnapshot: Instantiable0[typings.firebaseFirestoreTypes.mod.QueryDocumentSnapshot[js.Object]] = js.native
    
    var QuerySnapshot: Instantiable0[typings.firebaseFirestoreTypes.mod.QuerySnapshot[js.Object]] = js.native
    
    var Timestamp: TypeofTimestamp = js.native
    
    var Transaction: Instantiable0[typings.firebaseFirestoreTypes.mod.Transaction] = js.native
    
    var WriteBatch: Instantiable0[typings.firebaseFirestoreTypes.mod.WriteBatch] = js.native
    
    def setLogLevel(logLevel: LogLevel): Unit = js.native
    @JSName("setLogLevel")
    var setLogLevel_Original: js.Function1[/* logLevel */ LogLevel, Unit] = js.native
  }
  
  trait Complete[T] extends StObject {
    
    var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var error: js.UndefOr[js.Function1[/* error */ FirestoreError, Unit]] = js.undefined
    
    var next: js.UndefOr[js.Function1[/* snapshot */ DocumentSnapshot[T], Unit]] = js.undefined
  }
  object Complete {
    
    inline def apply[T](): Complete[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Complete[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Complete[?], T] (val x: Self & Complete[T]) extends AnyVal {
      
      inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setError(value: /* error */ FirestoreError => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setNext(value: /* snapshot */ DocumentSnapshot[T] => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
  
  trait Count extends StObject {
    
    def count(query: Compat[Query_[Any]]): js.Promise[Double]
    
    def delete(): js.Promise[Unit]
  }
  object Count {
    
    inline def apply(count: Compat[Query_[Any]] => js.Promise[Double], delete: () => js.Promise[Unit]): Count = {
      val __obj = js.Dynamic.literal(count = js.Any.fromFunction1(count), delete = js.Any.fromFunction0(delete))
      __obj.asInstanceOf[Count]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
      
      inline def setCount(value: Compat[Query_[Any]] => js.Promise[Double]): Self = StObject.set(x, "count", js.Any.fromFunction1(value))
      
      inline def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
    }
  }
  
  trait CountAggregateField extends StObject {
    
    var count: AggregateField[Double]
  }
  object CountAggregateField {
    
    inline def apply(count: AggregateField[Double]): CountAggregateField = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
      __obj.asInstanceOf[CountAggregateField]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CountAggregateField] (val x: Self) extends AnyVal {
      
      inline def setCount(value: AggregateField[Double]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    }
  }
  
  trait Delete extends StObject {
    
    def delete(): js.Promise[Unit]
  }
  object Delete {
    
    inline def apply(delete: () => js.Promise[Unit]): Delete = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete))
      __obj.asInstanceOf[Delete]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Delete] (val x: Self) extends AnyVal {
      
      inline def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
    }
  }
  
  trait Error[T] extends StObject {
    
    var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var error: js.UndefOr[js.Function1[/* error */ FirestoreError, Unit]] = js.undefined
    
    var next: js.UndefOr[js.Function1[/* snapshot */ QuerySnapshot[T], Unit]] = js.undefined
  }
  object Error {
    
    inline def apply[T](): Error[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Error[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Error[?], T] (val x: Self & Error[T]) extends AnyVal {
      
      inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setError(value: /* error */ FirestoreError => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setNext(value: /* snapshot */ QuerySnapshot[T] => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
  
  trait MockUserToken extends StObject {
    
    var mockUserToken: js.UndefOr[EmulatorMockTokenOptions | String] = js.undefined
  }
  object MockUserToken {
    
    inline def apply(): MockUserToken = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockUserToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MockUserToken] (val x: Self) extends AnyVal {
      
      inline def setMockUserToken(value: EmulatorMockTokenOptions | String): Self = StObject.set(x, "mockUserToken", value.asInstanceOf[js.Any])
      
      inline def setMockUserTokenUndefined: Self = StObject.set(x, "mockUserToken", js.undefined)
    }
  }
  
  trait Next extends StObject {
    
    var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var error: js.UndefOr[js.Function1[/* error */ FirestoreError, Unit]] = js.undefined
    
    var next: js.UndefOr[js.Function1[/* value */ Unit, Unit]] = js.undefined
  }
  object Next {
    
    inline def apply(): Next = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Next]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Next] (val x: Self) extends AnyVal {
      
      inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setError(value: /* error */ FirestoreError => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setNext(value: /* value */ Unit => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
  
  @js.native
  trait TypeofBlob
    extends StObject
       with Instantiable0[typings.firebaseFirestoreTypes.mod.Blob] {
    
    def fromBase64String(base64: String): typings.firebaseFirestoreTypes.mod.Blob = js.native
    
    def fromUint8Array(array: js.typedarray.Uint8Array): typings.firebaseFirestoreTypes.mod.Blob = js.native
  }
  
  @js.native
  trait TypeofFieldPath
    extends StObject
       with Instantiable1[/* fieldNames (repeated) */ String, FieldPath] {
    
    def documentId(): FieldPath = js.native
  }
  
  @js.native
  trait TypeofFieldValue
    extends StObject
       with Instantiable0[FieldValue] {
    
    def arrayRemove(elements: Any*): FieldValue = js.native
    
    def arrayUnion(elements: Any*): FieldValue = js.native
    
    def delete(): FieldValue = js.native
    
    def increment(n: Double): FieldValue = js.native
    
    def serverTimestamp(): FieldValue = js.native
  }
  
  @js.native
  trait TypeofTimestamp
    extends StObject
       with Instantiable2[/* seconds */ Double, /* nanoseconds */ Double, Timestamp] {
    
    def fromDate(date: js.Date): Timestamp = js.native
    
    def fromMillis(milliseconds: Double): Timestamp = js.native
    
    def now(): Timestamp = js.native
  }
}
