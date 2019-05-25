package typings
package atFirebaseAppDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AllowMultipleInstances extends js.Object {
  /**
    * Use to construct all thrown FirebaseError's.
    */
  var ErrorFactory: org.scalablytyped.runtime.Instantiable3[
    /* service */ java.lang.String, 
    /* serviceName */ java.lang.String, 
    /* errors */ atFirebaseUtilLib.distSrcErrorsMod.ErrorMap[
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam ErrorCode */ js.Any
    ], 
    atFirebaseUtilLib.atFirebaseUtilMod.ErrorFactory[
      java.lang.String, 
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {readonly [ K in any ]:? @firebase/util.@firebase/util/dist/src/errors.ErrorData}
    */ atFirebaseAppDashTypesLib.atFirebaseAppDashTypesLibStrings.Anon_AllowMultipleInstances with js.Any
    ]
  ] = js.native
  /**
    * Service factories for each registered service.
    */
  var factories: org.scalablytyped.runtime.StringDictionary[atFirebaseAppDashTypesLib.privateMod.FirebaseServiceFactory] = js.native
  /**
    * Just used for testing to start from a fresh namespace.
    */
  def createFirebaseNamespace(): atFirebaseAppDashTypesLib.atFirebaseAppDashTypesMod.FirebaseNamespace = js.native
  /**
    * Create a Subscribe function.  A proxy Observer is created so that
    * events can be sent to single Observer to be fanned out automatically.
    */
  def createSubscribe[T](
    executor: js.Function1[/* observer */ atFirebaseUtilLib.distSrcSubscribeMod.Observer[T], scala.Unit]
  ): atFirebaseUtilLib.distSrcSubscribeMod.Subscribe[T] = js.native
  def createSubscribe[T](
    executor: js.Function1[/* observer */ atFirebaseUtilLib.distSrcSubscribeMod.Observer[T], scala.Unit],
    onNoObservers: js.Function1[/* observer */ atFirebaseUtilLib.distSrcSubscribeMod.Observer[T], scala.Unit]
  ): atFirebaseUtilLib.distSrcSubscribeMod.Subscribe[T] = js.native
  /**
    * Utility exposed for internal testing.
    */
  def deepExtend(target: js.Any, source: js.Any): js.Any = js.native
  /**
    * Internal API to install properties on the top-level firebase namespace.
    * @prop props The top level properties of this object are copied to the
    *   namespace.
    */
  def extendNamespace(props: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  /**
    * Internal API to register a Firebase Service into the firebase namespace.
    *
    * Each service will create a child namespace (firebase.<name>) which acts as
    * both a namespace for service specific properties, and also as a service
    * accessor function (firebase.<name>() or firebase.<name>(app)).
    *
    * @param name The Firebase Service being registered.
    * @param createService Factory function to create a service instance.
    * @param serviceProperties Properties to copy to the service's namespace.
    * @param appHook All appHooks called before initializeApp returns to caller.
    * @param allowMultipleInstances Whether the registered service supports
    *   multiple instances per app. If not specified, the default is false.
    */
  def registerService(name: java.lang.String, createService: atFirebaseAppDashTypesLib.privateMod.FirebaseServiceFactory): atFirebaseAppDashTypesLib.privateMod.FirebaseServiceNamespace[atFirebaseAppDashTypesLib.privateMod.FirebaseService] = js.native
  def registerService(
    name: java.lang.String,
    createService: atFirebaseAppDashTypesLib.privateMod.FirebaseServiceFactory,
    serviceProperties: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): atFirebaseAppDashTypesLib.privateMod.FirebaseServiceNamespace[atFirebaseAppDashTypesLib.privateMod.FirebaseService] = js.native
  def registerService(
    name: java.lang.String,
    createService: atFirebaseAppDashTypesLib.privateMod.FirebaseServiceFactory,
    serviceProperties: org.scalablytyped.runtime.StringDictionary[js.Any],
    appHook: atFirebaseAppDashTypesLib.privateMod.AppHook
  ): atFirebaseAppDashTypesLib.privateMod.FirebaseServiceNamespace[atFirebaseAppDashTypesLib.privateMod.FirebaseService] = js.native
  def registerService(
    name: java.lang.String,
    createService: atFirebaseAppDashTypesLib.privateMod.FirebaseServiceFactory,
    serviceProperties: org.scalablytyped.runtime.StringDictionary[js.Any],
    appHook: atFirebaseAppDashTypesLib.privateMod.AppHook,
    allowMultipleInstances: scala.Boolean
  ): atFirebaseAppDashTypesLib.privateMod.FirebaseServiceNamespace[atFirebaseAppDashTypesLib.privateMod.FirebaseService] = js.native
  /**
    * Internal API to remove an app from the list of registered apps.
    */
  def removeApp(name: java.lang.String): scala.Unit = js.native
  /*
    * Convert service name to factory name to use.
    */
  def useAsService(
    app: atFirebaseAppDashTypesLib.atFirebaseAppDashTypesMod.FirebaseApp,
    serviceName: java.lang.String
  ): java.lang.String | scala.Null = js.native
}

