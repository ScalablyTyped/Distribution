package typings.firebaseDatabase

import typings.firebaseAppTypes.mod.FirebaseNamespace
import typings.firebaseDatabase.anon.Call
import typings.firebaseDatabase.anon.Sv
import typings.firebaseDatabase.anon.SvIncrement
import typings.firebaseDatabase.anon.TIMESTAMP
import typings.firebaseDatabase.indexMod.Index
import typings.firebaseDatabase.nodeMod.Node
import typings.firebaseDatabase.pathMod.Path
import typings.firebaseDatabase.queryParamsMod.QueryParams
import typings.firebaseDatabase.repoMod.Repo
import typings.firebaseDatabaseTypes.mod.FirebaseDatabase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@firebase/database", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database", "DataSnapshot")
  @js.native
  class DataSnapshot protected ()
    extends typings.firebaseDatabase.dataSnapshotMod.DataSnapshot {
    /**
      * @param {!Node} node_ A SnapshotNode to wrap.
      * @param {!Reference} ref_ The ref of the location this snapshot came from.
      * @param {!Index} index_ The iteration order for this snapshot
      */
    def this(node_ : Node, ref_ : typings.firebaseDatabase.referenceMod.Reference, index_ : Index) = this()
  }
  
  @JSImport("@firebase/database", "Database")
  @js.native
  class Database protected ()
    extends typings.firebaseDatabase.databaseMod.Database {
    /**
      * The constructor should not be called by users of our public API.
      * @param {!Repo} repoInternal_
      */
    def this(repoInternal_ : Repo) = this()
  }
  /* static members */
  object Database {
    
    @JSImport("@firebase/database", "Database.ServerValue")
    @js.native
    val ServerValue: TIMESTAMP = js.native
  }
  
  @JSImport("@firebase/database", "OnDisconnect")
  @js.native
  class OnDisconnect protected ()
    extends typings.firebaseDatabase.onDisconnectMod.OnDisconnect {
    /**
      * @param {!Repo} repo_
      * @param {!Path} path_
      */
    def this(repo_ : Repo, path_ : Path) = this()
  }
  
  @JSImport("@firebase/database", "Query")
  @js.native
  class Query protected ()
    extends typings.firebaseDatabase.queryMod.Query {
    def this(repo: Repo, path: Path, queryParams_ : QueryParams, orderByCalled_ : Boolean) = this()
  }
  /* static members */
  object Query {
    
    @JSImport("@firebase/database", "Query")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Helper used by .on and .once to extract the context and or cancel arguments.
      * @param {!string} fnName The function name (on or once)
      * @param {(function(Error)|Object)=} cancelOrContext
      * @param {Object=} context
      * @return {{cancel: ?function(Error), context: ?Object}}
      * @private
      */
    @JSImport("@firebase/database", "Query.getCancelAndContextArgs_")
    @js.native
    def getCancelAndContextArgs_ : js.Any = js.native
    @scala.inline
    def getCancelAndContextArgs__=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getCancelAndContextArgs_")(x.asInstanceOf[js.Any])
    
    /**
      * Validates that limit* has been called with the correct combination of parameters
      * @param {!QueryParams} params
      * @private
      */
    @JSImport("@firebase/database", "Query.validateLimit_")
    @js.native
    def validateLimit_ : js.Any = js.native
    @scala.inline
    def validateLimit__=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateLimit_")(x.asInstanceOf[js.Any])
    
    /**
      * Validates start/end values for queries.
      * @param {!QueryParams} params
      * @private
      */
    @JSImport("@firebase/database", "Query.validateQueryEndpoints_")
    @js.native
    def validateQueryEndpoints_ : js.Any = js.native
    @scala.inline
    def validateQueryEndpoints__=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateQueryEndpoints_")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@firebase/database", "Reference")
  @js.native
  class Reference protected ()
    extends typings.firebaseDatabase.referenceMod.Reference {
    /**
      * Call options:
      *   new Reference(Repo, Path) or
      *   new Reference(url: string, string|RepoManager)
      *
      * Externally - this is the firebase.database.Reference type.
      *
      * @param {!Repo} repo
      * @param {(!Path)} path
      * @extends {Query}
      */
    def this(repo: Repo, path: Path) = this()
  }
  
  object ServerValue {
    
    @JSImport("@firebase/database", "ServerValue")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@firebase/database", "ServerValue.TIMESTAMP")
    @js.native
    def TIMESTAMP: Sv = js.native
    @scala.inline
    def TIMESTAMP_=(x: Sv): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIMESTAMP")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def increment(delta: Double): SvIncrement = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(delta.asInstanceOf[js.Any]).asInstanceOf[SvIncrement]
  }
  
  @scala.inline
  def enableLogging(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")().asInstanceOf[Unit]
  @scala.inline
  def enableLogging(logger_ : js.Function1[/* a */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger_.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def enableLogging(logger_ : js.Function1[/* a */ String, Unit], persistent: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger_.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def enableLogging(logger_ : Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger_.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def enableLogging(logger_ : Boolean, persistent: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger_.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def enableLogging(logger_ : Unit, persistent: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger_.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def registerDatabase(instance: FirebaseNamespace): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerDatabase")(instance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* augmented module */
  object firebaseAppTypesAugmentingMod {
    
    trait FirebaseApp extends StObject {
      
      var database: js.UndefOr[js.Function1[/* databaseURL */ js.UndefOr[String], FirebaseDatabase]] = js.undefined
    }
    object FirebaseApp {
      
      @scala.inline
      def apply(): FirebaseApp = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FirebaseApp]
      }
      
      @scala.inline
      implicit class FirebaseAppMutableBuilder[Self <: FirebaseApp] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDatabase(value: /* databaseURL */ js.UndefOr[String] => FirebaseDatabase): Self = StObject.set(x, "database", js.Any.fromFunction1(value))
        
        @scala.inline
        def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      }
    }
    
    trait FirebaseNamespace extends StObject {
      
      var database: js.UndefOr[Call] = js.undefined
    }
    object FirebaseNamespace {
      
      @scala.inline
      def apply(): typings.firebaseDatabase.mod.firebaseAppTypesAugmentingMod.FirebaseNamespace = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.firebaseDatabase.mod.firebaseAppTypesAugmentingMod.FirebaseNamespace]
      }
      
      @scala.inline
      implicit class FirebaseNamespaceMutableBuilder[Self <: typings.firebaseDatabase.mod.firebaseAppTypesAugmentingMod.FirebaseNamespace] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDatabase(value: Call): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      }
    }
  }
}
