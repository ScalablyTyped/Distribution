package typings.expressBruteRedis

import org.scalablytyped.runtime.StringDictionary
import typings.redis.mod.RedisClient
import typings.redis.mod.RetryStrategy
import typings.redis.mod.RetryStrategyOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined redis.redis.ClientOpts & {  client :redis.redis.RedisClient | undefined,   prefix :string | undefined,   host :string | undefined,   port :number | string | undefined} */
  @js.native
  trait ClientOptsclientRedisClie extends StObject {
    
    var auth_pass: js.UndefOr[String] = js.native
    
    var client: js.UndefOr[RedisClient] = js.native
    
    var connect_timeout: js.UndefOr[Double] = js.native
    
    /**
      * If set, client will run Redis **select** command on connect.
      * @default null
      */
    var db: js.UndefOr[String | Double] = js.native
    
    /**
      * If set to `true`, then replies will be sent to callbacks as Buffers.
      * This option lets you switch between Buffers and Strings on a per-command basis,
      * whereas `return_buffers` applies to every command on a client.\
      * **Note**: This doesn't work properly with the pubsub mode.
      * A subscriber has to either always return Strings or Buffers.
      * @default false
      */
    var detect_buffers: js.UndefOr[Boolean] = js.native
    
    /**
      * If set to `true`, a client won't resubscribe after disconnecting.
      * @default false
      */
    var disable_resubscribing: js.UndefOr[Boolean] = js.native
    
    /**
      * By default, if there is no active connection to the Redis server,
      * commands are added to a queue and are executed once the connection has been established.
      * Setting `enable_offline_queue` to `false` will disable this feature
      * and the callback will be executed immediately with an error,
      * or an error will be emitted if no callback is specified.
      * @default true
      */
    var enable_offline_queue: js.UndefOr[Boolean] = js.native
    
    /**
      * You can force using IPv6 if you set the family to **IPv6**.
      * @see Node.js [net](https://nodejs.org/api/net.html)
      * or [dns](https://nodejs.org/api/dns.html)
      * modules on how to use the family type.
      * @default IPv4
      */
    var family: js.UndefOr[String] = js.native
    
    /**
      * IP address of the Redis server.
      * @default 127.0.0.1
      */
    var host: js.UndefOr[String] = js.native
    
    var max_attempts: js.UndefOr[Double] = js.native
    
    /**
      * When a connection is established to the Redis server,
      * the server might still be loading the database from disk.
      * While loading, the server will not respond to any commands.
      * To work around this, Node Redis has a "ready check" which sends the **INFO** command to the server.
      * The response from the **INFO** command indicates whether the server is ready for more commands.
      * When ready, **node_redis** emits a **ready** event.
      * Setting `no_ready_check` to `true` will inhibit this check.
      * @default false
      */
    var no_ready_check: js.UndefOr[Boolean] = js.native
    
    var parser: js.UndefOr[String] = js.native
    
    /**
      * If set, client will run Redis auth command on connect.
      * Alias `auth_pass`.\
      * **Note**: Node Redis < 2.5 must use `auth_pass`.
      * @default null
      */
    var password: js.UndefOr[String] = js.native
    
    /**
      * The UNIX socket string of the Redis server.
      * @default null
      */
    var path: js.UndefOr[String] = js.native
    
    /**
      * Port of the Redis server.
      * @default 6379
      */
    var port: js.UndefOr[Double] with (js.UndefOr[Double | String]) = js.native
    
    /**
      * A string used to prefix all used keys (e.g. namespace:test).
      * Please be aware that the **keys** command will not be prefixed.
      * The **keys** command has a "pattern" as argument and no key
      * and it would be impossible to determine the existing keys in Redis if this would be prefixed.
      * @default null
      */
    var prefix: js.UndefOr[String] = js.native
    
    /**
      * Passing an object with renamed commands to use instead of the original functions.
      * For example, if you renamed the command **KEYS** to "DO-NOT-USE"
      * then the `rename_commands` object would be: { KEYS : "DO-NOT-USE" }.
      * @see the [Redis security topics](http://redis.io/topics/security) for more info.
      * @default null
      */
    var rename_commands: js.UndefOr[StringDictionary[String] | Null] = js.native
    
    var retry_max_delay: js.UndefOr[Double] = js.native
    
    /**
      * A function that receives an options object as parameter including the retry `attempt`,
      * the `total_retry_time` indicating how much time passed since the last time connected,
      * the **error** why the connection was lost and the number of `times_connected` in total.
      * If you return a number from this function, the retry will happen after that time in milliseconds.
      * If you return a non-number, no further retry will happen
      * and all offline commands are flushed with errors.
      * Return an error to return that specific error to all offline commands.
      * @default function
      * @see interface `RetryStrategyOptions`
      * @example
      * const client = redis.createClient({
      *   retry_strategy: function(options) {
      *   if (options.error && options.error.code === "ECONNREFUSED") {
      *     // End reconnecting on a specific error and flush all commands with
      *     // a individual error
      *     return new Error("The server refused the connection");
      *   }
      *   if (options.total_retry_time > 1000 * 60 * 60) {
      *     // End reconnecting after a specific timeout and flush all commands
      *     // with a individual error
      *     return new Error("Retry time exhausted");
      *   }
      *   if (options.attempt > 10) {
      *     // End reconnecting with built in error
      *     return undefined;
      *   }
      *   // reconnect after
      *   return Math.min(options.attempt * 100, 3000);
      *   }
      * });
      */
    var retry_strategy: js.UndefOr[RetryStrategy] = js.native
    
    /**
      * If set to `true`, all commands that were unfulfilled while the connection is lost
      * will be retried after the connection has been reestablished.
      * Use this with caution if you use state altering commands (e.g. incr).
      * This is especially useful if you use blocking commands.
      * @default false
      */
    var retry_unfulfilled_commands: js.UndefOr[Boolean] = js.native
    
    /**
      * If set to `true`, then all replies will be sent to callbacks as Buffers instead of Strings.
      * @default false
      */
    var return_buffers: js.UndefOr[Boolean] = js.native
    
    /**
      * Initial Delay in milliseconds.
      * This will also set the initial delay for keep-alive packets being sent to Redis.
      * @default 0
      */
    var socket_initial_delay: js.UndefOr[Double] = js.native
    
    /**
      * If set to `true`, the keep-alive functionality is enabled on the underlying socket.
      * @default true
      */
    var socket_keepalive: js.UndefOr[Boolean] = js.native
    
    /**
      * Set to `true`, Node Redis will return Redis number values as Strings instead of javascript Numbers.
      * Useful if you need to handle big numbers (above `Number.MAX_SAFE_INTEGER` === 2^53).
      * Hiredis is incapable of this behavior, so setting this option to `true`
      * will result in the built-in javascript parser being used no matter
      * the value of the `parser` option.
      * @default null
      */
    var string_numbers: js.UndefOr[Boolean] = js.native
    
    /**
      * An object containing options to pass to
      * [tls.connect](http://nodejs.org/api/tls.html#tls_tls_connect_port_host_options_callback)
      * to set up a TLS connection to Redis
      * (if, for example, it is set up to be accessible via a tunnel).
      * @default null
      */
    var tls: js.UndefOr[js.Any] = js.native
    
    /**
      * The URL of the Redis server.\
      * Format:
      * [redis[s]:]//[[user][:password@]][host][:port][/db-number][?db=db-number[&password=bar[&option=value]]]\
      * More info avaliable at [IANA](http://www.iana.org/assignments/uri-schemes/prov/redis).
      * @default null
      */
    var url: js.UndefOr[String] = js.native
  }
  object ClientOptsclientRedisClie {
    
    @scala.inline
    def apply(port: js.UndefOr[Double] with (js.UndefOr[Double | String])): ClientOptsclientRedisClie = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientOptsclientRedisClie]
    }
    
    @scala.inline
    implicit class ClientOptsclientRedisClieMutableBuilder[Self <: ClientOptsclientRedisClie] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth_pass(value: String): Self = StObject.set(x, "auth_pass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuth_passUndefined: Self = StObject.set(x, "auth_pass", js.undefined)
      
      @scala.inline
      def setClient(value: RedisClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      @scala.inline
      def setConnect_timeout(value: Double): Self = StObject.set(x, "connect_timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnect_timeoutUndefined: Self = StObject.set(x, "connect_timeout", js.undefined)
      
      @scala.inline
      def setDb(value: String | Double): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
      
      @scala.inline
      def setDetect_buffers(value: Boolean): Self = StObject.set(x, "detect_buffers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetect_buffersUndefined: Self = StObject.set(x, "detect_buffers", js.undefined)
      
      @scala.inline
      def setDisable_resubscribing(value: Boolean): Self = StObject.set(x, "disable_resubscribing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisable_resubscribingUndefined: Self = StObject.set(x, "disable_resubscribing", js.undefined)
      
      @scala.inline
      def setEnable_offline_queue(value: Boolean): Self = StObject.set(x, "enable_offline_queue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnable_offline_queueUndefined: Self = StObject.set(x, "enable_offline_queue", js.undefined)
      
      @scala.inline
      def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setMax_attempts(value: Double): Self = StObject.set(x, "max_attempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_attemptsUndefined: Self = StObject.set(x, "max_attempts", js.undefined)
      
      @scala.inline
      def setNo_ready_check(value: Boolean): Self = StObject.set(x, "no_ready_check", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNo_ready_checkUndefined: Self = StObject.set(x, "no_ready_check", js.undefined)
      
      @scala.inline
      def setParser(value: String): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPort(value: js.UndefOr[Double] with (js.UndefOr[Double | String])): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setRename_commands(value: StringDictionary[String]): Self = StObject.set(x, "rename_commands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRename_commandsNull: Self = StObject.set(x, "rename_commands", null)
      
      @scala.inline
      def setRename_commandsUndefined: Self = StObject.set(x, "rename_commands", js.undefined)
      
      @scala.inline
      def setRetry_max_delay(value: Double): Self = StObject.set(x, "retry_max_delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetry_max_delayUndefined: Self = StObject.set(x, "retry_max_delay", js.undefined)
      
      @scala.inline
      def setRetry_strategy(value: /* options */ RetryStrategyOptions => Double | Error | js.Any): Self = StObject.set(x, "retry_strategy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRetry_strategyUndefined: Self = StObject.set(x, "retry_strategy", js.undefined)
      
      @scala.inline
      def setRetry_unfulfilled_commands(value: Boolean): Self = StObject.set(x, "retry_unfulfilled_commands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetry_unfulfilled_commandsUndefined: Self = StObject.set(x, "retry_unfulfilled_commands", js.undefined)
      
      @scala.inline
      def setReturn_buffers(value: Boolean): Self = StObject.set(x, "return_buffers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturn_buffersUndefined: Self = StObject.set(x, "return_buffers", js.undefined)
      
      @scala.inline
      def setSocket_initial_delay(value: Double): Self = StObject.set(x, "socket_initial_delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocket_initial_delayUndefined: Self = StObject.set(x, "socket_initial_delay", js.undefined)
      
      @scala.inline
      def setSocket_keepalive(value: Boolean): Self = StObject.set(x, "socket_keepalive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocket_keepaliveUndefined: Self = StObject.set(x, "socket_keepalive", js.undefined)
      
      @scala.inline
      def setString_numbers(value: Boolean): Self = StObject.set(x, "string_numbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setString_numbersUndefined: Self = StObject.set(x, "string_numbers", js.undefined)
      
      @scala.inline
      def setTls(value: js.Any): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
