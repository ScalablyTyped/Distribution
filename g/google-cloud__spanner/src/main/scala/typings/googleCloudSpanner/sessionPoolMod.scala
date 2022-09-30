package typings.googleCloudSpanner

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.commonMod.NormalCallback
import typings.googleCloudSpanner.databaseMod.Database
import typings.googleCloudSpanner.sessionMod.Session
import typings.googleCloudSpanner.sessionMod.types
import typings.googleCloudSpanner.transactionMod.Transaction
import typings.googleGax.mod.GoogleError
import typings.grpcGrpcJs.callMod.ServiceError
import typings.node.eventsMod.EventEmitter
import typings.node.timersMod.global.NodeJS.Timer
import typings.pQueue.optionsMod.QueueAddOptions
import typings.pQueue.priorityQueueMod.default
import typings.stackTrace.mod.StackFrame
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionPoolMod {
  
  @JSImport("@google-cloud/spanner/build/src/session-pool", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@google-cloud/spanner/build/src/session-pool", "ReleaseError")
  @js.native
  open class ReleaseError protected () extends GoogleError {
    def this(resource: Any) = this()
    
    var resource: Any = js.native
  }
  
  @JSImport("@google-cloud/spanner/build/src/session-pool", "SessionLeakError")
  @js.native
  open class SessionLeakError protected () extends GoogleError {
    def this(leaks: js.Array[String]) = this()
    
    var messages: js.Array[String] = js.native
  }
  
  @JSImport("@google-cloud/spanner/build/src/session-pool", "SessionPool")
  @js.native
  open class SessionPool protected () extends SessionPoolInterface {
    /**
      * @constructor
      * @param {Database} database The DB instance.
      * @param {SessionPoolOptions} [options] Configuration options.
      */
    def this(database: Database) = this()
    def this(database: Database, options: SessionPoolOptions) = this()
    
    /**
      * Attempts to borrow a session from the pool.
      *
      * @private
      *
      * @param {string} type The desired type to borrow.
      * @returns {Promise<Session>}
      */
    def _acquire(`type`: types): js.Promise[Session] = js.native
    
    var _acquires: typings.pQueue.mod.default[default, QueueAddOptions] = js.native
    
    /**
      * Moves a session into the borrowed group.
      *
      * @private
      *
      * @param {Session} session The session object.
      */
    def _borrow(session: Session): Unit = js.native
    
    /**
      * Borrows the first session from specific group. This method may only be called if the inventory
      * actually contains a session of the desired type.
      *
      * @private
      *
      * @param {string} type The desired session type.
      * @return {Session}
      */
    def _borrowFrom(`type`: types): Session = js.native
    
    /**
      * Grabs the next available session.
      *
      * @private
      *
      * @param {string} type The desired session type.
      * @returns {Promise<Session>}
      */
    def _borrowNextAvailableSession(`type`: types): Session = js.native
    
    /**
      * Attempts to create a single session of a certain type.
      *
      * @private
      *
      * @param {string} type The desired type to create.
      * @returns {Promise}
      */
    def _createSession(`type`: types): js.Promise[Unit] = js.native
    
    /**
      * Batch creates sessions and prepares any necessary transactions.
      *
      * @private
      *
      * @param {object} [options] Config specifying how many sessions to create.
      * @returns {Promise}
      * @emits SessionPool#createError
      */
    def _createSessions(hasReadsWrites: CreateSessionsOptions): js.Promise[Unit] = js.native
    
    /**
      * Attempts to delete a session, optionally creating a new one of the same
      * type if the pool is still open and we're under the configured min value.
      *
      * @private
      *
      * @fires SessionPool#error
      * @param {Session} session The session to delete.
      * @returns {Promise}
      */
    def _destroy(session: Session): js.Promise[Unit] = js.native
    
    var _evictHandle: Timer = js.native
    
    /**
      * Deletes idle sessions that exceed the maxIdle configuration.
      *
      * @private
      */
    def _evictIdleSessions(): Unit = js.native
    
    /**
      * Fills the pool with the minimum number of sessions.
      *
      * @return {Promise}
      */
    def _fill(): js.Promise[Unit] = js.native
    
    /**
      * Retrieves a list of all the idle sessions.
      *
      * @private
      *
      * @returns {Session[]}
      */
    def _getIdleSessions(): js.Array[Session] = js.native
    
    /**
      * Returns stack traces for sessions that have not been released.
      *
      * @return {string[]}
      */
    def _getLeaks(): js.Array[String] = js.native
    
    /**
      * Attempts to get a session of a specific type. If the type is unavailable it
      * may try to use a different type.
      *
      * @private
      *
      * @param {string} type The desired session type.
      * @param {number} startTime Timestamp to use when determining timeouts.
      * @returns {Promise<Session>}
      */
    def _getSession(`type`: types, startTime: Double): js.Promise[Session] = js.native
    
    /**
      * Returns true if the pool has a session that is usable for the specified
      * type, i.e. if a read-only session is requested, it returns true if the
      * pool has a read-only or a read/write session. If a read/write session is
      * requested, the method only returns true if the pool has a read/write
      * session available.
      * @param type The type of session.
      * @private
      */
    def _hasSessionUsableFor(`type`: types): Boolean = js.native
    
    var _inventory: SessionInventory = js.native
    
    /**
      * Checks to see whether or not session is expired.
      *
      * @param {Session} session The session to check.
      * @returns {boolean}
      */
    def _isValidSession(session: Session): Boolean = js.native
    
    var _numInProcessPrepare: Double = js.native
    
    var _onClose: js.Promise[Unit] = js.native
    
    var _pending: Double = js.native
    
    var _pendingPrepare: Double = js.native
    
    /**
      * Pings an individual session.
      *
      * @private
      *
      * @param {Session} session The session to ping.
      * @returns {Promise}
      */
    def _ping(session: Session): js.Promise[Unit] = js.native
    
    var _pingHandle: Timer = js.native
    
    /**
      * Makes a keep alive request to all the idle sessions.
      *
      * @private
      *
      * @returns {Promise}
      */
    def _pingIdleSessions(): js.Promise[Unit] = js.native
    
    /**
      * Creates a transaction for a session.
      *
      * @private
      *
      * @param {Session} session The session object.
      * @param {object} options The transaction options.
      * @returns {Promise}
      */
    def _prepareTransaction(session: Session): js.Promise[Unit] = js.native
    
    /**
      * Releases a session back into the pool.
      *
      * @private
      *
      * @fires SessionPool#available
      * @fires SessionPool#readonly-available
      * @fires SessionPool#readwrite-available
      * @param {Session} session The session object.
      */
    def _release(session: Session): Unit = js.native
    
    var _requests: typings.pQueue.mod.default[default, QueueAddOptions] = js.native
    
    /**
      * Starts housekeeping (pinging/evicting) of idle sessions.
      *
      * @private
      */
    def _startHouseKeeping(): Unit = js.native
    
    /**
      * Stops housekeeping.
      *
      * @private
      */
    def _stopHouseKeeping(): Unit = js.native
    
    var _traces: Map[String, js.Array[StackFrame]] = js.native
    
    var _waiters: Waiters = js.native
    
    /**
      * Total number of available sessions.
      * @type {number}
      */
    def available: Double = js.native
    
    /**
      * Total number of borrowed sessions.
      * @type {number}
      */
    def borrowed: Double = js.native
    
    /**
      * Current fraction of write-prepared sessions in the pool.
      * @type {number}
      */
    def currentWriteFraction: Double = js.native
    
    var database: Database = js.native
    
    /**
      * Flag to determine if Pool is full.
      * @type {boolean}
      */
    def isFull: Boolean = js.native
    
    var isOpen: Boolean = js.native
    
    /**
      * Current number of waiters for a read-only session.
      * @type {number}
      */
    def numReadWaiters: Double = js.native
    
    /**
      * Current number of waiters for a read/write session.
      * @type {number}
      */
    def numWriteWaiters: Double = js.native
    
    var options: SessionPoolOptions = js.native
    
    /**
      * Number of sessions currently being prepared for a read/write transaction
      * before being released into the pool. This number does not include the
      * number of sessions being prepared for a read/write transaction that have
      * already been checked out of the pool.
      * @type {number}
      */
    def pendingPrepare: Double = js.native
    
    /**
      * Total number of read sessions.
      * @type {number}
      */
    def reads: Double = js.native
    
    /**
      * Total size of pool.
      * @type {number}
      */
    def size: Double = js.native
    
    /**
      * Number of sessions being created or prepared for a read/write transaction.
      * @type {number}
      */
    def totalPending: Double = js.native
    
    /**
      * Sum of read and write waiters.
      * @type {number}
      */
    def totalWaiters: Double = js.native
    
    /**
      * Total number of write sessions.
      * @type {number}
      */
    def writes: Double = js.native
  }
  /* static members */
  object SessionPool {
    
    @JSImport("@google-cloud/spanner/build/src/session-pool", "SessionPool")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Formats stack trace objects into Node-like stack trace.
      *
      * @param {object[]} trace The trace object.
      * @return {string}
      */
    inline def formatTrace(frames: js.Array[StackFrame]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatTrace")(frames.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("@google-cloud/spanner/build/src/session-pool", "SessionPoolExhaustedError")
  @js.native
  open class SessionPoolExhaustedError protected () extends GoogleError {
    def this(leaks: js.Array[String]) = this()
    
    var messages: js.Array[String] = js.native
  }
  
  inline def isCreateSessionPermissionError(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCreateSessionPermissionError")().asInstanceOf[Boolean]
  inline def isCreateSessionPermissionError(error: ServiceError): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCreateSessionPermissionError")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDatabaseNotFoundError(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDatabaseNotFoundError")().asInstanceOf[Boolean]
  inline def isDatabaseNotFoundError(error: ServiceError): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDatabaseNotFoundError")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDefaultCredentialsNotSetError(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefaultCredentialsNotSetError")().asInstanceOf[Boolean]
  inline def isDefaultCredentialsNotSetError(error: ServiceError): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefaultCredentialsNotSetError")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isInstanceNotFoundError(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstanceNotFoundError")().asInstanceOf[Boolean]
  inline def isInstanceNotFoundError(error: ServiceError): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstanceNotFoundError")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isProjectIdNotSetInEnvironmentError(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isProjectIdNotSetInEnvironmentError")().asInstanceOf[Boolean]
  inline def isProjectIdNotSetInEnvironmentError(error: ServiceError): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isProjectIdNotSetInEnvironmentError")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSessionNotFoundError(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSessionNotFoundError")().asInstanceOf[Boolean]
  inline def isSessionNotFoundError(error: ServiceError): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSessionNotFoundError")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait CreateSessionsOptions extends StObject {
    
    var reads: js.UndefOr[Double] = js.undefined
    
    var writes: js.UndefOr[Double] = js.undefined
  }
  object CreateSessionsOptions {
    
    inline def apply(): CreateSessionsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateSessionsOptions]
    }
    
    extension [Self <: CreateSessionsOptions](x: Self) {
      
      inline def setReads(value: Double): Self = StObject.set(x, "reads", value.asInstanceOf[js.Any])
      
      inline def setReadsUndefined: Self = StObject.set(x, "reads", js.undefined)
      
      inline def setWrites(value: Double): Self = StObject.set(x, "writes", value.asInstanceOf[js.Any])
      
      inline def setWritesUndefined: Self = StObject.set(x, "writes", js.undefined)
    }
  }
  
  type GetReadSessionCallback = NormalCallback[Session]
  
  type GetWriteSessionCallback = js.Function3[
    /* err */ js.Error | Null, 
    /* session */ js.UndefOr[Session | Null], 
    /* transaction */ js.UndefOr[Transaction | Null], 
    Unit
  ]
  
  @js.native
  trait SessionInventory extends StObject {
    
    var borrowed: Set[Session] = js.native
  }
  
  type SessionPoolCloseCallback = js.Function1[/* error */ js.UndefOr[SessionLeakError], Unit]
  
  @js.native
  trait SessionPoolInterface extends EventEmitter {
    
    /**
      * Will be called via {@link Database#close}. Indicates that the pool should
      * perform any necessary teardown actions to its resources.
      *
      * @name SessionPoolInterface#close
      * @param {SessionPoolCloseCallback} callback The callback function.
      */
    /**
      * Will be called by the Database object, should be used to start creating
      * sessions/etc.
      *
      * @name SessionPoolInterface#open
      */
    /**
      * When called returns a read-only session.
      *
      * @name SessionPoolInterface#getReadSession
      * @param {GetReadSessionCallback} callback The callback function.
      */
    /**
      * When called returns a read-write session with prepared transaction.
      *
      * @name SessionPoolInterface#getWriteSession
      * @param {GetWriteSessionCallback} callback The callback function.
      */
    /**
      * To be called when releasing a session back into the pool.
      *
      * @name SessionPoolInterface#release
      * @param {Session} session The session to be released.
      */
    def close(callback: SessionPoolCloseCallback): Unit = js.native
    
    def getReadSession(callback: GetReadSessionCallback): Unit = js.native
    
    def getWriteSession(callback: GetWriteSessionCallback): Unit = js.native
    
    def open(): Unit = js.native
    
    def release(session: Session): Unit = js.native
  }
  
  trait SessionPoolOptions extends StObject {
    
    var acquireTimeout: js.UndefOr[Double] = js.undefined
    
    var concurrency: js.UndefOr[Double] = js.undefined
    
    var fail: js.UndefOr[Boolean] = js.undefined
    
    var idlesAfter: js.UndefOr[Double] = js.undefined
    
    var incStep: js.UndefOr[Double] = js.undefined
    
    var keepAlive: js.UndefOr[Double] = js.undefined
    
    var labels: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var maxIdle: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var writes: js.UndefOr[Double] = js.undefined
  }
  object SessionPoolOptions {
    
    inline def apply(): SessionPoolOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionPoolOptions]
    }
    
    extension [Self <: SessionPoolOptions](x: Self) {
      
      inline def setAcquireTimeout(value: Double): Self = StObject.set(x, "acquireTimeout", value.asInstanceOf[js.Any])
      
      inline def setAcquireTimeoutUndefined: Self = StObject.set(x, "acquireTimeout", js.undefined)
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      inline def setFail(value: Boolean): Self = StObject.set(x, "fail", value.asInstanceOf[js.Any])
      
      inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
      
      inline def setIdlesAfter(value: Double): Self = StObject.set(x, "idlesAfter", value.asInstanceOf[js.Any])
      
      inline def setIdlesAfterUndefined: Self = StObject.set(x, "idlesAfter", js.undefined)
      
      inline def setIncStep(value: Double): Self = StObject.set(x, "incStep", value.asInstanceOf[js.Any])
      
      inline def setIncStepUndefined: Self = StObject.set(x, "incStep", js.undefined)
      
      inline def setKeepAlive(value: Double): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxIdle(value: Double): Self = StObject.set(x, "maxIdle", value.asInstanceOf[js.Any])
      
      inline def setMaxIdleUndefined: Self = StObject.set(x, "maxIdle", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setWrites(value: Double): Self = StObject.set(x, "writes", value.asInstanceOf[js.Any])
      
      inline def setWritesUndefined: Self = StObject.set(x, "writes", js.undefined)
    }
  }
  
  @js.native
  trait Waiters extends StObject
}
