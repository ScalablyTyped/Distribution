package typings.firebaseDatabase

import org.scalablytyped.runtime.Instantiable2
import typings.firebaseDatabase.eventRegistrationMod.QueryContext
import typings.firebaseDatabase.pathMod.Path
import typings.firebaseDatabase.queryParamsMod.QueryParams
import typings.firebaseDatabase.repoMod.Repo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object referenceMod {
  
  @js.native
  trait DatabaseReference
    extends StObject
       with Query {
    
    /**
      * The last part of the `DatabaseReference`'s path.
      *
      * For example, `"ada"` is the key for
      * `https://<DATABASE_NAME>.firebaseio.com/users/ada`.
      *
      * The key of a root `DatabaseReference` is `null`.
      */
    val key: String | Null = js.native
    
    /**
      * The parent location of a `DatabaseReference`.
      *
      * The parent of a root `DatabaseReference` is `null`.
      */
    val parent: DatabaseReference | Null = js.native
    
    /** The root `DatabaseReference` of the Database. */
    val root: DatabaseReference = js.native
  }
  
  trait ListenOptions extends StObject {
    
    /** Whether to remove the listener after its first invocation. */
    val onlyOnce: js.UndefOr[Boolean] = js.undefined
  }
  object ListenOptions {
    
    inline def apply(): ListenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListenOptions]
    }
    
    extension [Self <: ListenOptions](x: Self) {
      
      inline def setOnlyOnce(value: Boolean): Self = StObject.set(x, "onlyOnce", value.asInstanceOf[js.Any])
      
      inline def setOnlyOnceUndefined: Self = StObject.set(x, "onlyOnce", js.undefined)
    }
  }
  
  @js.native
  trait Query
    extends StObject
       with QueryContext {
    
    /**
      * Returns whether or not the current and provided queries represent the same
      * location, have the same query parameters, and are from the same instance of
      * `FirebaseApp`.
      *
      * Two `DatabaseReference` objects are equivalent if they represent the same location
      * and are from the same instance of `FirebaseApp`.
      *
      * Two `Query` objects are equivalent if they represent the same location,
      * have the same query parameters, and are from the same instance of
      * `FirebaseApp`. Equivalent queries share the same sort order, limits, and
      * starting and ending points.
      *
      * @param other - The query to compare against.
      * @returns Whether or not the current and provided queries are equivalent.
      */
    def isEqual(): Boolean = js.native
    def isEqual(other: Query): Boolean = js.native
    
    /** The `DatabaseReference` for the `Query`'s location. */
    val ref: DatabaseReference = js.native
    
    /**
      * Returns a JSON-serializable representation of this object.
      *
      * @returns A JSON-serializable representation of this object.
      */
    def toJSON(): String = js.native
  }
  
  @js.native
  trait ReferenceConstructor
    extends StObject
       with Instantiable2[/* repo */ Repo, /* path */ Path, DatabaseReference]
  
  /* Inlined parent @firebase/database.@firebase/database/dist/node-esm/src/api/Reference.DatabaseReference */
  /* Inlined parent std.Pick<std.Promise<@firebase/database.@firebase/database/dist/node-esm/src/api/Reference.DatabaseReference>, 'then' | 'catch'> */
  @js.native
  trait ThenableReference extends StObject {
    
    val _path: Path = js.native
    
    val _queryIdentifier: String = js.native
    
    val _queryObject: js.Object = js.native
    
    val _queryParams: QueryParams = js.native
    
    val _repo: Repo = js.native
    
    def `catch`[TResult](): js.Promise[DatabaseReference | TResult] = js.native
    @JSName("catch")
    var catch_Original: js.Function0[js.Promise[DatabaseReference | scala.Nothing]] = js.native
    
    /**
      * Returns whether or not the current and provided queries represent the same
      * location, have the same query parameters, and are from the same instance of
      * `FirebaseApp`.
      *
      * Two `DatabaseReference` objects are equivalent if they represent the same location
      * and are from the same instance of `FirebaseApp`.
      *
      * Two `Query` objects are equivalent if they represent the same location,
      * have the same query parameters, and are from the same instance of
      * `FirebaseApp`. Equivalent queries share the same sort order, limits, and
      * starting and ending points.
      *
      * @param other - The query to compare against.
      * @returns Whether or not the current and provided queries are equivalent.
      */
    def isEqual(): Boolean = js.native
    def isEqual(other: Query): Boolean = js.native
    
    /**
      * The last part of the `DatabaseReference`'s path.
      *
      * For example, `"ada"` is the key for
      * `https://<DATABASE_NAME>.firebaseio.com/users/ada`.
      *
      * The key of a root `DatabaseReference` is `null`.
      */
    val key: String | Null = js.native
    
    /**
      * The parent location of a `DatabaseReference`.
      *
      * The parent of a root `DatabaseReference` is `null`.
      */
    val parent: DatabaseReference | Null = js.native
    
    /** The `DatabaseReference` for the `Query`'s location. */
    val ref: DatabaseReference = js.native
    
    /** The root `DatabaseReference` of the Database. */
    val root: DatabaseReference = js.native
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
    @JSName("then")
    var then_Original: js.Function0[js.Promise[DatabaseReference | scala.Nothing]] = js.native
    
    /**
      * Returns a JSON-serializable representation of this object.
      *
      * @returns A JSON-serializable representation of this object.
      */
    def toJSON(): String = js.native
  }
  
  type Unsubscribe = js.Function0[Unit]
}
