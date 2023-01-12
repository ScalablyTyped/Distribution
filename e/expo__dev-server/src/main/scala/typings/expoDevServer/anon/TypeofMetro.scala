package typings.expoDevServer.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.metro.mod.HttpServer
import typings.metro.mod.HttpsServer
import typings.metro.mod.RunServerOptions
import typings.metroConfig.configTypesMod.ConfigT
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofMetro extends StObject {
  
  /**
    * @since v0.1.17
    */
  var HttpServer: Instantiable0[
    typings.metro.mod.HttpServer[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ]
  ]
  
  /**
    * See `http.Server` for more information.
    * @since v0.3.4
    */
  var HttpsServer: Instantiable0[
    typings.metro.mod.HttpsServer[
      Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
      ]
    ]
  ]
  
  var Server: TypeofServer
  
  def runServer(config: ConfigT, options: RunServerOptions): js.Promise[
    (Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ]) | (typings.node.httpsMod.Server[
      Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
      ]
    ])
  ]
}
object TypeofMetro {
  
  inline def apply(
    HttpServer: Instantiable0[
      HttpServer[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ]
    ],
    HttpsServer: Instantiable0[
      HttpsServer[
        Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
        ]
      ]
    ],
    Server: TypeofServer,
    runServer: (ConfigT, RunServerOptions) => js.Promise[
      (Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ]) | (typings.node.httpsMod.Server[
        Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
        ]
      ])
    ]
  ): TypeofMetro = {
    val __obj = js.Dynamic.literal(HttpServer = HttpServer.asInstanceOf[js.Any], HttpsServer = HttpsServer.asInstanceOf[js.Any], Server = Server.asInstanceOf[js.Any], runServer = js.Any.fromFunction2(runServer))
    __obj.asInstanceOf[TypeofMetro]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofMetro] (val x: Self) extends AnyVal {
    
    inline def setHttpServer(
      value: Instantiable0[
          HttpServer[
            Instantiable1[/* socket */ Socket, IncomingMessage], 
            Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
              ServerResponse[IncomingMessage]
            ]
          ]
        ]
    ): Self = StObject.set(x, "HttpServer", value.asInstanceOf[js.Any])
    
    inline def setHttpsServer(
      value: Instantiable0[
          HttpsServer[
            Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage], 
            Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
              typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
            ]
          ]
        ]
    ): Self = StObject.set(x, "HttpsServer", value.asInstanceOf[js.Any])
    
    inline def setRunServer(
      value: (ConfigT, RunServerOptions) => js.Promise[
          (Server[
            Instantiable1[/* socket */ Socket, IncomingMessage], 
            Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
              ServerResponse[IncomingMessage]
            ]
          ]) | (typings.node.httpsMod.Server[
            Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage], 
            Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
              typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
            ]
          ])
        ]
    ): Self = StObject.set(x, "runServer", js.Any.fromFunction2(value))
    
    inline def setServer(value: TypeofServer): Self = StObject.set(x, "Server", value.asInstanceOf[js.Any])
  }
}
