package typings.erisSharder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bot extends StObject {
    
    var bot: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eris.Client */ Any
    
    var clusterID: Double
  }
  object Bot {
    
    inline def apply(
      bot: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eris.Client */ Any,
      clusterID: Double
    ): Bot = {
      val __obj = js.Dynamic.literal(bot = bot.asInstanceOf[js.Any], clusterID = clusterID.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bot]
    }
    
    extension [Self <: Bot](x: Self) {
      
      inline def setBot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eris.Client */ Any
      ): Self = StObject.set(x, "bot", value.asInstanceOf[js.Any])
      
      inline def setClusterID(value: Double): Self = StObject.set(x, "clusterID", value.asInstanceOf[js.Any])
    }
  }
  
  trait Broadcast extends StObject {
    
    def broadcast(name: String, message: Any): Unit
    
    def fetchChannel(id: String): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eris.Channel */ Any
      ]
    
    def fetchGuild(id: String): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eris.Guild */ Any
      ]
    
    def fetchUser(id: String): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eris.User */ Any
      ]
    
    def register(event: String, callback: js.Function0[Any]): Unit
    
    def sendTo(cluster: Double, name: String, message: Any): Unit
    
    def unregister(event: String): Unit
  }
  object Broadcast {
    
    inline def apply(
      broadcast: (String, Any) => Unit,
      fetchChannel: String => js.Promise[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eris.Channel */ Any
        ],
      fetchGuild: String => js.Promise[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eris.Guild */ Any
        ],
      fetchUser: String => js.Promise[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eris.User */ Any
        ],
      register: (String, js.Function0[Any]) => Unit,
      sendTo: (Double, String, Any) => Unit,
      unregister: String => Unit
    ): Broadcast = {
      val __obj = js.Dynamic.literal(broadcast = js.Any.fromFunction2(broadcast), fetchChannel = js.Any.fromFunction1(fetchChannel), fetchGuild = js.Any.fromFunction1(fetchGuild), fetchUser = js.Any.fromFunction1(fetchUser), register = js.Any.fromFunction2(register), sendTo = js.Any.fromFunction3(sendTo), unregister = js.Any.fromFunction1(unregister))
      __obj.asInstanceOf[Broadcast]
    }
    
    extension [Self <: Broadcast](x: Self) {
      
      inline def setBroadcast(value: (String, Any) => Unit): Self = StObject.set(x, "broadcast", js.Any.fromFunction2(value))
      
      inline def setFetchChannel(
        value: String => js.Promise[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eris.Channel */ Any
            ]
      ): Self = StObject.set(x, "fetchChannel", js.Any.fromFunction1(value))
      
      inline def setFetchGuild(
        value: String => js.Promise[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eris.Guild */ Any
            ]
      ): Self = StObject.set(x, "fetchGuild", js.Any.fromFunction1(value))
      
      inline def setFetchUser(
        value: String => js.Promise[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eris.User */ Any
            ]
      ): Self = StObject.set(x, "fetchUser", js.Any.fromFunction1(value))
      
      inline def setRegister(value: (String, js.Function0[Any]) => Unit): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
      
      inline def setSendTo(value: (Double, String, Any) => Unit): Self = StObject.set(x, "sendTo", js.Any.fromFunction3(value))
      
      inline def setUnregister(value: String => Unit): Self = StObject.set(x, "unregister", js.Any.fromFunction1(value))
    }
  }
  
  trait ClientOptions extends StObject {
    
    var clientOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eris.ClientOptions */ Any
    
    var clusterTimeout: js.UndefOr[Double] = js.undefined
    
    var clusters: js.UndefOr[Double] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var firstShardID: js.UndefOr[Double] = js.undefined
    
    var guildsPerShard: js.UndefOr[Double] = js.undefined
    
    var lastShardID: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var shards: js.UndefOr[Double] = js.undefined
    
    var stats: js.UndefOr[Boolean] = js.undefined
    
    var statsInterval: js.UndefOr[Double] = js.undefined
    
    var webhooks: js.UndefOr[Cluster] = js.undefined
  }
  object ClientOptions {
    
    inline def apply(
      clientOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eris.ClientOptions */ Any
    ): ClientOptions = {
      val __obj = js.Dynamic.literal(clientOptions = clientOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientOptions]
    }
    
    extension [Self <: ClientOptions](x: Self) {
      
      inline def setClientOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eris.ClientOptions */ Any
      ): Self = StObject.set(x, "clientOptions", value.asInstanceOf[js.Any])
      
      inline def setClusterTimeout(value: Double): Self = StObject.set(x, "clusterTimeout", value.asInstanceOf[js.Any])
      
      inline def setClusterTimeoutUndefined: Self = StObject.set(x, "clusterTimeout", js.undefined)
      
      inline def setClusters(value: Double): Self = StObject.set(x, "clusters", value.asInstanceOf[js.Any])
      
      inline def setClustersUndefined: Self = StObject.set(x, "clusters", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setFirstShardID(value: Double): Self = StObject.set(x, "firstShardID", value.asInstanceOf[js.Any])
      
      inline def setFirstShardIDUndefined: Self = StObject.set(x, "firstShardID", js.undefined)
      
      inline def setGuildsPerShard(value: Double): Self = StObject.set(x, "guildsPerShard", value.asInstanceOf[js.Any])
      
      inline def setGuildsPerShardUndefined: Self = StObject.set(x, "guildsPerShard", js.undefined)
      
      inline def setLastShardID(value: Double): Self = StObject.set(x, "lastShardID", value.asInstanceOf[js.Any])
      
      inline def setLastShardIDUndefined: Self = StObject.set(x, "lastShardID", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setShards(value: Double): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
      
      inline def setShardsUndefined: Self = StObject.set(x, "shards", js.undefined)
      
      inline def setStats(value: Boolean): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsInterval(value: Double): Self = StObject.set(x, "statsInterval", value.asInstanceOf[js.Any])
      
      inline def setStatsIntervalUndefined: Self = StObject.set(x, "statsInterval", js.undefined)
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      inline def setWebhooks(value: Cluster): Self = StObject.set(x, "webhooks", value.asInstanceOf[js.Any])
      
      inline def setWebhooksUndefined: Self = StObject.set(x, "webhooks", js.undefined)
    }
  }
  
  trait Cluster extends StObject {
    
    var cluster: js.UndefOr[Any] = js.undefined
    
    var shard: js.UndefOr[Any] = js.undefined
  }
  object Cluster {
    
    inline def apply(): Cluster = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cluster]
    }
    
    extension [Self <: Cluster](x: Self) {
      
      inline def setCluster(value: Any): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
      
      inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
      
      inline def setShard(value: Any): Self = StObject.set(x, "shard", value.asInstanceOf[js.Any])
      
      inline def setShardUndefined: Self = StObject.set(x, "shard", js.undefined)
    }
  }
}
