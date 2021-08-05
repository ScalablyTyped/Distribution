package typings.expressRedisCache

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.node.eventsMod.EventEmitter
import typings.redis.mod.RedisClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ExpressRedisCache = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ExpressRedisCache]
  inline def apply(options: Options): ExpressRedisCache = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[ExpressRedisCache]
  
  @JSImport("express-redis-cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("express-redis-cache", "ExpressRedisCache")
  @js.native
  class ExpressRedisCache () extends EventEmitter {
    def this(options: Options) = this()
    
    val FOREVER: Double = js.native
    
    def add(name: String, body: String, callback: js.Function2[/* error */ js.Any, /* added */ Entry, Unit]): Unit = js.native
    def add(
      name: String,
      body: String,
      options: AddOptions,
      callback: js.Function2[/* error */ js.Any, /* added */ Entry, Unit]
    ): Unit = js.native
    
    var auth_pass: String = js.native
    
    var client: RedisClient = js.native
    
    var connected: Boolean = js.native
    
    def del(name: String, callback: js.Function2[/* error */ js.Any, /* deleted */ Double, Unit]): Unit = js.native
    
    var expire: Double = js.native
    
    def get(callback: js.Function2[/* error */ js.Any, /* entries */ js.Array[Entry], Unit]): Unit = js.native
    def get(name: String, callback: js.Function2[/* error */ js.Any, /* entries */ js.Array[Entry], Unit]): Unit = js.native
    
    var host: String = js.native
    
    var options: Options = js.native
    
    var port: String | Double = js.native
    
    var prefix: String = js.native
    
    def route(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
    def route(expire: Double): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
    def route(nameOrOptions: String): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
    def route(nameOrOptions: String, expire: ExpireOption): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
    def route(nameOrOptions: RouteOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
    def route(nameOrOptions: RouteOptions, expire: ExpireOption): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
    
    def size(callback: js.Function2[/* error */ js.Any, /* bytes */ Double, Unit]): Unit = js.native
  }
  object ExpressRedisCache {
    
    @JSImport("express-redis-cache", "ExpressRedisCache")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def init(): ExpressRedisCache = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[ExpressRedisCache]
    inline def init(options: Options): ExpressRedisCache = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[ExpressRedisCache]
  }
  
  trait AddOptions extends StObject {
    
    var expire: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AddOptions {
    
    inline def apply(): AddOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddOptions]
    }
    
    extension [Self <: AddOptions](x: Self) {
      
      inline def setExpire(value: Double): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
      
      inline def setExpireUndefined: Self = StObject.set(x, "expire", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Entry extends StObject {
    
    var body: String
    
    var expire: Double
    
    var touched: Double
    
    var `type`: String
  }
  object Entry {
    
    inline def apply(body: String, expire: Double, touched: Double, `type`: String): Entry = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], expire = expire.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    extension [Self <: Entry](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setExpire(value: Double): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
      
      inline def setTouched(value: Double): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ExpirationConfig = StringDictionary[Double]
  
  type ExpirationPolicy = js.Function2[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    Double
  ]
  
  type ExpireOption = Double | ExpirationConfig
  
  trait Options extends StObject {
    
    var auth_pass: js.UndefOr[String] = js.undefined
    
    var client: js.UndefOr[RedisClient] = js.undefined
    
    var expire: js.UndefOr[Double] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[String | Double] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAuth_pass(value: String): Self = StObject.set(x, "auth_pass", value.asInstanceOf[js.Any])
      
      inline def setAuth_passUndefined: Self = StObject.set(x, "auth_pass", js.undefined)
      
      inline def setClient(value: RedisClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setExpire(value: Double): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
      
      inline def setExpireUndefined: Self = StObject.set(x, "expire", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  trait RouteOptions extends StObject {
    
    var binary: js.UndefOr[Boolean] = js.undefined
    
    var expire: js.UndefOr[ExpireOption | ExpirationPolicy] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object RouteOptions {
    
    inline def apply(): RouteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteOptions]
    }
    
    extension [Self <: RouteOptions](x: Self) {
      
      inline def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      inline def setExpire(value: ExpireOption | ExpirationPolicy): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
      
      inline def setExpireFunction2(
        value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => Double
      ): Self = StObject.set(x, "expire", js.Any.fromFunction2(value))
      
      inline def setExpireUndefined: Self = StObject.set(x, "expire", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  object expressServeStaticCoreAugmentingMod {
    
    trait Response extends StObject {
      
      var express_redis_cache_name: js.UndefOr[String] = js.undefined
      
      var use_express_redis_cache: js.UndefOr[Boolean] = js.undefined
    }
    object Response {
      
      inline def apply(): Response = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Response]
      }
      
      extension [Self <: Response](x: Self) {
        
        inline def setExpress_redis_cache_name(value: String): Self = StObject.set(x, "express_redis_cache_name", value.asInstanceOf[js.Any])
        
        inline def setExpress_redis_cache_nameUndefined: Self = StObject.set(x, "express_redis_cache_name", js.undefined)
        
        inline def setUse_express_redis_cache(value: Boolean): Self = StObject.set(x, "use_express_redis_cache", value.asInstanceOf[js.Any])
        
        inline def setUse_express_redis_cacheUndefined: Self = StObject.set(x, "use_express_redis_cache", js.undefined)
      }
    }
  }
}
