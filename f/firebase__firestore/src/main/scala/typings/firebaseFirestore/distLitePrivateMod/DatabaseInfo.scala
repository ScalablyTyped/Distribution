package typings.firebaseFirestore.distLitePrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Excluded from this release type: DatabaseId */
/**
  * @license
  * Copyright 2017 Google LLC
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  *   http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */
trait DatabaseInfo extends StObject {
  
  val appId: String
  
  val autoDetectLongPolling: Boolean
  
  val databaseId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DatabaseId */ Any
  
  val forceLongPolling: Boolean
  
  val host: String
  
  val persistenceKey: String
  
  val ssl: Boolean
  
  val useFetchStreams: Boolean
}
object DatabaseInfo {
  
  inline def apply(
    appId: String,
    autoDetectLongPolling: Boolean,
    databaseId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DatabaseId */ Any,
    forceLongPolling: Boolean,
    host: String,
    persistenceKey: String,
    ssl: Boolean,
    useFetchStreams: Boolean
  ): DatabaseInfo = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], autoDetectLongPolling = autoDetectLongPolling.asInstanceOf[js.Any], databaseId = databaseId.asInstanceOf[js.Any], forceLongPolling = forceLongPolling.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], persistenceKey = persistenceKey.asInstanceOf[js.Any], ssl = ssl.asInstanceOf[js.Any], useFetchStreams = useFetchStreams.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatabaseInfo] (val x: Self) extends AnyVal {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAutoDetectLongPolling(value: Boolean): Self = StObject.set(x, "autoDetectLongPolling", value.asInstanceOf[js.Any])
    
    inline def setDatabaseId(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DatabaseId */ Any
    ): Self = StObject.set(x, "databaseId", value.asInstanceOf[js.Any])
    
    inline def setForceLongPolling(value: Boolean): Self = StObject.set(x, "forceLongPolling", value.asInstanceOf[js.Any])
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setPersistenceKey(value: String): Self = StObject.set(x, "persistenceKey", value.asInstanceOf[js.Any])
    
    inline def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    inline def setUseFetchStreams(value: Boolean): Self = StObject.set(x, "useFetchStreams", value.asInstanceOf[js.Any])
  }
}
