package typings.googleGax

import org.scalablytyped.runtime.StringDictionary
import typings.googleAuthLibrary.buildSrcAuthGoogleauthMod.JSONClient
import typings.googleAuthLibrary.buildSrcAuthGoogleauthMod.ProjectIdCallback
import typings.googleAuthLibrary.mod.GoogleAuth
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleGax.buildSrcClientInterfaceMod.Callback
import typings.googleGax.buildSrcClientInterfaceMod.ClientOptions
import typings.googleGax.buildSrcClientInterfaceMod.Descriptors
import typings.googleGax.buildSrcFallbackMod.GrpcClient
import typings.googleGax.buildSrcGaxMod.CallOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcIamServiceMod {
  
  @JSImport("google-gax/build/src/iamService", "IamClient")
  @js.native
  open class IamClient protected () extends StObject {
    def this(gaxGrpc: GrpcClient, options: ClientOptions) = this()
    def this(gaxGrpc: typings.googleGax.buildSrcGrpcMod.GrpcClient, options: ClientOptions) = this()
    
    /* private */ var _defaults: Any = js.native
    
    /* private */ var _opts: Any = js.native
    
    /* private */ var _protos: Any = js.native
    
    /* private */ var _terminated: Any = js.native
    
    var auth: js.UndefOr[GoogleAuth[JSONClient] | OAuth2Client] = js.native
    
    /**
      * Terminate the GRPC channel and close the client.
      *
      * The client will no longer be usable and all future behavior is undefined.
      */
    def close(): js.Promise[Unit] = js.native
    
    var descriptors: Descriptors = js.native
    
    var gaxGrpc: typings.googleGax.buildSrcGrpcMod.GrpcClient | GrpcClient = js.native
    
    def getIamPolicy(
      request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.GetIamPolicyRequest */ Any
    ): Unit = js.native
    def getIamPolicy(
      request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.GetIamPolicyRequest */ Any,
      callback: Callback[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.Policy */ Any, 
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.GetIamPolicyRequest */ Any) | Null
          ], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def getIamPolicy(
      request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.GetIamPolicyRequest */ Any,
      options: Unit,
      callback: Callback[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.Policy */ Any, 
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.GetIamPolicyRequest */ Any) | Null
          ], 
          js.UndefOr[js.Object | Null]
        ]
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.Policy */ Any
      ] = js.native
    def getIamPolicy(
      request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.GetIamPolicyRequest */ Any,
      options: Callback[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.Policy */ Any, 
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.GetIamPolicyRequest */ Any) | Null
          ], 
          js.UndefOr[js.Object | Null]
        ],
      callback: Callback[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.Policy */ Any, 
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.GetIamPolicyRequest */ Any) | Null
          ], 
          js.UndefOr[js.Object | Null]
        ]
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.Policy */ Any
      ] = js.native
    def getIamPolicy(
      request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.GetIamPolicyRequest */ Any,
      options: CallOptions
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.Policy */ Any
      ] = js.native
    def getIamPolicy(
      request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.GetIamPolicyRequest */ Any,
      options: CallOptions,
      callback: Callback[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.Policy */ Any, 
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.GetIamPolicyRequest */ Any) | Null
          ], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    @JSName("getIamPolicy")
    def getIamPolicy_Promise(
      request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.GetIamPolicyRequest */ Any
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.Policy */ Any
      ] = js.native
    @JSName("getIamPolicy")
    def getIamPolicy_Promise(
      request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.GetIamPolicyRequest */ Any,
      options: Callback[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.Policy */ Any, 
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.GetIamPolicyRequest */ Any) | Null
          ], 
          js.UndefOr[js.Object | Null]
        ]
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.Policy */ Any
      ] = js.native
    @JSName("getIamPolicy")
    def getIamPolicy_Promise(
      request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.GetIamPolicyRequest */ Any,
      options: CallOptions,
      callback: Callback[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.Policy */ Any, 
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.GetIamPolicyRequest */ Any) | Null
          ], 
          js.UndefOr[js.Object | Null]
        ]
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.Policy */ Any
      ] = js.native
    
    /**
      * Get the project ID used by this class.
      * @param {function(Error, string)} callback - the callback to be called with
      *   the current project Id.
      */
    def getProjectId(): js.Promise[String] = js.native
    def getProjectId(callback: ProjectIdCallback): Unit = js.native
    
    var iamPolicyStub: js.UndefOr[js.Promise[StringDictionary[js.Function]]] = js.native
    
    /**
      * Initialize the client.
      * Performs asynchronous operations (such as authentication) and prepares the client.
      * This function will be called automatically when any class method is called for the
      * first time, but if you need to initialize it before calling an actual method,
      * feel free to call initialize() directly.
      *
      * You can await on this method if you want to make sure the client is initialized.
      *
      * @returns {Promise} A promise that resolves to an authenticated service stub.
      */
    def initialize(): js.Promise[StringDictionary[js.Function]] = js.native
    
    var innerApiCalls: StringDictionary[js.Function] = js.native
    
    def setIamPolicy(
      request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.SetIamPolicyRequest */ Any
    ): Unit = js.native
    def setIamPolicy(
      request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.SetIamPolicyRequest */ Any,
      callback: Callback[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.Policy */ Any, 
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.SetIamPolicyRequest */ Any) | Null
          ], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def setIamPolicy(
      request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.SetIamPolicyRequest */ Any,
      options: Unit,
      callback: Callback[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.Policy */ Any, 
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.SetIamPolicyRequest */ Any) | Null
          ], 
          js.UndefOr[js.Object | Null]
        ]
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.Policy */ Any
      ] = js.native
    def setIamPolicy(
      request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.SetIamPolicyRequest */ Any,
      options: Callback[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.Policy */ Any, 
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.SetIamPolicyRequest */ Any) | Null
          ], 
          js.UndefOr[js.Object | Null]
        ],
      callback: Callback[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.Policy */ Any, 
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.SetIamPolicyRequest */ Any) | Null
          ], 
          js.UndefOr[js.Object | Null]
        ]
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.Policy */ Any
      ] = js.native
    def setIamPolicy(
      request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.SetIamPolicyRequest */ Any,
      options: CallOptions
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.Policy */ Any
      ] = js.native
    def setIamPolicy(
      request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.SetIamPolicyRequest */ Any,
      options: CallOptions,
      callback: Callback[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.Policy */ Any, 
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.SetIamPolicyRequest */ Any) | Null
          ], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    @JSName("setIamPolicy")
    def setIamPolicy_Promise(
      request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.SetIamPolicyRequest */ Any
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.Policy */ Any
      ] = js.native
    @JSName("setIamPolicy")
    def setIamPolicy_Promise(
      request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.SetIamPolicyRequest */ Any,
      options: Callback[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.Policy */ Any, 
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.SetIamPolicyRequest */ Any) | Null
          ], 
          js.UndefOr[js.Object | Null]
        ]
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.Policy */ Any
      ] = js.native
    @JSName("setIamPolicy")
    def setIamPolicy_Promise(
      request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.SetIamPolicyRequest */ Any,
      options: CallOptions,
      callback: Callback[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.Policy */ Any, 
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.SetIamPolicyRequest */ Any) | Null
          ], 
          js.UndefOr[js.Object | Null]
        ]
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.Policy */ Any
      ] = js.native
    
    def testIamPermissions(
      request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.TestIamPermissionsRequest */ Any
    ): Unit = js.native
    def testIamPermissions(
      request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.TestIamPermissionsRequest */ Any,
      callback: Callback[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.TestIamPermissionsResponse */ Any, 
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.TestIamPermissionsRequest */ Any) | Null
          ], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def testIamPermissions(
      request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.TestIamPermissionsRequest */ Any,
      options: Unit,
      callback: Callback[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.TestIamPermissionsResponse */ Any, 
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.TestIamPermissionsRequest */ Any) | Null
          ], 
          js.UndefOr[js.Object | Null]
        ]
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.TestIamPermissionsResponse */ Any
      ] = js.native
    def testIamPermissions(
      request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.TestIamPermissionsRequest */ Any,
      options: Callback[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.TestIamPermissionsResponse */ Any, 
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.TestIamPermissionsRequest */ Any) | Null
          ], 
          js.UndefOr[js.Object | Null]
        ],
      callback: Callback[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.TestIamPermissionsResponse */ Any, 
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.TestIamPermissionsRequest */ Any) | Null
          ], 
          js.UndefOr[js.Object | Null]
        ]
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.TestIamPermissionsResponse */ Any
      ] = js.native
    def testIamPermissions(
      request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.TestIamPermissionsRequest */ Any,
      options: CallOptions
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.TestIamPermissionsResponse */ Any
      ] = js.native
    def testIamPermissions(
      request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.TestIamPermissionsRequest */ Any,
      options: CallOptions,
      callback: Callback[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.TestIamPermissionsResponse */ Any, 
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.TestIamPermissionsRequest */ Any) | Null
          ], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    @JSName("testIamPermissions")
    def testIamPermissions_Promise(
      request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.TestIamPermissionsRequest */ Any
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.TestIamPermissionsResponse */ Any
      ] = js.native
    @JSName("testIamPermissions")
    def testIamPermissions_Promise(
      request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.TestIamPermissionsRequest */ Any,
      options: Callback[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.TestIamPermissionsResponse */ Any, 
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.TestIamPermissionsRequest */ Any) | Null
          ], 
          js.UndefOr[js.Object | Null]
        ]
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.TestIamPermissionsResponse */ Any
      ] = js.native
    @JSName("testIamPermissions")
    def testIamPermissions_Promise(
      request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.TestIamPermissionsRequest */ Any,
      options: CallOptions,
      callback: Callback[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.TestIamPermissionsResponse */ Any, 
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.TestIamPermissionsRequest */ Any) | Null
          ], 
          js.UndefOr[js.Object | Null]
        ]
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protos.google.iam.v1.TestIamPermissionsResponse */ Any
      ] = js.native
  }
}
