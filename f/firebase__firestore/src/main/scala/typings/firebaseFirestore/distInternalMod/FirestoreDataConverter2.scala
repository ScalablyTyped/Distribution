package typings.firebaseFirestore.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Converter used by `withConverter()` to transform user objects of type `T`
  * into Firestore data.
  *
  * Using the converter allows you to specify generic type arguments when
  * storing and retrieving objects from Firestore.
  *
  * @example
  * ```typescript
  * class Post {
  *   constructor(readonly title: string, readonly author: string) {}
  *
  *   toString(): string {
  *     return this.title + ', by ' + this.author;
  *   }
  * }
  *
  * const postConverter = {
  *   toFirestore(post: WithFieldValue<Post>): DocumentData {
  *     return {title: post.title, author: post.author};
  *   },
  *   fromFirestore(snapshot: QueryDocumentSnapshot): Post {
  *     const data = snapshot.data(options)!;
  *     return new Post(data.title, data.author);
  *   }
  * };
  *
  * const postSnap = await firebase.firestore()
  *   .collection('posts')
  *   .withConverter(postConverter)
  *   .doc().get();
  * const post = postSnap.data();
  * if (post !== undefined) {
  *   post.title; // string
  *   post.toString(); // Should be defined
  *   post.someNonExistentProperty; // TS error
  * }
  * ```
  */
@js.native
trait FirestoreDataConverter2[T] extends StObject {
  
  /**
    * Called by the Firestore SDK to convert Firestore data into an object of
    * type T. You can access your data by calling: `snapshot.data()`.
    *
    * @param snapshot - A `QueryDocumentSnapshot` containing your data and
    * metadata.
    */
  def fromFirestore(snapshot: QueryDocumentSnapshot2[DocumentData]): T = js.native
  
  /**
    * Called by the Firestore SDK to convert a custom model object of type `T`
    * into a plain Javascript object (suitable for writing directly to the
    * Firestore database). Used with {@link @firebase/firestore/lite#(setDoc:1)}, {@link @firebase/firestore/lite#(WriteBatch.set:1)}
    * and {@link @firebase/firestore/lite#(Transaction.set:1)} with `merge:true` or `mergeFields`.
    *
    * The `PartialWithFieldValue<T>` type extends `Partial<T>` to allow
    * FieldValues such as {@link (arrayUnion:1)} to be used as property values.
    * It also supports nested `Partial` by allowing nested fields to be
    * omitted.
    */
  def toFirestore(modelObject: PartialWithFieldValue[T], options: SetOptions): DocumentData = js.native
  /**
    * Called by the Firestore SDK to convert a custom model object of type `T`
    * into a plain Javascript object (suitable for writing directly to the
    * Firestore database). Used with {@link @firebase/firestore/lite#(setDoc:1)}, {@link @firebase/firestore/lite#(WriteBatch.set:1)}
    * and {@link @firebase/firestore/lite#(Transaction.set:1)}.
    *
    * The `WithFieldValue<T>` type extends `T` to also allow FieldValues such as
    * {@link (deleteField:1)} to be used as property values.
    */
  def toFirestore(modelObject: WithFieldValue[T]): DocumentData = js.native
}
