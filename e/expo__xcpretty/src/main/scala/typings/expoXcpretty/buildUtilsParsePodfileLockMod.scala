package typings.expoXcpretty

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsParsePodfileLockMod {
  
  @JSImport("@expo/xcpretty/build/utils/parsePodfileLock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFilePathForExternalSource(podLock: PodfileLock, pod: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilePathForExternalSource")(podLock.asInstanceOf[js.Any], pod.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def loadPodfileLock(str: String): Null | (Record[String, Any]) = ^.asInstanceOf[js.Dynamic].applyDynamic("loadPodfileLock")(str.asInstanceOf[js.Any]).asInstanceOf[Null | (Record[String, Any])]
  
  inline def parsePodDependency(pod: String): js.Array[PodDependency] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePodDependency")(pod.asInstanceOf[js.Any]).asInstanceOf[js.Array[PodDependency]]
  inline def parsePodDependency(pod: Record[String, String | (Record[String, Any])]): js.Array[PodDependency] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePodDependency")(pod.asInstanceOf[js.Any]).asInstanceOf[js.Array[PodDependency]]
  
  inline def parsePodfileLock(fileContent: String): PodfileLock | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePodfileLock")(fileContent.asInstanceOf[js.Any]).asInstanceOf[PodfileLock | Null]
  
  trait ExternalSource extends StObject {
    
    /** "../node_modules/expo-application/ios" */
    @JSName(":path")
    var Colonpath: js.UndefOr[String] = js.undefined
    
    /** "../node_modules/react-native/third-party-podspecs/DoubleConversion.podspec" */
    @JSName(":podspec")
    var Colonpodspec: js.UndefOr[String] = js.undefined
  }
  object ExternalSource {
    
    inline def apply(): ExternalSource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExternalSource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExternalSource] (val x: Self) extends AnyVal {
      
      inline def setColonpath(value: String): Self = StObject.set(x, ":path", value.asInstanceOf[js.Any])
      
      inline def setColonpathUndefined: Self = StObject.set(x, ":path", js.undefined)
      
      inline def setColonpodspec(value: String): Self = StObject.set(x, ":podspec", value.asInstanceOf[js.Any])
      
      inline def setColonpodspecUndefined: Self = StObject.set(x, ":podspec", js.undefined)
    }
  }
  
  trait PodDependency extends StObject {
    
    var dependencies: js.UndefOr[js.Array[PodDependency]] = js.undefined
    
    var name: String
    
    var version: js.UndefOr[String] = js.undefined
  }
  object PodDependency {
    
    inline def apply(name: String): PodDependency = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PodDependency]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PodDependency] (val x: Self) extends AnyVal {
      
      inline def setDependencies(value: js.Array[PodDependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDependenciesVarargs(value: PodDependency*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait PodfileLock extends StObject {
    
    /** "1.11.2" */
    var cocoapods: js.UndefOr[String] = js.undefined
    
    var externalSources: js.UndefOr[Record[String, ExternalSource]] = js.undefined
    
    /** 73e35020f8f5d49ffd32debe3c1bdd501f8029a6 */
    var podfileChecksum: js.UndefOr[String] = js.undefined
    
    var pods: js.UndefOr[js.Array[PodDependency]] = js.undefined
    
    /** { "DoubleConversion": "cf9b38bf0b2d048436d9a82ad2abe1404f11e7de" } */
    var specChecksums: js.UndefOr[Record[String, String]] = js.undefined
  }
  object PodfileLock {
    
    inline def apply(): PodfileLock = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PodfileLock]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PodfileLock] (val x: Self) extends AnyVal {
      
      inline def setCocoapods(value: String): Self = StObject.set(x, "cocoapods", value.asInstanceOf[js.Any])
      
      inline def setCocoapodsUndefined: Self = StObject.set(x, "cocoapods", js.undefined)
      
      inline def setExternalSources(value: Record[String, ExternalSource]): Self = StObject.set(x, "externalSources", value.asInstanceOf[js.Any])
      
      inline def setExternalSourcesUndefined: Self = StObject.set(x, "externalSources", js.undefined)
      
      inline def setPodfileChecksum(value: String): Self = StObject.set(x, "podfileChecksum", value.asInstanceOf[js.Any])
      
      inline def setPodfileChecksumUndefined: Self = StObject.set(x, "podfileChecksum", js.undefined)
      
      inline def setPods(value: js.Array[PodDependency]): Self = StObject.set(x, "pods", value.asInstanceOf[js.Any])
      
      inline def setPodsUndefined: Self = StObject.set(x, "pods", js.undefined)
      
      inline def setPodsVarargs(value: PodDependency*): Self = StObject.set(x, "pods", js.Array(value*))
      
      inline def setSpecChecksums(value: Record[String, String]): Self = StObject.set(x, "specChecksums", value.asInstanceOf[js.Any])
      
      inline def setSpecChecksumsUndefined: Self = StObject.set(x, "specChecksums", js.undefined)
    }
  }
}
