package typings.devtoolsProtocol

import typings.devtoolsProtocol.anon.ParamsType
import typings.devtoolsProtocol.anon.ParamsTypeReturnType
import typings.devtoolsProtocol.anon.ParamsTypeReturnTypeCaptureSnapshotResponse
import typings.devtoolsProtocol.anon.ParamsTypeReturnTypeGetCookiesResponse
import typings.devtoolsProtocol.anon.ParamsTypeReturnTypeGetResponseBodyResponse
import typings.devtoolsProtocol.anon.ParamsTypeReturnTypeGetSamplingProfileResponse
import typings.devtoolsProtocol.anon.ParamsTypeReturnTypeVoid
import typings.devtoolsProtocol.anon.ReturnType
import typings.devtoolsProtocol.anon.ReturnTypeAddRuleResponse
import typings.devtoolsProtocol.anon.ReturnTypeAddScriptToEvaluateOnLoadResponse
import typings.devtoolsProtocol.anon.ReturnTypeAddScriptToEvaluateOnNewDocumentResponse
import typings.devtoolsProtocol.anon.ReturnTypeAddVirtualAuthenticatorResponse
import typings.devtoolsProtocol.anon.ReturnTypeAttachToBrowserTargetResponse
import typings.devtoolsProtocol.anon.ReturnTypeAttachToTargetResponse
import typings.devtoolsProtocol.anon.ReturnTypeAwaitPromiseResponse
import typings.devtoolsProtocol.anon.ReturnTypeBeginFrameResponse
import typings.devtoolsProtocol.anon.ReturnTypeCallFunctionOnResponse
import typings.devtoolsProtocol.anon.ReturnTypeCanClearBrowserCacheResponse
import typings.devtoolsProtocol.anon.ReturnTypeCanClearBrowserCookiesResponse
import typings.devtoolsProtocol.anon.ReturnTypeCanEmulateNetworkConditionsResponse
import typings.devtoolsProtocol.anon.ReturnTypeCanEmulateResponse
import typings.devtoolsProtocol.anon.ReturnTypeCaptureScreenshotResponse
import typings.devtoolsProtocol.anon.ReturnTypeCaptureSnapshotResponse
import typings.devtoolsProtocol.anon.ReturnTypeCloseTargetResponse
import typings.devtoolsProtocol.anon.ReturnTypeCollectClassNamesFromSubtreeResponse
import typings.devtoolsProtocol.anon.ReturnTypeCollectClassNamesResponse
import typings.devtoolsProtocol.anon.ReturnTypeCompileScriptResponse
import typings.devtoolsProtocol.anon.ReturnTypeCompositingReasonsResponse
import typings.devtoolsProtocol.anon.ReturnTypeCopyToResponse
import typings.devtoolsProtocol.anon.ReturnTypeCreateBrowserContextResponse
import typings.devtoolsProtocol.anon.ReturnTypeCreateIsolatedWorldResponse
import typings.devtoolsProtocol.anon.ReturnTypeCreateStyleSheetResponse
import typings.devtoolsProtocol.anon.ReturnTypeCreateTargetResponse
import typings.devtoolsProtocol.anon.ReturnTypeDescribeNodeResponse
import typings.devtoolsProtocol.anon.ReturnTypeEvaluateOnCallFrameResponse
import typings.devtoolsProtocol.anon.ReturnTypeEvaluateResponse
import typings.devtoolsProtocol.anon.ReturnTypeExecuteSQLResponse
import typings.devtoolsProtocol.anon.ReturnTypeExecuteWasmEvaluatorResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetAllCookiesResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetAllTimeSamplingProfileResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetAppManifestResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetApplicationCacheForFrameResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetAttributesResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetBackgroundColorsResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetBestEffortCoverageResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetBoxModelResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetBrowserCommandLineResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetBrowserContextsResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetBrowserSamplingProfileResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetCategoriesResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetCertificateResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetComputedStyleForNodeResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetContentQuadsResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetCookiesResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetCountersResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetCredentialResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetCredentialsResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetCurrentTimeResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetDOMCountersResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetDOMStorageItemsResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetDatabaseTableNamesResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetDocumentResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetDomainsResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetEncodedResponseResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetEventListenersResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetFileInfoResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetFlattenedDocumentResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetFrameOwnerResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetFrameTreeResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetFramesWithManifestsResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetFullAXTreeResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetGridHighlightObjectsForTestResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetHeapObjectIdResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetHeapUsageResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetHighlightObjectForTestResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetHistogramResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetHistogramsResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetInfoResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetInlineStylesForNodeResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetInstallabilityErrorsResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetIsolateIdResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetLayoutMetricsResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetManifestForFrameResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetManifestIconsResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetMatchedStylesForNodeResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetMediaQueriesResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetMetadataResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetMetricsResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetNavigationHistoryResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetNodeForLocationResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetNodeStackTracesResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetNodesForSubtreeByStyleResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetObjectByHeapObjectIdResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetOuterHTMLResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetPartialAXTreeResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetPlatformFontsForNodeResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetPlaybackRateResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetPossibleBreakpointsResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetProcessInfoResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetPropertiesResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetRealtimeDataResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetRelayoutBoundaryResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetRequestPostDataResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetResourceContentResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetResourceTreeResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetResponseBodyForInterceptionResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetResponseBodyResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetRuntimeCallStatsResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetSamplingProfileResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetScriptSourceResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetSearchResultsResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetSecurityIsolationStatusResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetSnapshotResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetSourceOrderHighlightObjectForTestResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetStackTraceResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetStyleSheetTextResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetTargetInfoResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetTargetsResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetUsageAndQuotaResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetVersionResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetWasmBytecodeResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetWindowBoundsResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetWindowForTargetResponse
import typings.devtoolsProtocol.anon.ReturnTypeGlobalLexicalScopeNamesResponse
import typings.devtoolsProtocol.anon.ReturnTypeLoadNetworkResourceResponse
import typings.devtoolsProtocol.anon.ReturnTypeLoadSnapshotResponse
import typings.devtoolsProtocol.anon.ReturnTypeMakeSnapshotResponse
import typings.devtoolsProtocol.anon.ReturnTypeMoveToResponse
import typings.devtoolsProtocol.anon.ReturnTypeNavigateResponse
import typings.devtoolsProtocol.anon.ReturnTypePerformSearchResponse
import typings.devtoolsProtocol.anon.ReturnTypePrintToPDFResponse
import typings.devtoolsProtocol.anon.ReturnTypeProfileSnapshotResponse
import typings.devtoolsProtocol.anon.ReturnTypePushNodeByPathToFrontendResponse
import typings.devtoolsProtocol.anon.ReturnTypePushNodesByBackendIdsToFrontendResponse
import typings.devtoolsProtocol.anon.ReturnTypeQueryAXTreeResponse
import typings.devtoolsProtocol.anon.ReturnTypeQueryObjectsResponse
import typings.devtoolsProtocol.anon.ReturnTypeQuerySelectorAllResponse
import typings.devtoolsProtocol.anon.ReturnTypeQuerySelectorResponse
import typings.devtoolsProtocol.anon.ReturnTypeReadResponse
import typings.devtoolsProtocol.anon.ReturnTypeReplaySnapshotResponse
import typings.devtoolsProtocol.anon.ReturnTypeRequestCacheNamesResponse
import typings.devtoolsProtocol.anon.ReturnTypeRequestCachedResponseResponse
import typings.devtoolsProtocol.anon.ReturnTypeRequestDataResponse
import typings.devtoolsProtocol.anon.ReturnTypeRequestDatabaseNamesResponse
import typings.devtoolsProtocol.anon.ReturnTypeRequestDatabaseResponse
import typings.devtoolsProtocol.anon.ReturnTypeRequestEntriesResponse
import typings.devtoolsProtocol.anon.ReturnTypeRequestMemoryDumpResponse
import typings.devtoolsProtocol.anon.ReturnTypeRequestNodeResponse
import typings.devtoolsProtocol.anon.ReturnTypeResolveAnimationResponse
import typings.devtoolsProtocol.anon.ReturnTypeResolveBlobResponse
import typings.devtoolsProtocol.anon.ReturnTypeResolveNodeResponse
import typings.devtoolsProtocol.anon.ReturnTypeRestartFrameResponse
import typings.devtoolsProtocol.anon.ReturnTypeRunScriptResponse
import typings.devtoolsProtocol.anon.ReturnTypeSearchInContentResponse
import typings.devtoolsProtocol.anon.ReturnTypeSearchInResourceResponse
import typings.devtoolsProtocol.anon.ReturnTypeSearchInResponseBodyResponse
import typings.devtoolsProtocol.anon.ReturnTypeSetBreakpointByUrlResponse
import typings.devtoolsProtocol.anon.ReturnTypeSetBreakpointOnFunctionCallResponse
import typings.devtoolsProtocol.anon.ReturnTypeSetBreakpointResponse
import typings.devtoolsProtocol.anon.ReturnTypeSetCookieResponse
import typings.devtoolsProtocol.anon.ReturnTypeSetInstrumentationBreakpointResponse
import typings.devtoolsProtocol.anon.ReturnTypeSetKeyframeKeyResponse
import typings.devtoolsProtocol.anon.ReturnTypeSetMediaTextResponse
import typings.devtoolsProtocol.anon.ReturnTypeSetNodeNameResponse
import typings.devtoolsProtocol.anon.ReturnTypeSetRuleSelectorResponse
import typings.devtoolsProtocol.anon.ReturnTypeSetScriptSourceResponse
import typings.devtoolsProtocol.anon.ReturnTypeSetStyleSheetTextResponse
import typings.devtoolsProtocol.anon.ReturnTypeSetStyleTextsResponse
import typings.devtoolsProtocol.anon.ReturnTypeSetVirtualTimePolicyResponse
import typings.devtoolsProtocol.anon.ReturnTypeSnapshotCommandLogResponse
import typings.devtoolsProtocol.anon.ReturnTypeStartPreciseCoverageResponse
import typings.devtoolsProtocol.anon.ReturnTypeStopResponse
import typings.devtoolsProtocol.anon.ReturnTypeStopRuleUsageTrackingResponse
import typings.devtoolsProtocol.anon.ReturnTypeStopSamplingResponse
import typings.devtoolsProtocol.anon.ReturnTypeTakeComputedStyleUpdatesResponse
import typings.devtoolsProtocol.anon.ReturnTypeTakeCoverageDeltaResponse
import typings.devtoolsProtocol.anon.ReturnTypeTakePreciseCoverageResponse
import typings.devtoolsProtocol.anon.ReturnTypeTakeResponseBodyAsStreamResponse
import typings.devtoolsProtocol.anon.ReturnTypeTakeResponseBodyForInterceptionAsStreamResponse
import typings.devtoolsProtocol.anon.ReturnTypeTakeTypeProfileResponse
import typings.devtoolsProtocol.anon.ReturnTypeVoid
import typings.devtoolsProtocol.anon.`0`
import typings.devtoolsProtocol.anon.`100`
import typings.devtoolsProtocol.anon.`101`
import typings.devtoolsProtocol.anon.`102`
import typings.devtoolsProtocol.anon.`103`
import typings.devtoolsProtocol.anon.`104`
import typings.devtoolsProtocol.anon.`105`
import typings.devtoolsProtocol.anon.`106`
import typings.devtoolsProtocol.anon.`107`
import typings.devtoolsProtocol.anon.`108`
import typings.devtoolsProtocol.anon.`109`
import typings.devtoolsProtocol.anon.`10`
import typings.devtoolsProtocol.anon.`110`
import typings.devtoolsProtocol.anon.`111`
import typings.devtoolsProtocol.anon.`112`
import typings.devtoolsProtocol.anon.`113`
import typings.devtoolsProtocol.anon.`114`
import typings.devtoolsProtocol.anon.`115`
import typings.devtoolsProtocol.anon.`116`
import typings.devtoolsProtocol.anon.`117`
import typings.devtoolsProtocol.anon.`118`
import typings.devtoolsProtocol.anon.`119`
import typings.devtoolsProtocol.anon.`11`
import typings.devtoolsProtocol.anon.`120`
import typings.devtoolsProtocol.anon.`121`
import typings.devtoolsProtocol.anon.`122`
import typings.devtoolsProtocol.anon.`123`
import typings.devtoolsProtocol.anon.`124`
import typings.devtoolsProtocol.anon.`125`
import typings.devtoolsProtocol.anon.`126`
import typings.devtoolsProtocol.anon.`127`
import typings.devtoolsProtocol.anon.`128`
import typings.devtoolsProtocol.anon.`129`
import typings.devtoolsProtocol.anon.`12`
import typings.devtoolsProtocol.anon.`130`
import typings.devtoolsProtocol.anon.`131`
import typings.devtoolsProtocol.anon.`132`
import typings.devtoolsProtocol.anon.`133`
import typings.devtoolsProtocol.anon.`134`
import typings.devtoolsProtocol.anon.`135`
import typings.devtoolsProtocol.anon.`136`
import typings.devtoolsProtocol.anon.`137`
import typings.devtoolsProtocol.anon.`138`
import typings.devtoolsProtocol.anon.`139`
import typings.devtoolsProtocol.anon.`13`
import typings.devtoolsProtocol.anon.`140`
import typings.devtoolsProtocol.anon.`141`
import typings.devtoolsProtocol.anon.`142`
import typings.devtoolsProtocol.anon.`143`
import typings.devtoolsProtocol.anon.`144`
import typings.devtoolsProtocol.anon.`145`
import typings.devtoolsProtocol.anon.`146`
import typings.devtoolsProtocol.anon.`147`
import typings.devtoolsProtocol.anon.`148`
import typings.devtoolsProtocol.anon.`149`
import typings.devtoolsProtocol.anon.`14`
import typings.devtoolsProtocol.anon.`150`
import typings.devtoolsProtocol.anon.`151`
import typings.devtoolsProtocol.anon.`152`
import typings.devtoolsProtocol.anon.`153`
import typings.devtoolsProtocol.anon.`154`
import typings.devtoolsProtocol.anon.`155`
import typings.devtoolsProtocol.anon.`156`
import typings.devtoolsProtocol.anon.`157`
import typings.devtoolsProtocol.anon.`158`
import typings.devtoolsProtocol.anon.`159`
import typings.devtoolsProtocol.anon.`15`
import typings.devtoolsProtocol.anon.`160`
import typings.devtoolsProtocol.anon.`161`
import typings.devtoolsProtocol.anon.`162`
import typings.devtoolsProtocol.anon.`163`
import typings.devtoolsProtocol.anon.`164`
import typings.devtoolsProtocol.anon.`165`
import typings.devtoolsProtocol.anon.`166`
import typings.devtoolsProtocol.anon.`167`
import typings.devtoolsProtocol.anon.`168`
import typings.devtoolsProtocol.anon.`169`
import typings.devtoolsProtocol.anon.`16`
import typings.devtoolsProtocol.anon.`170`
import typings.devtoolsProtocol.anon.`171`
import typings.devtoolsProtocol.anon.`172`
import typings.devtoolsProtocol.anon.`173`
import typings.devtoolsProtocol.anon.`174`
import typings.devtoolsProtocol.anon.`175`
import typings.devtoolsProtocol.anon.`176`
import typings.devtoolsProtocol.anon.`177`
import typings.devtoolsProtocol.anon.`178`
import typings.devtoolsProtocol.anon.`179`
import typings.devtoolsProtocol.anon.`17`
import typings.devtoolsProtocol.anon.`180`
import typings.devtoolsProtocol.anon.`181`
import typings.devtoolsProtocol.anon.`182`
import typings.devtoolsProtocol.anon.`183`
import typings.devtoolsProtocol.anon.`184`
import typings.devtoolsProtocol.anon.`185`
import typings.devtoolsProtocol.anon.`186`
import typings.devtoolsProtocol.anon.`187`
import typings.devtoolsProtocol.anon.`188`
import typings.devtoolsProtocol.anon.`189`
import typings.devtoolsProtocol.anon.`18`
import typings.devtoolsProtocol.anon.`190`
import typings.devtoolsProtocol.anon.`191`
import typings.devtoolsProtocol.anon.`192`
import typings.devtoolsProtocol.anon.`193`
import typings.devtoolsProtocol.anon.`194`
import typings.devtoolsProtocol.anon.`195`
import typings.devtoolsProtocol.anon.`196`
import typings.devtoolsProtocol.anon.`197`
import typings.devtoolsProtocol.anon.`198`
import typings.devtoolsProtocol.anon.`199`
import typings.devtoolsProtocol.anon.`19`
import typings.devtoolsProtocol.anon.`1`
import typings.devtoolsProtocol.anon.`200`
import typings.devtoolsProtocol.anon.`201`
import typings.devtoolsProtocol.anon.`202`
import typings.devtoolsProtocol.anon.`203`
import typings.devtoolsProtocol.anon.`204`
import typings.devtoolsProtocol.anon.`205`
import typings.devtoolsProtocol.anon.`206`
import typings.devtoolsProtocol.anon.`207`
import typings.devtoolsProtocol.anon.`208`
import typings.devtoolsProtocol.anon.`209`
import typings.devtoolsProtocol.anon.`20`
import typings.devtoolsProtocol.anon.`210`
import typings.devtoolsProtocol.anon.`211`
import typings.devtoolsProtocol.anon.`212`
import typings.devtoolsProtocol.anon.`21`
import typings.devtoolsProtocol.anon.`22`
import typings.devtoolsProtocol.anon.`23`
import typings.devtoolsProtocol.anon.`24`
import typings.devtoolsProtocol.anon.`25`
import typings.devtoolsProtocol.anon.`26`
import typings.devtoolsProtocol.anon.`27`
import typings.devtoolsProtocol.anon.`28`
import typings.devtoolsProtocol.anon.`29`
import typings.devtoolsProtocol.anon.`2`
import typings.devtoolsProtocol.anon.`30`
import typings.devtoolsProtocol.anon.`31`
import typings.devtoolsProtocol.anon.`32`
import typings.devtoolsProtocol.anon.`33`
import typings.devtoolsProtocol.anon.`34`
import typings.devtoolsProtocol.anon.`35`
import typings.devtoolsProtocol.anon.`36`
import typings.devtoolsProtocol.anon.`37`
import typings.devtoolsProtocol.anon.`38`
import typings.devtoolsProtocol.anon.`39`
import typings.devtoolsProtocol.anon.`3`
import typings.devtoolsProtocol.anon.`40`
import typings.devtoolsProtocol.anon.`41`
import typings.devtoolsProtocol.anon.`42`
import typings.devtoolsProtocol.anon.`43`
import typings.devtoolsProtocol.anon.`44`
import typings.devtoolsProtocol.anon.`45`
import typings.devtoolsProtocol.anon.`46`
import typings.devtoolsProtocol.anon.`47`
import typings.devtoolsProtocol.anon.`48`
import typings.devtoolsProtocol.anon.`49`
import typings.devtoolsProtocol.anon.`4`
import typings.devtoolsProtocol.anon.`50`
import typings.devtoolsProtocol.anon.`51`
import typings.devtoolsProtocol.anon.`52`
import typings.devtoolsProtocol.anon.`53`
import typings.devtoolsProtocol.anon.`54`
import typings.devtoolsProtocol.anon.`55`
import typings.devtoolsProtocol.anon.`56`
import typings.devtoolsProtocol.anon.`57`
import typings.devtoolsProtocol.anon.`58`
import typings.devtoolsProtocol.anon.`59`
import typings.devtoolsProtocol.anon.`5`
import typings.devtoolsProtocol.anon.`60`
import typings.devtoolsProtocol.anon.`61`
import typings.devtoolsProtocol.anon.`62`
import typings.devtoolsProtocol.anon.`63`
import typings.devtoolsProtocol.anon.`64`
import typings.devtoolsProtocol.anon.`65`
import typings.devtoolsProtocol.anon.`66`
import typings.devtoolsProtocol.anon.`67`
import typings.devtoolsProtocol.anon.`68`
import typings.devtoolsProtocol.anon.`69`
import typings.devtoolsProtocol.anon.`6`
import typings.devtoolsProtocol.anon.`70`
import typings.devtoolsProtocol.anon.`71`
import typings.devtoolsProtocol.anon.`72`
import typings.devtoolsProtocol.anon.`73`
import typings.devtoolsProtocol.anon.`74`
import typings.devtoolsProtocol.anon.`75`
import typings.devtoolsProtocol.anon.`76`
import typings.devtoolsProtocol.anon.`77`
import typings.devtoolsProtocol.anon.`78`
import typings.devtoolsProtocol.anon.`79`
import typings.devtoolsProtocol.anon.`7`
import typings.devtoolsProtocol.anon.`80`
import typings.devtoolsProtocol.anon.`81`
import typings.devtoolsProtocol.anon.`82`
import typings.devtoolsProtocol.anon.`83`
import typings.devtoolsProtocol.anon.`84`
import typings.devtoolsProtocol.anon.`85`
import typings.devtoolsProtocol.anon.`86`
import typings.devtoolsProtocol.anon.`87`
import typings.devtoolsProtocol.anon.`88`
import typings.devtoolsProtocol.anon.`89`
import typings.devtoolsProtocol.anon.`8`
import typings.devtoolsProtocol.anon.`90`
import typings.devtoolsProtocol.anon.`91`
import typings.devtoolsProtocol.anon.`92`
import typings.devtoolsProtocol.anon.`93`
import typings.devtoolsProtocol.anon.`94`
import typings.devtoolsProtocol.anon.`95`
import typings.devtoolsProtocol.anon.`96`
import typings.devtoolsProtocol.anon.`97`
import typings.devtoolsProtocol.anon.`98`
import typings.devtoolsProtocol.anon.`99`
import typings.devtoolsProtocol.anon.`9`
import typings.devtoolsProtocol.mod.Protocol.Animation.AnimationCanceledEvent
import typings.devtoolsProtocol.mod.Protocol.Animation.AnimationCreatedEvent
import typings.devtoolsProtocol.mod.Protocol.Animation.AnimationStartedEvent
import typings.devtoolsProtocol.mod.Protocol.ApplicationCache.ApplicationCacheStatusUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.ApplicationCache.NetworkStateUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Audits.IssueAddedEvent
import typings.devtoolsProtocol.mod.Protocol.BackgroundService.BackgroundServiceEventReceivedEvent
import typings.devtoolsProtocol.mod.Protocol.BackgroundService.RecordingStateChangedEvent
import typings.devtoolsProtocol.mod.Protocol.CSS.FontsUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.CSS.StyleSheetAddedEvent
import typings.devtoolsProtocol.mod.Protocol.CSS.StyleSheetChangedEvent
import typings.devtoolsProtocol.mod.Protocol.CSS.StyleSheetRemovedEvent
import typings.devtoolsProtocol.mod.Protocol.Cast.IssueUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Cast.SinksUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Console.MessageAddedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.AttributeModifiedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.AttributeRemovedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.CharacterDataModifiedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.ChildNodeCountUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.ChildNodeInsertedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.ChildNodeRemovedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.DistributedNodesUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.InlineStyleInvalidatedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.PseudoElementAddedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.PseudoElementRemovedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.SetChildNodesEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.ShadowRootPoppedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.ShadowRootPushedEvent
import typings.devtoolsProtocol.mod.Protocol.DOMStorage.DomStorageItemAddedEvent
import typings.devtoolsProtocol.mod.Protocol.DOMStorage.DomStorageItemRemovedEvent
import typings.devtoolsProtocol.mod.Protocol.DOMStorage.DomStorageItemUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.DOMStorage.DomStorageItemsClearedEvent
import typings.devtoolsProtocol.mod.Protocol.Database.AddDatabaseEvent
import typings.devtoolsProtocol.mod.Protocol.Debugger.BreakpointResolvedEvent
import typings.devtoolsProtocol.mod.Protocol.Debugger.PausedEvent
import typings.devtoolsProtocol.mod.Protocol.Debugger.ScriptFailedToParseEvent
import typings.devtoolsProtocol.mod.Protocol.Debugger.ScriptParsedEvent
import typings.devtoolsProtocol.mod.Protocol.Fetch.AuthRequiredEvent
import typings.devtoolsProtocol.mod.Protocol.Fetch.RequestPausedEvent
import typings.devtoolsProtocol.mod.Protocol.HeadlessExperimental.NeedsBeginFramesChangedEvent
import typings.devtoolsProtocol.mod.Protocol.HeapProfiler.AddHeapSnapshotChunkEvent
import typings.devtoolsProtocol.mod.Protocol.HeapProfiler.HeapStatsUpdateEvent
import typings.devtoolsProtocol.mod.Protocol.HeapProfiler.LastSeenObjectIdEvent
import typings.devtoolsProtocol.mod.Protocol.HeapProfiler.ReportHeapSnapshotProgressEvent
import typings.devtoolsProtocol.mod.Protocol.Inspector.DetachedEvent
import typings.devtoolsProtocol.mod.Protocol.LayerTree.LayerPaintedEvent
import typings.devtoolsProtocol.mod.Protocol.LayerTree.LayerTreeDidChangeEvent
import typings.devtoolsProtocol.mod.Protocol.Log.EntryAddedEvent
import typings.devtoolsProtocol.mod.Protocol.Media.PlayerErrorsRaisedEvent
import typings.devtoolsProtocol.mod.Protocol.Media.PlayerEventsAddedEvent
import typings.devtoolsProtocol.mod.Protocol.Media.PlayerMessagesLoggedEvent
import typings.devtoolsProtocol.mod.Protocol.Media.PlayerPropertiesChangedEvent
import typings.devtoolsProtocol.mod.Protocol.Media.PlayersCreatedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.DataReceivedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.EventSourceMessageReceivedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.LoadingFailedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.LoadingFinishedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.RequestInterceptedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.RequestServedFromCacheEvent
import typings.devtoolsProtocol.mod.Protocol.Network.RequestWillBeSentEvent
import typings.devtoolsProtocol.mod.Protocol.Network.RequestWillBeSentExtraInfoEvent
import typings.devtoolsProtocol.mod.Protocol.Network.ResourceChangedPriorityEvent
import typings.devtoolsProtocol.mod.Protocol.Network.ResponseReceivedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.ResponseReceivedExtraInfoEvent
import typings.devtoolsProtocol.mod.Protocol.Network.SignedExchangeReceivedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.WebSocketClosedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.WebSocketCreatedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.WebSocketFrameErrorEvent
import typings.devtoolsProtocol.mod.Protocol.Network.WebSocketFrameReceivedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.WebSocketFrameSentEvent
import typings.devtoolsProtocol.mod.Protocol.Network.WebSocketHandshakeResponseReceivedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.WebSocketWillSendHandshakeRequestEvent
import typings.devtoolsProtocol.mod.Protocol.Overlay.InspectNodeRequestedEvent
import typings.devtoolsProtocol.mod.Protocol.Overlay.NodeHighlightRequestedEvent
import typings.devtoolsProtocol.mod.Protocol.Overlay.ScreenshotRequestedEvent
import typings.devtoolsProtocol.mod.Protocol.Page.CompilationCacheProducedEvent
import typings.devtoolsProtocol.mod.Protocol.Page.DomContentEventFiredEvent
import typings.devtoolsProtocol.mod.Protocol.Page.DownloadProgressEvent
import typings.devtoolsProtocol.mod.Protocol.Page.DownloadWillBeginEvent
import typings.devtoolsProtocol.mod.Protocol.Page.FileChooserOpenedEvent
import typings.devtoolsProtocol.mod.Protocol.Page.FrameAttachedEvent
import typings.devtoolsProtocol.mod.Protocol.Page.FrameClearedScheduledNavigationEvent
import typings.devtoolsProtocol.mod.Protocol.Page.FrameDetachedEvent
import typings.devtoolsProtocol.mod.Protocol.Page.FrameNavigatedEvent
import typings.devtoolsProtocol.mod.Protocol.Page.FrameRequestedNavigationEvent
import typings.devtoolsProtocol.mod.Protocol.Page.FrameScheduledNavigationEvent
import typings.devtoolsProtocol.mod.Protocol.Page.FrameStartedLoadingEvent
import typings.devtoolsProtocol.mod.Protocol.Page.FrameStoppedLoadingEvent
import typings.devtoolsProtocol.mod.Protocol.Page.JavascriptDialogClosedEvent
import typings.devtoolsProtocol.mod.Protocol.Page.JavascriptDialogOpeningEvent
import typings.devtoolsProtocol.mod.Protocol.Page.LifecycleEventEvent
import typings.devtoolsProtocol.mod.Protocol.Page.LoadEventFiredEvent
import typings.devtoolsProtocol.mod.Protocol.Page.NavigatedWithinDocumentEvent
import typings.devtoolsProtocol.mod.Protocol.Page.ScreencastFrameEvent
import typings.devtoolsProtocol.mod.Protocol.Page.ScreencastVisibilityChangedEvent
import typings.devtoolsProtocol.mod.Protocol.Page.WindowOpenEvent
import typings.devtoolsProtocol.mod.Protocol.Performance.MetricsEvent
import typings.devtoolsProtocol.mod.Protocol.Profiler.ConsoleProfileFinishedEvent
import typings.devtoolsProtocol.mod.Protocol.Profiler.ConsoleProfileStartedEvent
import typings.devtoolsProtocol.mod.Protocol.Profiler.PreciseCoverageDeltaUpdateEvent
import typings.devtoolsProtocol.mod.Protocol.Runtime.BindingCalledEvent
import typings.devtoolsProtocol.mod.Protocol.Runtime.ConsoleAPICalledEvent
import typings.devtoolsProtocol.mod.Protocol.Runtime.ExceptionRevokedEvent
import typings.devtoolsProtocol.mod.Protocol.Runtime.ExceptionThrownEvent
import typings.devtoolsProtocol.mod.Protocol.Runtime.ExecutionContextCreatedEvent
import typings.devtoolsProtocol.mod.Protocol.Runtime.ExecutionContextDestroyedEvent
import typings.devtoolsProtocol.mod.Protocol.Runtime.InspectRequestedEvent
import typings.devtoolsProtocol.mod.Protocol.Security.CertificateErrorEvent
import typings.devtoolsProtocol.mod.Protocol.Security.SecurityStateChangedEvent
import typings.devtoolsProtocol.mod.Protocol.Security.VisibleSecurityStateChangedEvent
import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.WorkerErrorReportedEvent
import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.WorkerRegistrationUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.WorkerVersionUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Storage.CacheStorageContentUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Storage.CacheStorageListUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Storage.IndexedDBContentUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Storage.IndexedDBListUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Target.AttachedToTargetEvent
import typings.devtoolsProtocol.mod.Protocol.Target.DetachedFromTargetEvent
import typings.devtoolsProtocol.mod.Protocol.Target.ReceivedMessageFromTargetEvent
import typings.devtoolsProtocol.mod.Protocol.Target.TargetCrashedEvent
import typings.devtoolsProtocol.mod.Protocol.Target.TargetCreatedEvent
import typings.devtoolsProtocol.mod.Protocol.Target.TargetDestroyedEvent
import typings.devtoolsProtocol.mod.Protocol.Target.TargetInfoChangedEvent
import typings.devtoolsProtocol.mod.Protocol.Tethering.AcceptedEvent
import typings.devtoolsProtocol.mod.Protocol.Tracing.BufferUsageEvent
import typings.devtoolsProtocol.mod.Protocol.Tracing.DataCollectedEvent
import typings.devtoolsProtocol.mod.Protocol.Tracing.TracingCompleteEvent
import typings.devtoolsProtocol.mod.Protocol.WebAudio.AudioListenerCreatedEvent
import typings.devtoolsProtocol.mod.Protocol.WebAudio.AudioListenerWillBeDestroyedEvent
import typings.devtoolsProtocol.mod.Protocol.WebAudio.AudioNodeCreatedEvent
import typings.devtoolsProtocol.mod.Protocol.WebAudio.AudioNodeWillBeDestroyedEvent
import typings.devtoolsProtocol.mod.Protocol.WebAudio.AudioParamCreatedEvent
import typings.devtoolsProtocol.mod.Protocol.WebAudio.AudioParamWillBeDestroyedEvent
import typings.devtoolsProtocol.mod.Protocol.WebAudio.ContextChangedEvent
import typings.devtoolsProtocol.mod.Protocol.WebAudio.ContextCreatedEvent
import typings.devtoolsProtocol.mod.Protocol.WebAudio.ContextWillBeDestroyedEvent
import typings.devtoolsProtocol.mod.Protocol.WebAudio.NodeParamConnectedEvent
import typings.devtoolsProtocol.mod.Protocol.WebAudio.NodeParamDisconnectedEvent
import typings.devtoolsProtocol.mod.Protocol.WebAudio.NodesConnectedEvent
import typings.devtoolsProtocol.mod.Protocol.WebAudio.NodesDisconnectedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolMappingMod {
  
  object ProtocolMapping {
    
    trait Commands extends StObject {
      
      /**
        * Disables the accessibility domain.
        */
      @JSName("Accessibility.disable")
      var AccessibilityDotdisable: ParamsType
      
      /**
        * Enables the accessibility domain which causes `AXNodeId`s to remain consistent between method calls.
        * This turns on accessibility for the page, which can impact performance until accessibility is disabled.
        */
      @JSName("Accessibility.enable")
      var AccessibilityDotenable: ParamsType
      
      /**
        * Fetches the entire accessibility tree
        */
      @JSName("Accessibility.getFullAXTree")
      var AccessibilityDotgetFullAXTree: ReturnTypeGetFullAXTreeResponse
      
      /**
        * Fetches the accessibility node and partial accessibility tree for this DOM node, if it exists.
        */
      @JSName("Accessibility.getPartialAXTree")
      var AccessibilityDotgetPartialAXTree: ReturnTypeGetPartialAXTreeResponse
      
      /**
        * Query a DOM node's accessibility subtree for accessible name and role.
        * This command computes the name and role for all nodes in the subtree, including those that are
        * ignored for accessibility, and returns those that mactch the specified name and role. If no DOM
        * node is specified, or the DOM node does not exist, the command returns an error. If neither
        * `accessibleName` or `role` is specified, it returns all the accessibility nodes in the subtree.
        */
      @JSName("Accessibility.queryAXTree")
      var AccessibilityDotqueryAXTree: ReturnTypeQueryAXTreeResponse
      
      /**
        * Disables animation domain notifications.
        */
      @JSName("Animation.disable")
      var AnimationDotdisable: ParamsType
      
      /**
        * Enables animation domain notifications.
        */
      @JSName("Animation.enable")
      var AnimationDotenable: ParamsType
      
      /**
        * Returns the current time of the an animation.
        */
      @JSName("Animation.getCurrentTime")
      var AnimationDotgetCurrentTime: ReturnTypeGetCurrentTimeResponse
      
      /**
        * Gets the playback rate of the document timeline.
        */
      @JSName("Animation.getPlaybackRate")
      var AnimationDotgetPlaybackRate: ReturnTypeGetPlaybackRateResponse
      
      /**
        * Releases a set of animations to no longer be manipulated.
        */
      @JSName("Animation.releaseAnimations")
      var AnimationDotreleaseAnimations: `24`
      
      /**
        * Gets the remote object of the Animation.
        */
      @JSName("Animation.resolveAnimation")
      var AnimationDotresolveAnimation: ReturnTypeResolveAnimationResponse
      
      /**
        * Seek a set of animations to a particular time within each animation.
        */
      @JSName("Animation.seekAnimations")
      var AnimationDotseekAnimations: `25`
      
      /**
        * Sets the paused state of a set of animations.
        */
      @JSName("Animation.setPaused")
      var AnimationDotsetPaused: `26`
      
      /**
        * Sets the playback rate of the document timeline.
        */
      @JSName("Animation.setPlaybackRate")
      var AnimationDotsetPlaybackRate: `27`
      
      /**
        * Sets the timing of an animation node.
        */
      @JSName("Animation.setTiming")
      var AnimationDotsetTiming: `28`
      
      /**
        * Enables application cache domain notifications.
        */
      @JSName("ApplicationCache.enable")
      var ApplicationCacheDotenable: ParamsType
      
      /**
        * Returns relevant application cache data for the document in given frame.
        */
      @JSName("ApplicationCache.getApplicationCacheForFrame")
      var ApplicationCacheDotgetApplicationCacheForFrame: ReturnTypeGetApplicationCacheForFrameResponse
      
      /**
        * Returns array of frame identifiers with manifest urls for each frame containing a document
        * associated with some application cache.
        */
      @JSName("ApplicationCache.getFramesWithManifests")
      var ApplicationCacheDotgetFramesWithManifests: ReturnTypeGetFramesWithManifestsResponse
      
      /**
        * Returns manifest URL for document in the given frame.
        */
      @JSName("ApplicationCache.getManifestForFrame")
      var ApplicationCacheDotgetManifestForFrame: ReturnTypeGetManifestForFrameResponse
      
      /**
        * Disables issues domain, prevents further issues from being reported to the client.
        */
      @JSName("Audits.disable")
      var AuditsDotdisable: ParamsType
      
      /**
        * Enables issues domain, sends the issues collected so far to the client by means of the
        * `issueAdded` event.
        */
      @JSName("Audits.enable")
      var AuditsDotenable: ParamsType
      
      /**
        * Returns the response body and size if it were re-encoded with the specified settings. Only
        * applies to images.
        */
      @JSName("Audits.getEncodedResponse")
      var AuditsDotgetEncodedResponse: ReturnTypeGetEncodedResponseResponse
      
      /**
        * Clears all stored data for the service.
        */
      @JSName("BackgroundService.clearEvents")
      var BackgroundServiceDotclearEvents: `32`
      
      /**
        * Set the recording state for the service.
        */
      @JSName("BackgroundService.setRecording")
      var BackgroundServiceDotsetRecording: `31`
      
      /**
        * Enables event updates for the service.
        */
      @JSName("BackgroundService.startObserving")
      var BackgroundServiceDotstartObserving: `29`
      
      /**
        * Disables event updates for the service.
        */
      @JSName("BackgroundService.stopObserving")
      var BackgroundServiceDotstopObserving: `30`
      
      /**
        * Close browser gracefully.
        */
      @JSName("Browser.close")
      var BrowserDotclose: ParamsType
      
      /**
        * Crashes browser on the main thread.
        */
      @JSName("Browser.crash")
      var BrowserDotcrash: ParamsType
      
      /**
        * Crashes GPU process.
        */
      @JSName("Browser.crashGpuProcess")
      var BrowserDotcrashGpuProcess: ParamsType
      
      /**
        * Returns the command line switches for the browser process if, and only if
        * --enable-automation is on the commandline.
        */
      @JSName("Browser.getBrowserCommandLine")
      var BrowserDotgetBrowserCommandLine: ReturnTypeGetBrowserCommandLineResponse
      
      /**
        * Get a Chrome histogram by name.
        */
      @JSName("Browser.getHistogram")
      var BrowserDotgetHistogram: ReturnTypeGetHistogramResponse
      
      /**
        * Get Chrome histograms.
        */
      @JSName("Browser.getHistograms")
      var BrowserDotgetHistograms: ReturnTypeGetHistogramsResponse
      
      /**
        * Returns version information.
        */
      @JSName("Browser.getVersion")
      var BrowserDotgetVersion: ReturnTypeGetVersionResponse
      
      /**
        * Get position and size of the browser window.
        */
      @JSName("Browser.getWindowBounds")
      var BrowserDotgetWindowBounds: ReturnTypeGetWindowBoundsResponse
      
      /**
        * Get the browser window that contains the devtools target.
        */
      @JSName("Browser.getWindowForTarget")
      var BrowserDotgetWindowForTarget: ReturnTypeGetWindowForTargetResponse
      
      /**
        * Grant specific permissions to the given origin and reject all others.
        */
      @JSName("Browser.grantPermissions")
      var BrowserDotgrantPermissions: `34`
      
      /**
        * Reset all permission management for all origins.
        */
      @JSName("Browser.resetPermissions")
      var BrowserDotresetPermissions: `35`
      
      /**
        * Set dock tile details, platform-specific.
        */
      @JSName("Browser.setDockTile")
      var BrowserDotsetDockTile: `38`
      
      /**
        * Set the behavior when downloading a file.
        */
      @JSName("Browser.setDownloadBehavior")
      var BrowserDotsetDownloadBehavior: `36`
      
      /**
        * Set permission settings for given origin.
        */
      @JSName("Browser.setPermission")
      var BrowserDotsetPermission: `33`
      
      /**
        * Set position and/or size of the browser window.
        */
      @JSName("Browser.setWindowBounds")
      var BrowserDotsetWindowBounds: `37`
      
      /**
        * Inserts a new rule with the given `ruleText` in a stylesheet with given `styleSheetId`, at the
        * position specified by `location`.
        */
      @JSName("CSS.addRule")
      var CSSDotaddRule: ReturnTypeAddRuleResponse
      
      /**
        * Returns all class names from specified stylesheet.
        */
      @JSName("CSS.collectClassNames")
      var CSSDotcollectClassNames: ReturnTypeCollectClassNamesResponse
      
      /**
        * Creates a new special "via-inspector" stylesheet in the frame with given `frameId`.
        */
      @JSName("CSS.createStyleSheet")
      var CSSDotcreateStyleSheet: ReturnTypeCreateStyleSheetResponse
      
      /**
        * Disables the CSS agent for the given page.
        */
      @JSName("CSS.disable")
      var CSSDotdisable: ParamsType
      
      /**
        * Enables the CSS agent for the given page. Clients should not assume that the CSS agent has been
        * enabled until the result of this command is received.
        */
      @JSName("CSS.enable")
      var CSSDotenable: ParamsType
      
      /**
        * Ensures that the given node will have specified pseudo-classes whenever its style is computed by
        * the browser.
        */
      @JSName("CSS.forcePseudoState")
      var CSSDotforcePseudoState: `39`
      
      @JSName("CSS.getBackgroundColors")
      var CSSDotgetBackgroundColors: ReturnTypeGetBackgroundColorsResponse
      
      /**
        * Returns the computed style for a DOM node identified by `nodeId`.
        */
      @JSName("CSS.getComputedStyleForNode")
      var CSSDotgetComputedStyleForNode: ReturnTypeGetComputedStyleForNodeResponse
      
      /**
        * Returns the styles defined inline (explicitly in the "style" attribute and implicitly, using DOM
        * attributes) for a DOM node identified by `nodeId`.
        */
      @JSName("CSS.getInlineStylesForNode")
      var CSSDotgetInlineStylesForNode: ReturnTypeGetInlineStylesForNodeResponse
      
      /**
        * Returns requested styles for a DOM node identified by `nodeId`.
        */
      @JSName("CSS.getMatchedStylesForNode")
      var CSSDotgetMatchedStylesForNode: ReturnTypeGetMatchedStylesForNodeResponse
      
      /**
        * Returns all media queries parsed by the rendering engine.
        */
      @JSName("CSS.getMediaQueries")
      var CSSDotgetMediaQueries: ReturnTypeGetMediaQueriesResponse
      
      /**
        * Requests information about platform fonts which we used to render child TextNodes in the given
        * node.
        */
      @JSName("CSS.getPlatformFontsForNode")
      var CSSDotgetPlatformFontsForNode: ReturnTypeGetPlatformFontsForNodeResponse
      
      /**
        * Returns the current textual content for a stylesheet.
        */
      @JSName("CSS.getStyleSheetText")
      var CSSDotgetStyleSheetText: ReturnTypeGetStyleSheetTextResponse
      
      /**
        * Find a rule with the given active property for the given node and set the new value for this
        * property
        */
      @JSName("CSS.setEffectivePropertyValueForNode")
      var CSSDotsetEffectivePropertyValueForNode: `41`
      
      /**
        * Modifies the keyframe rule key text.
        */
      @JSName("CSS.setKeyframeKey")
      var CSSDotsetKeyframeKey: ReturnTypeSetKeyframeKeyResponse
      
      /**
        * Enables/disables rendering of local CSS fonts (enabled by default).
        */
      @JSName("CSS.setLocalFontsEnabled")
      var CSSDotsetLocalFontsEnabled: `42`
      
      /**
        * Modifies the rule selector.
        */
      @JSName("CSS.setMediaText")
      var CSSDotsetMediaText: ReturnTypeSetMediaTextResponse
      
      /**
        * Modifies the rule selector.
        */
      @JSName("CSS.setRuleSelector")
      var CSSDotsetRuleSelector: ReturnTypeSetRuleSelectorResponse
      
      /**
        * Sets the new stylesheet text.
        */
      @JSName("CSS.setStyleSheetText")
      var CSSDotsetStyleSheetText: ReturnTypeSetStyleSheetTextResponse
      
      /**
        * Applies specified style edits one after another in the given order.
        */
      @JSName("CSS.setStyleTexts")
      var CSSDotsetStyleTexts: ReturnTypeSetStyleTextsResponse
      
      /**
        * Enables the selector recording.
        */
      @JSName("CSS.startRuleUsageTracking")
      var CSSDotstartRuleUsageTracking: ParamsType
      
      /**
        * Stop tracking rule usage and return the list of rules that were used since last call to
        * `takeCoverageDelta` (or since start of coverage instrumentation)
        */
      @JSName("CSS.stopRuleUsageTracking")
      var CSSDotstopRuleUsageTracking: ReturnTypeStopRuleUsageTrackingResponse
      
      /**
        * Polls the next batch of computed style updates.
        */
      @JSName("CSS.takeComputedStyleUpdates")
      var CSSDottakeComputedStyleUpdates: ReturnTypeTakeComputedStyleUpdatesResponse
      
      /**
        * Obtain list of rules that became used since last call to this method (or since start of coverage
        * instrumentation)
        */
      @JSName("CSS.takeCoverageDelta")
      var CSSDottakeCoverageDelta: ReturnTypeTakeCoverageDeltaResponse
      
      /**
        * Starts tracking the given computed styles for updates. The specified array of properties
        * replaces the one previously specified. Pass empty array to disable tracking.
        * Use takeComputedStyleUpdates to retrieve the list of nodes that had properties modified.
        * The changes to computed style properties are only tracked for nodes pushed to the front-end
        * by the DOM agent. If no changes to the tracked properties occur after the node has been pushed
        * to the front-end, no updates will be issued for the node.
        */
      @JSName("CSS.trackComputedStyleUpdates")
      var CSSDottrackComputedStyleUpdates: `40`
      
      /**
        * Deletes a cache.
        */
      @JSName("CacheStorage.deleteCache")
      var CacheStorageDotdeleteCache: `43`
      
      /**
        * Deletes a cache entry.
        */
      @JSName("CacheStorage.deleteEntry")
      var CacheStorageDotdeleteEntry: `44`
      
      /**
        * Requests cache names.
        */
      @JSName("CacheStorage.requestCacheNames")
      var CacheStorageDotrequestCacheNames: ReturnTypeRequestCacheNamesResponse
      
      /**
        * Fetches cache entry.
        */
      @JSName("CacheStorage.requestCachedResponse")
      var CacheStorageDotrequestCachedResponse: ReturnTypeRequestCachedResponseResponse
      
      /**
        * Requests data from cache.
        */
      @JSName("CacheStorage.requestEntries")
      var CacheStorageDotrequestEntries: ReturnTypeRequestEntriesResponse
      
      /**
        * Stops observing for sinks and issues.
        */
      @JSName("Cast.disable")
      var CastDotdisable: ParamsType
      
      /**
        * Starts observing for sinks that can be used for tab mirroring, and if set,
        * sinks compatible with |presentationUrl| as well. When sinks are found, a
        * |sinksUpdated| event is fired.
        * Also starts observing for issue messages. When an issue is added or removed,
        * an |issueUpdated| event is fired.
        */
      @JSName("Cast.enable")
      var CastDotenable: `45`
      
      /**
        * Sets a sink to be used when the web page requests the browser to choose a
        * sink via Presentation API, Remote Playback API, or Cast SDK.
        */
      @JSName("Cast.setSinkToUse")
      var CastDotsetSinkToUse: `46`
      
      /**
        * Starts mirroring the tab to the sink.
        */
      @JSName("Cast.startTabMirroring")
      var CastDotstartTabMirroring: `47`
      
      /**
        * Stops the active Cast session on the sink.
        */
      @JSName("Cast.stopCasting")
      var CastDotstopCasting: `48`
      
      /**
        * Does nothing.
        */
      @JSName("Console.clearMessages")
      var ConsoleDotclearMessages: ParamsType
      
      /**
        * Disables console domain, prevents further console messages from being reported to the client.
        */
      @JSName("Console.disable")
      var ConsoleDotdisable: ParamsType
      
      /**
        * Enables console domain, sends the messages collected so far to the client by means of the
        * `messageAdded` notification.
        */
      @JSName("Console.enable")
      var ConsoleDotenable: ParamsType
      
      /**
        * Returns event listeners of the given object.
        */
      @JSName("DOMDebugger.getEventListeners")
      var DOMDebuggerDotgetEventListeners: ReturnTypeGetEventListenersResponse
      
      /**
        * Removes DOM breakpoint that was set using `setDOMBreakpoint`.
        */
      @JSName("DOMDebugger.removeDOMBreakpoint")
      var DOMDebuggerDotremoveDOMBreakpoint: `62`
      
      /**
        * Removes breakpoint on particular DOM event.
        */
      @JSName("DOMDebugger.removeEventListenerBreakpoint")
      var DOMDebuggerDotremoveEventListenerBreakpoint: `63`
      
      /**
        * Removes breakpoint on particular native event.
        */
      @JSName("DOMDebugger.removeInstrumentationBreakpoint")
      var DOMDebuggerDotremoveInstrumentationBreakpoint: `64`
      
      /**
        * Removes breakpoint from XMLHttpRequest.
        */
      @JSName("DOMDebugger.removeXHRBreakpoint")
      var DOMDebuggerDotremoveXHRBreakpoint: `65`
      
      /**
        * Sets breakpoint on particular operation with DOM.
        */
      @JSName("DOMDebugger.setDOMBreakpoint")
      var DOMDebuggerDotsetDOMBreakpoint: `66`
      
      /**
        * Sets breakpoint on particular DOM event.
        */
      @JSName("DOMDebugger.setEventListenerBreakpoint")
      var DOMDebuggerDotsetEventListenerBreakpoint: `67`
      
      /**
        * Sets breakpoint on particular native event.
        */
      @JSName("DOMDebugger.setInstrumentationBreakpoint")
      var DOMDebuggerDotsetInstrumentationBreakpoint: `68`
      
      /**
        * Sets breakpoint on XMLHttpRequest.
        */
      @JSName("DOMDebugger.setXHRBreakpoint")
      var DOMDebuggerDotsetXHRBreakpoint: `69`
      
      /**
        * Collects class names for the node with given id and all of it's child nodes.
        */
      @JSName("DOM.collectClassNamesFromSubtree")
      var DOMDotcollectClassNamesFromSubtree: ReturnTypeCollectClassNamesFromSubtreeResponse
      
      /**
        * Creates a deep copy of the specified node and places it into the target container before the
        * given anchor.
        */
      @JSName("DOM.copyTo")
      var DOMDotcopyTo: ReturnTypeCopyToResponse
      
      /**
        * Describes node given its id, does not require domain to be enabled. Does not start tracking any
        * objects, can be used for automation.
        */
      @JSName("DOM.describeNode")
      var DOMDotdescribeNode: ReturnTypeDescribeNodeResponse
      
      /**
        * Disables DOM agent for the given page.
        */
      @JSName("DOM.disable")
      var DOMDotdisable: ParamsType
      
      /**
        * Discards search results from the session with the given id. `getSearchResults` should no longer
        * be called for that search.
        */
      @JSName("DOM.discardSearchResults")
      var DOMDotdiscardSearchResults: `50`
      
      /**
        * Enables DOM agent for the given page.
        */
      @JSName("DOM.enable")
      var DOMDotenable: ParamsType
      
      /**
        * Focuses the given element.
        */
      @JSName("DOM.focus")
      var DOMDotfocus: `51`
      
      /**
        * Returns attributes for the specified node.
        */
      @JSName("DOM.getAttributes")
      var DOMDotgetAttributes: ReturnTypeGetAttributesResponse
      
      /**
        * Returns boxes for the given node.
        */
      @JSName("DOM.getBoxModel")
      var DOMDotgetBoxModel: ReturnTypeGetBoxModelResponse
      
      /**
        * Returns quads that describe node position on the page. This method
        * might return multiple quads for inline nodes.
        */
      @JSName("DOM.getContentQuads")
      var DOMDotgetContentQuads: ReturnTypeGetContentQuadsResponse
      
      /**
        * Returns the root DOM node (and optionally the subtree) to the caller.
        */
      @JSName("DOM.getDocument")
      var DOMDotgetDocument: ReturnTypeGetDocumentResponse
      
      /**
        * Returns file information for the given
        * File wrapper.
        */
      @JSName("DOM.getFileInfo")
      var DOMDotgetFileInfo: ReturnTypeGetFileInfoResponse
      
      /**
        * Returns the root DOM node (and optionally the subtree) to the caller.
        * Deprecated, as it is not designed to work well with the rest of the DOM agent.
        * Use DOMSnapshot.captureSnapshot instead.
        */
      @JSName("DOM.getFlattenedDocument")
      var DOMDotgetFlattenedDocument: ReturnTypeGetFlattenedDocumentResponse
      
      /**
        * Returns iframe node that owns iframe with the given domain.
        */
      @JSName("DOM.getFrameOwner")
      var DOMDotgetFrameOwner: ReturnTypeGetFrameOwnerResponse
      
      /**
        * Returns node id at given location. Depending on whether DOM domain is enabled, nodeId is
        * either returned or not.
        */
      @JSName("DOM.getNodeForLocation")
      var DOMDotgetNodeForLocation: ReturnTypeGetNodeForLocationResponse
      
      /**
        * Gets stack traces associated with a Node. As of now, only provides stack trace for Node creation.
        */
      @JSName("DOM.getNodeStackTraces")
      var DOMDotgetNodeStackTraces: ReturnTypeGetNodeStackTracesResponse
      
      /**
        * Finds nodes with a given computed style in a subtree.
        */
      @JSName("DOM.getNodesForSubtreeByStyle")
      var DOMDotgetNodesForSubtreeByStyle: ReturnTypeGetNodesForSubtreeByStyleResponse
      
      /**
        * Returns node's HTML markup.
        */
      @JSName("DOM.getOuterHTML")
      var DOMDotgetOuterHTML: ReturnTypeGetOuterHTMLResponse
      
      /**
        * Returns the id of the nearest ancestor that is a relayout boundary.
        */
      @JSName("DOM.getRelayoutBoundary")
      var DOMDotgetRelayoutBoundary: ReturnTypeGetRelayoutBoundaryResponse
      
      /**
        * Returns search results from given `fromIndex` to given `toIndex` from the search with the given
        * identifier.
        */
      @JSName("DOM.getSearchResults")
      var DOMDotgetSearchResults: ReturnTypeGetSearchResultsResponse
      
      /**
        * Hides any highlight.
        */
      @JSName("DOM.hideHighlight")
      var DOMDothideHighlight: ParamsType
      
      /**
        * Highlights DOM node.
        */
      @JSName("DOM.highlightNode")
      var DOMDothighlightNode: ParamsType
      
      /**
        * Highlights given rectangle.
        */
      @JSName("DOM.highlightRect")
      var DOMDothighlightRect: ParamsType
      
      /**
        * Marks last undoable state.
        */
      @JSName("DOM.markUndoableState")
      var DOMDotmarkUndoableState: ParamsType
      
      /**
        * Moves node into the new container, places it before the given anchor.
        */
      @JSName("DOM.moveTo")
      var DOMDotmoveTo: ReturnTypeMoveToResponse
      
      /**
        * Searches for a given string in the DOM tree. Use `getSearchResults` to access search results or
        * `cancelSearch` to end this search session.
        */
      @JSName("DOM.performSearch")
      var DOMDotperformSearch: ReturnTypePerformSearchResponse
      
      /**
        * Requests that the node is sent to the caller given its path. // FIXME, use XPath
        */
      @JSName("DOM.pushNodeByPathToFrontend")
      var DOMDotpushNodeByPathToFrontend: ReturnTypePushNodeByPathToFrontendResponse
      
      /**
        * Requests that a batch of nodes is sent to the caller given their backend node ids.
        */
      @JSName("DOM.pushNodesByBackendIdsToFrontend")
      var DOMDotpushNodesByBackendIdsToFrontend: ReturnTypePushNodesByBackendIdsToFrontendResponse
      
      /**
        * Executes `querySelector` on a given node.
        */
      @JSName("DOM.querySelector")
      var DOMDotquerySelector: ReturnTypeQuerySelectorResponse
      
      /**
        * Executes `querySelectorAll` on a given node.
        */
      @JSName("DOM.querySelectorAll")
      var DOMDotquerySelectorAll: ReturnTypeQuerySelectorAllResponse
      
      /**
        * Re-does the last undone action.
        */
      @JSName("DOM.redo")
      var DOMDotredo: ParamsType
      
      /**
        * Removes attribute with given name from an element with given id.
        */
      @JSName("DOM.removeAttribute")
      var DOMDotremoveAttribute: `52`
      
      /**
        * Removes node with given id.
        */
      @JSName("DOM.removeNode")
      var DOMDotremoveNode: `53`
      
      /**
        * Requests that children of the node with given id are returned to the caller in form of
        * `setChildNodes` events where not only immediate children are retrieved, but all children down to
        * the specified depth.
        */
      @JSName("DOM.requestChildNodes")
      var DOMDotrequestChildNodes: `54`
      
      /**
        * Requests that the node is sent to the caller given the JavaScript node object reference. All
        * nodes that form the path from the node to the root are also sent to the client as a series of
        * `setChildNodes` notifications.
        */
      @JSName("DOM.requestNode")
      var DOMDotrequestNode: ReturnTypeRequestNodeResponse
      
      /**
        * Resolves the JavaScript node object for a given NodeId or BackendNodeId.
        */
      @JSName("DOM.resolveNode")
      var DOMDotresolveNode: ReturnTypeResolveNodeResponse
      
      /**
        * Scrolls the specified rect of the given node into view if not already visible.
        * Note: exactly one between nodeId, backendNodeId and objectId should be passed
        * to identify the node.
        */
      @JSName("DOM.scrollIntoViewIfNeeded")
      var DOMDotscrollIntoViewIfNeeded: `49`
      
      /**
        * Sets attribute for an element with given id.
        */
      @JSName("DOM.setAttributeValue")
      var DOMDotsetAttributeValue: `55`
      
      /**
        * Sets attributes on element with given id. This method is useful when user edits some existing
        * attribute value and types in several attribute name/value pairs.
        */
      @JSName("DOM.setAttributesAsText")
      var DOMDotsetAttributesAsText: `56`
      
      /**
        * Sets files for the given file input element.
        */
      @JSName("DOM.setFileInputFiles")
      var DOMDotsetFileInputFiles: `57`
      
      /**
        * Enables console to refer to the node with given id via $x (see Command Line API for more details
        * $x functions).
        */
      @JSName("DOM.setInspectedNode")
      var DOMDotsetInspectedNode: `59`
      
      /**
        * Sets node name for a node with given id.
        */
      @JSName("DOM.setNodeName")
      var DOMDotsetNodeName: ReturnTypeSetNodeNameResponse
      
      /**
        * Sets if stack traces should be captured for Nodes. See `Node.getNodeStackTraces`. Default is disabled.
        */
      @JSName("DOM.setNodeStackTracesEnabled")
      var DOMDotsetNodeStackTracesEnabled: `58`
      
      /**
        * Sets node value for a node with given id.
        */
      @JSName("DOM.setNodeValue")
      var DOMDotsetNodeValue: `60`
      
      /**
        * Sets node HTML markup, returns new node id.
        */
      @JSName("DOM.setOuterHTML")
      var DOMDotsetOuterHTML: `61`
      
      /**
        * Undoes the last performed action.
        */
      @JSName("DOM.undo")
      var DOMDotundo: ParamsType
      
      /**
        * Returns a document snapshot, including the full DOM tree of the root node (including iframes,
        * template contents, and imported documents) in a flattened array, as well as layout and
        * white-listed computed style information for the nodes. Shadow DOM in the returned DOM tree is
        * flattened.
        */
      @JSName("DOMSnapshot.captureSnapshot")
      var DOMSnapshotDotcaptureSnapshot: ReturnTypeCaptureSnapshotResponse
      
      /**
        * Disables DOM snapshot agent for the given page.
        */
      @JSName("DOMSnapshot.disable")
      var DOMSnapshotDotdisable: ParamsType
      
      /**
        * Enables DOM snapshot agent for the given page.
        */
      @JSName("DOMSnapshot.enable")
      var DOMSnapshotDotenable: ParamsType
      
      /**
        * Returns a document snapshot, including the full DOM tree of the root node (including iframes,
        * template contents, and imported documents) in a flattened array, as well as layout and
        * white-listed computed style information for the nodes. Shadow DOM in the returned DOM tree is
        * flattened.
        */
      @JSName("DOMSnapshot.getSnapshot")
      var DOMSnapshotDotgetSnapshot: ReturnTypeGetSnapshotResponse
      
      @JSName("DOMStorage.clear")
      var DOMStorageDotclear: `70`
      
      /**
        * Disables storage tracking, prevents storage events from being sent to the client.
        */
      @JSName("DOMStorage.disable")
      var DOMStorageDotdisable: ParamsType
      
      /**
        * Enables storage tracking, storage events will now be delivered to the client.
        */
      @JSName("DOMStorage.enable")
      var DOMStorageDotenable: ParamsType
      
      @JSName("DOMStorage.getDOMStorageItems")
      var DOMStorageDotgetDOMStorageItems: ReturnTypeGetDOMStorageItemsResponse
      
      @JSName("DOMStorage.removeDOMStorageItem")
      var DOMStorageDotremoveDOMStorageItem: `71`
      
      @JSName("DOMStorage.setDOMStorageItem")
      var DOMStorageDotsetDOMStorageItem: `72`
      
      /**
        * Disables database tracking, prevents database events from being sent to the client.
        */
      @JSName("Database.disable")
      var DatabaseDotdisable: ParamsType
      
      /**
        * Enables database tracking, database events will now be delivered to the client.
        */
      @JSName("Database.enable")
      var DatabaseDotenable: ParamsType
      
      @JSName("Database.executeSQL")
      var DatabaseDotexecuteSQL: ReturnTypeExecuteSQLResponse
      
      @JSName("Database.getDatabaseTableNames")
      var DatabaseDotgetDatabaseTableNames: ReturnTypeGetDatabaseTableNamesResponse
      
      /**
        * Continues execution until specific location is reached.
        */
      @JSName("Debugger.continueToLocation")
      var DebuggerDotcontinueToLocation: ReturnType
      
      /**
        * Disables debugger for given page.
        */
      @JSName("Debugger.disable")
      var DebuggerDotdisable: ParamsType
      
      /**
        * Enables debugger for the given page. Clients should not assume that the debugging has been
        * enabled until the result for this command is received.
        */
      @JSName("Debugger.enable")
      var DebuggerDotenable: ParamsTypeReturnType
      
      /**
        * Evaluates expression on a given call frame.
        */
      @JSName("Debugger.evaluateOnCallFrame")
      var DebuggerDotevaluateOnCallFrame: ReturnTypeEvaluateOnCallFrameResponse
      
      /**
        * Execute a Wasm Evaluator module on a given call frame.
        */
      @JSName("Debugger.executeWasmEvaluator")
      var DebuggerDotexecuteWasmEvaluator: ReturnTypeExecuteWasmEvaluatorResponse
      
      /**
        * Returns possible locations for breakpoint. scriptId in start and end range locations should be
        * the same.
        */
      @JSName("Debugger.getPossibleBreakpoints")
      var DebuggerDotgetPossibleBreakpoints: ReturnTypeGetPossibleBreakpointsResponse
      
      /**
        * Returns source for the script with given id.
        */
      @JSName("Debugger.getScriptSource")
      var DebuggerDotgetScriptSource: ReturnTypeGetScriptSourceResponse
      
      /**
        * Returns stack trace with given `stackTraceId`.
        */
      @JSName("Debugger.getStackTrace")
      var DebuggerDotgetStackTrace: ReturnTypeGetStackTraceResponse
      
      /**
        * This command is deprecated. Use getScriptSource instead.
        */
      @JSName("Debugger.getWasmBytecode")
      var DebuggerDotgetWasmBytecode: ReturnTypeGetWasmBytecodeResponse
      
      /**
        * Stops on the next JavaScript statement.
        */
      @JSName("Debugger.pause")
      var DebuggerDotpause: ParamsType
      
      @JSName("Debugger.pauseOnAsyncCall")
      var DebuggerDotpauseOnAsyncCall: ReturnTypeVoid
      
      /**
        * Removes JavaScript breakpoint.
        */
      @JSName("Debugger.removeBreakpoint")
      var DebuggerDotremoveBreakpoint: ParamsTypeReturnTypeVoid
      
      /**
        * Restarts particular call frame from the beginning.
        */
      @JSName("Debugger.restartFrame")
      var DebuggerDotrestartFrame: ReturnTypeRestartFrameResponse
      
      /**
        * Resumes JavaScript execution.
        */
      @JSName("Debugger.resume")
      var DebuggerDotresume: `0`
      
      /**
        * Searches for given string in script content.
        */
      @JSName("Debugger.searchInContent")
      var DebuggerDotsearchInContent: ReturnTypeSearchInContentResponse
      
      /**
        * Enables or disables async call stacks tracking.
        */
      @JSName("Debugger.setAsyncCallStackDepth")
      var DebuggerDotsetAsyncCallStackDepth: `1`
      
      /**
        * Replace previous blackbox patterns with passed ones. Forces backend to skip stepping/pausing in
        * scripts with url matching one of the patterns. VM will try to leave blackboxed script by
        * performing 'step in' several times, finally resorting to 'step out' if unsuccessful.
        */
      @JSName("Debugger.setBlackboxPatterns")
      var DebuggerDotsetBlackboxPatterns: `2`
      
      /**
        * Makes backend skip steps in the script in blackboxed ranges. VM will try leave blacklisted
        * scripts by performing 'step in' several times, finally resorting to 'step out' if unsuccessful.
        * Positions array contains positions where blackbox state is changed. First interval isn't
        * blackboxed. Array should be sorted.
        */
      @JSName("Debugger.setBlackboxedRanges")
      var DebuggerDotsetBlackboxedRanges: `3`
      
      /**
        * Sets JavaScript breakpoint at a given location.
        */
      @JSName("Debugger.setBreakpoint")
      var DebuggerDotsetBreakpoint: ReturnTypeSetBreakpointResponse
      
      /**
        * Sets JavaScript breakpoint at given location specified either by URL or URL regex. Once this
        * command is issued, all existing parsed scripts will have breakpoints resolved and returned in
        * `locations` property. Further matching script parsing will result in subsequent
        * `breakpointResolved` events issued. This logical breakpoint will survive page reloads.
        */
      @JSName("Debugger.setBreakpointByUrl")
      var DebuggerDotsetBreakpointByUrl: ReturnTypeSetBreakpointByUrlResponse
      
      /**
        * Sets JavaScript breakpoint before each call to the given function.
        * If another function was created from the same source as a given one,
        * calling it will also trigger the breakpoint.
        */
      @JSName("Debugger.setBreakpointOnFunctionCall")
      var DebuggerDotsetBreakpointOnFunctionCall: ReturnTypeSetBreakpointOnFunctionCallResponse
      
      /**
        * Activates / deactivates all breakpoints on the page.
        */
      @JSName("Debugger.setBreakpointsActive")
      var DebuggerDotsetBreakpointsActive: `4`
      
      /**
        * Sets instrumentation breakpoint.
        */
      @JSName("Debugger.setInstrumentationBreakpoint")
      var DebuggerDotsetInstrumentationBreakpoint: ReturnTypeSetInstrumentationBreakpointResponse
      
      /**
        * Defines pause on exceptions state. Can be set to stop on all exceptions, uncaught exceptions or
        * no exceptions. Initial pause on exceptions state is `none`.
        */
      @JSName("Debugger.setPauseOnExceptions")
      var DebuggerDotsetPauseOnExceptions: `5`
      
      /**
        * Changes return value in top frame. Available only at return break position.
        */
      @JSName("Debugger.setReturnValue")
      var DebuggerDotsetReturnValue: `6`
      
      /**
        * Edits JavaScript source live.
        */
      @JSName("Debugger.setScriptSource")
      var DebuggerDotsetScriptSource: ReturnTypeSetScriptSourceResponse
      
      /**
        * Makes page not interrupt on any pauses (breakpoint, exception, dom exception etc).
        */
      @JSName("Debugger.setSkipAllPauses")
      var DebuggerDotsetSkipAllPauses: `7`
      
      /**
        * Changes value of variable in a callframe. Object-based scopes are not supported and must be
        * mutated manually.
        */
      @JSName("Debugger.setVariableValue")
      var DebuggerDotsetVariableValue: `8`
      
      /**
        * Steps into the function call.
        */
      @JSName("Debugger.stepInto")
      var DebuggerDotstepInto: `9`
      
      /**
        * Steps out of the function call.
        */
      @JSName("Debugger.stepOut")
      var DebuggerDotstepOut: ParamsType
      
      /**
        * Steps over the statement.
        */
      @JSName("Debugger.stepOver")
      var DebuggerDotstepOver: `10`
      
      /**
        * Clears the overridden Device Orientation.
        */
      @JSName("DeviceOrientation.clearDeviceOrientationOverride")
      var DeviceOrientationDotclearDeviceOrientationOverride: ParamsType
      
      /**
        * Overrides the Device Orientation.
        */
      @JSName("DeviceOrientation.setDeviceOrientationOverride")
      var DeviceOrientationDotsetDeviceOrientationOverride: `73`
      
      /**
        * Tells whether emulation is supported.
        */
      @JSName("Emulation.canEmulate")
      var EmulationDotcanEmulate: ReturnTypeCanEmulateResponse
      
      /**
        * Clears the overriden device metrics.
        */
      @JSName("Emulation.clearDeviceMetricsOverride")
      var EmulationDotclearDeviceMetricsOverride: ParamsType
      
      /**
        * Clears the overriden Geolocation Position and Error.
        */
      @JSName("Emulation.clearGeolocationOverride")
      var EmulationDotclearGeolocationOverride: ParamsType
      
      /**
        * Clears Idle state overrides.
        */
      @JSName("Emulation.clearIdleOverride")
      var EmulationDotclearIdleOverride: ParamsType
      
      /**
        * Requests that page scale factor is reset to initial values.
        */
      @JSName("Emulation.resetPageScaleFactor")
      var EmulationDotresetPageScaleFactor: ParamsType
      
      /**
        * Enables CPU throttling to emulate slow CPUs.
        */
      @JSName("Emulation.setCPUThrottlingRate")
      var EmulationDotsetCPUThrottlingRate: `75`
      
      /**
        * Sets or clears an override of the default background color of the frame. This override is used
        * if the content does not specify one.
        */
      @JSName("Emulation.setDefaultBackgroundColorOverride")
      var EmulationDotsetDefaultBackgroundColorOverride: `76`
      
      /**
        * Overrides the values of device screen dimensions (window.screen.width, window.screen.height,
        * window.innerWidth, window.innerHeight, and "device-width"/"device-height"-related CSS media
        * query results).
        */
      @JSName("Emulation.setDeviceMetricsOverride")
      var EmulationDotsetDeviceMetricsOverride: `77`
      
      @JSName("Emulation.setDocumentCookieDisabled")
      var EmulationDotsetDocumentCookieDisabled: `79`
      
      @JSName("Emulation.setEmitTouchEventsForMouse")
      var EmulationDotsetEmitTouchEventsForMouse: `80`
      
      /**
        * Emulates the given media type or media feature for CSS media queries.
        */
      @JSName("Emulation.setEmulatedMedia")
      var EmulationDotsetEmulatedMedia: `81`
      
      /**
        * Emulates the given vision deficiency.
        */
      @JSName("Emulation.setEmulatedVisionDeficiency")
      var EmulationDotsetEmulatedVisionDeficiency: `82`
      
      /**
        * Enables or disables simulating a focused and active page.
        */
      @JSName("Emulation.setFocusEmulationEnabled")
      var EmulationDotsetFocusEmulationEnabled: `74`
      
      /**
        * Overrides the Geolocation Position or Error. Omitting any of the parameters emulates position
        * unavailable.
        */
      @JSName("Emulation.setGeolocationOverride")
      var EmulationDotsetGeolocationOverride: `83`
      
      /**
        * Overrides the Idle state.
        */
      @JSName("Emulation.setIdleOverride")
      var EmulationDotsetIdleOverride: `84`
      
      /**
        * Overrides default host system locale with the specified one.
        */
      @JSName("Emulation.setLocaleOverride")
      var EmulationDotsetLocaleOverride: `89`
      
      /**
        * Overrides value returned by the javascript navigator object.
        */
      @JSName("Emulation.setNavigatorOverrides")
      var EmulationDotsetNavigatorOverrides: `85`
      
      /**
        * Sets a specified page scale factor.
        */
      @JSName("Emulation.setPageScaleFactor")
      var EmulationDotsetPageScaleFactor: `86`
      
      /**
        * Switches script execution in the page.
        */
      @JSName("Emulation.setScriptExecutionDisabled")
      var EmulationDotsetScriptExecutionDisabled: `87`
      
      @JSName("Emulation.setScrollbarsHidden")
      var EmulationDotsetScrollbarsHidden: `78`
      
      /**
        * Overrides default host system timezone with the specified one.
        */
      @JSName("Emulation.setTimezoneOverride")
      var EmulationDotsetTimezoneOverride: `90`
      
      /**
        * Enables touch on platforms which do not support them.
        */
      @JSName("Emulation.setTouchEmulationEnabled")
      var EmulationDotsetTouchEmulationEnabled: `88`
      
      /**
        * Allows overriding user agent with the given string.
        */
      @JSName("Emulation.setUserAgentOverride")
      var EmulationDotsetUserAgentOverride: `92`
      
      /**
        * Turns on virtual time for all frames (replacing real-time with a synthetic time source) and sets
        * the current virtual time policy.  Note this supersedes any previous time budget.
        */
      @JSName("Emulation.setVirtualTimePolicy")
      var EmulationDotsetVirtualTimePolicy: ReturnTypeSetVirtualTimePolicyResponse
      
      /**
        * Resizes the frame/viewport of the page. Note that this does not affect the frame's container
        * (e.g. browser window). Can be used to produce screenshots of the specified size. Not supported
        * on Android.
        */
      @JSName("Emulation.setVisibleSize")
      var EmulationDotsetVisibleSize: `91`
      
      /**
        * Continues the request, optionally modifying some of its parameters.
        */
      @JSName("Fetch.continueRequest")
      var FetchDotcontinueRequest: `205`
      
      /**
        * Continues a request supplying authChallengeResponse following authRequired event.
        */
      @JSName("Fetch.continueWithAuth")
      var FetchDotcontinueWithAuth: `206`
      
      /**
        * Disables the fetch domain.
        */
      @JSName("Fetch.disable")
      var FetchDotdisable: ParamsType
      
      /**
        * Enables issuing of requestPaused events. A request will be paused until client
        * calls one of failRequest, fulfillRequest or continueRequest/continueWithAuth.
        */
      @JSName("Fetch.enable")
      var FetchDotenable: `202`
      
      /**
        * Causes the request to fail with specified reason.
        */
      @JSName("Fetch.failRequest")
      var FetchDotfailRequest: `203`
      
      /**
        * Provides response to the request.
        */
      @JSName("Fetch.fulfillRequest")
      var FetchDotfulfillRequest: `204`
      
      /**
        * Causes the body of the response to be received from the server and
        * returned as a single string. May only be issued for a request that
        * is paused in the Response stage and is mutually exclusive with
        * takeResponseBodyForInterceptionAsStream. Calling other methods that
        * affect the request or disabling fetch domain before body is received
        * results in an undefined behavior.
        */
      @JSName("Fetch.getResponseBody")
      var FetchDotgetResponseBody: ParamsTypeReturnTypeGetResponseBodyResponse
      
      /**
        * Returns a handle to the stream representing the response body.
        * The request must be paused in the HeadersReceived stage.
        * Note that after this command the request can't be continued
        * as is -- client either needs to cancel it or to provide the
        * response body.
        * The stream only supports sequential read, IO.read will fail if the position
        * is specified.
        * This method is mutually exclusive with getResponseBody.
        * Calling other methods that affect the request or disabling fetch
        * domain before body is received results in an undefined behavior.
        */
      @JSName("Fetch.takeResponseBodyAsStream")
      var FetchDottakeResponseBodyAsStream: ReturnTypeTakeResponseBodyAsStreamResponse
      
      /**
        * Sends a BeginFrame to the target and returns when the frame was completed. Optionally captures a
        * screenshot from the resulting frame. Requires that the target was created with enabled
        * BeginFrameControl. Designed for use with --run-all-compositor-stages-before-draw, see also
        * https://goo.gl/3zHXhB for more background.
        */
      @JSName("HeadlessExperimental.beginFrame")
      var HeadlessExperimentalDotbeginFrame: ReturnTypeBeginFrameResponse
      
      /**
        * Disables headless events for the target.
        */
      @JSName("HeadlessExperimental.disable")
      var HeadlessExperimentalDotdisable: ParamsType
      
      /**
        * Enables headless events for the target.
        */
      @JSName("HeadlessExperimental.enable")
      var HeadlessExperimentalDotenable: ParamsType
      
      /**
        * Enables console to refer to the node with given id via $x (see Command Line API for more details
        * $x functions).
        */
      @JSName("HeapProfiler.addInspectedHeapObject")
      var HeapProfilerDotaddInspectedHeapObject: `11`
      
      @JSName("HeapProfiler.collectGarbage")
      var HeapProfilerDotcollectGarbage: ParamsType
      
      @JSName("HeapProfiler.disable")
      var HeapProfilerDotdisable: ParamsType
      
      @JSName("HeapProfiler.enable")
      var HeapProfilerDotenable: ParamsType
      
      @JSName("HeapProfiler.getHeapObjectId")
      var HeapProfilerDotgetHeapObjectId: ReturnTypeGetHeapObjectIdResponse
      
      @JSName("HeapProfiler.getObjectByHeapObjectId")
      var HeapProfilerDotgetObjectByHeapObjectId: ReturnTypeGetObjectByHeapObjectIdResponse
      
      @JSName("HeapProfiler.getSamplingProfile")
      var HeapProfilerDotgetSamplingProfile: ReturnTypeGetSamplingProfileResponse
      
      @JSName("HeapProfiler.startSampling")
      var HeapProfilerDotstartSampling: `12`
      
      @JSName("HeapProfiler.startTrackingHeapObjects")
      var HeapProfilerDotstartTrackingHeapObjects: `13`
      
      @JSName("HeapProfiler.stopSampling")
      var HeapProfilerDotstopSampling: ReturnTypeStopSamplingResponse
      
      @JSName("HeapProfiler.stopTrackingHeapObjects")
      var HeapProfilerDotstopTrackingHeapObjects: `14`
      
      @JSName("HeapProfiler.takeHeapSnapshot")
      var HeapProfilerDottakeHeapSnapshot: `15`
      
      /**
        * Close the stream, discard any temporary backing storage.
        */
      @JSName("IO.close")
      var IODotclose: `93`
      
      /**
        * Read a chunk of the stream
        */
      @JSName("IO.read")
      var IODotread: ReturnTypeReadResponse
      
      /**
        * Return UUID of Blob object specified by a remote object id.
        */
      @JSName("IO.resolveBlob")
      var IODotresolveBlob: ReturnTypeResolveBlobResponse
      
      /**
        * Clears all entries from an object store.
        */
      @JSName("IndexedDB.clearObjectStore")
      var IndexedDBDotclearObjectStore: `94`
      
      /**
        * Deletes a database.
        */
      @JSName("IndexedDB.deleteDatabase")
      var IndexedDBDotdeleteDatabase: `95`
      
      /**
        * Delete a range of entries from an object store
        */
      @JSName("IndexedDB.deleteObjectStoreEntries")
      var IndexedDBDotdeleteObjectStoreEntries: `96`
      
      /**
        * Disables events from backend.
        */
      @JSName("IndexedDB.disable")
      var IndexedDBDotdisable: ParamsType
      
      /**
        * Enables events from backend.
        */
      @JSName("IndexedDB.enable")
      var IndexedDBDotenable: ParamsType
      
      /**
        * Gets metadata of an object store
        */
      @JSName("IndexedDB.getMetadata")
      var IndexedDBDotgetMetadata: ReturnTypeGetMetadataResponse
      
      /**
        * Requests data from object store or index.
        */
      @JSName("IndexedDB.requestData")
      var IndexedDBDotrequestData: ReturnTypeRequestDataResponse
      
      /**
        * Requests database with given name in given frame.
        */
      @JSName("IndexedDB.requestDatabase")
      var IndexedDBDotrequestDatabase: ReturnTypeRequestDatabaseResponse
      
      /**
        * Requests database names for given security origin.
        */
      @JSName("IndexedDB.requestDatabaseNames")
      var IndexedDBDotrequestDatabaseNames: ReturnTypeRequestDatabaseNamesResponse
      
      /**
        * Dispatches a key event to the page.
        */
      @JSName("Input.dispatchKeyEvent")
      var InputDotdispatchKeyEvent: `97`
      
      /**
        * Dispatches a mouse event to the page.
        */
      @JSName("Input.dispatchMouseEvent")
      var InputDotdispatchMouseEvent: `99`
      
      /**
        * Dispatches a touch event to the page.
        */
      @JSName("Input.dispatchTouchEvent")
      var InputDotdispatchTouchEvent: `100`
      
      /**
        * Emulates touch event from the mouse event parameters.
        */
      @JSName("Input.emulateTouchFromMouseEvent")
      var InputDotemulateTouchFromMouseEvent: `101`
      
      /**
        * This method emulates inserting text that doesn't come from a key press,
        * for example an emoji keyboard or an IME.
        */
      @JSName("Input.insertText")
      var InputDotinsertText: `98`
      
      /**
        * Ignores input events (useful while auditing page).
        */
      @JSName("Input.setIgnoreInputEvents")
      var InputDotsetIgnoreInputEvents: `102`
      
      /**
        * Synthesizes a pinch gesture over a time period by issuing appropriate touch events.
        */
      @JSName("Input.synthesizePinchGesture")
      var InputDotsynthesizePinchGesture: `103`
      
      /**
        * Synthesizes a scroll gesture over a time period by issuing appropriate touch events.
        */
      @JSName("Input.synthesizeScrollGesture")
      var InputDotsynthesizeScrollGesture: `104`
      
      /**
        * Synthesizes a tap gesture over a time period by issuing appropriate touch events.
        */
      @JSName("Input.synthesizeTapGesture")
      var InputDotsynthesizeTapGesture: `105`
      
      /**
        * Disables inspector domain notifications.
        */
      @JSName("Inspector.disable")
      var InspectorDotdisable: ParamsType
      
      /**
        * Enables inspector domain notifications.
        */
      @JSName("Inspector.enable")
      var InspectorDotenable: ParamsType
      
      /**
        * Provides the reasons why the given layer was composited.
        */
      @JSName("LayerTree.compositingReasons")
      var LayerTreeDotcompositingReasons: ReturnTypeCompositingReasonsResponse
      
      /**
        * Disables compositing tree inspection.
        */
      @JSName("LayerTree.disable")
      var LayerTreeDotdisable: ParamsType
      
      /**
        * Enables compositing tree inspection.
        */
      @JSName("LayerTree.enable")
      var LayerTreeDotenable: ParamsType
      
      /**
        * Returns the snapshot identifier.
        */
      @JSName("LayerTree.loadSnapshot")
      var LayerTreeDotloadSnapshot: ReturnTypeLoadSnapshotResponse
      
      /**
        * Returns the layer snapshot identifier.
        */
      @JSName("LayerTree.makeSnapshot")
      var LayerTreeDotmakeSnapshot: ReturnTypeMakeSnapshotResponse
      
      @JSName("LayerTree.profileSnapshot")
      var LayerTreeDotprofileSnapshot: ReturnTypeProfileSnapshotResponse
      
      /**
        * Releases layer snapshot captured by the back-end.
        */
      @JSName("LayerTree.releaseSnapshot")
      var LayerTreeDotreleaseSnapshot: `106`
      
      /**
        * Replays the layer snapshot and returns the resulting bitmap.
        */
      @JSName("LayerTree.replaySnapshot")
      var LayerTreeDotreplaySnapshot: ReturnTypeReplaySnapshotResponse
      
      /**
        * Replays the layer snapshot and returns canvas log.
        */
      @JSName("LayerTree.snapshotCommandLog")
      var LayerTreeDotsnapshotCommandLog: ReturnTypeSnapshotCommandLogResponse
      
      /**
        * Clears the log.
        */
      @JSName("Log.clear")
      var LogDotclear: ParamsType
      
      /**
        * Disables log domain, prevents further log entries from being reported to the client.
        */
      @JSName("Log.disable")
      var LogDotdisable: ParamsType
      
      /**
        * Enables log domain, sends the entries collected so far to the client by means of the
        * `entryAdded` notification.
        */
      @JSName("Log.enable")
      var LogDotenable: ParamsType
      
      /**
        * start violation reporting.
        */
      @JSName("Log.startViolationsReport")
      var LogDotstartViolationsReport: `107`
      
      /**
        * Stop violation reporting.
        */
      @JSName("Log.stopViolationsReport")
      var LogDotstopViolationsReport: ParamsType
      
      /**
        * Disables the Media domain.
        */
      @JSName("Media.disable")
      var MediaDotdisable: ParamsType
      
      /**
        * Enables the Media domain
        */
      @JSName("Media.enable")
      var MediaDotenable: ParamsType
      
      /**
        * Simulate OomIntervention by purging V8 memory.
        */
      @JSName("Memory.forciblyPurgeJavaScriptMemory")
      var MemoryDotforciblyPurgeJavaScriptMemory: ParamsType
      
      /**
        * Retrieve native memory allocations profile
        * collected since renderer process startup.
        */
      @JSName("Memory.getAllTimeSamplingProfile")
      var MemoryDotgetAllTimeSamplingProfile: ReturnTypeGetAllTimeSamplingProfileResponse
      
      /**
        * Retrieve native memory allocations profile
        * collected since browser process startup.
        */
      @JSName("Memory.getBrowserSamplingProfile")
      var MemoryDotgetBrowserSamplingProfile: ReturnTypeGetBrowserSamplingProfileResponse
      
      @JSName("Memory.getDOMCounters")
      var MemoryDotgetDOMCounters: ReturnTypeGetDOMCountersResponse
      
      /**
        * Retrieve native memory allocations profile collected since last
        * `startSampling` call.
        */
      @JSName("Memory.getSamplingProfile")
      var MemoryDotgetSamplingProfile: ParamsTypeReturnTypeGetSamplingProfileResponse
      
      @JSName("Memory.prepareForLeakDetection")
      var MemoryDotprepareForLeakDetection: ParamsType
      
      /**
        * Enable/disable suppressing memory pressure notifications in all processes.
        */
      @JSName("Memory.setPressureNotificationsSuppressed")
      var MemoryDotsetPressureNotificationsSuppressed: `108`
      
      /**
        * Simulate a memory pressure notification in all processes.
        */
      @JSName("Memory.simulatePressureNotification")
      var MemoryDotsimulatePressureNotification: `109`
      
      /**
        * Start collecting native memory profile.
        */
      @JSName("Memory.startSampling")
      var MemoryDotstartSampling: `110`
      
      /**
        * Stop collecting native memory profile.
        */
      @JSName("Memory.stopSampling")
      var MemoryDotstopSampling: ParamsType
      
      /**
        * Tells whether clearing browser cache is supported.
        */
      @JSName("Network.canClearBrowserCache")
      var NetworkDotcanClearBrowserCache: ReturnTypeCanClearBrowserCacheResponse
      
      /**
        * Tells whether clearing browser cookies is supported.
        */
      @JSName("Network.canClearBrowserCookies")
      var NetworkDotcanClearBrowserCookies: ReturnTypeCanClearBrowserCookiesResponse
      
      /**
        * Tells whether emulation of network conditions is supported.
        */
      @JSName("Network.canEmulateNetworkConditions")
      var NetworkDotcanEmulateNetworkConditions: ReturnTypeCanEmulateNetworkConditionsResponse
      
      /**
        * Clears browser cache.
        */
      @JSName("Network.clearBrowserCache")
      var NetworkDotclearBrowserCache: ParamsType
      
      /**
        * Clears browser cookies.
        */
      @JSName("Network.clearBrowserCookies")
      var NetworkDotclearBrowserCookies: ParamsType
      
      /**
        * Response to Network.requestIntercepted which either modifies the request to continue with any
        * modifications, or blocks it, or completes it with the provided response bytes. If a network
        * fetch occurs as a result which encounters a redirect an additional Network.requestIntercepted
        * event will be sent with the same InterceptionId.
        * Deprecated, use Fetch.continueRequest, Fetch.fulfillRequest and Fetch.failRequest instead.
        */
      @JSName("Network.continueInterceptedRequest")
      var NetworkDotcontinueInterceptedRequest: `111`
      
      /**
        * Deletes browser cookies with matching name and url or domain/path pair.
        */
      @JSName("Network.deleteCookies")
      var NetworkDotdeleteCookies: `112`
      
      /**
        * Disables network tracking, prevents network events from being sent to the client.
        */
      @JSName("Network.disable")
      var NetworkDotdisable: ParamsType
      
      /**
        * Activates emulation of network conditions.
        */
      @JSName("Network.emulateNetworkConditions")
      var NetworkDotemulateNetworkConditions: `113`
      
      /**
        * Enables network tracking, network events will now be delivered to the client.
        */
      @JSName("Network.enable")
      var NetworkDotenable: `114`
      
      /**
        * Returns all browser cookies. Depending on the backend support, will return detailed cookie
        * information in the `cookies` field.
        */
      @JSName("Network.getAllCookies")
      var NetworkDotgetAllCookies: ReturnTypeGetAllCookiesResponse
      
      /**
        * Returns the DER-encoded certificate.
        */
      @JSName("Network.getCertificate")
      var NetworkDotgetCertificate: ReturnTypeGetCertificateResponse
      
      /**
        * Returns all browser cookies for the current URL. Depending on the backend support, will return
        * detailed cookie information in the `cookies` field.
        */
      @JSName("Network.getCookies")
      var NetworkDotgetCookies: ReturnTypeGetCookiesResponse
      
      /**
        * Returns post data sent with the request. Returns an error when no data was sent with the request.
        */
      @JSName("Network.getRequestPostData")
      var NetworkDotgetRequestPostData: ReturnTypeGetRequestPostDataResponse
      
      /**
        * Returns content served for the given request.
        */
      @JSName("Network.getResponseBody")
      var NetworkDotgetResponseBody: ReturnTypeGetResponseBodyResponse
      
      /**
        * Returns content served for the given currently intercepted request.
        */
      @JSName("Network.getResponseBodyForInterception")
      var NetworkDotgetResponseBodyForInterception: ReturnTypeGetResponseBodyForInterceptionResponse
      
      /**
        * Returns information about the COEP/COOP isolation status.
        */
      @JSName("Network.getSecurityIsolationStatus")
      var NetworkDotgetSecurityIsolationStatus: ReturnTypeGetSecurityIsolationStatusResponse
      
      /**
        * Fetches the resource and returns the content.
        */
      @JSName("Network.loadNetworkResource")
      var NetworkDotloadNetworkResource: ReturnTypeLoadNetworkResourceResponse
      
      /**
        * This method sends a new XMLHttpRequest which is identical to the original one. The following
        * parameters should be identical: method, url, async, request body, extra headers, withCredentials
        * attribute, user, password.
        */
      @JSName("Network.replayXHR")
      var NetworkDotreplayXHR: `115`
      
      /**
        * Searches for given string in response content.
        */
      @JSName("Network.searchInResponseBody")
      var NetworkDotsearchInResponseBody: ReturnTypeSearchInResponseBodyResponse
      
      /**
        * Specifies whether to sned a debug header to all outgoing requests.
        */
      @JSName("Network.setAttachDebugHeader")
      var NetworkDotsetAttachDebugHeader: `122`
      
      /**
        * Blocks URLs from loading.
        */
      @JSName("Network.setBlockedURLs")
      var NetworkDotsetBlockedURLs: `116`
      
      /**
        * Toggles ignoring of service worker for each request.
        */
      @JSName("Network.setBypassServiceWorker")
      var NetworkDotsetBypassServiceWorker: `117`
      
      /**
        * Toggles ignoring cache for each request. If `true`, cache will not be used.
        */
      @JSName("Network.setCacheDisabled")
      var NetworkDotsetCacheDisabled: `118`
      
      /**
        * Sets a cookie with the given cookie data; may overwrite equivalent cookies if they exist.
        */
      @JSName("Network.setCookie")
      var NetworkDotsetCookie: ReturnTypeSetCookieResponse
      
      /**
        * Sets given cookies.
        */
      @JSName("Network.setCookies")
      var NetworkDotsetCookies: `119`
      
      /**
        * For testing.
        */
      @JSName("Network.setDataSizeLimitsForTest")
      var NetworkDotsetDataSizeLimitsForTest: `120`
      
      /**
        * Specifies whether to always send extra HTTP headers with the requests from this page.
        */
      @JSName("Network.setExtraHTTPHeaders")
      var NetworkDotsetExtraHTTPHeaders: `121`
      
      /**
        * Sets the requests to intercept that match the provided patterns and optionally resource types.
        * Deprecated, please use Fetch.enable instead.
        */
      @JSName("Network.setRequestInterception")
      var NetworkDotsetRequestInterception: `123`
      
      /**
        * Allows overriding user agent with the given string.
        */
      @JSName("Network.setUserAgentOverride")
      var NetworkDotsetUserAgentOverride: `124`
      
      /**
        * Returns a handle to the stream representing the response body. Note that after this command,
        * the intercepted request can't be continued as is -- you either need to cancel it or to provide
        * the response body. The stream only supports sequential read, IO.read will fail if the position
        * is specified.
        */
      @JSName("Network.takeResponseBodyForInterceptionAsStream")
      var NetworkDottakeResponseBodyForInterceptionAsStream: ReturnTypeTakeResponseBodyForInterceptionAsStreamResponse
      
      /**
        * Disables domain notifications.
        */
      @JSName("Overlay.disable")
      var OverlayDotdisable: ParamsType
      
      /**
        * Enables domain notifications.
        */
      @JSName("Overlay.enable")
      var OverlayDotenable: ParamsType
      
      /**
        * For Persistent Grid testing.
        */
      @JSName("Overlay.getGridHighlightObjectsForTest")
      var OverlayDotgetGridHighlightObjectsForTest: ReturnTypeGetGridHighlightObjectsForTestResponse
      
      /**
        * For testing.
        */
      @JSName("Overlay.getHighlightObjectForTest")
      var OverlayDotgetHighlightObjectForTest: ReturnTypeGetHighlightObjectForTestResponse
      
      /**
        * For Source Order Viewer testing.
        */
      @JSName("Overlay.getSourceOrderHighlightObjectForTest")
      var OverlayDotgetSourceOrderHighlightObjectForTest: ReturnTypeGetSourceOrderHighlightObjectForTestResponse
      
      /**
        * Hides any highlight.
        */
      @JSName("Overlay.hideHighlight")
      var OverlayDothideHighlight: ParamsType
      
      /**
        * Highlights owner element of the frame with given id.
        */
      @JSName("Overlay.highlightFrame")
      var OverlayDothighlightFrame: `125`
      
      /**
        * Highlights DOM node with given id or with the given JavaScript object wrapper. Either nodeId or
        * objectId must be specified.
        */
      @JSName("Overlay.highlightNode")
      var OverlayDothighlightNode: `126`
      
      /**
        * Highlights given quad. Coordinates are absolute with respect to the main frame viewport.
        */
      @JSName("Overlay.highlightQuad")
      var OverlayDothighlightQuad: `127`
      
      /**
        * Highlights given rectangle. Coordinates are absolute with respect to the main frame viewport.
        */
      @JSName("Overlay.highlightRect")
      var OverlayDothighlightRect: `128`
      
      /**
        * Highlights the source order of the children of the DOM node with given id or with the given
        * JavaScript object wrapper. Either nodeId or objectId must be specified.
        */
      @JSName("Overlay.highlightSourceOrder")
      var OverlayDothighlightSourceOrder: `129`
      
      /**
        * Enters the 'inspect' mode. In this mode, elements that user is hovering over are highlighted.
        * Backend then generates 'inspectNodeRequested' event upon element selection.
        */
      @JSName("Overlay.setInspectMode")
      var OverlayDotsetInspectMode: `130`
      
      @JSName("Overlay.setPausedInDebuggerMessage")
      var OverlayDotsetPausedInDebuggerMessage: `132`
      
      /**
        * Highlights owner element of all frames detected to be ads.
        */
      @JSName("Overlay.setShowAdHighlights")
      var OverlayDotsetShowAdHighlights: `131`
      
      /**
        * Requests that backend shows debug borders on layers
        */
      @JSName("Overlay.setShowDebugBorders")
      var OverlayDotsetShowDebugBorders: `133`
      
      /**
        * Requests that backend shows the FPS counter
        */
      @JSName("Overlay.setShowFPSCounter")
      var OverlayDotsetShowFPSCounter: `134`
      
      /**
        * Highlight multiple elements with the CSS Grid overlay.
        */
      @JSName("Overlay.setShowGridOverlays")
      var OverlayDotsetShowGridOverlays: `135`
      
      /**
        * Add a dual screen device hinge
        */
      @JSName("Overlay.setShowHinge")
      var OverlayDotsetShowHinge: `141`
      
      /**
        * Requests that backend shows hit-test borders on layers
        */
      @JSName("Overlay.setShowHitTestBorders")
      var OverlayDotsetShowHitTestBorders: `139`
      
      /**
        * Requests that backend shows layout shift regions
        */
      @JSName("Overlay.setShowLayoutShiftRegions")
      var OverlayDotsetShowLayoutShiftRegions: `137`
      
      /**
        * Requests that backend shows paint rectangles
        */
      @JSName("Overlay.setShowPaintRects")
      var OverlayDotsetShowPaintRects: `136`
      
      /**
        * Requests that backend shows scroll bottleneck rects
        */
      @JSName("Overlay.setShowScrollBottleneckRects")
      var OverlayDotsetShowScrollBottleneckRects: `138`
      
      /**
        * Paints viewport size upon main frame resize.
        */
      @JSName("Overlay.setShowViewportSizeOnResize")
      var OverlayDotsetShowViewportSizeOnResize: `140`
      
      /**
        * Seeds compilation cache for given url. Compilation cache does not survive
        * cross-process navigation.
        */
      @JSName("Page.addCompilationCache")
      var PageDotaddCompilationCache: `163`
      
      /**
        * Deprecated, please use addScriptToEvaluateOnNewDocument instead.
        */
      @JSName("Page.addScriptToEvaluateOnLoad")
      var PageDotaddScriptToEvaluateOnLoad: ReturnTypeAddScriptToEvaluateOnLoadResponse
      
      /**
        * Evaluates given script in every frame upon creation (before loading frame's scripts).
        */
      @JSName("Page.addScriptToEvaluateOnNewDocument")
      var PageDotaddScriptToEvaluateOnNewDocument: ReturnTypeAddScriptToEvaluateOnNewDocumentResponse
      
      /**
        * Brings page to front (activates tab).
        */
      @JSName("Page.bringToFront")
      var PageDotbringToFront: ParamsType
      
      /**
        * Capture page screenshot.
        */
      @JSName("Page.captureScreenshot")
      var PageDotcaptureScreenshot: ReturnTypeCaptureScreenshotResponse
      
      /**
        * Returns a snapshot of the page as a string. For MHTML format, the serialization includes
        * iframes, shadow DOM, external resources, and element-inline styles.
        */
      @JSName("Page.captureSnapshot")
      var PageDotcaptureSnapshot: ParamsTypeReturnTypeCaptureSnapshotResponse
      
      /**
        * Clears seeded compilation cache.
        */
      @JSName("Page.clearCompilationCache")
      var PageDotclearCompilationCache: ParamsType
      
      /**
        * Clears the overriden device metrics.
        */
      @JSName("Page.clearDeviceMetricsOverride")
      var PageDotclearDeviceMetricsOverride: ParamsType
      
      /**
        * Clears the overridden Device Orientation.
        */
      @JSName("Page.clearDeviceOrientationOverride")
      var PageDotclearDeviceOrientationOverride: ParamsType
      
      /**
        * Clears the overriden Geolocation Position and Error.
        */
      @JSName("Page.clearGeolocationOverride")
      var PageDotclearGeolocationOverride: ParamsType
      
      /**
        * Tries to close page, running its beforeunload hooks, if any.
        */
      @JSName("Page.close")
      var PageDotclose: ParamsType
      
      /**
        * Crashes renderer on the IO thread, generates minidumps.
        */
      @JSName("Page.crash")
      var PageDotcrash: ParamsType
      
      /**
        * Creates an isolated world for the given frame.
        */
      @JSName("Page.createIsolatedWorld")
      var PageDotcreateIsolatedWorld: ReturnTypeCreateIsolatedWorldResponse
      
      /**
        * Deletes browser cookie with given name, domain and path.
        */
      @JSName("Page.deleteCookie")
      var PageDotdeleteCookie: `142`
      
      /**
        * Disables page domain notifications.
        */
      @JSName("Page.disable")
      var PageDotdisable: ParamsType
      
      /**
        * Enables page domain notifications.
        */
      @JSName("Page.enable")
      var PageDotenable: ParamsType
      
      /**
        * Generates a report for testing.
        */
      @JSName("Page.generateTestReport")
      var PageDotgenerateTestReport: `164`
      
      @JSName("Page.getAppManifest")
      var PageDotgetAppManifest: ReturnTypeGetAppManifestResponse
      
      /**
        * Returns all browser cookies. Depending on the backend support, will return detailed cookie
        * information in the `cookies` field.
        */
      @JSName("Page.getCookies")
      var PageDotgetCookies: ParamsTypeReturnTypeGetCookiesResponse
      
      /**
        * Returns present frame tree structure.
        */
      @JSName("Page.getFrameTree")
      var PageDotgetFrameTree: ReturnTypeGetFrameTreeResponse
      
      @JSName("Page.getInstallabilityErrors")
      var PageDotgetInstallabilityErrors: ReturnTypeGetInstallabilityErrorsResponse
      
      /**
        * Returns metrics relating to the layouting of the page, such as viewport bounds/scale.
        */
      @JSName("Page.getLayoutMetrics")
      var PageDotgetLayoutMetrics: ReturnTypeGetLayoutMetricsResponse
      
      @JSName("Page.getManifestIcons")
      var PageDotgetManifestIcons: ReturnTypeGetManifestIconsResponse
      
      /**
        * Returns navigation history for the current page.
        */
      @JSName("Page.getNavigationHistory")
      var PageDotgetNavigationHistory: ReturnTypeGetNavigationHistoryResponse
      
      /**
        * Returns content of the given resource.
        */
      @JSName("Page.getResourceContent")
      var PageDotgetResourceContent: ReturnTypeGetResourceContentResponse
      
      /**
        * Returns present frame / resource tree structure.
        */
      @JSName("Page.getResourceTree")
      var PageDotgetResourceTree: ReturnTypeGetResourceTreeResponse
      
      /**
        * Accepts or dismisses a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload).
        */
      @JSName("Page.handleJavaScriptDialog")
      var PageDothandleJavaScriptDialog: `143`
      
      /**
        * Navigates current page to the given URL.
        */
      @JSName("Page.navigate")
      var PageDotnavigate: ReturnTypeNavigateResponse
      
      /**
        * Navigates current page to the given history entry.
        */
      @JSName("Page.navigateToHistoryEntry")
      var PageDotnavigateToHistoryEntry: `144`
      
      /**
        * Print page as PDF.
        */
      @JSName("Page.printToPDF")
      var PageDotprintToPDF: ReturnTypePrintToPDFResponse
      
      /**
        * Reloads given page optionally ignoring the cache.
        */
      @JSName("Page.reload")
      var PageDotreload: `145`
      
      /**
        * Deprecated, please use removeScriptToEvaluateOnNewDocument instead.
        */
      @JSName("Page.removeScriptToEvaluateOnLoad")
      var PageDotremoveScriptToEvaluateOnLoad: `146`
      
      /**
        * Removes given script from the list.
        */
      @JSName("Page.removeScriptToEvaluateOnNewDocument")
      var PageDotremoveScriptToEvaluateOnNewDocument: `147`
      
      /**
        * Resets navigation history for the current page.
        */
      @JSName("Page.resetNavigationHistory")
      var PageDotresetNavigationHistory: ParamsType
      
      /**
        * Acknowledges that a screencast frame has been received by the frontend.
        */
      @JSName("Page.screencastFrameAck")
      var PageDotscreencastFrameAck: `148`
      
      /**
        * Searches for given string in resource content.
        */
      @JSName("Page.searchInResource")
      var PageDotsearchInResource: ReturnTypeSearchInResourceResponse
      
      /**
        * Enable Chrome's experimental ad filter on all sites.
        */
      @JSName("Page.setAdBlockingEnabled")
      var PageDotsetAdBlockingEnabled: `149`
      
      /**
        * Enable page Content Security Policy by-passing.
        */
      @JSName("Page.setBypassCSP")
      var PageDotsetBypassCSP: `150`
      
      /**
        * Overrides the values of device screen dimensions (window.screen.width, window.screen.height,
        * window.innerWidth, window.innerHeight, and "device-width"/"device-height"-related CSS media
        * query results).
        */
      @JSName("Page.setDeviceMetricsOverride")
      var PageDotsetDeviceMetricsOverride: `151`
      
      /**
        * Overrides the Device Orientation.
        */
      @JSName("Page.setDeviceOrientationOverride")
      var PageDotsetDeviceOrientationOverride: `152`
      
      /**
        * Sets given markup as the document's HTML.
        */
      @JSName("Page.setDocumentContent")
      var PageDotsetDocumentContent: `155`
      
      /**
        * Set the behavior when downloading a file.
        */
      @JSName("Page.setDownloadBehavior")
      var PageDotsetDownloadBehavior: `156`
      
      /**
        * Set generic font families.
        */
      @JSName("Page.setFontFamilies")
      var PageDotsetFontFamilies: `153`
      
      /**
        * Set default font sizes.
        */
      @JSName("Page.setFontSizes")
      var PageDotsetFontSizes: `154`
      
      /**
        * Overrides the Geolocation Position or Error. Omitting any of the parameters emulates position
        * unavailable.
        */
      @JSName("Page.setGeolocationOverride")
      var PageDotsetGeolocationOverride: `157`
      
      /**
        * Intercept file chooser requests and transfer control to protocol clients.
        * When file chooser interception is enabled, native file chooser dialog is not shown.
        * Instead, a protocol event `Page.fileChooserOpened` is emitted.
        */
      @JSName("Page.setInterceptFileChooserDialog")
      var PageDotsetInterceptFileChooserDialog: `165`
      
      /**
        * Controls whether page will emit lifecycle events.
        */
      @JSName("Page.setLifecycleEventsEnabled")
      var PageDotsetLifecycleEventsEnabled: `158`
      
      /**
        * Forces compilation cache to be generated for every subresource script.
        */
      @JSName("Page.setProduceCompilationCache")
      var PageDotsetProduceCompilationCache: `162`
      
      /**
        * Toggles mouse event-based touch event emulation.
        */
      @JSName("Page.setTouchEmulationEnabled")
      var PageDotsetTouchEmulationEnabled: `159`
      
      /**
        * Tries to update the web lifecycle state of the page.
        * It will transition the page to the given state according to:
        * https://github.com/WICG/web-lifecycle/
        */
      @JSName("Page.setWebLifecycleState")
      var PageDotsetWebLifecycleState: `161`
      
      /**
        * Starts sending each frame using the `screencastFrame` event.
        */
      @JSName("Page.startScreencast")
      var PageDotstartScreencast: `160`
      
      /**
        * Force the page stop all navigations and pending resource fetches.
        */
      @JSName("Page.stopLoading")
      var PageDotstopLoading: ParamsType
      
      /**
        * Stops sending each frame in the `screencastFrame`.
        */
      @JSName("Page.stopScreencast")
      var PageDotstopScreencast: ParamsType
      
      /**
        * Pauses page execution. Can be resumed using generic Runtime.runIfWaitingForDebugger.
        */
      @JSName("Page.waitForDebugger")
      var PageDotwaitForDebugger: ParamsType
      
      /**
        * Disable collecting and reporting metrics.
        */
      @JSName("Performance.disable")
      var PerformanceDotdisable: ParamsType
      
      /**
        * Enable collecting and reporting metrics.
        */
      @JSName("Performance.enable")
      var PerformanceDotenable: `166`
      
      /**
        * Retrieve current values of run-time metrics.
        */
      @JSName("Performance.getMetrics")
      var PerformanceDotgetMetrics: ReturnTypeGetMetricsResponse
      
      /**
        * Sets time domain to use for collecting and reporting duration metrics.
        * Note that this must be called before enabling metrics collection. Calling
        * this method while metrics collection is enabled returns an error.
        */
      @JSName("Performance.setTimeDomain")
      var PerformanceDotsetTimeDomain: `167`
      
      @JSName("Profiler.disable")
      var ProfilerDotdisable: ParamsType
      
      /**
        * Disable counters collection.
        */
      @JSName("Profiler.disableCounters")
      var ProfilerDotdisableCounters: ParamsType
      
      /**
        * Disable run time call stats collection.
        */
      @JSName("Profiler.disableRuntimeCallStats")
      var ProfilerDotdisableRuntimeCallStats: ParamsType
      
      @JSName("Profiler.enable")
      var ProfilerDotenable: ParamsType
      
      /**
        * Enable counters collection.
        */
      @JSName("Profiler.enableCounters")
      var ProfilerDotenableCounters: ParamsType
      
      /**
        * Enable run time call stats collection.
        */
      @JSName("Profiler.enableRuntimeCallStats")
      var ProfilerDotenableRuntimeCallStats: ParamsType
      
      /**
        * Collect coverage data for the current isolate. The coverage data may be incomplete due to
        * garbage collection.
        */
      @JSName("Profiler.getBestEffortCoverage")
      var ProfilerDotgetBestEffortCoverage: ReturnTypeGetBestEffortCoverageResponse
      
      /**
        * Retrieve counters.
        */
      @JSName("Profiler.getCounters")
      var ProfilerDotgetCounters: ReturnTypeGetCountersResponse
      
      /**
        * Retrieve run time call stats.
        */
      @JSName("Profiler.getRuntimeCallStats")
      var ProfilerDotgetRuntimeCallStats: ReturnTypeGetRuntimeCallStatsResponse
      
      /**
        * Changes CPU profiler sampling interval. Must be called before CPU profiles recording started.
        */
      @JSName("Profiler.setSamplingInterval")
      var ProfilerDotsetSamplingInterval: `16`
      
      @JSName("Profiler.start")
      var ProfilerDotstart: ParamsType
      
      /**
        * Enable precise code coverage. Coverage data for JavaScript executed before enabling precise code
        * coverage may be incomplete. Enabling prevents running optimized code and resets execution
        * counters.
        */
      @JSName("Profiler.startPreciseCoverage")
      var ProfilerDotstartPreciseCoverage: ReturnTypeStartPreciseCoverageResponse
      
      /**
        * Enable type profile.
        */
      @JSName("Profiler.startTypeProfile")
      var ProfilerDotstartTypeProfile: ParamsType
      
      @JSName("Profiler.stop")
      var ProfilerDotstop: ReturnTypeStopResponse
      
      /**
        * Disable precise code coverage. Disabling releases unnecessary execution count records and allows
        * executing optimized code.
        */
      @JSName("Profiler.stopPreciseCoverage")
      var ProfilerDotstopPreciseCoverage: ParamsType
      
      /**
        * Disable type profile. Disabling releases type profile data collected so far.
        */
      @JSName("Profiler.stopTypeProfile")
      var ProfilerDotstopTypeProfile: ParamsType
      
      /**
        * Collect coverage data for the current isolate, and resets execution counters. Precise code
        * coverage needs to have started.
        */
      @JSName("Profiler.takePreciseCoverage")
      var ProfilerDottakePreciseCoverage: ReturnTypeTakePreciseCoverageResponse
      
      /**
        * Collect type profile.
        */
      @JSName("Profiler.takeTypeProfile")
      var ProfilerDottakeTypeProfile: ReturnTypeTakeTypeProfileResponse
      
      /**
        * If executionContextId is empty, adds binding with the given name on the
        * global objects of all inspected contexts, including those created later,
        * bindings survive reloads.
        * If executionContextId is specified, adds binding only on global object of
        * given execution context.
        * Binding function takes exactly one argument, this argument should be string,
        * in case of any other input, function throws an exception.
        * Each binding function call produces Runtime.bindingCalled notification.
        */
      @JSName("Runtime.addBinding")
      var RuntimeDotaddBinding: `22`
      
      /**
        * Add handler to promise with given promise object id.
        */
      @JSName("Runtime.awaitPromise")
      var RuntimeDotawaitPromise: ReturnTypeAwaitPromiseResponse
      
      /**
        * Calls function with given declaration on the given object. Object group of the result is
        * inherited from the target object.
        */
      @JSName("Runtime.callFunctionOn")
      var RuntimeDotcallFunctionOn: ReturnTypeCallFunctionOnResponse
      
      /**
        * Compiles expression.
        */
      @JSName("Runtime.compileScript")
      var RuntimeDotcompileScript: ReturnTypeCompileScriptResponse
      
      /**
        * Disables reporting of execution contexts creation.
        */
      @JSName("Runtime.disable")
      var RuntimeDotdisable: ParamsType
      
      /**
        * Discards collected exceptions and console API calls.
        */
      @JSName("Runtime.discardConsoleEntries")
      var RuntimeDotdiscardConsoleEntries: ParamsType
      
      /**
        * Enables reporting of execution contexts creation by means of `executionContextCreated` event.
        * When the reporting gets enabled the event will be sent immediately for each existing execution
        * context.
        */
      @JSName("Runtime.enable")
      var RuntimeDotenable: ParamsType
      
      /**
        * Evaluates expression on global object.
        */
      @JSName("Runtime.evaluate")
      var RuntimeDotevaluate: ReturnTypeEvaluateResponse
      
      /**
        * Returns the JavaScript heap usage.
        * It is the total usage of the corresponding isolate not scoped to a particular Runtime.
        */
      @JSName("Runtime.getHeapUsage")
      var RuntimeDotgetHeapUsage: ReturnTypeGetHeapUsageResponse
      
      /**
        * Returns the isolate id.
        */
      @JSName("Runtime.getIsolateId")
      var RuntimeDotgetIsolateId: ReturnTypeGetIsolateIdResponse
      
      /**
        * Returns properties of a given object. Object group of the result is inherited from the target
        * object.
        */
      @JSName("Runtime.getProperties")
      var RuntimeDotgetProperties: ReturnTypeGetPropertiesResponse
      
      /**
        * Returns all let, const and class variables from global scope.
        */
      @JSName("Runtime.globalLexicalScopeNames")
      var RuntimeDotglobalLexicalScopeNames: ReturnTypeGlobalLexicalScopeNamesResponse
      
      @JSName("Runtime.queryObjects")
      var RuntimeDotqueryObjects: ReturnTypeQueryObjectsResponse
      
      /**
        * Releases remote object with given id.
        */
      @JSName("Runtime.releaseObject")
      var RuntimeDotreleaseObject: `17`
      
      /**
        * Releases all remote objects that belong to a given group.
        */
      @JSName("Runtime.releaseObjectGroup")
      var RuntimeDotreleaseObjectGroup: `18`
      
      /**
        * This method does not remove binding function from global object but
        * unsubscribes current runtime agent from Runtime.bindingCalled notifications.
        */
      @JSName("Runtime.removeBinding")
      var RuntimeDotremoveBinding: `23`
      
      /**
        * Tells inspected instance to run if it was waiting for debugger to attach.
        */
      @JSName("Runtime.runIfWaitingForDebugger")
      var RuntimeDotrunIfWaitingForDebugger: ParamsType
      
      /**
        * Runs script with given id in a given context.
        */
      @JSName("Runtime.runScript")
      var RuntimeDotrunScript: ReturnTypeRunScriptResponse
      
      /**
        * Enables or disables async call stacks tracking.
        */
      @JSName("Runtime.setAsyncCallStackDepth")
      var RuntimeDotsetAsyncCallStackDepth: `19`
      
      @JSName("Runtime.setCustomObjectFormatterEnabled")
      var RuntimeDotsetCustomObjectFormatterEnabled: `20`
      
      @JSName("Runtime.setMaxCallStackSizeToCapture")
      var RuntimeDotsetMaxCallStackSizeToCapture: `21`
      
      /**
        * Terminate current or next JavaScript execution.
        * Will cancel the termination when the outer-most script execution ends.
        */
      @JSName("Runtime.terminateExecution")
      var RuntimeDotterminateExecution: ParamsType
      
      /**
        * Returns supported domains.
        */
      @JSName("Schema.getDomains")
      var SchemaDotgetDomains: ReturnTypeGetDomainsResponse
      
      /**
        * Disables tracking security state changes.
        */
      @JSName("Security.disable")
      var SecurityDotdisable: ParamsType
      
      /**
        * Enables tracking security state changes.
        */
      @JSName("Security.enable")
      var SecurityDotenable: ParamsType
      
      /**
        * Handles a certificate error that fired a certificateError event.
        */
      @JSName("Security.handleCertificateError")
      var SecurityDothandleCertificateError: `169`
      
      /**
        * Enable/disable whether all certificate errors should be ignored.
        */
      @JSName("Security.setIgnoreCertificateErrors")
      var SecurityDotsetIgnoreCertificateErrors: `168`
      
      /**
        * Enable/disable overriding certificate errors. If enabled, all certificate error events need to
        * be handled by the DevTools client and should be answered with `handleCertificateError` commands.
        */
      @JSName("Security.setOverrideCertificateErrors")
      var SecurityDotsetOverrideCertificateErrors: `170`
      
      @JSName("ServiceWorker.deliverPushMessage")
      var ServiceWorkerDotdeliverPushMessage: `171`
      
      @JSName("ServiceWorker.disable")
      var ServiceWorkerDotdisable: ParamsType
      
      @JSName("ServiceWorker.dispatchPeriodicSyncEvent")
      var ServiceWorkerDotdispatchPeriodicSyncEvent: `173`
      
      @JSName("ServiceWorker.dispatchSyncEvent")
      var ServiceWorkerDotdispatchSyncEvent: `172`
      
      @JSName("ServiceWorker.enable")
      var ServiceWorkerDotenable: ParamsType
      
      @JSName("ServiceWorker.inspectWorker")
      var ServiceWorkerDotinspectWorker: `174`
      
      @JSName("ServiceWorker.setForceUpdateOnPageLoad")
      var ServiceWorkerDotsetForceUpdateOnPageLoad: `175`
      
      @JSName("ServiceWorker.skipWaiting")
      var ServiceWorkerDotskipWaiting: `176`
      
      @JSName("ServiceWorker.startWorker")
      var ServiceWorkerDotstartWorker: `177`
      
      @JSName("ServiceWorker.stopAllWorkers")
      var ServiceWorkerDotstopAllWorkers: ParamsType
      
      @JSName("ServiceWorker.stopWorker")
      var ServiceWorkerDotstopWorker: `178`
      
      @JSName("ServiceWorker.unregister")
      var ServiceWorkerDotunregister: `179`
      
      @JSName("ServiceWorker.updateRegistration")
      var ServiceWorkerDotupdateRegistration: `180`
      
      /**
        * Clears cookies.
        */
      @JSName("Storage.clearCookies")
      var StorageDotclearCookies: `184`
      
      /**
        * Clears storage for origin.
        */
      @JSName("Storage.clearDataForOrigin")
      var StorageDotclearDataForOrigin: `181`
      
      /**
        * Returns all browser cookies.
        */
      @JSName("Storage.getCookies")
      var StorageDotgetCookies: `182`
      
      /**
        * Returns usage and quota in bytes.
        */
      @JSName("Storage.getUsageAndQuota")
      var StorageDotgetUsageAndQuota: ReturnTypeGetUsageAndQuotaResponse
      
      /**
        * Override quota for the specified origin
        */
      @JSName("Storage.overrideQuotaForOrigin")
      var StorageDotoverrideQuotaForOrigin: `185`
      
      /**
        * Sets given cookies.
        */
      @JSName("Storage.setCookies")
      var StorageDotsetCookies: `183`
      
      /**
        * Registers origin to be notified when an update occurs to its cache storage list.
        */
      @JSName("Storage.trackCacheStorageForOrigin")
      var StorageDottrackCacheStorageForOrigin: `186`
      
      /**
        * Registers origin to be notified when an update occurs to its IndexedDB.
        */
      @JSName("Storage.trackIndexedDBForOrigin")
      var StorageDottrackIndexedDBForOrigin: `187`
      
      /**
        * Unregisters origin from receiving notifications for cache storage.
        */
      @JSName("Storage.untrackCacheStorageForOrigin")
      var StorageDotuntrackCacheStorageForOrigin: `188`
      
      /**
        * Unregisters origin from receiving notifications for IndexedDB.
        */
      @JSName("Storage.untrackIndexedDBForOrigin")
      var StorageDotuntrackIndexedDBForOrigin: `189`
      
      /**
        * Returns information about the system.
        */
      @JSName("SystemInfo.getInfo")
      var SystemInfoDotgetInfo: ReturnTypeGetInfoResponse
      
      /**
        * Returns information about all running processes.
        */
      @JSName("SystemInfo.getProcessInfo")
      var SystemInfoDotgetProcessInfo: ReturnTypeGetProcessInfoResponse
      
      /**
        * Activates (focuses) the target.
        */
      @JSName("Target.activateTarget")
      var TargetDotactivateTarget: `190`
      
      /**
        * Attaches to the browser target, only uses flat sessionId mode.
        */
      @JSName("Target.attachToBrowserTarget")
      var TargetDotattachToBrowserTarget: ReturnTypeAttachToBrowserTargetResponse
      
      /**
        * Attaches to the target with given id.
        */
      @JSName("Target.attachToTarget")
      var TargetDotattachToTarget: ReturnTypeAttachToTargetResponse
      
      /**
        * Closes the target. If the target is a page that gets closed too.
        */
      @JSName("Target.closeTarget")
      var TargetDotcloseTarget: ReturnTypeCloseTargetResponse
      
      /**
        * Creates a new empty BrowserContext. Similar to an incognito profile but you can have more than
        * one.
        */
      @JSName("Target.createBrowserContext")
      var TargetDotcreateBrowserContext: ReturnTypeCreateBrowserContextResponse
      
      /**
        * Creates a new page.
        */
      @JSName("Target.createTarget")
      var TargetDotcreateTarget: ReturnTypeCreateTargetResponse
      
      /**
        * Detaches session with given id.
        */
      @JSName("Target.detachFromTarget")
      var TargetDotdetachFromTarget: `192`
      
      /**
        * Deletes a BrowserContext. All the belonging pages will be closed without calling their
        * beforeunload hooks.
        */
      @JSName("Target.disposeBrowserContext")
      var TargetDotdisposeBrowserContext: `193`
      
      /**
        * Inject object to the target's main frame that provides a communication
        * channel with browser target.
        * 
        * Injected object will be available as `window[bindingName]`.
        * 
        * The object has the follwing API:
        * - `binding.send(json)` - a method to send messages over the remote debugging protocol
        * - `binding.onmessage = json => handleMessage(json)` - a callback that will be called for the protocol notifications and command responses.
        */
      @JSName("Target.exposeDevToolsProtocol")
      var TargetDotexposeDevToolsProtocol: `191`
      
      /**
        * Returns all browser contexts created with `Target.createBrowserContext` method.
        */
      @JSName("Target.getBrowserContexts")
      var TargetDotgetBrowserContexts: ReturnTypeGetBrowserContextsResponse
      
      /**
        * Returns information about a target.
        */
      @JSName("Target.getTargetInfo")
      var TargetDotgetTargetInfo: ReturnTypeGetTargetInfoResponse
      
      /**
        * Retrieves a list of available targets.
        */
      @JSName("Target.getTargets")
      var TargetDotgetTargets: ReturnTypeGetTargetsResponse
      
      /**
        * Sends protocol message over session with given id.
        * Consider using flat mode instead; see commands attachToTarget, setAutoAttach,
        * and crbug.com/991325.
        */
      @JSName("Target.sendMessageToTarget")
      var TargetDotsendMessageToTarget: `194`
      
      /**
        * Controls whether to automatically attach to new targets which are considered to be related to
        * this one. When turned on, attaches to all existing related targets as well. When turned off,
        * automatically detaches from all currently attached targets.
        */
      @JSName("Target.setAutoAttach")
      var TargetDotsetAutoAttach: `195`
      
      /**
        * Controls whether to discover available targets and notify via
        * `targetCreated/targetInfoChanged/targetDestroyed` events.
        */
      @JSName("Target.setDiscoverTargets")
      var TargetDotsetDiscoverTargets: `196`
      
      /**
        * Enables target discovery for the specified locations, when `setDiscoverTargets` was set to
        * `true`.
        */
      @JSName("Target.setRemoteLocations")
      var TargetDotsetRemoteLocations: `197`
      
      /**
        * Request browser port binding.
        */
      @JSName("Tethering.bind")
      var TetheringDotbind: `198`
      
      /**
        * Request browser port unbinding.
        */
      @JSName("Tethering.unbind")
      var TetheringDotunbind: `199`
      
      /**
        * Stop trace events collection.
        */
      @JSName("Tracing.end")
      var TracingDotend: ParamsType
      
      /**
        * Gets supported tracing categories.
        */
      @JSName("Tracing.getCategories")
      var TracingDotgetCategories: ReturnTypeGetCategoriesResponse
      
      /**
        * Record a clock sync marker in the trace.
        */
      @JSName("Tracing.recordClockSyncMarker")
      var TracingDotrecordClockSyncMarker: `200`
      
      /**
        * Request a global memory dump.
        */
      @JSName("Tracing.requestMemoryDump")
      var TracingDotrequestMemoryDump: ReturnTypeRequestMemoryDumpResponse
      
      /**
        * Start trace events collection.
        */
      @JSName("Tracing.start")
      var TracingDotstart: `201`
      
      /**
        * Disables the WebAudio domain.
        */
      @JSName("WebAudio.disable")
      var WebAudioDotdisable: ParamsType
      
      /**
        * Enables the WebAudio domain and starts sending context lifetime events.
        */
      @JSName("WebAudio.enable")
      var WebAudioDotenable: ParamsType
      
      /**
        * Fetch the realtime data from the registered contexts.
        */
      @JSName("WebAudio.getRealtimeData")
      var WebAudioDotgetRealtimeData: ReturnTypeGetRealtimeDataResponse
      
      /**
        * Adds the credential to the specified authenticator.
        */
      @JSName("WebAuthn.addCredential")
      var WebAuthnDotaddCredential: `208`
      
      /**
        * Creates and adds a virtual authenticator.
        */
      @JSName("WebAuthn.addVirtualAuthenticator")
      var WebAuthnDotaddVirtualAuthenticator: ReturnTypeAddVirtualAuthenticatorResponse
      
      /**
        * Clears all the credentials from the specified device.
        */
      @JSName("WebAuthn.clearCredentials")
      var WebAuthnDotclearCredentials: `210`
      
      /**
        * Disable the WebAuthn domain.
        */
      @JSName("WebAuthn.disable")
      var WebAuthnDotdisable: ParamsType
      
      /**
        * Enable the WebAuthn domain and start intercepting credential storage and
        * retrieval with a virtual authenticator.
        */
      @JSName("WebAuthn.enable")
      var WebAuthnDotenable: ParamsType
      
      /**
        * Returns a single credential stored in the given virtual authenticator that
        * matches the credential ID.
        */
      @JSName("WebAuthn.getCredential")
      var WebAuthnDotgetCredential: ReturnTypeGetCredentialResponse
      
      /**
        * Returns all the credentials stored in the given virtual authenticator.
        */
      @JSName("WebAuthn.getCredentials")
      var WebAuthnDotgetCredentials: ReturnTypeGetCredentialsResponse
      
      /**
        * Removes a credential from the authenticator.
        */
      @JSName("WebAuthn.removeCredential")
      var WebAuthnDotremoveCredential: `209`
      
      /**
        * Removes the given authenticator.
        */
      @JSName("WebAuthn.removeVirtualAuthenticator")
      var WebAuthnDotremoveVirtualAuthenticator: `207`
      
      /**
        * Sets whether tests of user presence will succeed immediately (if true) or fail to resolve (if false) for an authenticator.
        * The default is true.
        */
      @JSName("WebAuthn.setAutomaticPresenceSimulation")
      var WebAuthnDotsetAutomaticPresenceSimulation: `212`
      
      /**
        * Sets whether User Verification succeeds or fails for an authenticator.
        * The default is true.
        */
      @JSName("WebAuthn.setUserVerified")
      var WebAuthnDotsetUserVerified: `211`
    }
    object Commands {
      
      inline def apply(
        AccessibilityDotdisable: ParamsType,
        AccessibilityDotenable: ParamsType,
        AccessibilityDotgetFullAXTree: ReturnTypeGetFullAXTreeResponse,
        AccessibilityDotgetPartialAXTree: ReturnTypeGetPartialAXTreeResponse,
        AccessibilityDotqueryAXTree: ReturnTypeQueryAXTreeResponse,
        AnimationDotdisable: ParamsType,
        AnimationDotenable: ParamsType,
        AnimationDotgetCurrentTime: ReturnTypeGetCurrentTimeResponse,
        AnimationDotgetPlaybackRate: ReturnTypeGetPlaybackRateResponse,
        AnimationDotreleaseAnimations: `24`,
        AnimationDotresolveAnimation: ReturnTypeResolveAnimationResponse,
        AnimationDotseekAnimations: `25`,
        AnimationDotsetPaused: `26`,
        AnimationDotsetPlaybackRate: `27`,
        AnimationDotsetTiming: `28`,
        ApplicationCacheDotenable: ParamsType,
        ApplicationCacheDotgetApplicationCacheForFrame: ReturnTypeGetApplicationCacheForFrameResponse,
        ApplicationCacheDotgetFramesWithManifests: ReturnTypeGetFramesWithManifestsResponse,
        ApplicationCacheDotgetManifestForFrame: ReturnTypeGetManifestForFrameResponse,
        AuditsDotdisable: ParamsType,
        AuditsDotenable: ParamsType,
        AuditsDotgetEncodedResponse: ReturnTypeGetEncodedResponseResponse,
        BackgroundServiceDotclearEvents: `32`,
        BackgroundServiceDotsetRecording: `31`,
        BackgroundServiceDotstartObserving: `29`,
        BackgroundServiceDotstopObserving: `30`,
        BrowserDotclose: ParamsType,
        BrowserDotcrash: ParamsType,
        BrowserDotcrashGpuProcess: ParamsType,
        BrowserDotgetBrowserCommandLine: ReturnTypeGetBrowserCommandLineResponse,
        BrowserDotgetHistogram: ReturnTypeGetHistogramResponse,
        BrowserDotgetHistograms: ReturnTypeGetHistogramsResponse,
        BrowserDotgetVersion: ReturnTypeGetVersionResponse,
        BrowserDotgetWindowBounds: ReturnTypeGetWindowBoundsResponse,
        BrowserDotgetWindowForTarget: ReturnTypeGetWindowForTargetResponse,
        BrowserDotgrantPermissions: `34`,
        BrowserDotresetPermissions: `35`,
        BrowserDotsetDockTile: `38`,
        BrowserDotsetDownloadBehavior: `36`,
        BrowserDotsetPermission: `33`,
        BrowserDotsetWindowBounds: `37`,
        CSSDotaddRule: ReturnTypeAddRuleResponse,
        CSSDotcollectClassNames: ReturnTypeCollectClassNamesResponse,
        CSSDotcreateStyleSheet: ReturnTypeCreateStyleSheetResponse,
        CSSDotdisable: ParamsType,
        CSSDotenable: ParamsType,
        CSSDotforcePseudoState: `39`,
        CSSDotgetBackgroundColors: ReturnTypeGetBackgroundColorsResponse,
        CSSDotgetComputedStyleForNode: ReturnTypeGetComputedStyleForNodeResponse,
        CSSDotgetInlineStylesForNode: ReturnTypeGetInlineStylesForNodeResponse,
        CSSDotgetMatchedStylesForNode: ReturnTypeGetMatchedStylesForNodeResponse,
        CSSDotgetMediaQueries: ReturnTypeGetMediaQueriesResponse,
        CSSDotgetPlatformFontsForNode: ReturnTypeGetPlatformFontsForNodeResponse,
        CSSDotgetStyleSheetText: ReturnTypeGetStyleSheetTextResponse,
        CSSDotsetEffectivePropertyValueForNode: `41`,
        CSSDotsetKeyframeKey: ReturnTypeSetKeyframeKeyResponse,
        CSSDotsetLocalFontsEnabled: `42`,
        CSSDotsetMediaText: ReturnTypeSetMediaTextResponse,
        CSSDotsetRuleSelector: ReturnTypeSetRuleSelectorResponse,
        CSSDotsetStyleSheetText: ReturnTypeSetStyleSheetTextResponse,
        CSSDotsetStyleTexts: ReturnTypeSetStyleTextsResponse,
        CSSDotstartRuleUsageTracking: ParamsType,
        CSSDotstopRuleUsageTracking: ReturnTypeStopRuleUsageTrackingResponse,
        CSSDottakeComputedStyleUpdates: ReturnTypeTakeComputedStyleUpdatesResponse,
        CSSDottakeCoverageDelta: ReturnTypeTakeCoverageDeltaResponse,
        CSSDottrackComputedStyleUpdates: `40`,
        CacheStorageDotdeleteCache: `43`,
        CacheStorageDotdeleteEntry: `44`,
        CacheStorageDotrequestCacheNames: ReturnTypeRequestCacheNamesResponse,
        CacheStorageDotrequestCachedResponse: ReturnTypeRequestCachedResponseResponse,
        CacheStorageDotrequestEntries: ReturnTypeRequestEntriesResponse,
        CastDotdisable: ParamsType,
        CastDotenable: `45`,
        CastDotsetSinkToUse: `46`,
        CastDotstartTabMirroring: `47`,
        CastDotstopCasting: `48`,
        ConsoleDotclearMessages: ParamsType,
        ConsoleDotdisable: ParamsType,
        ConsoleDotenable: ParamsType,
        DOMDebuggerDotgetEventListeners: ReturnTypeGetEventListenersResponse,
        DOMDebuggerDotremoveDOMBreakpoint: `62`,
        DOMDebuggerDotremoveEventListenerBreakpoint: `63`,
        DOMDebuggerDotremoveInstrumentationBreakpoint: `64`,
        DOMDebuggerDotremoveXHRBreakpoint: `65`,
        DOMDebuggerDotsetDOMBreakpoint: `66`,
        DOMDebuggerDotsetEventListenerBreakpoint: `67`,
        DOMDebuggerDotsetInstrumentationBreakpoint: `68`,
        DOMDebuggerDotsetXHRBreakpoint: `69`,
        DOMDotcollectClassNamesFromSubtree: ReturnTypeCollectClassNamesFromSubtreeResponse,
        DOMDotcopyTo: ReturnTypeCopyToResponse,
        DOMDotdescribeNode: ReturnTypeDescribeNodeResponse,
        DOMDotdisable: ParamsType,
        DOMDotdiscardSearchResults: `50`,
        DOMDotenable: ParamsType,
        DOMDotfocus: `51`,
        DOMDotgetAttributes: ReturnTypeGetAttributesResponse,
        DOMDotgetBoxModel: ReturnTypeGetBoxModelResponse,
        DOMDotgetContentQuads: ReturnTypeGetContentQuadsResponse,
        DOMDotgetDocument: ReturnTypeGetDocumentResponse,
        DOMDotgetFileInfo: ReturnTypeGetFileInfoResponse,
        DOMDotgetFlattenedDocument: ReturnTypeGetFlattenedDocumentResponse,
        DOMDotgetFrameOwner: ReturnTypeGetFrameOwnerResponse,
        DOMDotgetNodeForLocation: ReturnTypeGetNodeForLocationResponse,
        DOMDotgetNodeStackTraces: ReturnTypeGetNodeStackTracesResponse,
        DOMDotgetNodesForSubtreeByStyle: ReturnTypeGetNodesForSubtreeByStyleResponse,
        DOMDotgetOuterHTML: ReturnTypeGetOuterHTMLResponse,
        DOMDotgetRelayoutBoundary: ReturnTypeGetRelayoutBoundaryResponse,
        DOMDotgetSearchResults: ReturnTypeGetSearchResultsResponse,
        DOMDothideHighlight: ParamsType,
        DOMDothighlightNode: ParamsType,
        DOMDothighlightRect: ParamsType,
        DOMDotmarkUndoableState: ParamsType,
        DOMDotmoveTo: ReturnTypeMoveToResponse,
        DOMDotperformSearch: ReturnTypePerformSearchResponse,
        DOMDotpushNodeByPathToFrontend: ReturnTypePushNodeByPathToFrontendResponse,
        DOMDotpushNodesByBackendIdsToFrontend: ReturnTypePushNodesByBackendIdsToFrontendResponse,
        DOMDotquerySelector: ReturnTypeQuerySelectorResponse,
        DOMDotquerySelectorAll: ReturnTypeQuerySelectorAllResponse,
        DOMDotredo: ParamsType,
        DOMDotremoveAttribute: `52`,
        DOMDotremoveNode: `53`,
        DOMDotrequestChildNodes: `54`,
        DOMDotrequestNode: ReturnTypeRequestNodeResponse,
        DOMDotresolveNode: ReturnTypeResolveNodeResponse,
        DOMDotscrollIntoViewIfNeeded: `49`,
        DOMDotsetAttributeValue: `55`,
        DOMDotsetAttributesAsText: `56`,
        DOMDotsetFileInputFiles: `57`,
        DOMDotsetInspectedNode: `59`,
        DOMDotsetNodeName: ReturnTypeSetNodeNameResponse,
        DOMDotsetNodeStackTracesEnabled: `58`,
        DOMDotsetNodeValue: `60`,
        DOMDotsetOuterHTML: `61`,
        DOMDotundo: ParamsType,
        DOMSnapshotDotcaptureSnapshot: ReturnTypeCaptureSnapshotResponse,
        DOMSnapshotDotdisable: ParamsType,
        DOMSnapshotDotenable: ParamsType,
        DOMSnapshotDotgetSnapshot: ReturnTypeGetSnapshotResponse,
        DOMStorageDotclear: `70`,
        DOMStorageDotdisable: ParamsType,
        DOMStorageDotenable: ParamsType,
        DOMStorageDotgetDOMStorageItems: ReturnTypeGetDOMStorageItemsResponse,
        DOMStorageDotremoveDOMStorageItem: `71`,
        DOMStorageDotsetDOMStorageItem: `72`,
        DatabaseDotdisable: ParamsType,
        DatabaseDotenable: ParamsType,
        DatabaseDotexecuteSQL: ReturnTypeExecuteSQLResponse,
        DatabaseDotgetDatabaseTableNames: ReturnTypeGetDatabaseTableNamesResponse,
        DebuggerDotcontinueToLocation: ReturnType,
        DebuggerDotdisable: ParamsType,
        DebuggerDotenable: ParamsTypeReturnType,
        DebuggerDotevaluateOnCallFrame: ReturnTypeEvaluateOnCallFrameResponse,
        DebuggerDotexecuteWasmEvaluator: ReturnTypeExecuteWasmEvaluatorResponse,
        DebuggerDotgetPossibleBreakpoints: ReturnTypeGetPossibleBreakpointsResponse,
        DebuggerDotgetScriptSource: ReturnTypeGetScriptSourceResponse,
        DebuggerDotgetStackTrace: ReturnTypeGetStackTraceResponse,
        DebuggerDotgetWasmBytecode: ReturnTypeGetWasmBytecodeResponse,
        DebuggerDotpause: ParamsType,
        DebuggerDotpauseOnAsyncCall: ReturnTypeVoid,
        DebuggerDotremoveBreakpoint: ParamsTypeReturnTypeVoid,
        DebuggerDotrestartFrame: ReturnTypeRestartFrameResponse,
        DebuggerDotresume: `0`,
        DebuggerDotsearchInContent: ReturnTypeSearchInContentResponse,
        DebuggerDotsetAsyncCallStackDepth: `1`,
        DebuggerDotsetBlackboxPatterns: `2`,
        DebuggerDotsetBlackboxedRanges: `3`,
        DebuggerDotsetBreakpoint: ReturnTypeSetBreakpointResponse,
        DebuggerDotsetBreakpointByUrl: ReturnTypeSetBreakpointByUrlResponse,
        DebuggerDotsetBreakpointOnFunctionCall: ReturnTypeSetBreakpointOnFunctionCallResponse,
        DebuggerDotsetBreakpointsActive: `4`,
        DebuggerDotsetInstrumentationBreakpoint: ReturnTypeSetInstrumentationBreakpointResponse,
        DebuggerDotsetPauseOnExceptions: `5`,
        DebuggerDotsetReturnValue: `6`,
        DebuggerDotsetScriptSource: ReturnTypeSetScriptSourceResponse,
        DebuggerDotsetSkipAllPauses: `7`,
        DebuggerDotsetVariableValue: `8`,
        DebuggerDotstepInto: `9`,
        DebuggerDotstepOut: ParamsType,
        DebuggerDotstepOver: `10`,
        DeviceOrientationDotclearDeviceOrientationOverride: ParamsType,
        DeviceOrientationDotsetDeviceOrientationOverride: `73`,
        EmulationDotcanEmulate: ReturnTypeCanEmulateResponse,
        EmulationDotclearDeviceMetricsOverride: ParamsType,
        EmulationDotclearGeolocationOverride: ParamsType,
        EmulationDotclearIdleOverride: ParamsType,
        EmulationDotresetPageScaleFactor: ParamsType,
        EmulationDotsetCPUThrottlingRate: `75`,
        EmulationDotsetDefaultBackgroundColorOverride: `76`,
        EmulationDotsetDeviceMetricsOverride: `77`,
        EmulationDotsetDocumentCookieDisabled: `79`,
        EmulationDotsetEmitTouchEventsForMouse: `80`,
        EmulationDotsetEmulatedMedia: `81`,
        EmulationDotsetEmulatedVisionDeficiency: `82`,
        EmulationDotsetFocusEmulationEnabled: `74`,
        EmulationDotsetGeolocationOverride: `83`,
        EmulationDotsetIdleOverride: `84`,
        EmulationDotsetLocaleOverride: `89`,
        EmulationDotsetNavigatorOverrides: `85`,
        EmulationDotsetPageScaleFactor: `86`,
        EmulationDotsetScriptExecutionDisabled: `87`,
        EmulationDotsetScrollbarsHidden: `78`,
        EmulationDotsetTimezoneOverride: `90`,
        EmulationDotsetTouchEmulationEnabled: `88`,
        EmulationDotsetUserAgentOverride: `92`,
        EmulationDotsetVirtualTimePolicy: ReturnTypeSetVirtualTimePolicyResponse,
        EmulationDotsetVisibleSize: `91`,
        FetchDotcontinueRequest: `205`,
        FetchDotcontinueWithAuth: `206`,
        FetchDotdisable: ParamsType,
        FetchDotenable: `202`,
        FetchDotfailRequest: `203`,
        FetchDotfulfillRequest: `204`,
        FetchDotgetResponseBody: ParamsTypeReturnTypeGetResponseBodyResponse,
        FetchDottakeResponseBodyAsStream: ReturnTypeTakeResponseBodyAsStreamResponse,
        HeadlessExperimentalDotbeginFrame: ReturnTypeBeginFrameResponse,
        HeadlessExperimentalDotdisable: ParamsType,
        HeadlessExperimentalDotenable: ParamsType,
        HeapProfilerDotaddInspectedHeapObject: `11`,
        HeapProfilerDotcollectGarbage: ParamsType,
        HeapProfilerDotdisable: ParamsType,
        HeapProfilerDotenable: ParamsType,
        HeapProfilerDotgetHeapObjectId: ReturnTypeGetHeapObjectIdResponse,
        HeapProfilerDotgetObjectByHeapObjectId: ReturnTypeGetObjectByHeapObjectIdResponse,
        HeapProfilerDotgetSamplingProfile: ReturnTypeGetSamplingProfileResponse,
        HeapProfilerDotstartSampling: `12`,
        HeapProfilerDotstartTrackingHeapObjects: `13`,
        HeapProfilerDotstopSampling: ReturnTypeStopSamplingResponse,
        HeapProfilerDotstopTrackingHeapObjects: `14`,
        HeapProfilerDottakeHeapSnapshot: `15`,
        IODotclose: `93`,
        IODotread: ReturnTypeReadResponse,
        IODotresolveBlob: ReturnTypeResolveBlobResponse,
        IndexedDBDotclearObjectStore: `94`,
        IndexedDBDotdeleteDatabase: `95`,
        IndexedDBDotdeleteObjectStoreEntries: `96`,
        IndexedDBDotdisable: ParamsType,
        IndexedDBDotenable: ParamsType,
        IndexedDBDotgetMetadata: ReturnTypeGetMetadataResponse,
        IndexedDBDotrequestData: ReturnTypeRequestDataResponse,
        IndexedDBDotrequestDatabase: ReturnTypeRequestDatabaseResponse,
        IndexedDBDotrequestDatabaseNames: ReturnTypeRequestDatabaseNamesResponse,
        InputDotdispatchKeyEvent: `97`,
        InputDotdispatchMouseEvent: `99`,
        InputDotdispatchTouchEvent: `100`,
        InputDotemulateTouchFromMouseEvent: `101`,
        InputDotinsertText: `98`,
        InputDotsetIgnoreInputEvents: `102`,
        InputDotsynthesizePinchGesture: `103`,
        InputDotsynthesizeScrollGesture: `104`,
        InputDotsynthesizeTapGesture: `105`,
        InspectorDotdisable: ParamsType,
        InspectorDotenable: ParamsType,
        LayerTreeDotcompositingReasons: ReturnTypeCompositingReasonsResponse,
        LayerTreeDotdisable: ParamsType
      ): Commands = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("Accessibility.disable")(AccessibilityDotdisable.asInstanceOf[js.Any])
        __obj.updateDynamic("Accessibility.enable")(AccessibilityDotenable.asInstanceOf[js.Any])
        __obj.updateDynamic("Accessibility.getFullAXTree")(AccessibilityDotgetFullAXTree.asInstanceOf[js.Any])
        __obj.updateDynamic("Accessibility.getPartialAXTree")(AccessibilityDotgetPartialAXTree.asInstanceOf[js.Any])
        __obj.updateDynamic("Accessibility.queryAXTree")(AccessibilityDotqueryAXTree.asInstanceOf[js.Any])
        __obj.updateDynamic("Animation.disable")(AnimationDotdisable.asInstanceOf[js.Any])
        __obj.updateDynamic("Animation.enable")(AnimationDotenable.asInstanceOf[js.Any])
        __obj.updateDynamic("Animation.getCurrentTime")(AnimationDotgetCurrentTime.asInstanceOf[js.Any])
        __obj.updateDynamic("Animation.getPlaybackRate")(AnimationDotgetPlaybackRate.asInstanceOf[js.Any])
        __obj.updateDynamic("Animation.releaseAnimations")(AnimationDotreleaseAnimations.asInstanceOf[js.Any])
        __obj.updateDynamic("Animation.resolveAnimation")(AnimationDotresolveAnimation.asInstanceOf[js.Any])
        __obj.updateDynamic("Animation.seekAnimations")(AnimationDotseekAnimations.asInstanceOf[js.Any])
        __obj.updateDynamic("Animation.setPaused")(AnimationDotsetPaused.asInstanceOf[js.Any])
        __obj.updateDynamic("Animation.setPlaybackRate")(AnimationDotsetPlaybackRate.asInstanceOf[js.Any])
        __obj.updateDynamic("Animation.setTiming")(AnimationDotsetTiming.asInstanceOf[js.Any])
        __obj.updateDynamic("ApplicationCache.enable")(ApplicationCacheDotenable.asInstanceOf[js.Any])
        __obj.updateDynamic("ApplicationCache.getApplicationCacheForFrame")(ApplicationCacheDotgetApplicationCacheForFrame.asInstanceOf[js.Any])
        __obj.updateDynamic("ApplicationCache.getFramesWithManifests")(ApplicationCacheDotgetFramesWithManifests.asInstanceOf[js.Any])
        __obj.updateDynamic("ApplicationCache.getManifestForFrame")(ApplicationCacheDotgetManifestForFrame.asInstanceOf[js.Any])
        __obj.updateDynamic("Audits.disable")(AuditsDotdisable.asInstanceOf[js.Any])
        __obj.updateDynamic("Audits.enable")(AuditsDotenable.asInstanceOf[js.Any])
        __obj.updateDynamic("Audits.getEncodedResponse")(AuditsDotgetEncodedResponse.asInstanceOf[js.Any])
        __obj.updateDynamic("BackgroundService.clearEvents")(BackgroundServiceDotclearEvents.asInstanceOf[js.Any])
        __obj.updateDynamic("BackgroundService.setRecording")(BackgroundServiceDotsetRecording.asInstanceOf[js.Any])
        __obj.updateDynamic("BackgroundService.startObserving")(BackgroundServiceDotstartObserving.asInstanceOf[js.Any])
        __obj.updateDynamic("BackgroundService.stopObserving")(BackgroundServiceDotstopObserving.asInstanceOf[js.Any])
        __obj.updateDynamic("Browser.close")(BrowserDotclose.asInstanceOf[js.Any])
        __obj.updateDynamic("Browser.crash")(BrowserDotcrash.asInstanceOf[js.Any])
        __obj.updateDynamic("Browser.crashGpuProcess")(BrowserDotcrashGpuProcess.asInstanceOf[js.Any])
        __obj.updateDynamic("Browser.getBrowserCommandLine")(BrowserDotgetBrowserCommandLine.asInstanceOf[js.Any])
        __obj.updateDynamic("Browser.getHistogram")(BrowserDotgetHistogram.asInstanceOf[js.Any])
        __obj.updateDynamic("Browser.getHistograms")(BrowserDotgetHistograms.asInstanceOf[js.Any])
        __obj.updateDynamic("Browser.getVersion")(BrowserDotgetVersion.asInstanceOf[js.Any])
        __obj.updateDynamic("Browser.getWindowBounds")(BrowserDotgetWindowBounds.asInstanceOf[js.Any])
        __obj.updateDynamic("Browser.getWindowForTarget")(BrowserDotgetWindowForTarget.asInstanceOf[js.Any])
        __obj.updateDynamic("Browser.grantPermissions")(BrowserDotgrantPermissions.asInstanceOf[js.Any])
        __obj.updateDynamic("Browser.resetPermissions")(BrowserDotresetPermissions.asInstanceOf[js.Any])
        __obj.updateDynamic("Browser.setDockTile")(BrowserDotsetDockTile.asInstanceOf[js.Any])
        __obj.updateDynamic("Browser.setDownloadBehavior")(BrowserDotsetDownloadBehavior.asInstanceOf[js.Any])
        __obj.updateDynamic("Browser.setPermission")(BrowserDotsetPermission.asInstanceOf[js.Any])
        __obj.updateDynamic("Browser.setWindowBounds")(BrowserDotsetWindowBounds.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.addRule")(CSSDotaddRule.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.collectClassNames")(CSSDotcollectClassNames.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.createStyleSheet")(CSSDotcreateStyleSheet.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.disable")(CSSDotdisable.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.enable")(CSSDotenable.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.forcePseudoState")(CSSDotforcePseudoState.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.getBackgroundColors")(CSSDotgetBackgroundColors.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.getComputedStyleForNode")(CSSDotgetComputedStyleForNode.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.getInlineStylesForNode")(CSSDotgetInlineStylesForNode.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.getMatchedStylesForNode")(CSSDotgetMatchedStylesForNode.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.getMediaQueries")(CSSDotgetMediaQueries.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.getPlatformFontsForNode")(CSSDotgetPlatformFontsForNode.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.getStyleSheetText")(CSSDotgetStyleSheetText.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.setEffectivePropertyValueForNode")(CSSDotsetEffectivePropertyValueForNode.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.setKeyframeKey")(CSSDotsetKeyframeKey.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.setLocalFontsEnabled")(CSSDotsetLocalFontsEnabled.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.setMediaText")(CSSDotsetMediaText.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.setRuleSelector")(CSSDotsetRuleSelector.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.setStyleSheetText")(CSSDotsetStyleSheetText.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.setStyleTexts")(CSSDotsetStyleTexts.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.startRuleUsageTracking")(CSSDotstartRuleUsageTracking.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.stopRuleUsageTracking")(CSSDotstopRuleUsageTracking.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.takeComputedStyleUpdates")(CSSDottakeComputedStyleUpdates.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.takeCoverageDelta")(CSSDottakeCoverageDelta.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.trackComputedStyleUpdates")(CSSDottrackComputedStyleUpdates.asInstanceOf[js.Any])
        __obj.updateDynamic("CacheStorage.deleteCache")(CacheStorageDotdeleteCache.asInstanceOf[js.Any])
        __obj.updateDynamic("CacheStorage.deleteEntry")(CacheStorageDotdeleteEntry.asInstanceOf[js.Any])
        __obj.updateDynamic("CacheStorage.requestCacheNames")(CacheStorageDotrequestCacheNames.asInstanceOf[js.Any])
        __obj.updateDynamic("CacheStorage.requestCachedResponse")(CacheStorageDotrequestCachedResponse.asInstanceOf[js.Any])
        __obj.updateDynamic("CacheStorage.requestEntries")(CacheStorageDotrequestEntries.asInstanceOf[js.Any])
        __obj.updateDynamic("Cast.disable")(CastDotdisable.asInstanceOf[js.Any])
        __obj.updateDynamic("Cast.enable")(CastDotenable.asInstanceOf[js.Any])
        __obj.updateDynamic("Cast.setSinkToUse")(CastDotsetSinkToUse.asInstanceOf[js.Any])
        __obj.updateDynamic("Cast.startTabMirroring")(CastDotstartTabMirroring.asInstanceOf[js.Any])
        __obj.updateDynamic("Cast.stopCasting")(CastDotstopCasting.asInstanceOf[js.Any])
        __obj.updateDynamic("Console.clearMessages")(ConsoleDotclearMessages.asInstanceOf[js.Any])
        __obj.updateDynamic("Console.disable")(ConsoleDotdisable.asInstanceOf[js.Any])
        __obj.updateDynamic("Console.enable")(ConsoleDotenable.asInstanceOf[js.Any])
        __obj.updateDynamic("DOMDebugger.getEventListeners")(DOMDebuggerDotgetEventListeners.asInstanceOf[js.Any])
        __obj.updateDynamic("DOMDebugger.removeDOMBreakpoint")(DOMDebuggerDotremoveDOMBreakpoint.asInstanceOf[js.Any])
        __obj.updateDynamic("DOMDebugger.removeEventListenerBreakpoint")(DOMDebuggerDotremoveEventListenerBreakpoint.asInstanceOf[js.Any])
        __obj.updateDynamic("DOMDebugger.removeInstrumentationBreakpoint")(DOMDebuggerDotremoveInstrumentationBreakpoint.asInstanceOf[js.Any])
        __obj.updateDynamic("DOMDebugger.removeXHRBreakpoint")(DOMDebuggerDotremoveXHRBreakpoint.asInstanceOf[js.Any])
        __obj.updateDynamic("DOMDebugger.setDOMBreakpoint")(DOMDebuggerDotsetDOMBreakpoint.asInstanceOf[js.Any])
        __obj.updateDynamic("DOMDebugger.setEventListenerBreakpoint")(DOMDebuggerDotsetEventListenerBreakpoint.asInstanceOf[js.Any])
        __obj.updateDynamic("DOMDebugger.setInstrumentationBreakpoint")(DOMDebuggerDotsetInstrumentationBreakpoint.asInstanceOf[js.Any])
        __obj.updateDynamic("DOMDebugger.setXHRBreakpoint")(DOMDebuggerDotsetXHRBreakpoint.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.collectClassNamesFromSubtree")(DOMDotcollectClassNamesFromSubtree.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.copyTo")(DOMDotcopyTo.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.describeNode")(DOMDotdescribeNode.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.disable")(DOMDotdisable.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.discardSearchResults")(DOMDotdiscardSearchResults.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.enable")(DOMDotenable.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.focus")(DOMDotfocus.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.getAttributes")(DOMDotgetAttributes.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.getBoxModel")(DOMDotgetBoxModel.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.getContentQuads")(DOMDotgetContentQuads.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.getDocument")(DOMDotgetDocument.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.getFileInfo")(DOMDotgetFileInfo.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.getFlattenedDocument")(DOMDotgetFlattenedDocument.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.getFrameOwner")(DOMDotgetFrameOwner.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.getNodeForLocation")(DOMDotgetNodeForLocation.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.getNodeStackTraces")(DOMDotgetNodeStackTraces.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.getNodesForSubtreeByStyle")(DOMDotgetNodesForSubtreeByStyle.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.getOuterHTML")(DOMDotgetOuterHTML.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.getRelayoutBoundary")(DOMDotgetRelayoutBoundary.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.getSearchResults")(DOMDotgetSearchResults.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.hideHighlight")(DOMDothideHighlight.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.highlightNode")(DOMDothighlightNode.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.highlightRect")(DOMDothighlightRect.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.markUndoableState")(DOMDotmarkUndoableState.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.moveTo")(DOMDotmoveTo.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.performSearch")(DOMDotperformSearch.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.pushNodeByPathToFrontend")(DOMDotpushNodeByPathToFrontend.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.pushNodesByBackendIdsToFrontend")(DOMDotpushNodesByBackendIdsToFrontend.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.querySelector")(DOMDotquerySelector.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.querySelectorAll")(DOMDotquerySelectorAll.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.redo")(DOMDotredo.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.removeAttribute")(DOMDotremoveAttribute.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.removeNode")(DOMDotremoveNode.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.requestChildNodes")(DOMDotrequestChildNodes.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.requestNode")(DOMDotrequestNode.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.resolveNode")(DOMDotresolveNode.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.scrollIntoViewIfNeeded")(DOMDotscrollIntoViewIfNeeded.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.setAttributeValue")(DOMDotsetAttributeValue.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.setAttributesAsText")(DOMDotsetAttributesAsText.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.setFileInputFiles")(DOMDotsetFileInputFiles.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.setInspectedNode")(DOMDotsetInspectedNode.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.setNodeName")(DOMDotsetNodeName.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.setNodeStackTracesEnabled")(DOMDotsetNodeStackTracesEnabled.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.setNodeValue")(DOMDotsetNodeValue.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.setOuterHTML")(DOMDotsetOuterHTML.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.undo")(DOMDotundo.asInstanceOf[js.Any])
        __obj.updateDynamic("DOMSnapshot.captureSnapshot")(DOMSnapshotDotcaptureSnapshot.asInstanceOf[js.Any])
        __obj.updateDynamic("DOMSnapshot.disable")(DOMSnapshotDotdisable.asInstanceOf[js.Any])
        __obj.updateDynamic("DOMSnapshot.enable")(DOMSnapshotDotenable.asInstanceOf[js.Any])
        __obj.updateDynamic("DOMSnapshot.getSnapshot")(DOMSnapshotDotgetSnapshot.asInstanceOf[js.Any])
        __obj.updateDynamic("DOMStorage.clear")(DOMStorageDotclear.asInstanceOf[js.Any])
        __obj.updateDynamic("DOMStorage.disable")(DOMStorageDotdisable.asInstanceOf[js.Any])
        __obj.updateDynamic("DOMStorage.enable")(DOMStorageDotenable.asInstanceOf[js.Any])
        __obj.updateDynamic("DOMStorage.getDOMStorageItems")(DOMStorageDotgetDOMStorageItems.asInstanceOf[js.Any])
        __obj.updateDynamic("DOMStorage.removeDOMStorageItem")(DOMStorageDotremoveDOMStorageItem.asInstanceOf[js.Any])
        __obj.updateDynamic("DOMStorage.setDOMStorageItem")(DOMStorageDotsetDOMStorageItem.asInstanceOf[js.Any])
        __obj.updateDynamic("Database.disable")(DatabaseDotdisable.asInstanceOf[js.Any])
        __obj.updateDynamic("Database.enable")(DatabaseDotenable.asInstanceOf[js.Any])
        __obj.updateDynamic("Database.executeSQL")(DatabaseDotexecuteSQL.asInstanceOf[js.Any])
        __obj.updateDynamic("Database.getDatabaseTableNames")(DatabaseDotgetDatabaseTableNames.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.continueToLocation")(DebuggerDotcontinueToLocation.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.disable")(DebuggerDotdisable.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.enable")(DebuggerDotenable.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.evaluateOnCallFrame")(DebuggerDotevaluateOnCallFrame.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.executeWasmEvaluator")(DebuggerDotexecuteWasmEvaluator.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.getPossibleBreakpoints")(DebuggerDotgetPossibleBreakpoints.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.getScriptSource")(DebuggerDotgetScriptSource.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.getStackTrace")(DebuggerDotgetStackTrace.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.getWasmBytecode")(DebuggerDotgetWasmBytecode.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.pause")(DebuggerDotpause.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.pauseOnAsyncCall")(DebuggerDotpauseOnAsyncCall.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.removeBreakpoint")(DebuggerDotremoveBreakpoint.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.restartFrame")(DebuggerDotrestartFrame.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.resume")(DebuggerDotresume.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.searchInContent")(DebuggerDotsearchInContent.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.setAsyncCallStackDepth")(DebuggerDotsetAsyncCallStackDepth.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.setBlackboxPatterns")(DebuggerDotsetBlackboxPatterns.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.setBlackboxedRanges")(DebuggerDotsetBlackboxedRanges.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.setBreakpoint")(DebuggerDotsetBreakpoint.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.setBreakpointByUrl")(DebuggerDotsetBreakpointByUrl.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.setBreakpointOnFunctionCall")(DebuggerDotsetBreakpointOnFunctionCall.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.setBreakpointsActive")(DebuggerDotsetBreakpointsActive.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.setInstrumentationBreakpoint")(DebuggerDotsetInstrumentationBreakpoint.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.setPauseOnExceptions")(DebuggerDotsetPauseOnExceptions.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.setReturnValue")(DebuggerDotsetReturnValue.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.setScriptSource")(DebuggerDotsetScriptSource.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.setSkipAllPauses")(DebuggerDotsetSkipAllPauses.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.setVariableValue")(DebuggerDotsetVariableValue.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.stepInto")(DebuggerDotstepInto.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.stepOut")(DebuggerDotstepOut.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.stepOver")(DebuggerDotstepOver.asInstanceOf[js.Any])
        __obj.updateDynamic("DeviceOrientation.clearDeviceOrientationOverride")(DeviceOrientationDotclearDeviceOrientationOverride.asInstanceOf[js.Any])
        __obj.updateDynamic("DeviceOrientation.setDeviceOrientationOverride")(DeviceOrientationDotsetDeviceOrientationOverride.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.canEmulate")(EmulationDotcanEmulate.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.clearDeviceMetricsOverride")(EmulationDotclearDeviceMetricsOverride.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.clearGeolocationOverride")(EmulationDotclearGeolocationOverride.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.clearIdleOverride")(EmulationDotclearIdleOverride.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.resetPageScaleFactor")(EmulationDotresetPageScaleFactor.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.setCPUThrottlingRate")(EmulationDotsetCPUThrottlingRate.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.setDefaultBackgroundColorOverride")(EmulationDotsetDefaultBackgroundColorOverride.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.setDeviceMetricsOverride")(EmulationDotsetDeviceMetricsOverride.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.setDocumentCookieDisabled")(EmulationDotsetDocumentCookieDisabled.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.setEmitTouchEventsForMouse")(EmulationDotsetEmitTouchEventsForMouse.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.setEmulatedMedia")(EmulationDotsetEmulatedMedia.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.setEmulatedVisionDeficiency")(EmulationDotsetEmulatedVisionDeficiency.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.setFocusEmulationEnabled")(EmulationDotsetFocusEmulationEnabled.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.setGeolocationOverride")(EmulationDotsetGeolocationOverride.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.setIdleOverride")(EmulationDotsetIdleOverride.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.setLocaleOverride")(EmulationDotsetLocaleOverride.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.setNavigatorOverrides")(EmulationDotsetNavigatorOverrides.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.setPageScaleFactor")(EmulationDotsetPageScaleFactor.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.setScriptExecutionDisabled")(EmulationDotsetScriptExecutionDisabled.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.setScrollbarsHidden")(EmulationDotsetScrollbarsHidden.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.setTimezoneOverride")(EmulationDotsetTimezoneOverride.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.setTouchEmulationEnabled")(EmulationDotsetTouchEmulationEnabled.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.setUserAgentOverride")(EmulationDotsetUserAgentOverride.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.setVirtualTimePolicy")(EmulationDotsetVirtualTimePolicy.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.setVisibleSize")(EmulationDotsetVisibleSize.asInstanceOf[js.Any])
        __obj.updateDynamic("Fetch.continueRequest")(FetchDotcontinueRequest.asInstanceOf[js.Any])
        __obj.updateDynamic("Fetch.continueWithAuth")(FetchDotcontinueWithAuth.asInstanceOf[js.Any])
        __obj.updateDynamic("Fetch.disable")(FetchDotdisable.asInstanceOf[js.Any])
        __obj.updateDynamic("Fetch.enable")(FetchDotenable.asInstanceOf[js.Any])
        __obj.updateDynamic("Fetch.failRequest")(FetchDotfailRequest.asInstanceOf[js.Any])
        __obj.updateDynamic("Fetch.fulfillRequest")(FetchDotfulfillRequest.asInstanceOf[js.Any])
        __obj.updateDynamic("Fetch.getResponseBody")(FetchDotgetResponseBody.asInstanceOf[js.Any])
        __obj.updateDynamic("Fetch.takeResponseBodyAsStream")(FetchDottakeResponseBodyAsStream.asInstanceOf[js.Any])
        __obj.updateDynamic("HeadlessExperimental.beginFrame")(HeadlessExperimentalDotbeginFrame.asInstanceOf[js.Any])
        __obj.updateDynamic("HeadlessExperimental.disable")(HeadlessExperimentalDotdisable.asInstanceOf[js.Any])
        __obj.updateDynamic("HeadlessExperimental.enable")(HeadlessExperimentalDotenable.asInstanceOf[js.Any])
        __obj.updateDynamic("HeapProfiler.addInspectedHeapObject")(HeapProfilerDotaddInspectedHeapObject.asInstanceOf[js.Any])
        __obj.updateDynamic("HeapProfiler.collectGarbage")(HeapProfilerDotcollectGarbage.asInstanceOf[js.Any])
        __obj.updateDynamic("HeapProfiler.disable")(HeapProfilerDotdisable.asInstanceOf[js.Any])
        __obj.updateDynamic("HeapProfiler.enable")(HeapProfilerDotenable.asInstanceOf[js.Any])
        __obj.updateDynamic("HeapProfiler.getHeapObjectId")(HeapProfilerDotgetHeapObjectId.asInstanceOf[js.Any])
        __obj.updateDynamic("HeapProfiler.getObjectByHeapObjectId")(HeapProfilerDotgetObjectByHeapObjectId.asInstanceOf[js.Any])
        __obj.updateDynamic("HeapProfiler.getSamplingProfile")(HeapProfilerDotgetSamplingProfile.asInstanceOf[js.Any])
        __obj.updateDynamic("HeapProfiler.startSampling")(HeapProfilerDotstartSampling.asInstanceOf[js.Any])
        __obj.updateDynamic("HeapProfiler.startTrackingHeapObjects")(HeapProfilerDotstartTrackingHeapObjects.asInstanceOf[js.Any])
        __obj.updateDynamic("HeapProfiler.stopSampling")(HeapProfilerDotstopSampling.asInstanceOf[js.Any])
        __obj.updateDynamic("HeapProfiler.stopTrackingHeapObjects")(HeapProfilerDotstopTrackingHeapObjects.asInstanceOf[js.Any])
        __obj.updateDynamic("HeapProfiler.takeHeapSnapshot")(HeapProfilerDottakeHeapSnapshot.asInstanceOf[js.Any])
        __obj.updateDynamic("IO.close")(IODotclose.asInstanceOf[js.Any])
        __obj.updateDynamic("IO.read")(IODotread.asInstanceOf[js.Any])
        __obj.updateDynamic("IO.resolveBlob")(IODotresolveBlob.asInstanceOf[js.Any])
        __obj.updateDynamic("IndexedDB.clearObjectStore")(IndexedDBDotclearObjectStore.asInstanceOf[js.Any])
        __obj.updateDynamic("IndexedDB.deleteDatabase")(IndexedDBDotdeleteDatabase.asInstanceOf[js.Any])
        __obj.updateDynamic("IndexedDB.deleteObjectStoreEntries")(IndexedDBDotdeleteObjectStoreEntries.asInstanceOf[js.Any])
        __obj.updateDynamic("IndexedDB.disable")(IndexedDBDotdisable.asInstanceOf[js.Any])
        __obj.updateDynamic("IndexedDB.enable")(IndexedDBDotenable.asInstanceOf[js.Any])
        __obj.updateDynamic("IndexedDB.getMetadata")(IndexedDBDotgetMetadata.asInstanceOf[js.Any])
        __obj.updateDynamic("IndexedDB.requestData")(IndexedDBDotrequestData.asInstanceOf[js.Any])
        __obj.updateDynamic("IndexedDB.requestDatabase")(IndexedDBDotrequestDatabase.asInstanceOf[js.Any])
        __obj.updateDynamic("IndexedDB.requestDatabaseNames")(IndexedDBDotrequestDatabaseNames.asInstanceOf[js.Any])
        __obj.updateDynamic("Input.dispatchKeyEvent")(InputDotdispatchKeyEvent.asInstanceOf[js.Any])
        __obj.updateDynamic("Input.dispatchMouseEvent")(InputDotdispatchMouseEvent.asInstanceOf[js.Any])
        __obj.updateDynamic("Input.dispatchTouchEvent")(InputDotdispatchTouchEvent.asInstanceOf[js.Any])
        __obj.updateDynamic("Input.emulateTouchFromMouseEvent")(InputDotemulateTouchFromMouseEvent.asInstanceOf[js.Any])
        __obj.updateDynamic("Input.insertText")(InputDotinsertText.asInstanceOf[js.Any])
        __obj.updateDynamic("Input.setIgnoreInputEvents")(InputDotsetIgnoreInputEvents.asInstanceOf[js.Any])
        __obj.updateDynamic("Input.synthesizePinchGesture")(InputDotsynthesizePinchGesture.asInstanceOf[js.Any])
        __obj.updateDynamic("Input.synthesizeScrollGesture")(InputDotsynthesizeScrollGesture.asInstanceOf[js.Any])
        __obj.updateDynamic("Input.synthesizeTapGesture")(InputDotsynthesizeTapGesture.asInstanceOf[js.Any])
        __obj.updateDynamic("Inspector.disable")(InspectorDotdisable.asInstanceOf[js.Any])
        __obj.updateDynamic("Inspector.enable")(InspectorDotenable.asInstanceOf[js.Any])
        __obj.updateDynamic("LayerTree.compositingReasons")(LayerTreeDotcompositingReasons.asInstanceOf[js.Any])
        __obj.updateDynamic("LayerTree.disable")(LayerTreeDotdisable.asInstanceOf[js.Any])
        __obj.asInstanceOf[Commands]
      }
      
      extension [Self <: Commands](x: Self) {
        
        inline def setAccessibilityDotdisable(value: ParamsType): Self = StObject.set(x, "Accessibility.disable", value.asInstanceOf[js.Any])
        
        inline def setAccessibilityDotenable(value: ParamsType): Self = StObject.set(x, "Accessibility.enable", value.asInstanceOf[js.Any])
        
        inline def setAccessibilityDotgetFullAXTree(value: ReturnTypeGetFullAXTreeResponse): Self = StObject.set(x, "Accessibility.getFullAXTree", value.asInstanceOf[js.Any])
        
        inline def setAccessibilityDotgetPartialAXTree(value: ReturnTypeGetPartialAXTreeResponse): Self = StObject.set(x, "Accessibility.getPartialAXTree", value.asInstanceOf[js.Any])
        
        inline def setAccessibilityDotqueryAXTree(value: ReturnTypeQueryAXTreeResponse): Self = StObject.set(x, "Accessibility.queryAXTree", value.asInstanceOf[js.Any])
        
        inline def setAnimationDotdisable(value: ParamsType): Self = StObject.set(x, "Animation.disable", value.asInstanceOf[js.Any])
        
        inline def setAnimationDotenable(value: ParamsType): Self = StObject.set(x, "Animation.enable", value.asInstanceOf[js.Any])
        
        inline def setAnimationDotgetCurrentTime(value: ReturnTypeGetCurrentTimeResponse): Self = StObject.set(x, "Animation.getCurrentTime", value.asInstanceOf[js.Any])
        
        inline def setAnimationDotgetPlaybackRate(value: ReturnTypeGetPlaybackRateResponse): Self = StObject.set(x, "Animation.getPlaybackRate", value.asInstanceOf[js.Any])
        
        inline def setAnimationDotreleaseAnimations(value: `24`): Self = StObject.set(x, "Animation.releaseAnimations", value.asInstanceOf[js.Any])
        
        inline def setAnimationDotresolveAnimation(value: ReturnTypeResolveAnimationResponse): Self = StObject.set(x, "Animation.resolveAnimation", value.asInstanceOf[js.Any])
        
        inline def setAnimationDotseekAnimations(value: `25`): Self = StObject.set(x, "Animation.seekAnimations", value.asInstanceOf[js.Any])
        
        inline def setAnimationDotsetPaused(value: `26`): Self = StObject.set(x, "Animation.setPaused", value.asInstanceOf[js.Any])
        
        inline def setAnimationDotsetPlaybackRate(value: `27`): Self = StObject.set(x, "Animation.setPlaybackRate", value.asInstanceOf[js.Any])
        
        inline def setAnimationDotsetTiming(value: `28`): Self = StObject.set(x, "Animation.setTiming", value.asInstanceOf[js.Any])
        
        inline def setApplicationCacheDotenable(value: ParamsType): Self = StObject.set(x, "ApplicationCache.enable", value.asInstanceOf[js.Any])
        
        inline def setApplicationCacheDotgetApplicationCacheForFrame(value: ReturnTypeGetApplicationCacheForFrameResponse): Self = StObject.set(x, "ApplicationCache.getApplicationCacheForFrame", value.asInstanceOf[js.Any])
        
        inline def setApplicationCacheDotgetFramesWithManifests(value: ReturnTypeGetFramesWithManifestsResponse): Self = StObject.set(x, "ApplicationCache.getFramesWithManifests", value.asInstanceOf[js.Any])
        
        inline def setApplicationCacheDotgetManifestForFrame(value: ReturnTypeGetManifestForFrameResponse): Self = StObject.set(x, "ApplicationCache.getManifestForFrame", value.asInstanceOf[js.Any])
        
        inline def setAuditsDotdisable(value: ParamsType): Self = StObject.set(x, "Audits.disable", value.asInstanceOf[js.Any])
        
        inline def setAuditsDotenable(value: ParamsType): Self = StObject.set(x, "Audits.enable", value.asInstanceOf[js.Any])
        
        inline def setAuditsDotgetEncodedResponse(value: ReturnTypeGetEncodedResponseResponse): Self = StObject.set(x, "Audits.getEncodedResponse", value.asInstanceOf[js.Any])
        
        inline def setBackgroundServiceDotclearEvents(value: `32`): Self = StObject.set(x, "BackgroundService.clearEvents", value.asInstanceOf[js.Any])
        
        inline def setBackgroundServiceDotsetRecording(value: `31`): Self = StObject.set(x, "BackgroundService.setRecording", value.asInstanceOf[js.Any])
        
        inline def setBackgroundServiceDotstartObserving(value: `29`): Self = StObject.set(x, "BackgroundService.startObserving", value.asInstanceOf[js.Any])
        
        inline def setBackgroundServiceDotstopObserving(value: `30`): Self = StObject.set(x, "BackgroundService.stopObserving", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotclose(value: ParamsType): Self = StObject.set(x, "Browser.close", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotcrash(value: ParamsType): Self = StObject.set(x, "Browser.crash", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotcrashGpuProcess(value: ParamsType): Self = StObject.set(x, "Browser.crashGpuProcess", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotgetBrowserCommandLine(value: ReturnTypeGetBrowserCommandLineResponse): Self = StObject.set(x, "Browser.getBrowserCommandLine", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotgetHistogram(value: ReturnTypeGetHistogramResponse): Self = StObject.set(x, "Browser.getHistogram", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotgetHistograms(value: ReturnTypeGetHistogramsResponse): Self = StObject.set(x, "Browser.getHistograms", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotgetVersion(value: ReturnTypeGetVersionResponse): Self = StObject.set(x, "Browser.getVersion", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotgetWindowBounds(value: ReturnTypeGetWindowBoundsResponse): Self = StObject.set(x, "Browser.getWindowBounds", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotgetWindowForTarget(value: ReturnTypeGetWindowForTargetResponse): Self = StObject.set(x, "Browser.getWindowForTarget", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotgrantPermissions(value: `34`): Self = StObject.set(x, "Browser.grantPermissions", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotresetPermissions(value: `35`): Self = StObject.set(x, "Browser.resetPermissions", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotsetDockTile(value: `38`): Self = StObject.set(x, "Browser.setDockTile", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotsetDownloadBehavior(value: `36`): Self = StObject.set(x, "Browser.setDownloadBehavior", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotsetPermission(value: `33`): Self = StObject.set(x, "Browser.setPermission", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotsetWindowBounds(value: `37`): Self = StObject.set(x, "Browser.setWindowBounds", value.asInstanceOf[js.Any])
        
        inline def setCSSDotaddRule(value: ReturnTypeAddRuleResponse): Self = StObject.set(x, "CSS.addRule", value.asInstanceOf[js.Any])
        
        inline def setCSSDotcollectClassNames(value: ReturnTypeCollectClassNamesResponse): Self = StObject.set(x, "CSS.collectClassNames", value.asInstanceOf[js.Any])
        
        inline def setCSSDotcreateStyleSheet(value: ReturnTypeCreateStyleSheetResponse): Self = StObject.set(x, "CSS.createStyleSheet", value.asInstanceOf[js.Any])
        
        inline def setCSSDotdisable(value: ParamsType): Self = StObject.set(x, "CSS.disable", value.asInstanceOf[js.Any])
        
        inline def setCSSDotenable(value: ParamsType): Self = StObject.set(x, "CSS.enable", value.asInstanceOf[js.Any])
        
        inline def setCSSDotforcePseudoState(value: `39`): Self = StObject.set(x, "CSS.forcePseudoState", value.asInstanceOf[js.Any])
        
        inline def setCSSDotgetBackgroundColors(value: ReturnTypeGetBackgroundColorsResponse): Self = StObject.set(x, "CSS.getBackgroundColors", value.asInstanceOf[js.Any])
        
        inline def setCSSDotgetComputedStyleForNode(value: ReturnTypeGetComputedStyleForNodeResponse): Self = StObject.set(x, "CSS.getComputedStyleForNode", value.asInstanceOf[js.Any])
        
        inline def setCSSDotgetInlineStylesForNode(value: ReturnTypeGetInlineStylesForNodeResponse): Self = StObject.set(x, "CSS.getInlineStylesForNode", value.asInstanceOf[js.Any])
        
        inline def setCSSDotgetMatchedStylesForNode(value: ReturnTypeGetMatchedStylesForNodeResponse): Self = StObject.set(x, "CSS.getMatchedStylesForNode", value.asInstanceOf[js.Any])
        
        inline def setCSSDotgetMediaQueries(value: ReturnTypeGetMediaQueriesResponse): Self = StObject.set(x, "CSS.getMediaQueries", value.asInstanceOf[js.Any])
        
        inline def setCSSDotgetPlatformFontsForNode(value: ReturnTypeGetPlatformFontsForNodeResponse): Self = StObject.set(x, "CSS.getPlatformFontsForNode", value.asInstanceOf[js.Any])
        
        inline def setCSSDotgetStyleSheetText(value: ReturnTypeGetStyleSheetTextResponse): Self = StObject.set(x, "CSS.getStyleSheetText", value.asInstanceOf[js.Any])
        
        inline def setCSSDotsetEffectivePropertyValueForNode(value: `41`): Self = StObject.set(x, "CSS.setEffectivePropertyValueForNode", value.asInstanceOf[js.Any])
        
        inline def setCSSDotsetKeyframeKey(value: ReturnTypeSetKeyframeKeyResponse): Self = StObject.set(x, "CSS.setKeyframeKey", value.asInstanceOf[js.Any])
        
        inline def setCSSDotsetLocalFontsEnabled(value: `42`): Self = StObject.set(x, "CSS.setLocalFontsEnabled", value.asInstanceOf[js.Any])
        
        inline def setCSSDotsetMediaText(value: ReturnTypeSetMediaTextResponse): Self = StObject.set(x, "CSS.setMediaText", value.asInstanceOf[js.Any])
        
        inline def setCSSDotsetRuleSelector(value: ReturnTypeSetRuleSelectorResponse): Self = StObject.set(x, "CSS.setRuleSelector", value.asInstanceOf[js.Any])
        
        inline def setCSSDotsetStyleSheetText(value: ReturnTypeSetStyleSheetTextResponse): Self = StObject.set(x, "CSS.setStyleSheetText", value.asInstanceOf[js.Any])
        
        inline def setCSSDotsetStyleTexts(value: ReturnTypeSetStyleTextsResponse): Self = StObject.set(x, "CSS.setStyleTexts", value.asInstanceOf[js.Any])
        
        inline def setCSSDotstartRuleUsageTracking(value: ParamsType): Self = StObject.set(x, "CSS.startRuleUsageTracking", value.asInstanceOf[js.Any])
        
        inline def setCSSDotstopRuleUsageTracking(value: ReturnTypeStopRuleUsageTrackingResponse): Self = StObject.set(x, "CSS.stopRuleUsageTracking", value.asInstanceOf[js.Any])
        
        inline def setCSSDottakeComputedStyleUpdates(value: ReturnTypeTakeComputedStyleUpdatesResponse): Self = StObject.set(x, "CSS.takeComputedStyleUpdates", value.asInstanceOf[js.Any])
        
        inline def setCSSDottakeCoverageDelta(value: ReturnTypeTakeCoverageDeltaResponse): Self = StObject.set(x, "CSS.takeCoverageDelta", value.asInstanceOf[js.Any])
        
        inline def setCSSDottrackComputedStyleUpdates(value: `40`): Self = StObject.set(x, "CSS.trackComputedStyleUpdates", value.asInstanceOf[js.Any])
        
        inline def setCacheStorageDotdeleteCache(value: `43`): Self = StObject.set(x, "CacheStorage.deleteCache", value.asInstanceOf[js.Any])
        
        inline def setCacheStorageDotdeleteEntry(value: `44`): Self = StObject.set(x, "CacheStorage.deleteEntry", value.asInstanceOf[js.Any])
        
        inline def setCacheStorageDotrequestCacheNames(value: ReturnTypeRequestCacheNamesResponse): Self = StObject.set(x, "CacheStorage.requestCacheNames", value.asInstanceOf[js.Any])
        
        inline def setCacheStorageDotrequestCachedResponse(value: ReturnTypeRequestCachedResponseResponse): Self = StObject.set(x, "CacheStorage.requestCachedResponse", value.asInstanceOf[js.Any])
        
        inline def setCacheStorageDotrequestEntries(value: ReturnTypeRequestEntriesResponse): Self = StObject.set(x, "CacheStorage.requestEntries", value.asInstanceOf[js.Any])
        
        inline def setCastDotdisable(value: ParamsType): Self = StObject.set(x, "Cast.disable", value.asInstanceOf[js.Any])
        
        inline def setCastDotenable(value: `45`): Self = StObject.set(x, "Cast.enable", value.asInstanceOf[js.Any])
        
        inline def setCastDotsetSinkToUse(value: `46`): Self = StObject.set(x, "Cast.setSinkToUse", value.asInstanceOf[js.Any])
        
        inline def setCastDotstartTabMirroring(value: `47`): Self = StObject.set(x, "Cast.startTabMirroring", value.asInstanceOf[js.Any])
        
        inline def setCastDotstopCasting(value: `48`): Self = StObject.set(x, "Cast.stopCasting", value.asInstanceOf[js.Any])
        
        inline def setConsoleDotclearMessages(value: ParamsType): Self = StObject.set(x, "Console.clearMessages", value.asInstanceOf[js.Any])
        
        inline def setConsoleDotdisable(value: ParamsType): Self = StObject.set(x, "Console.disable", value.asInstanceOf[js.Any])
        
        inline def setConsoleDotenable(value: ParamsType): Self = StObject.set(x, "Console.enable", value.asInstanceOf[js.Any])
        
        inline def setDOMDebuggerDotgetEventListeners(value: ReturnTypeGetEventListenersResponse): Self = StObject.set(x, "DOMDebugger.getEventListeners", value.asInstanceOf[js.Any])
        
        inline def setDOMDebuggerDotremoveDOMBreakpoint(value: `62`): Self = StObject.set(x, "DOMDebugger.removeDOMBreakpoint", value.asInstanceOf[js.Any])
        
        inline def setDOMDebuggerDotremoveEventListenerBreakpoint(value: `63`): Self = StObject.set(x, "DOMDebugger.removeEventListenerBreakpoint", value.asInstanceOf[js.Any])
        
        inline def setDOMDebuggerDotremoveInstrumentationBreakpoint(value: `64`): Self = StObject.set(x, "DOMDebugger.removeInstrumentationBreakpoint", value.asInstanceOf[js.Any])
        
        inline def setDOMDebuggerDotremoveXHRBreakpoint(value: `65`): Self = StObject.set(x, "DOMDebugger.removeXHRBreakpoint", value.asInstanceOf[js.Any])
        
        inline def setDOMDebuggerDotsetDOMBreakpoint(value: `66`): Self = StObject.set(x, "DOMDebugger.setDOMBreakpoint", value.asInstanceOf[js.Any])
        
        inline def setDOMDebuggerDotsetEventListenerBreakpoint(value: `67`): Self = StObject.set(x, "DOMDebugger.setEventListenerBreakpoint", value.asInstanceOf[js.Any])
        
        inline def setDOMDebuggerDotsetInstrumentationBreakpoint(value: `68`): Self = StObject.set(x, "DOMDebugger.setInstrumentationBreakpoint", value.asInstanceOf[js.Any])
        
        inline def setDOMDebuggerDotsetXHRBreakpoint(value: `69`): Self = StObject.set(x, "DOMDebugger.setXHRBreakpoint", value.asInstanceOf[js.Any])
        
        inline def setDOMDotcollectClassNamesFromSubtree(value: ReturnTypeCollectClassNamesFromSubtreeResponse): Self = StObject.set(x, "DOM.collectClassNamesFromSubtree", value.asInstanceOf[js.Any])
        
        inline def setDOMDotcopyTo(value: ReturnTypeCopyToResponse): Self = StObject.set(x, "DOM.copyTo", value.asInstanceOf[js.Any])
        
        inline def setDOMDotdescribeNode(value: ReturnTypeDescribeNodeResponse): Self = StObject.set(x, "DOM.describeNode", value.asInstanceOf[js.Any])
        
        inline def setDOMDotdisable(value: ParamsType): Self = StObject.set(x, "DOM.disable", value.asInstanceOf[js.Any])
        
        inline def setDOMDotdiscardSearchResults(value: `50`): Self = StObject.set(x, "DOM.discardSearchResults", value.asInstanceOf[js.Any])
        
        inline def setDOMDotenable(value: ParamsType): Self = StObject.set(x, "DOM.enable", value.asInstanceOf[js.Any])
        
        inline def setDOMDotfocus(value: `51`): Self = StObject.set(x, "DOM.focus", value.asInstanceOf[js.Any])
        
        inline def setDOMDotgetAttributes(value: ReturnTypeGetAttributesResponse): Self = StObject.set(x, "DOM.getAttributes", value.asInstanceOf[js.Any])
        
        inline def setDOMDotgetBoxModel(value: ReturnTypeGetBoxModelResponse): Self = StObject.set(x, "DOM.getBoxModel", value.asInstanceOf[js.Any])
        
        inline def setDOMDotgetContentQuads(value: ReturnTypeGetContentQuadsResponse): Self = StObject.set(x, "DOM.getContentQuads", value.asInstanceOf[js.Any])
        
        inline def setDOMDotgetDocument(value: ReturnTypeGetDocumentResponse): Self = StObject.set(x, "DOM.getDocument", value.asInstanceOf[js.Any])
        
        inline def setDOMDotgetFileInfo(value: ReturnTypeGetFileInfoResponse): Self = StObject.set(x, "DOM.getFileInfo", value.asInstanceOf[js.Any])
        
        inline def setDOMDotgetFlattenedDocument(value: ReturnTypeGetFlattenedDocumentResponse): Self = StObject.set(x, "DOM.getFlattenedDocument", value.asInstanceOf[js.Any])
        
        inline def setDOMDotgetFrameOwner(value: ReturnTypeGetFrameOwnerResponse): Self = StObject.set(x, "DOM.getFrameOwner", value.asInstanceOf[js.Any])
        
        inline def setDOMDotgetNodeForLocation(value: ReturnTypeGetNodeForLocationResponse): Self = StObject.set(x, "DOM.getNodeForLocation", value.asInstanceOf[js.Any])
        
        inline def setDOMDotgetNodeStackTraces(value: ReturnTypeGetNodeStackTracesResponse): Self = StObject.set(x, "DOM.getNodeStackTraces", value.asInstanceOf[js.Any])
        
        inline def setDOMDotgetNodesForSubtreeByStyle(value: ReturnTypeGetNodesForSubtreeByStyleResponse): Self = StObject.set(x, "DOM.getNodesForSubtreeByStyle", value.asInstanceOf[js.Any])
        
        inline def setDOMDotgetOuterHTML(value: ReturnTypeGetOuterHTMLResponse): Self = StObject.set(x, "DOM.getOuterHTML", value.asInstanceOf[js.Any])
        
        inline def setDOMDotgetRelayoutBoundary(value: ReturnTypeGetRelayoutBoundaryResponse): Self = StObject.set(x, "DOM.getRelayoutBoundary", value.asInstanceOf[js.Any])
        
        inline def setDOMDotgetSearchResults(value: ReturnTypeGetSearchResultsResponse): Self = StObject.set(x, "DOM.getSearchResults", value.asInstanceOf[js.Any])
        
        inline def setDOMDothideHighlight(value: ParamsType): Self = StObject.set(x, "DOM.hideHighlight", value.asInstanceOf[js.Any])
        
        inline def setDOMDothighlightNode(value: ParamsType): Self = StObject.set(x, "DOM.highlightNode", value.asInstanceOf[js.Any])
        
        inline def setDOMDothighlightRect(value: ParamsType): Self = StObject.set(x, "DOM.highlightRect", value.asInstanceOf[js.Any])
        
        inline def setDOMDotmarkUndoableState(value: ParamsType): Self = StObject.set(x, "DOM.markUndoableState", value.asInstanceOf[js.Any])
        
        inline def setDOMDotmoveTo(value: ReturnTypeMoveToResponse): Self = StObject.set(x, "DOM.moveTo", value.asInstanceOf[js.Any])
        
        inline def setDOMDotperformSearch(value: ReturnTypePerformSearchResponse): Self = StObject.set(x, "DOM.performSearch", value.asInstanceOf[js.Any])
        
        inline def setDOMDotpushNodeByPathToFrontend(value: ReturnTypePushNodeByPathToFrontendResponse): Self = StObject.set(x, "DOM.pushNodeByPathToFrontend", value.asInstanceOf[js.Any])
        
        inline def setDOMDotpushNodesByBackendIdsToFrontend(value: ReturnTypePushNodesByBackendIdsToFrontendResponse): Self = StObject.set(x, "DOM.pushNodesByBackendIdsToFrontend", value.asInstanceOf[js.Any])
        
        inline def setDOMDotquerySelector(value: ReturnTypeQuerySelectorResponse): Self = StObject.set(x, "DOM.querySelector", value.asInstanceOf[js.Any])
        
        inline def setDOMDotquerySelectorAll(value: ReturnTypeQuerySelectorAllResponse): Self = StObject.set(x, "DOM.querySelectorAll", value.asInstanceOf[js.Any])
        
        inline def setDOMDotredo(value: ParamsType): Self = StObject.set(x, "DOM.redo", value.asInstanceOf[js.Any])
        
        inline def setDOMDotremoveAttribute(value: `52`): Self = StObject.set(x, "DOM.removeAttribute", value.asInstanceOf[js.Any])
        
        inline def setDOMDotremoveNode(value: `53`): Self = StObject.set(x, "DOM.removeNode", value.asInstanceOf[js.Any])
        
        inline def setDOMDotrequestChildNodes(value: `54`): Self = StObject.set(x, "DOM.requestChildNodes", value.asInstanceOf[js.Any])
        
        inline def setDOMDotrequestNode(value: ReturnTypeRequestNodeResponse): Self = StObject.set(x, "DOM.requestNode", value.asInstanceOf[js.Any])
        
        inline def setDOMDotresolveNode(value: ReturnTypeResolveNodeResponse): Self = StObject.set(x, "DOM.resolveNode", value.asInstanceOf[js.Any])
        
        inline def setDOMDotscrollIntoViewIfNeeded(value: `49`): Self = StObject.set(x, "DOM.scrollIntoViewIfNeeded", value.asInstanceOf[js.Any])
        
        inline def setDOMDotsetAttributeValue(value: `55`): Self = StObject.set(x, "DOM.setAttributeValue", value.asInstanceOf[js.Any])
        
        inline def setDOMDotsetAttributesAsText(value: `56`): Self = StObject.set(x, "DOM.setAttributesAsText", value.asInstanceOf[js.Any])
        
        inline def setDOMDotsetFileInputFiles(value: `57`): Self = StObject.set(x, "DOM.setFileInputFiles", value.asInstanceOf[js.Any])
        
        inline def setDOMDotsetInspectedNode(value: `59`): Self = StObject.set(x, "DOM.setInspectedNode", value.asInstanceOf[js.Any])
        
        inline def setDOMDotsetNodeName(value: ReturnTypeSetNodeNameResponse): Self = StObject.set(x, "DOM.setNodeName", value.asInstanceOf[js.Any])
        
        inline def setDOMDotsetNodeStackTracesEnabled(value: `58`): Self = StObject.set(x, "DOM.setNodeStackTracesEnabled", value.asInstanceOf[js.Any])
        
        inline def setDOMDotsetNodeValue(value: `60`): Self = StObject.set(x, "DOM.setNodeValue", value.asInstanceOf[js.Any])
        
        inline def setDOMDotsetOuterHTML(value: `61`): Self = StObject.set(x, "DOM.setOuterHTML", value.asInstanceOf[js.Any])
        
        inline def setDOMDotundo(value: ParamsType): Self = StObject.set(x, "DOM.undo", value.asInstanceOf[js.Any])
        
        inline def setDOMSnapshotDotcaptureSnapshot(value: ReturnTypeCaptureSnapshotResponse): Self = StObject.set(x, "DOMSnapshot.captureSnapshot", value.asInstanceOf[js.Any])
        
        inline def setDOMSnapshotDotdisable(value: ParamsType): Self = StObject.set(x, "DOMSnapshot.disable", value.asInstanceOf[js.Any])
        
        inline def setDOMSnapshotDotenable(value: ParamsType): Self = StObject.set(x, "DOMSnapshot.enable", value.asInstanceOf[js.Any])
        
        inline def setDOMSnapshotDotgetSnapshot(value: ReturnTypeGetSnapshotResponse): Self = StObject.set(x, "DOMSnapshot.getSnapshot", value.asInstanceOf[js.Any])
        
        inline def setDOMStorageDotclear(value: `70`): Self = StObject.set(x, "DOMStorage.clear", value.asInstanceOf[js.Any])
        
        inline def setDOMStorageDotdisable(value: ParamsType): Self = StObject.set(x, "DOMStorage.disable", value.asInstanceOf[js.Any])
        
        inline def setDOMStorageDotenable(value: ParamsType): Self = StObject.set(x, "DOMStorage.enable", value.asInstanceOf[js.Any])
        
        inline def setDOMStorageDotgetDOMStorageItems(value: ReturnTypeGetDOMStorageItemsResponse): Self = StObject.set(x, "DOMStorage.getDOMStorageItems", value.asInstanceOf[js.Any])
        
        inline def setDOMStorageDotremoveDOMStorageItem(value: `71`): Self = StObject.set(x, "DOMStorage.removeDOMStorageItem", value.asInstanceOf[js.Any])
        
        inline def setDOMStorageDotsetDOMStorageItem(value: `72`): Self = StObject.set(x, "DOMStorage.setDOMStorageItem", value.asInstanceOf[js.Any])
        
        inline def setDatabaseDotdisable(value: ParamsType): Self = StObject.set(x, "Database.disable", value.asInstanceOf[js.Any])
        
        inline def setDatabaseDotenable(value: ParamsType): Self = StObject.set(x, "Database.enable", value.asInstanceOf[js.Any])
        
        inline def setDatabaseDotexecuteSQL(value: ReturnTypeExecuteSQLResponse): Self = StObject.set(x, "Database.executeSQL", value.asInstanceOf[js.Any])
        
        inline def setDatabaseDotgetDatabaseTableNames(value: ReturnTypeGetDatabaseTableNamesResponse): Self = StObject.set(x, "Database.getDatabaseTableNames", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotcontinueToLocation(value: ReturnType): Self = StObject.set(x, "Debugger.continueToLocation", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotdisable(value: ParamsType): Self = StObject.set(x, "Debugger.disable", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotenable(value: ParamsTypeReturnType): Self = StObject.set(x, "Debugger.enable", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotevaluateOnCallFrame(value: ReturnTypeEvaluateOnCallFrameResponse): Self = StObject.set(x, "Debugger.evaluateOnCallFrame", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotexecuteWasmEvaluator(value: ReturnTypeExecuteWasmEvaluatorResponse): Self = StObject.set(x, "Debugger.executeWasmEvaluator", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotgetPossibleBreakpoints(value: ReturnTypeGetPossibleBreakpointsResponse): Self = StObject.set(x, "Debugger.getPossibleBreakpoints", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotgetScriptSource(value: ReturnTypeGetScriptSourceResponse): Self = StObject.set(x, "Debugger.getScriptSource", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotgetStackTrace(value: ReturnTypeGetStackTraceResponse): Self = StObject.set(x, "Debugger.getStackTrace", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotgetWasmBytecode(value: ReturnTypeGetWasmBytecodeResponse): Self = StObject.set(x, "Debugger.getWasmBytecode", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotpause(value: ParamsType): Self = StObject.set(x, "Debugger.pause", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotpauseOnAsyncCall(value: ReturnTypeVoid): Self = StObject.set(x, "Debugger.pauseOnAsyncCall", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotremoveBreakpoint(value: ParamsTypeReturnTypeVoid): Self = StObject.set(x, "Debugger.removeBreakpoint", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotrestartFrame(value: ReturnTypeRestartFrameResponse): Self = StObject.set(x, "Debugger.restartFrame", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotresume(value: `0`): Self = StObject.set(x, "Debugger.resume", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotsearchInContent(value: ReturnTypeSearchInContentResponse): Self = StObject.set(x, "Debugger.searchInContent", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotsetAsyncCallStackDepth(value: `1`): Self = StObject.set(x, "Debugger.setAsyncCallStackDepth", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotsetBlackboxPatterns(value: `2`): Self = StObject.set(x, "Debugger.setBlackboxPatterns", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotsetBlackboxedRanges(value: `3`): Self = StObject.set(x, "Debugger.setBlackboxedRanges", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotsetBreakpoint(value: ReturnTypeSetBreakpointResponse): Self = StObject.set(x, "Debugger.setBreakpoint", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotsetBreakpointByUrl(value: ReturnTypeSetBreakpointByUrlResponse): Self = StObject.set(x, "Debugger.setBreakpointByUrl", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotsetBreakpointOnFunctionCall(value: ReturnTypeSetBreakpointOnFunctionCallResponse): Self = StObject.set(x, "Debugger.setBreakpointOnFunctionCall", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotsetBreakpointsActive(value: `4`): Self = StObject.set(x, "Debugger.setBreakpointsActive", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotsetInstrumentationBreakpoint(value: ReturnTypeSetInstrumentationBreakpointResponse): Self = StObject.set(x, "Debugger.setInstrumentationBreakpoint", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotsetPauseOnExceptions(value: `5`): Self = StObject.set(x, "Debugger.setPauseOnExceptions", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotsetReturnValue(value: `6`): Self = StObject.set(x, "Debugger.setReturnValue", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotsetScriptSource(value: ReturnTypeSetScriptSourceResponse): Self = StObject.set(x, "Debugger.setScriptSource", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotsetSkipAllPauses(value: `7`): Self = StObject.set(x, "Debugger.setSkipAllPauses", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotsetVariableValue(value: `8`): Self = StObject.set(x, "Debugger.setVariableValue", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotstepInto(value: `9`): Self = StObject.set(x, "Debugger.stepInto", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotstepOut(value: ParamsType): Self = StObject.set(x, "Debugger.stepOut", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotstepOver(value: `10`): Self = StObject.set(x, "Debugger.stepOver", value.asInstanceOf[js.Any])
        
        inline def setDeviceOrientationDotclearDeviceOrientationOverride(value: ParamsType): Self = StObject.set(x, "DeviceOrientation.clearDeviceOrientationOverride", value.asInstanceOf[js.Any])
        
        inline def setDeviceOrientationDotsetDeviceOrientationOverride(value: `73`): Self = StObject.set(x, "DeviceOrientation.setDeviceOrientationOverride", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotcanEmulate(value: ReturnTypeCanEmulateResponse): Self = StObject.set(x, "Emulation.canEmulate", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotclearDeviceMetricsOverride(value: ParamsType): Self = StObject.set(x, "Emulation.clearDeviceMetricsOverride", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotclearGeolocationOverride(value: ParamsType): Self = StObject.set(x, "Emulation.clearGeolocationOverride", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotclearIdleOverride(value: ParamsType): Self = StObject.set(x, "Emulation.clearIdleOverride", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotresetPageScaleFactor(value: ParamsType): Self = StObject.set(x, "Emulation.resetPageScaleFactor", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetCPUThrottlingRate(value: `75`): Self = StObject.set(x, "Emulation.setCPUThrottlingRate", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetDefaultBackgroundColorOverride(value: `76`): Self = StObject.set(x, "Emulation.setDefaultBackgroundColorOverride", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetDeviceMetricsOverride(value: `77`): Self = StObject.set(x, "Emulation.setDeviceMetricsOverride", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetDocumentCookieDisabled(value: `79`): Self = StObject.set(x, "Emulation.setDocumentCookieDisabled", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetEmitTouchEventsForMouse(value: `80`): Self = StObject.set(x, "Emulation.setEmitTouchEventsForMouse", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetEmulatedMedia(value: `81`): Self = StObject.set(x, "Emulation.setEmulatedMedia", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetEmulatedVisionDeficiency(value: `82`): Self = StObject.set(x, "Emulation.setEmulatedVisionDeficiency", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetFocusEmulationEnabled(value: `74`): Self = StObject.set(x, "Emulation.setFocusEmulationEnabled", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetGeolocationOverride(value: `83`): Self = StObject.set(x, "Emulation.setGeolocationOverride", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetIdleOverride(value: `84`): Self = StObject.set(x, "Emulation.setIdleOverride", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetLocaleOverride(value: `89`): Self = StObject.set(x, "Emulation.setLocaleOverride", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetNavigatorOverrides(value: `85`): Self = StObject.set(x, "Emulation.setNavigatorOverrides", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetPageScaleFactor(value: `86`): Self = StObject.set(x, "Emulation.setPageScaleFactor", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetScriptExecutionDisabled(value: `87`): Self = StObject.set(x, "Emulation.setScriptExecutionDisabled", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetScrollbarsHidden(value: `78`): Self = StObject.set(x, "Emulation.setScrollbarsHidden", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetTimezoneOverride(value: `90`): Self = StObject.set(x, "Emulation.setTimezoneOverride", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetTouchEmulationEnabled(value: `88`): Self = StObject.set(x, "Emulation.setTouchEmulationEnabled", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetUserAgentOverride(value: `92`): Self = StObject.set(x, "Emulation.setUserAgentOverride", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetVirtualTimePolicy(value: ReturnTypeSetVirtualTimePolicyResponse): Self = StObject.set(x, "Emulation.setVirtualTimePolicy", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetVisibleSize(value: `91`): Self = StObject.set(x, "Emulation.setVisibleSize", value.asInstanceOf[js.Any])
        
        inline def setFetchDotcontinueRequest(value: `205`): Self = StObject.set(x, "Fetch.continueRequest", value.asInstanceOf[js.Any])
        
        inline def setFetchDotcontinueWithAuth(value: `206`): Self = StObject.set(x, "Fetch.continueWithAuth", value.asInstanceOf[js.Any])
        
        inline def setFetchDotdisable(value: ParamsType): Self = StObject.set(x, "Fetch.disable", value.asInstanceOf[js.Any])
        
        inline def setFetchDotenable(value: `202`): Self = StObject.set(x, "Fetch.enable", value.asInstanceOf[js.Any])
        
        inline def setFetchDotfailRequest(value: `203`): Self = StObject.set(x, "Fetch.failRequest", value.asInstanceOf[js.Any])
        
        inline def setFetchDotfulfillRequest(value: `204`): Self = StObject.set(x, "Fetch.fulfillRequest", value.asInstanceOf[js.Any])
        
        inline def setFetchDotgetResponseBody(value: ParamsTypeReturnTypeGetResponseBodyResponse): Self = StObject.set(x, "Fetch.getResponseBody", value.asInstanceOf[js.Any])
        
        inline def setFetchDottakeResponseBodyAsStream(value: ReturnTypeTakeResponseBodyAsStreamResponse): Self = StObject.set(x, "Fetch.takeResponseBodyAsStream", value.asInstanceOf[js.Any])
        
        inline def setHeadlessExperimentalDotbeginFrame(value: ReturnTypeBeginFrameResponse): Self = StObject.set(x, "HeadlessExperimental.beginFrame", value.asInstanceOf[js.Any])
        
        inline def setHeadlessExperimentalDotdisable(value: ParamsType): Self = StObject.set(x, "HeadlessExperimental.disable", value.asInstanceOf[js.Any])
        
        inline def setHeadlessExperimentalDotenable(value: ParamsType): Self = StObject.set(x, "HeadlessExperimental.enable", value.asInstanceOf[js.Any])
        
        inline def setHeapProfilerDotaddInspectedHeapObject(value: `11`): Self = StObject.set(x, "HeapProfiler.addInspectedHeapObject", value.asInstanceOf[js.Any])
        
        inline def setHeapProfilerDotcollectGarbage(value: ParamsType): Self = StObject.set(x, "HeapProfiler.collectGarbage", value.asInstanceOf[js.Any])
        
        inline def setHeapProfilerDotdisable(value: ParamsType): Self = StObject.set(x, "HeapProfiler.disable", value.asInstanceOf[js.Any])
        
        inline def setHeapProfilerDotenable(value: ParamsType): Self = StObject.set(x, "HeapProfiler.enable", value.asInstanceOf[js.Any])
        
        inline def setHeapProfilerDotgetHeapObjectId(value: ReturnTypeGetHeapObjectIdResponse): Self = StObject.set(x, "HeapProfiler.getHeapObjectId", value.asInstanceOf[js.Any])
        
        inline def setHeapProfilerDotgetObjectByHeapObjectId(value: ReturnTypeGetObjectByHeapObjectIdResponse): Self = StObject.set(x, "HeapProfiler.getObjectByHeapObjectId", value.asInstanceOf[js.Any])
        
        inline def setHeapProfilerDotgetSamplingProfile(value: ReturnTypeGetSamplingProfileResponse): Self = StObject.set(x, "HeapProfiler.getSamplingProfile", value.asInstanceOf[js.Any])
        
        inline def setHeapProfilerDotstartSampling(value: `12`): Self = StObject.set(x, "HeapProfiler.startSampling", value.asInstanceOf[js.Any])
        
        inline def setHeapProfilerDotstartTrackingHeapObjects(value: `13`): Self = StObject.set(x, "HeapProfiler.startTrackingHeapObjects", value.asInstanceOf[js.Any])
        
        inline def setHeapProfilerDotstopSampling(value: ReturnTypeStopSamplingResponse): Self = StObject.set(x, "HeapProfiler.stopSampling", value.asInstanceOf[js.Any])
        
        inline def setHeapProfilerDotstopTrackingHeapObjects(value: `14`): Self = StObject.set(x, "HeapProfiler.stopTrackingHeapObjects", value.asInstanceOf[js.Any])
        
        inline def setHeapProfilerDottakeHeapSnapshot(value: `15`): Self = StObject.set(x, "HeapProfiler.takeHeapSnapshot", value.asInstanceOf[js.Any])
        
        inline def setIODotclose(value: `93`): Self = StObject.set(x, "IO.close", value.asInstanceOf[js.Any])
        
        inline def setIODotread(value: ReturnTypeReadResponse): Self = StObject.set(x, "IO.read", value.asInstanceOf[js.Any])
        
        inline def setIODotresolveBlob(value: ReturnTypeResolveBlobResponse): Self = StObject.set(x, "IO.resolveBlob", value.asInstanceOf[js.Any])
        
        inline def setIndexedDBDotclearObjectStore(value: `94`): Self = StObject.set(x, "IndexedDB.clearObjectStore", value.asInstanceOf[js.Any])
        
        inline def setIndexedDBDotdeleteDatabase(value: `95`): Self = StObject.set(x, "IndexedDB.deleteDatabase", value.asInstanceOf[js.Any])
        
        inline def setIndexedDBDotdeleteObjectStoreEntries(value: `96`): Self = StObject.set(x, "IndexedDB.deleteObjectStoreEntries", value.asInstanceOf[js.Any])
        
        inline def setIndexedDBDotdisable(value: ParamsType): Self = StObject.set(x, "IndexedDB.disable", value.asInstanceOf[js.Any])
        
        inline def setIndexedDBDotenable(value: ParamsType): Self = StObject.set(x, "IndexedDB.enable", value.asInstanceOf[js.Any])
        
        inline def setIndexedDBDotgetMetadata(value: ReturnTypeGetMetadataResponse): Self = StObject.set(x, "IndexedDB.getMetadata", value.asInstanceOf[js.Any])
        
        inline def setIndexedDBDotrequestData(value: ReturnTypeRequestDataResponse): Self = StObject.set(x, "IndexedDB.requestData", value.asInstanceOf[js.Any])
        
        inline def setIndexedDBDotrequestDatabase(value: ReturnTypeRequestDatabaseResponse): Self = StObject.set(x, "IndexedDB.requestDatabase", value.asInstanceOf[js.Any])
        
        inline def setIndexedDBDotrequestDatabaseNames(value: ReturnTypeRequestDatabaseNamesResponse): Self = StObject.set(x, "IndexedDB.requestDatabaseNames", value.asInstanceOf[js.Any])
        
        inline def setInputDotdispatchKeyEvent(value: `97`): Self = StObject.set(x, "Input.dispatchKeyEvent", value.asInstanceOf[js.Any])
        
        inline def setInputDotdispatchMouseEvent(value: `99`): Self = StObject.set(x, "Input.dispatchMouseEvent", value.asInstanceOf[js.Any])
        
        inline def setInputDotdispatchTouchEvent(value: `100`): Self = StObject.set(x, "Input.dispatchTouchEvent", value.asInstanceOf[js.Any])
        
        inline def setInputDotemulateTouchFromMouseEvent(value: `101`): Self = StObject.set(x, "Input.emulateTouchFromMouseEvent", value.asInstanceOf[js.Any])
        
        inline def setInputDotinsertText(value: `98`): Self = StObject.set(x, "Input.insertText", value.asInstanceOf[js.Any])
        
        inline def setInputDotsetIgnoreInputEvents(value: `102`): Self = StObject.set(x, "Input.setIgnoreInputEvents", value.asInstanceOf[js.Any])
        
        inline def setInputDotsynthesizePinchGesture(value: `103`): Self = StObject.set(x, "Input.synthesizePinchGesture", value.asInstanceOf[js.Any])
        
        inline def setInputDotsynthesizeScrollGesture(value: `104`): Self = StObject.set(x, "Input.synthesizeScrollGesture", value.asInstanceOf[js.Any])
        
        inline def setInputDotsynthesizeTapGesture(value: `105`): Self = StObject.set(x, "Input.synthesizeTapGesture", value.asInstanceOf[js.Any])
        
        inline def setInspectorDotdisable(value: ParamsType): Self = StObject.set(x, "Inspector.disable", value.asInstanceOf[js.Any])
        
        inline def setInspectorDotenable(value: ParamsType): Self = StObject.set(x, "Inspector.enable", value.asInstanceOf[js.Any])
        
        inline def setLayerTreeDotcompositingReasons(value: ReturnTypeCompositingReasonsResponse): Self = StObject.set(x, "LayerTree.compositingReasons", value.asInstanceOf[js.Any])
        
        inline def setLayerTreeDotdisable(value: ParamsType): Self = StObject.set(x, "LayerTree.disable", value.asInstanceOf[js.Any])
        
        inline def setLayerTreeDotenable(value: ParamsType): Self = StObject.set(x, "LayerTree.enable", value.asInstanceOf[js.Any])
        
        inline def setLayerTreeDotloadSnapshot(value: ReturnTypeLoadSnapshotResponse): Self = StObject.set(x, "LayerTree.loadSnapshot", value.asInstanceOf[js.Any])
        
        inline def setLayerTreeDotmakeSnapshot(value: ReturnTypeMakeSnapshotResponse): Self = StObject.set(x, "LayerTree.makeSnapshot", value.asInstanceOf[js.Any])
        
        inline def setLayerTreeDotprofileSnapshot(value: ReturnTypeProfileSnapshotResponse): Self = StObject.set(x, "LayerTree.profileSnapshot", value.asInstanceOf[js.Any])
        
        inline def setLayerTreeDotreleaseSnapshot(value: `106`): Self = StObject.set(x, "LayerTree.releaseSnapshot", value.asInstanceOf[js.Any])
        
        inline def setLayerTreeDotreplaySnapshot(value: ReturnTypeReplaySnapshotResponse): Self = StObject.set(x, "LayerTree.replaySnapshot", value.asInstanceOf[js.Any])
        
        inline def setLayerTreeDotsnapshotCommandLog(value: ReturnTypeSnapshotCommandLogResponse): Self = StObject.set(x, "LayerTree.snapshotCommandLog", value.asInstanceOf[js.Any])
        
        inline def setLogDotclear(value: ParamsType): Self = StObject.set(x, "Log.clear", value.asInstanceOf[js.Any])
        
        inline def setLogDotdisable(value: ParamsType): Self = StObject.set(x, "Log.disable", value.asInstanceOf[js.Any])
        
        inline def setLogDotenable(value: ParamsType): Self = StObject.set(x, "Log.enable", value.asInstanceOf[js.Any])
        
        inline def setLogDotstartViolationsReport(value: `107`): Self = StObject.set(x, "Log.startViolationsReport", value.asInstanceOf[js.Any])
        
        inline def setLogDotstopViolationsReport(value: ParamsType): Self = StObject.set(x, "Log.stopViolationsReport", value.asInstanceOf[js.Any])
        
        inline def setMediaDotdisable(value: ParamsType): Self = StObject.set(x, "Media.disable", value.asInstanceOf[js.Any])
        
        inline def setMediaDotenable(value: ParamsType): Self = StObject.set(x, "Media.enable", value.asInstanceOf[js.Any])
        
        inline def setMemoryDotforciblyPurgeJavaScriptMemory(value: ParamsType): Self = StObject.set(x, "Memory.forciblyPurgeJavaScriptMemory", value.asInstanceOf[js.Any])
        
        inline def setMemoryDotgetAllTimeSamplingProfile(value: ReturnTypeGetAllTimeSamplingProfileResponse): Self = StObject.set(x, "Memory.getAllTimeSamplingProfile", value.asInstanceOf[js.Any])
        
        inline def setMemoryDotgetBrowserSamplingProfile(value: ReturnTypeGetBrowserSamplingProfileResponse): Self = StObject.set(x, "Memory.getBrowserSamplingProfile", value.asInstanceOf[js.Any])
        
        inline def setMemoryDotgetDOMCounters(value: ReturnTypeGetDOMCountersResponse): Self = StObject.set(x, "Memory.getDOMCounters", value.asInstanceOf[js.Any])
        
        inline def setMemoryDotgetSamplingProfile(value: ParamsTypeReturnTypeGetSamplingProfileResponse): Self = StObject.set(x, "Memory.getSamplingProfile", value.asInstanceOf[js.Any])
        
        inline def setMemoryDotprepareForLeakDetection(value: ParamsType): Self = StObject.set(x, "Memory.prepareForLeakDetection", value.asInstanceOf[js.Any])
        
        inline def setMemoryDotsetPressureNotificationsSuppressed(value: `108`): Self = StObject.set(x, "Memory.setPressureNotificationsSuppressed", value.asInstanceOf[js.Any])
        
        inline def setMemoryDotsimulatePressureNotification(value: `109`): Self = StObject.set(x, "Memory.simulatePressureNotification", value.asInstanceOf[js.Any])
        
        inline def setMemoryDotstartSampling(value: `110`): Self = StObject.set(x, "Memory.startSampling", value.asInstanceOf[js.Any])
        
        inline def setMemoryDotstopSampling(value: ParamsType): Self = StObject.set(x, "Memory.stopSampling", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotcanClearBrowserCache(value: ReturnTypeCanClearBrowserCacheResponse): Self = StObject.set(x, "Network.canClearBrowserCache", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotcanClearBrowserCookies(value: ReturnTypeCanClearBrowserCookiesResponse): Self = StObject.set(x, "Network.canClearBrowserCookies", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotcanEmulateNetworkConditions(value: ReturnTypeCanEmulateNetworkConditionsResponse): Self = StObject.set(x, "Network.canEmulateNetworkConditions", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotclearBrowserCache(value: ParamsType): Self = StObject.set(x, "Network.clearBrowserCache", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotclearBrowserCookies(value: ParamsType): Self = StObject.set(x, "Network.clearBrowserCookies", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotcontinueInterceptedRequest(value: `111`): Self = StObject.set(x, "Network.continueInterceptedRequest", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotdeleteCookies(value: `112`): Self = StObject.set(x, "Network.deleteCookies", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotdisable(value: ParamsType): Self = StObject.set(x, "Network.disable", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotemulateNetworkConditions(value: `113`): Self = StObject.set(x, "Network.emulateNetworkConditions", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotenable(value: `114`): Self = StObject.set(x, "Network.enable", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotgetAllCookies(value: ReturnTypeGetAllCookiesResponse): Self = StObject.set(x, "Network.getAllCookies", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotgetCertificate(value: ReturnTypeGetCertificateResponse): Self = StObject.set(x, "Network.getCertificate", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotgetCookies(value: ReturnTypeGetCookiesResponse): Self = StObject.set(x, "Network.getCookies", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotgetRequestPostData(value: ReturnTypeGetRequestPostDataResponse): Self = StObject.set(x, "Network.getRequestPostData", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotgetResponseBody(value: ReturnTypeGetResponseBodyResponse): Self = StObject.set(x, "Network.getResponseBody", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotgetResponseBodyForInterception(value: ReturnTypeGetResponseBodyForInterceptionResponse): Self = StObject.set(x, "Network.getResponseBodyForInterception", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotgetSecurityIsolationStatus(value: ReturnTypeGetSecurityIsolationStatusResponse): Self = StObject.set(x, "Network.getSecurityIsolationStatus", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotloadNetworkResource(value: ReturnTypeLoadNetworkResourceResponse): Self = StObject.set(x, "Network.loadNetworkResource", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotreplayXHR(value: `115`): Self = StObject.set(x, "Network.replayXHR", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotsearchInResponseBody(value: ReturnTypeSearchInResponseBodyResponse): Self = StObject.set(x, "Network.searchInResponseBody", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotsetAttachDebugHeader(value: `122`): Self = StObject.set(x, "Network.setAttachDebugHeader", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotsetBlockedURLs(value: `116`): Self = StObject.set(x, "Network.setBlockedURLs", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotsetBypassServiceWorker(value: `117`): Self = StObject.set(x, "Network.setBypassServiceWorker", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotsetCacheDisabled(value: `118`): Self = StObject.set(x, "Network.setCacheDisabled", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotsetCookie(value: ReturnTypeSetCookieResponse): Self = StObject.set(x, "Network.setCookie", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotsetCookies(value: `119`): Self = StObject.set(x, "Network.setCookies", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotsetDataSizeLimitsForTest(value: `120`): Self = StObject.set(x, "Network.setDataSizeLimitsForTest", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotsetExtraHTTPHeaders(value: `121`): Self = StObject.set(x, "Network.setExtraHTTPHeaders", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotsetRequestInterception(value: `123`): Self = StObject.set(x, "Network.setRequestInterception", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotsetUserAgentOverride(value: `124`): Self = StObject.set(x, "Network.setUserAgentOverride", value.asInstanceOf[js.Any])
        
        inline def setNetworkDottakeResponseBodyForInterceptionAsStream(value: ReturnTypeTakeResponseBodyForInterceptionAsStreamResponse): Self = StObject.set(x, "Network.takeResponseBodyForInterceptionAsStream", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotdisable(value: ParamsType): Self = StObject.set(x, "Overlay.disable", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotenable(value: ParamsType): Self = StObject.set(x, "Overlay.enable", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotgetGridHighlightObjectsForTest(value: ReturnTypeGetGridHighlightObjectsForTestResponse): Self = StObject.set(x, "Overlay.getGridHighlightObjectsForTest", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotgetHighlightObjectForTest(value: ReturnTypeGetHighlightObjectForTestResponse): Self = StObject.set(x, "Overlay.getHighlightObjectForTest", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotgetSourceOrderHighlightObjectForTest(value: ReturnTypeGetSourceOrderHighlightObjectForTestResponse): Self = StObject.set(x, "Overlay.getSourceOrderHighlightObjectForTest", value.asInstanceOf[js.Any])
        
        inline def setOverlayDothideHighlight(value: ParamsType): Self = StObject.set(x, "Overlay.hideHighlight", value.asInstanceOf[js.Any])
        
        inline def setOverlayDothighlightFrame(value: `125`): Self = StObject.set(x, "Overlay.highlightFrame", value.asInstanceOf[js.Any])
        
        inline def setOverlayDothighlightNode(value: `126`): Self = StObject.set(x, "Overlay.highlightNode", value.asInstanceOf[js.Any])
        
        inline def setOverlayDothighlightQuad(value: `127`): Self = StObject.set(x, "Overlay.highlightQuad", value.asInstanceOf[js.Any])
        
        inline def setOverlayDothighlightRect(value: `128`): Self = StObject.set(x, "Overlay.highlightRect", value.asInstanceOf[js.Any])
        
        inline def setOverlayDothighlightSourceOrder(value: `129`): Self = StObject.set(x, "Overlay.highlightSourceOrder", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotsetInspectMode(value: `130`): Self = StObject.set(x, "Overlay.setInspectMode", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotsetPausedInDebuggerMessage(value: `132`): Self = StObject.set(x, "Overlay.setPausedInDebuggerMessage", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotsetShowAdHighlights(value: `131`): Self = StObject.set(x, "Overlay.setShowAdHighlights", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotsetShowDebugBorders(value: `133`): Self = StObject.set(x, "Overlay.setShowDebugBorders", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotsetShowFPSCounter(value: `134`): Self = StObject.set(x, "Overlay.setShowFPSCounter", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotsetShowGridOverlays(value: `135`): Self = StObject.set(x, "Overlay.setShowGridOverlays", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotsetShowHinge(value: `141`): Self = StObject.set(x, "Overlay.setShowHinge", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotsetShowHitTestBorders(value: `139`): Self = StObject.set(x, "Overlay.setShowHitTestBorders", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotsetShowLayoutShiftRegions(value: `137`): Self = StObject.set(x, "Overlay.setShowLayoutShiftRegions", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotsetShowPaintRects(value: `136`): Self = StObject.set(x, "Overlay.setShowPaintRects", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotsetShowScrollBottleneckRects(value: `138`): Self = StObject.set(x, "Overlay.setShowScrollBottleneckRects", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotsetShowViewportSizeOnResize(value: `140`): Self = StObject.set(x, "Overlay.setShowViewportSizeOnResize", value.asInstanceOf[js.Any])
        
        inline def setPageDotaddCompilationCache(value: `163`): Self = StObject.set(x, "Page.addCompilationCache", value.asInstanceOf[js.Any])
        
        inline def setPageDotaddScriptToEvaluateOnLoad(value: ReturnTypeAddScriptToEvaluateOnLoadResponse): Self = StObject.set(x, "Page.addScriptToEvaluateOnLoad", value.asInstanceOf[js.Any])
        
        inline def setPageDotaddScriptToEvaluateOnNewDocument(value: ReturnTypeAddScriptToEvaluateOnNewDocumentResponse): Self = StObject.set(x, "Page.addScriptToEvaluateOnNewDocument", value.asInstanceOf[js.Any])
        
        inline def setPageDotbringToFront(value: ParamsType): Self = StObject.set(x, "Page.bringToFront", value.asInstanceOf[js.Any])
        
        inline def setPageDotcaptureScreenshot(value: ReturnTypeCaptureScreenshotResponse): Self = StObject.set(x, "Page.captureScreenshot", value.asInstanceOf[js.Any])
        
        inline def setPageDotcaptureSnapshot(value: ParamsTypeReturnTypeCaptureSnapshotResponse): Self = StObject.set(x, "Page.captureSnapshot", value.asInstanceOf[js.Any])
        
        inline def setPageDotclearCompilationCache(value: ParamsType): Self = StObject.set(x, "Page.clearCompilationCache", value.asInstanceOf[js.Any])
        
        inline def setPageDotclearDeviceMetricsOverride(value: ParamsType): Self = StObject.set(x, "Page.clearDeviceMetricsOverride", value.asInstanceOf[js.Any])
        
        inline def setPageDotclearDeviceOrientationOverride(value: ParamsType): Self = StObject.set(x, "Page.clearDeviceOrientationOverride", value.asInstanceOf[js.Any])
        
        inline def setPageDotclearGeolocationOverride(value: ParamsType): Self = StObject.set(x, "Page.clearGeolocationOverride", value.asInstanceOf[js.Any])
        
        inline def setPageDotclose(value: ParamsType): Self = StObject.set(x, "Page.close", value.asInstanceOf[js.Any])
        
        inline def setPageDotcrash(value: ParamsType): Self = StObject.set(x, "Page.crash", value.asInstanceOf[js.Any])
        
        inline def setPageDotcreateIsolatedWorld(value: ReturnTypeCreateIsolatedWorldResponse): Self = StObject.set(x, "Page.createIsolatedWorld", value.asInstanceOf[js.Any])
        
        inline def setPageDotdeleteCookie(value: `142`): Self = StObject.set(x, "Page.deleteCookie", value.asInstanceOf[js.Any])
        
        inline def setPageDotdisable(value: ParamsType): Self = StObject.set(x, "Page.disable", value.asInstanceOf[js.Any])
        
        inline def setPageDotenable(value: ParamsType): Self = StObject.set(x, "Page.enable", value.asInstanceOf[js.Any])
        
        inline def setPageDotgenerateTestReport(value: `164`): Self = StObject.set(x, "Page.generateTestReport", value.asInstanceOf[js.Any])
        
        inline def setPageDotgetAppManifest(value: ReturnTypeGetAppManifestResponse): Self = StObject.set(x, "Page.getAppManifest", value.asInstanceOf[js.Any])
        
        inline def setPageDotgetCookies(value: ParamsTypeReturnTypeGetCookiesResponse): Self = StObject.set(x, "Page.getCookies", value.asInstanceOf[js.Any])
        
        inline def setPageDotgetFrameTree(value: ReturnTypeGetFrameTreeResponse): Self = StObject.set(x, "Page.getFrameTree", value.asInstanceOf[js.Any])
        
        inline def setPageDotgetInstallabilityErrors(value: ReturnTypeGetInstallabilityErrorsResponse): Self = StObject.set(x, "Page.getInstallabilityErrors", value.asInstanceOf[js.Any])
        
        inline def setPageDotgetLayoutMetrics(value: ReturnTypeGetLayoutMetricsResponse): Self = StObject.set(x, "Page.getLayoutMetrics", value.asInstanceOf[js.Any])
        
        inline def setPageDotgetManifestIcons(value: ReturnTypeGetManifestIconsResponse): Self = StObject.set(x, "Page.getManifestIcons", value.asInstanceOf[js.Any])
        
        inline def setPageDotgetNavigationHistory(value: ReturnTypeGetNavigationHistoryResponse): Self = StObject.set(x, "Page.getNavigationHistory", value.asInstanceOf[js.Any])
        
        inline def setPageDotgetResourceContent(value: ReturnTypeGetResourceContentResponse): Self = StObject.set(x, "Page.getResourceContent", value.asInstanceOf[js.Any])
        
        inline def setPageDotgetResourceTree(value: ReturnTypeGetResourceTreeResponse): Self = StObject.set(x, "Page.getResourceTree", value.asInstanceOf[js.Any])
        
        inline def setPageDothandleJavaScriptDialog(value: `143`): Self = StObject.set(x, "Page.handleJavaScriptDialog", value.asInstanceOf[js.Any])
        
        inline def setPageDotnavigate(value: ReturnTypeNavigateResponse): Self = StObject.set(x, "Page.navigate", value.asInstanceOf[js.Any])
        
        inline def setPageDotnavigateToHistoryEntry(value: `144`): Self = StObject.set(x, "Page.navigateToHistoryEntry", value.asInstanceOf[js.Any])
        
        inline def setPageDotprintToPDF(value: ReturnTypePrintToPDFResponse): Self = StObject.set(x, "Page.printToPDF", value.asInstanceOf[js.Any])
        
        inline def setPageDotreload(value: `145`): Self = StObject.set(x, "Page.reload", value.asInstanceOf[js.Any])
        
        inline def setPageDotremoveScriptToEvaluateOnLoad(value: `146`): Self = StObject.set(x, "Page.removeScriptToEvaluateOnLoad", value.asInstanceOf[js.Any])
        
        inline def setPageDotremoveScriptToEvaluateOnNewDocument(value: `147`): Self = StObject.set(x, "Page.removeScriptToEvaluateOnNewDocument", value.asInstanceOf[js.Any])
        
        inline def setPageDotresetNavigationHistory(value: ParamsType): Self = StObject.set(x, "Page.resetNavigationHistory", value.asInstanceOf[js.Any])
        
        inline def setPageDotscreencastFrameAck(value: `148`): Self = StObject.set(x, "Page.screencastFrameAck", value.asInstanceOf[js.Any])
        
        inline def setPageDotsearchInResource(value: ReturnTypeSearchInResourceResponse): Self = StObject.set(x, "Page.searchInResource", value.asInstanceOf[js.Any])
        
        inline def setPageDotsetAdBlockingEnabled(value: `149`): Self = StObject.set(x, "Page.setAdBlockingEnabled", value.asInstanceOf[js.Any])
        
        inline def setPageDotsetBypassCSP(value: `150`): Self = StObject.set(x, "Page.setBypassCSP", value.asInstanceOf[js.Any])
        
        inline def setPageDotsetDeviceMetricsOverride(value: `151`): Self = StObject.set(x, "Page.setDeviceMetricsOverride", value.asInstanceOf[js.Any])
        
        inline def setPageDotsetDeviceOrientationOverride(value: `152`): Self = StObject.set(x, "Page.setDeviceOrientationOverride", value.asInstanceOf[js.Any])
        
        inline def setPageDotsetDocumentContent(value: `155`): Self = StObject.set(x, "Page.setDocumentContent", value.asInstanceOf[js.Any])
        
        inline def setPageDotsetDownloadBehavior(value: `156`): Self = StObject.set(x, "Page.setDownloadBehavior", value.asInstanceOf[js.Any])
        
        inline def setPageDotsetFontFamilies(value: `153`): Self = StObject.set(x, "Page.setFontFamilies", value.asInstanceOf[js.Any])
        
        inline def setPageDotsetFontSizes(value: `154`): Self = StObject.set(x, "Page.setFontSizes", value.asInstanceOf[js.Any])
        
        inline def setPageDotsetGeolocationOverride(value: `157`): Self = StObject.set(x, "Page.setGeolocationOverride", value.asInstanceOf[js.Any])
        
        inline def setPageDotsetInterceptFileChooserDialog(value: `165`): Self = StObject.set(x, "Page.setInterceptFileChooserDialog", value.asInstanceOf[js.Any])
        
        inline def setPageDotsetLifecycleEventsEnabled(value: `158`): Self = StObject.set(x, "Page.setLifecycleEventsEnabled", value.asInstanceOf[js.Any])
        
        inline def setPageDotsetProduceCompilationCache(value: `162`): Self = StObject.set(x, "Page.setProduceCompilationCache", value.asInstanceOf[js.Any])
        
        inline def setPageDotsetTouchEmulationEnabled(value: `159`): Self = StObject.set(x, "Page.setTouchEmulationEnabled", value.asInstanceOf[js.Any])
        
        inline def setPageDotsetWebLifecycleState(value: `161`): Self = StObject.set(x, "Page.setWebLifecycleState", value.asInstanceOf[js.Any])
        
        inline def setPageDotstartScreencast(value: `160`): Self = StObject.set(x, "Page.startScreencast", value.asInstanceOf[js.Any])
        
        inline def setPageDotstopLoading(value: ParamsType): Self = StObject.set(x, "Page.stopLoading", value.asInstanceOf[js.Any])
        
        inline def setPageDotstopScreencast(value: ParamsType): Self = StObject.set(x, "Page.stopScreencast", value.asInstanceOf[js.Any])
        
        inline def setPageDotwaitForDebugger(value: ParamsType): Self = StObject.set(x, "Page.waitForDebugger", value.asInstanceOf[js.Any])
        
        inline def setPerformanceDotdisable(value: ParamsType): Self = StObject.set(x, "Performance.disable", value.asInstanceOf[js.Any])
        
        inline def setPerformanceDotenable(value: `166`): Self = StObject.set(x, "Performance.enable", value.asInstanceOf[js.Any])
        
        inline def setPerformanceDotgetMetrics(value: ReturnTypeGetMetricsResponse): Self = StObject.set(x, "Performance.getMetrics", value.asInstanceOf[js.Any])
        
        inline def setPerformanceDotsetTimeDomain(value: `167`): Self = StObject.set(x, "Performance.setTimeDomain", value.asInstanceOf[js.Any])
        
        inline def setProfilerDotdisable(value: ParamsType): Self = StObject.set(x, "Profiler.disable", value.asInstanceOf[js.Any])
        
        inline def setProfilerDotdisableCounters(value: ParamsType): Self = StObject.set(x, "Profiler.disableCounters", value.asInstanceOf[js.Any])
        
        inline def setProfilerDotdisableRuntimeCallStats(value: ParamsType): Self = StObject.set(x, "Profiler.disableRuntimeCallStats", value.asInstanceOf[js.Any])
        
        inline def setProfilerDotenable(value: ParamsType): Self = StObject.set(x, "Profiler.enable", value.asInstanceOf[js.Any])
        
        inline def setProfilerDotenableCounters(value: ParamsType): Self = StObject.set(x, "Profiler.enableCounters", value.asInstanceOf[js.Any])
        
        inline def setProfilerDotenableRuntimeCallStats(value: ParamsType): Self = StObject.set(x, "Profiler.enableRuntimeCallStats", value.asInstanceOf[js.Any])
        
        inline def setProfilerDotgetBestEffortCoverage(value: ReturnTypeGetBestEffortCoverageResponse): Self = StObject.set(x, "Profiler.getBestEffortCoverage", value.asInstanceOf[js.Any])
        
        inline def setProfilerDotgetCounters(value: ReturnTypeGetCountersResponse): Self = StObject.set(x, "Profiler.getCounters", value.asInstanceOf[js.Any])
        
        inline def setProfilerDotgetRuntimeCallStats(value: ReturnTypeGetRuntimeCallStatsResponse): Self = StObject.set(x, "Profiler.getRuntimeCallStats", value.asInstanceOf[js.Any])
        
        inline def setProfilerDotsetSamplingInterval(value: `16`): Self = StObject.set(x, "Profiler.setSamplingInterval", value.asInstanceOf[js.Any])
        
        inline def setProfilerDotstart(value: ParamsType): Self = StObject.set(x, "Profiler.start", value.asInstanceOf[js.Any])
        
        inline def setProfilerDotstartPreciseCoverage(value: ReturnTypeStartPreciseCoverageResponse): Self = StObject.set(x, "Profiler.startPreciseCoverage", value.asInstanceOf[js.Any])
        
        inline def setProfilerDotstartTypeProfile(value: ParamsType): Self = StObject.set(x, "Profiler.startTypeProfile", value.asInstanceOf[js.Any])
        
        inline def setProfilerDotstop(value: ReturnTypeStopResponse): Self = StObject.set(x, "Profiler.stop", value.asInstanceOf[js.Any])
        
        inline def setProfilerDotstopPreciseCoverage(value: ParamsType): Self = StObject.set(x, "Profiler.stopPreciseCoverage", value.asInstanceOf[js.Any])
        
        inline def setProfilerDotstopTypeProfile(value: ParamsType): Self = StObject.set(x, "Profiler.stopTypeProfile", value.asInstanceOf[js.Any])
        
        inline def setProfilerDottakePreciseCoverage(value: ReturnTypeTakePreciseCoverageResponse): Self = StObject.set(x, "Profiler.takePreciseCoverage", value.asInstanceOf[js.Any])
        
        inline def setProfilerDottakeTypeProfile(value: ReturnTypeTakeTypeProfileResponse): Self = StObject.set(x, "Profiler.takeTypeProfile", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotaddBinding(value: `22`): Self = StObject.set(x, "Runtime.addBinding", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotawaitPromise(value: ReturnTypeAwaitPromiseResponse): Self = StObject.set(x, "Runtime.awaitPromise", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotcallFunctionOn(value: ReturnTypeCallFunctionOnResponse): Self = StObject.set(x, "Runtime.callFunctionOn", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotcompileScript(value: ReturnTypeCompileScriptResponse): Self = StObject.set(x, "Runtime.compileScript", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotdisable(value: ParamsType): Self = StObject.set(x, "Runtime.disable", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotdiscardConsoleEntries(value: ParamsType): Self = StObject.set(x, "Runtime.discardConsoleEntries", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotenable(value: ParamsType): Self = StObject.set(x, "Runtime.enable", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotevaluate(value: ReturnTypeEvaluateResponse): Self = StObject.set(x, "Runtime.evaluate", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotgetHeapUsage(value: ReturnTypeGetHeapUsageResponse): Self = StObject.set(x, "Runtime.getHeapUsage", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotgetIsolateId(value: ReturnTypeGetIsolateIdResponse): Self = StObject.set(x, "Runtime.getIsolateId", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotgetProperties(value: ReturnTypeGetPropertiesResponse): Self = StObject.set(x, "Runtime.getProperties", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotglobalLexicalScopeNames(value: ReturnTypeGlobalLexicalScopeNamesResponse): Self = StObject.set(x, "Runtime.globalLexicalScopeNames", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotqueryObjects(value: ReturnTypeQueryObjectsResponse): Self = StObject.set(x, "Runtime.queryObjects", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotreleaseObject(value: `17`): Self = StObject.set(x, "Runtime.releaseObject", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotreleaseObjectGroup(value: `18`): Self = StObject.set(x, "Runtime.releaseObjectGroup", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotremoveBinding(value: `23`): Self = StObject.set(x, "Runtime.removeBinding", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotrunIfWaitingForDebugger(value: ParamsType): Self = StObject.set(x, "Runtime.runIfWaitingForDebugger", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotrunScript(value: ReturnTypeRunScriptResponse): Self = StObject.set(x, "Runtime.runScript", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotsetAsyncCallStackDepth(value: `19`): Self = StObject.set(x, "Runtime.setAsyncCallStackDepth", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotsetCustomObjectFormatterEnabled(value: `20`): Self = StObject.set(x, "Runtime.setCustomObjectFormatterEnabled", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotsetMaxCallStackSizeToCapture(value: `21`): Self = StObject.set(x, "Runtime.setMaxCallStackSizeToCapture", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotterminateExecution(value: ParamsType): Self = StObject.set(x, "Runtime.terminateExecution", value.asInstanceOf[js.Any])
        
        inline def setSchemaDotgetDomains(value: ReturnTypeGetDomainsResponse): Self = StObject.set(x, "Schema.getDomains", value.asInstanceOf[js.Any])
        
        inline def setSecurityDotdisable(value: ParamsType): Self = StObject.set(x, "Security.disable", value.asInstanceOf[js.Any])
        
        inline def setSecurityDotenable(value: ParamsType): Self = StObject.set(x, "Security.enable", value.asInstanceOf[js.Any])
        
        inline def setSecurityDothandleCertificateError(value: `169`): Self = StObject.set(x, "Security.handleCertificateError", value.asInstanceOf[js.Any])
        
        inline def setSecurityDotsetIgnoreCertificateErrors(value: `168`): Self = StObject.set(x, "Security.setIgnoreCertificateErrors", value.asInstanceOf[js.Any])
        
        inline def setSecurityDotsetOverrideCertificateErrors(value: `170`): Self = StObject.set(x, "Security.setOverrideCertificateErrors", value.asInstanceOf[js.Any])
        
        inline def setServiceWorkerDotdeliverPushMessage(value: `171`): Self = StObject.set(x, "ServiceWorker.deliverPushMessage", value.asInstanceOf[js.Any])
        
        inline def setServiceWorkerDotdisable(value: ParamsType): Self = StObject.set(x, "ServiceWorker.disable", value.asInstanceOf[js.Any])
        
        inline def setServiceWorkerDotdispatchPeriodicSyncEvent(value: `173`): Self = StObject.set(x, "ServiceWorker.dispatchPeriodicSyncEvent", value.asInstanceOf[js.Any])
        
        inline def setServiceWorkerDotdispatchSyncEvent(value: `172`): Self = StObject.set(x, "ServiceWorker.dispatchSyncEvent", value.asInstanceOf[js.Any])
        
        inline def setServiceWorkerDotenable(value: ParamsType): Self = StObject.set(x, "ServiceWorker.enable", value.asInstanceOf[js.Any])
        
        inline def setServiceWorkerDotinspectWorker(value: `174`): Self = StObject.set(x, "ServiceWorker.inspectWorker", value.asInstanceOf[js.Any])
        
        inline def setServiceWorkerDotsetForceUpdateOnPageLoad(value: `175`): Self = StObject.set(x, "ServiceWorker.setForceUpdateOnPageLoad", value.asInstanceOf[js.Any])
        
        inline def setServiceWorkerDotskipWaiting(value: `176`): Self = StObject.set(x, "ServiceWorker.skipWaiting", value.asInstanceOf[js.Any])
        
        inline def setServiceWorkerDotstartWorker(value: `177`): Self = StObject.set(x, "ServiceWorker.startWorker", value.asInstanceOf[js.Any])
        
        inline def setServiceWorkerDotstopAllWorkers(value: ParamsType): Self = StObject.set(x, "ServiceWorker.stopAllWorkers", value.asInstanceOf[js.Any])
        
        inline def setServiceWorkerDotstopWorker(value: `178`): Self = StObject.set(x, "ServiceWorker.stopWorker", value.asInstanceOf[js.Any])
        
        inline def setServiceWorkerDotunregister(value: `179`): Self = StObject.set(x, "ServiceWorker.unregister", value.asInstanceOf[js.Any])
        
        inline def setServiceWorkerDotupdateRegistration(value: `180`): Self = StObject.set(x, "ServiceWorker.updateRegistration", value.asInstanceOf[js.Any])
        
        inline def setStorageDotclearCookies(value: `184`): Self = StObject.set(x, "Storage.clearCookies", value.asInstanceOf[js.Any])
        
        inline def setStorageDotclearDataForOrigin(value: `181`): Self = StObject.set(x, "Storage.clearDataForOrigin", value.asInstanceOf[js.Any])
        
        inline def setStorageDotgetCookies(value: `182`): Self = StObject.set(x, "Storage.getCookies", value.asInstanceOf[js.Any])
        
        inline def setStorageDotgetUsageAndQuota(value: ReturnTypeGetUsageAndQuotaResponse): Self = StObject.set(x, "Storage.getUsageAndQuota", value.asInstanceOf[js.Any])
        
        inline def setStorageDotoverrideQuotaForOrigin(value: `185`): Self = StObject.set(x, "Storage.overrideQuotaForOrigin", value.asInstanceOf[js.Any])
        
        inline def setStorageDotsetCookies(value: `183`): Self = StObject.set(x, "Storage.setCookies", value.asInstanceOf[js.Any])
        
        inline def setStorageDottrackCacheStorageForOrigin(value: `186`): Self = StObject.set(x, "Storage.trackCacheStorageForOrigin", value.asInstanceOf[js.Any])
        
        inline def setStorageDottrackIndexedDBForOrigin(value: `187`): Self = StObject.set(x, "Storage.trackIndexedDBForOrigin", value.asInstanceOf[js.Any])
        
        inline def setStorageDotuntrackCacheStorageForOrigin(value: `188`): Self = StObject.set(x, "Storage.untrackCacheStorageForOrigin", value.asInstanceOf[js.Any])
        
        inline def setStorageDotuntrackIndexedDBForOrigin(value: `189`): Self = StObject.set(x, "Storage.untrackIndexedDBForOrigin", value.asInstanceOf[js.Any])
        
        inline def setSystemInfoDotgetInfo(value: ReturnTypeGetInfoResponse): Self = StObject.set(x, "SystemInfo.getInfo", value.asInstanceOf[js.Any])
        
        inline def setSystemInfoDotgetProcessInfo(value: ReturnTypeGetProcessInfoResponse): Self = StObject.set(x, "SystemInfo.getProcessInfo", value.asInstanceOf[js.Any])
        
        inline def setTargetDotactivateTarget(value: `190`): Self = StObject.set(x, "Target.activateTarget", value.asInstanceOf[js.Any])
        
        inline def setTargetDotattachToBrowserTarget(value: ReturnTypeAttachToBrowserTargetResponse): Self = StObject.set(x, "Target.attachToBrowserTarget", value.asInstanceOf[js.Any])
        
        inline def setTargetDotattachToTarget(value: ReturnTypeAttachToTargetResponse): Self = StObject.set(x, "Target.attachToTarget", value.asInstanceOf[js.Any])
        
        inline def setTargetDotcloseTarget(value: ReturnTypeCloseTargetResponse): Self = StObject.set(x, "Target.closeTarget", value.asInstanceOf[js.Any])
        
        inline def setTargetDotcreateBrowserContext(value: ReturnTypeCreateBrowserContextResponse): Self = StObject.set(x, "Target.createBrowserContext", value.asInstanceOf[js.Any])
        
        inline def setTargetDotcreateTarget(value: ReturnTypeCreateTargetResponse): Self = StObject.set(x, "Target.createTarget", value.asInstanceOf[js.Any])
        
        inline def setTargetDotdetachFromTarget(value: `192`): Self = StObject.set(x, "Target.detachFromTarget", value.asInstanceOf[js.Any])
        
        inline def setTargetDotdisposeBrowserContext(value: `193`): Self = StObject.set(x, "Target.disposeBrowserContext", value.asInstanceOf[js.Any])
        
        inline def setTargetDotexposeDevToolsProtocol(value: `191`): Self = StObject.set(x, "Target.exposeDevToolsProtocol", value.asInstanceOf[js.Any])
        
        inline def setTargetDotgetBrowserContexts(value: ReturnTypeGetBrowserContextsResponse): Self = StObject.set(x, "Target.getBrowserContexts", value.asInstanceOf[js.Any])
        
        inline def setTargetDotgetTargetInfo(value: ReturnTypeGetTargetInfoResponse): Self = StObject.set(x, "Target.getTargetInfo", value.asInstanceOf[js.Any])
        
        inline def setTargetDotgetTargets(value: ReturnTypeGetTargetsResponse): Self = StObject.set(x, "Target.getTargets", value.asInstanceOf[js.Any])
        
        inline def setTargetDotsendMessageToTarget(value: `194`): Self = StObject.set(x, "Target.sendMessageToTarget", value.asInstanceOf[js.Any])
        
        inline def setTargetDotsetAutoAttach(value: `195`): Self = StObject.set(x, "Target.setAutoAttach", value.asInstanceOf[js.Any])
        
        inline def setTargetDotsetDiscoverTargets(value: `196`): Self = StObject.set(x, "Target.setDiscoverTargets", value.asInstanceOf[js.Any])
        
        inline def setTargetDotsetRemoteLocations(value: `197`): Self = StObject.set(x, "Target.setRemoteLocations", value.asInstanceOf[js.Any])
        
        inline def setTetheringDotbind(value: `198`): Self = StObject.set(x, "Tethering.bind", value.asInstanceOf[js.Any])
        
        inline def setTetheringDotunbind(value: `199`): Self = StObject.set(x, "Tethering.unbind", value.asInstanceOf[js.Any])
        
        inline def setTracingDotend(value: ParamsType): Self = StObject.set(x, "Tracing.end", value.asInstanceOf[js.Any])
        
        inline def setTracingDotgetCategories(value: ReturnTypeGetCategoriesResponse): Self = StObject.set(x, "Tracing.getCategories", value.asInstanceOf[js.Any])
        
        inline def setTracingDotrecordClockSyncMarker(value: `200`): Self = StObject.set(x, "Tracing.recordClockSyncMarker", value.asInstanceOf[js.Any])
        
        inline def setTracingDotrequestMemoryDump(value: ReturnTypeRequestMemoryDumpResponse): Self = StObject.set(x, "Tracing.requestMemoryDump", value.asInstanceOf[js.Any])
        
        inline def setTracingDotstart(value: `201`): Self = StObject.set(x, "Tracing.start", value.asInstanceOf[js.Any])
        
        inline def setWebAudioDotdisable(value: ParamsType): Self = StObject.set(x, "WebAudio.disable", value.asInstanceOf[js.Any])
        
        inline def setWebAudioDotenable(value: ParamsType): Self = StObject.set(x, "WebAudio.enable", value.asInstanceOf[js.Any])
        
        inline def setWebAudioDotgetRealtimeData(value: ReturnTypeGetRealtimeDataResponse): Self = StObject.set(x, "WebAudio.getRealtimeData", value.asInstanceOf[js.Any])
        
        inline def setWebAuthnDotaddCredential(value: `208`): Self = StObject.set(x, "WebAuthn.addCredential", value.asInstanceOf[js.Any])
        
        inline def setWebAuthnDotaddVirtualAuthenticator(value: ReturnTypeAddVirtualAuthenticatorResponse): Self = StObject.set(x, "WebAuthn.addVirtualAuthenticator", value.asInstanceOf[js.Any])
        
        inline def setWebAuthnDotclearCredentials(value: `210`): Self = StObject.set(x, "WebAuthn.clearCredentials", value.asInstanceOf[js.Any])
        
        inline def setWebAuthnDotdisable(value: ParamsType): Self = StObject.set(x, "WebAuthn.disable", value.asInstanceOf[js.Any])
        
        inline def setWebAuthnDotenable(value: ParamsType): Self = StObject.set(x, "WebAuthn.enable", value.asInstanceOf[js.Any])
        
        inline def setWebAuthnDotgetCredential(value: ReturnTypeGetCredentialResponse): Self = StObject.set(x, "WebAuthn.getCredential", value.asInstanceOf[js.Any])
        
        inline def setWebAuthnDotgetCredentials(value: ReturnTypeGetCredentialsResponse): Self = StObject.set(x, "WebAuthn.getCredentials", value.asInstanceOf[js.Any])
        
        inline def setWebAuthnDotremoveCredential(value: `209`): Self = StObject.set(x, "WebAuthn.removeCredential", value.asInstanceOf[js.Any])
        
        inline def setWebAuthnDotremoveVirtualAuthenticator(value: `207`): Self = StObject.set(x, "WebAuthn.removeVirtualAuthenticator", value.asInstanceOf[js.Any])
        
        inline def setWebAuthnDotsetAutomaticPresenceSimulation(value: `212`): Self = StObject.set(x, "WebAuthn.setAutomaticPresenceSimulation", value.asInstanceOf[js.Any])
        
        inline def setWebAuthnDotsetUserVerified(value: `211`): Self = StObject.set(x, "WebAuthn.setUserVerified", value.asInstanceOf[js.Any])
      }
    }
    
    trait Events extends StObject {
      
      /**
        * Event for when an animation has been cancelled.
        */
      @JSName("Animation.animationCanceled")
      var AnimationDotanimationCanceled: js.Array[AnimationCanceledEvent]
      
      /**
        * Event for each animation that has been created.
        */
      @JSName("Animation.animationCreated")
      var AnimationDotanimationCreated: js.Array[AnimationCreatedEvent]
      
      /**
        * Event for animation that has been started.
        */
      @JSName("Animation.animationStarted")
      var AnimationDotanimationStarted: js.Array[AnimationStartedEvent]
      
      @JSName("ApplicationCache.applicationCacheStatusUpdated")
      var ApplicationCacheDotapplicationCacheStatusUpdated: js.Array[ApplicationCacheStatusUpdatedEvent]
      
      @JSName("ApplicationCache.networkStateUpdated")
      var ApplicationCacheDotnetworkStateUpdated: js.Array[NetworkStateUpdatedEvent]
      
      @JSName("Audits.issueAdded")
      var AuditsDotissueAdded: js.Array[IssueAddedEvent]
      
      /**
        * Called with all existing backgroundServiceEvents when enabled, and all new
        * events afterwards if enabled and recording.
        */
      @JSName("BackgroundService.backgroundServiceEventReceived")
      var BackgroundServiceDotbackgroundServiceEventReceived: js.Array[BackgroundServiceEventReceivedEvent]
      
      /**
        * Called when the recording state for the service has been updated.
        */
      @JSName("BackgroundService.recordingStateChanged")
      var BackgroundServiceDotrecordingStateChanged: js.Array[RecordingStateChangedEvent]
      
      /**
        * Fires whenever a web font is updated.  A non-empty font parameter indicates a successfully loaded
        * web font
        */
      @JSName("CSS.fontsUpdated")
      var CSSDotfontsUpdated: js.Array[FontsUpdatedEvent]
      
      /**
        * Fires whenever a MediaQuery result changes (for example, after a browser window has been
        * resized.) The current implementation considers only viewport-dependent media features.
        */
      @JSName("CSS.mediaQueryResultChanged")
      var CSSDotmediaQueryResultChanged: js.Array[js.Any]
      
      /**
        * Fired whenever an active document stylesheet is added.
        */
      @JSName("CSS.styleSheetAdded")
      var CSSDotstyleSheetAdded: js.Array[StyleSheetAddedEvent]
      
      /**
        * Fired whenever a stylesheet is changed as a result of the client operation.
        */
      @JSName("CSS.styleSheetChanged")
      var CSSDotstyleSheetChanged: js.Array[StyleSheetChangedEvent]
      
      /**
        * Fired whenever an active document stylesheet is removed.
        */
      @JSName("CSS.styleSheetRemoved")
      var CSSDotstyleSheetRemoved: js.Array[StyleSheetRemovedEvent]
      
      /**
        * This is fired whenever the outstanding issue/error message changes.
        * |issueMessage| is empty if there is no issue.
        */
      @JSName("Cast.issueUpdated")
      var CastDotissueUpdated: js.Array[IssueUpdatedEvent]
      
      /**
        * This is fired whenever the list of available sinks changes. A sink is a
        * device or a software surface that you can cast to.
        */
      @JSName("Cast.sinksUpdated")
      var CastDotsinksUpdated: js.Array[SinksUpdatedEvent]
      
      /**
        * Issued when new console message is added.
        */
      @JSName("Console.messageAdded")
      var ConsoleDotmessageAdded: js.Array[MessageAddedEvent]
      
      /**
        * Fired when `Element`'s attribute is modified.
        */
      @JSName("DOM.attributeModified")
      var DOMDotattributeModified: js.Array[AttributeModifiedEvent]
      
      /**
        * Fired when `Element`'s attribute is removed.
        */
      @JSName("DOM.attributeRemoved")
      var DOMDotattributeRemoved: js.Array[AttributeRemovedEvent]
      
      /**
        * Mirrors `DOMCharacterDataModified` event.
        */
      @JSName("DOM.characterDataModified")
      var DOMDotcharacterDataModified: js.Array[CharacterDataModifiedEvent]
      
      /**
        * Fired when `Container`'s child node count has changed.
        */
      @JSName("DOM.childNodeCountUpdated")
      var DOMDotchildNodeCountUpdated: js.Array[ChildNodeCountUpdatedEvent]
      
      /**
        * Mirrors `DOMNodeInserted` event.
        */
      @JSName("DOM.childNodeInserted")
      var DOMDotchildNodeInserted: js.Array[ChildNodeInsertedEvent]
      
      /**
        * Mirrors `DOMNodeRemoved` event.
        */
      @JSName("DOM.childNodeRemoved")
      var DOMDotchildNodeRemoved: js.Array[ChildNodeRemovedEvent]
      
      /**
        * Called when distrubution is changed.
        */
      @JSName("DOM.distributedNodesUpdated")
      var DOMDotdistributedNodesUpdated: js.Array[DistributedNodesUpdatedEvent]
      
      /**
        * Fired when `Document` has been totally updated. Node ids are no longer valid.
        */
      @JSName("DOM.documentUpdated")
      var DOMDotdocumentUpdated: js.Array[js.Any]
      
      /**
        * Fired when `Element`'s inline style is modified via a CSS property modification.
        */
      @JSName("DOM.inlineStyleInvalidated")
      var DOMDotinlineStyleInvalidated: js.Array[InlineStyleInvalidatedEvent]
      
      /**
        * Called when a pseudo element is added to an element.
        */
      @JSName("DOM.pseudoElementAdded")
      var DOMDotpseudoElementAdded: js.Array[PseudoElementAddedEvent]
      
      /**
        * Called when a pseudo element is removed from an element.
        */
      @JSName("DOM.pseudoElementRemoved")
      var DOMDotpseudoElementRemoved: js.Array[PseudoElementRemovedEvent]
      
      /**
        * Fired when backend wants to provide client with the missing DOM structure. This happens upon
        * most of the calls requesting node ids.
        */
      @JSName("DOM.setChildNodes")
      var DOMDotsetChildNodes: js.Array[SetChildNodesEvent]
      
      /**
        * Called when shadow root is popped from the element.
        */
      @JSName("DOM.shadowRootPopped")
      var DOMDotshadowRootPopped: js.Array[ShadowRootPoppedEvent]
      
      /**
        * Called when shadow root is pushed into the element.
        */
      @JSName("DOM.shadowRootPushed")
      var DOMDotshadowRootPushed: js.Array[ShadowRootPushedEvent]
      
      @JSName("DOMStorage.domStorageItemAdded")
      var DOMStorageDotdomStorageItemAdded: js.Array[DomStorageItemAddedEvent]
      
      @JSName("DOMStorage.domStorageItemRemoved")
      var DOMStorageDotdomStorageItemRemoved: js.Array[DomStorageItemRemovedEvent]
      
      @JSName("DOMStorage.domStorageItemUpdated")
      var DOMStorageDotdomStorageItemUpdated: js.Array[DomStorageItemUpdatedEvent]
      
      @JSName("DOMStorage.domStorageItemsCleared")
      var DOMStorageDotdomStorageItemsCleared: js.Array[DomStorageItemsClearedEvent]
      
      @JSName("Database.addDatabase")
      var DatabaseDotaddDatabase: js.Array[AddDatabaseEvent]
      
      /**
        * Fired when breakpoint is resolved to an actual script and location.
        */
      @JSName("Debugger.breakpointResolved")
      var DebuggerDotbreakpointResolved: js.Array[BreakpointResolvedEvent]
      
      /**
        * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
        */
      @JSName("Debugger.paused")
      var DebuggerDotpaused: js.Array[PausedEvent]
      
      /**
        * Fired when the virtual machine resumed execution.
        */
      @JSName("Debugger.resumed")
      var DebuggerDotresumed: js.Array[js.Any]
      
      /**
        * Fired when virtual machine fails to parse the script.
        */
      @JSName("Debugger.scriptFailedToParse")
      var DebuggerDotscriptFailedToParse: js.Array[ScriptFailedToParseEvent]
      
      /**
        * Fired when virtual machine parses script. This event is also fired for all known and uncollected
        * scripts upon enabling debugger.
        */
      @JSName("Debugger.scriptParsed")
      var DebuggerDotscriptParsed: js.Array[ScriptParsedEvent]
      
      /**
        * Notification sent after the virtual time budget for the current VirtualTimePolicy has run out.
        */
      @JSName("Emulation.virtualTimeBudgetExpired")
      var EmulationDotvirtualTimeBudgetExpired: js.Array[js.Any]
      
      /**
        * Issued when the domain is enabled with handleAuthRequests set to true.
        * The request is paused until client responds with continueWithAuth.
        */
      @JSName("Fetch.authRequired")
      var FetchDotauthRequired: js.Array[AuthRequiredEvent]
      
      /**
        * Issued when the domain is enabled and the request URL matches the
        * specified filter. The request is paused until the client responds
        * with one of continueRequest, failRequest or fulfillRequest.
        * The stage of the request can be determined by presence of responseErrorReason
        * and responseStatusCode -- the request is at the response stage if either
        * of these fields is present and in the request stage otherwise.
        */
      @JSName("Fetch.requestPaused")
      var FetchDotrequestPaused: js.Array[RequestPausedEvent]
      
      /**
        * Issued when the target starts or stops needing BeginFrames.
        * Deprecated. Issue beginFrame unconditionally instead and use result from
        * beginFrame to detect whether the frames were suppressed.
        */
      @JSName("HeadlessExperimental.needsBeginFramesChanged")
      var HeadlessExperimentalDotneedsBeginFramesChanged: js.Array[NeedsBeginFramesChangedEvent]
      
      @JSName("HeapProfiler.addHeapSnapshotChunk")
      var HeapProfilerDotaddHeapSnapshotChunk: js.Array[AddHeapSnapshotChunkEvent]
      
      /**
        * If heap objects tracking has been started then backend may send update for one or more fragments
        */
      @JSName("HeapProfiler.heapStatsUpdate")
      var HeapProfilerDotheapStatsUpdate: js.Array[HeapStatsUpdateEvent]
      
      /**
        * If heap objects tracking has been started then backend regularly sends a current value for last
        * seen object id and corresponding timestamp. If the were changes in the heap since last event
        * then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
        */
      @JSName("HeapProfiler.lastSeenObjectId")
      var HeapProfilerDotlastSeenObjectId: js.Array[LastSeenObjectIdEvent]
      
      @JSName("HeapProfiler.reportHeapSnapshotProgress")
      var HeapProfilerDotreportHeapSnapshotProgress: js.Array[ReportHeapSnapshotProgressEvent]
      
      @JSName("HeapProfiler.resetProfiles")
      var HeapProfilerDotresetProfiles: js.Array[js.Any]
      
      /**
        * Fired when remote debugging connection is about to be terminated. Contains detach reason.
        */
      @JSName("Inspector.detached")
      var InspectorDotdetached: js.Array[DetachedEvent]
      
      /**
        * Fired when debugging target has crashed
        */
      @JSName("Inspector.targetCrashed")
      var InspectorDottargetCrashed: js.Array[js.Any]
      
      /**
        * Fired when debugging target has reloaded after crash
        */
      @JSName("Inspector.targetReloadedAfterCrash")
      var InspectorDottargetReloadedAfterCrash: js.Array[js.Any]
      
      @JSName("LayerTree.layerPainted")
      var LayerTreeDotlayerPainted: js.Array[LayerPaintedEvent]
      
      @JSName("LayerTree.layerTreeDidChange")
      var LayerTreeDotlayerTreeDidChange: js.Array[LayerTreeDidChangeEvent]
      
      /**
        * Issued when new message was logged.
        */
      @JSName("Log.entryAdded")
      var LogDotentryAdded: js.Array[EntryAddedEvent]
      
      /**
        * Send a list of any errors that need to be delivered.
        */
      @JSName("Media.playerErrorsRaised")
      var MediaDotplayerErrorsRaised: js.Array[PlayerErrorsRaisedEvent]
      
      /**
        * Send events as a list, allowing them to be batched on the browser for less
        * congestion. If batched, events must ALWAYS be in chronological order.
        */
      @JSName("Media.playerEventsAdded")
      var MediaDotplayerEventsAdded: js.Array[PlayerEventsAddedEvent]
      
      /**
        * Send a list of any messages that need to be delivered.
        */
      @JSName("Media.playerMessagesLogged")
      var MediaDotplayerMessagesLogged: js.Array[PlayerMessagesLoggedEvent]
      
      /**
        * This can be called multiple times, and can be used to set / override /
        * remove player properties. A null propValue indicates removal.
        */
      @JSName("Media.playerPropertiesChanged")
      var MediaDotplayerPropertiesChanged: js.Array[PlayerPropertiesChangedEvent]
      
      /**
        * Called whenever a player is created, or when a new agent joins and recieves
        * a list of active players. If an agent is restored, it will recieve the full
        * list of player ids and all events again.
        */
      @JSName("Media.playersCreated")
      var MediaDotplayersCreated: js.Array[PlayersCreatedEvent]
      
      /**
        * Fired when data chunk was received over the network.
        */
      @JSName("Network.dataReceived")
      var NetworkDotdataReceived: js.Array[DataReceivedEvent]
      
      /**
        * Fired when EventSource message is received.
        */
      @JSName("Network.eventSourceMessageReceived")
      var NetworkDoteventSourceMessageReceived: js.Array[EventSourceMessageReceivedEvent]
      
      /**
        * Fired when HTTP request has failed to load.
        */
      @JSName("Network.loadingFailed")
      var NetworkDotloadingFailed: js.Array[LoadingFailedEvent]
      
      /**
        * Fired when HTTP request has finished loading.
        */
      @JSName("Network.loadingFinished")
      var NetworkDotloadingFinished: js.Array[LoadingFinishedEvent]
      
      /**
        * Details of an intercepted HTTP request, which must be either allowed, blocked, modified or
        * mocked.
        * Deprecated, use Fetch.requestPaused instead.
        */
      @JSName("Network.requestIntercepted")
      var NetworkDotrequestIntercepted: js.Array[RequestInterceptedEvent]
      
      /**
        * Fired if request ended up loading from cache.
        */
      @JSName("Network.requestServedFromCache")
      var NetworkDotrequestServedFromCache: js.Array[RequestServedFromCacheEvent]
      
      /**
        * Fired when page is about to send HTTP request.
        */
      @JSName("Network.requestWillBeSent")
      var NetworkDotrequestWillBeSent: js.Array[RequestWillBeSentEvent]
      
      /**
        * Fired when additional information about a requestWillBeSent event is available from the
        * network stack. Not every requestWillBeSent event will have an additional
        * requestWillBeSentExtraInfo fired for it, and there is no guarantee whether requestWillBeSent
        * or requestWillBeSentExtraInfo will be fired first for the same request.
        */
      @JSName("Network.requestWillBeSentExtraInfo")
      var NetworkDotrequestWillBeSentExtraInfo: js.Array[RequestWillBeSentExtraInfoEvent]
      
      /**
        * Fired when resource loading priority is changed
        */
      @JSName("Network.resourceChangedPriority")
      var NetworkDotresourceChangedPriority: js.Array[ResourceChangedPriorityEvent]
      
      /**
        * Fired when HTTP response is available.
        */
      @JSName("Network.responseReceived")
      var NetworkDotresponseReceived: js.Array[ResponseReceivedEvent]
      
      /**
        * Fired when additional information about a responseReceived event is available from the network
        * stack. Not every responseReceived event will have an additional responseReceivedExtraInfo for
        * it, and responseReceivedExtraInfo may be fired before or after responseReceived.
        */
      @JSName("Network.responseReceivedExtraInfo")
      var NetworkDotresponseReceivedExtraInfo: js.Array[ResponseReceivedExtraInfoEvent]
      
      /**
        * Fired when a signed exchange was received over the network
        */
      @JSName("Network.signedExchangeReceived")
      var NetworkDotsignedExchangeReceived: js.Array[SignedExchangeReceivedEvent]
      
      /**
        * Fired when WebSocket is closed.
        */
      @JSName("Network.webSocketClosed")
      var NetworkDotwebSocketClosed: js.Array[WebSocketClosedEvent]
      
      /**
        * Fired upon WebSocket creation.
        */
      @JSName("Network.webSocketCreated")
      var NetworkDotwebSocketCreated: js.Array[WebSocketCreatedEvent]
      
      /**
        * Fired when WebSocket message error occurs.
        */
      @JSName("Network.webSocketFrameError")
      var NetworkDotwebSocketFrameError: js.Array[WebSocketFrameErrorEvent]
      
      /**
        * Fired when WebSocket message is received.
        */
      @JSName("Network.webSocketFrameReceived")
      var NetworkDotwebSocketFrameReceived: js.Array[WebSocketFrameReceivedEvent]
      
      /**
        * Fired when WebSocket message is sent.
        */
      @JSName("Network.webSocketFrameSent")
      var NetworkDotwebSocketFrameSent: js.Array[WebSocketFrameSentEvent]
      
      /**
        * Fired when WebSocket handshake response becomes available.
        */
      @JSName("Network.webSocketHandshakeResponseReceived")
      var NetworkDotwebSocketHandshakeResponseReceived: js.Array[WebSocketHandshakeResponseReceivedEvent]
      
      /**
        * Fired when WebSocket is about to initiate handshake.
        */
      @JSName("Network.webSocketWillSendHandshakeRequest")
      var NetworkDotwebSocketWillSendHandshakeRequest: js.Array[WebSocketWillSendHandshakeRequestEvent]
      
      /**
        * Fired when user cancels the inspect mode.
        */
      @JSName("Overlay.inspectModeCanceled")
      var OverlayDotinspectModeCanceled: js.Array[js.Any]
      
      /**
        * Fired when the node should be inspected. This happens after call to `setInspectMode` or when
        * user manually inspects an element.
        */
      @JSName("Overlay.inspectNodeRequested")
      var OverlayDotinspectNodeRequested: js.Array[InspectNodeRequestedEvent]
      
      /**
        * Fired when the node should be highlighted. This happens after call to `setInspectMode`.
        */
      @JSName("Overlay.nodeHighlightRequested")
      var OverlayDotnodeHighlightRequested: js.Array[NodeHighlightRequestedEvent]
      
      /**
        * Fired when user asks to capture screenshot of some area on the page.
        */
      @JSName("Overlay.screenshotRequested")
      var OverlayDotscreenshotRequested: js.Array[ScreenshotRequestedEvent]
      
      /**
        * Issued for every compilation cache generated. Is only available
        * if Page.setGenerateCompilationCache is enabled.
        */
      @JSName("Page.compilationCacheProduced")
      var PageDotcompilationCacheProduced: js.Array[CompilationCacheProducedEvent]
      
      @JSName("Page.domContentEventFired")
      var PageDotdomContentEventFired: js.Array[DomContentEventFiredEvent]
      
      /**
        * Fired when download makes progress. Last call has |done| == true.
        */
      @JSName("Page.downloadProgress")
      var PageDotdownloadProgress: js.Array[DownloadProgressEvent]
      
      /**
        * Fired when page is about to start a download.
        */
      @JSName("Page.downloadWillBegin")
      var PageDotdownloadWillBegin: js.Array[DownloadWillBeginEvent]
      
      /**
        * Emitted only when `page.interceptFileChooser` is enabled.
        */
      @JSName("Page.fileChooserOpened")
      var PageDotfileChooserOpened: js.Array[FileChooserOpenedEvent]
      
      /**
        * Fired when frame has been attached to its parent.
        */
      @JSName("Page.frameAttached")
      var PageDotframeAttached: js.Array[FrameAttachedEvent]
      
      /**
        * Fired when frame no longer has a scheduled navigation.
        */
      @JSName("Page.frameClearedScheduledNavigation")
      var PageDotframeClearedScheduledNavigation: js.Array[FrameClearedScheduledNavigationEvent]
      
      /**
        * Fired when frame has been detached from its parent.
        */
      @JSName("Page.frameDetached")
      var PageDotframeDetached: js.Array[FrameDetachedEvent]
      
      /**
        * Fired once navigation of the frame has completed. Frame is now associated with the new loader.
        */
      @JSName("Page.frameNavigated")
      var PageDotframeNavigated: js.Array[FrameNavigatedEvent]
      
      /**
        * Fired when a renderer-initiated navigation is requested.
        * Navigation may still be cancelled after the event is issued.
        */
      @JSName("Page.frameRequestedNavigation")
      var PageDotframeRequestedNavigation: js.Array[FrameRequestedNavigationEvent]
      
      @JSName("Page.frameResized")
      var PageDotframeResized: js.Array[js.Any]
      
      /**
        * Fired when frame schedules a potential navigation.
        */
      @JSName("Page.frameScheduledNavigation")
      var PageDotframeScheduledNavigation: js.Array[FrameScheduledNavigationEvent]
      
      /**
        * Fired when frame has started loading.
        */
      @JSName("Page.frameStartedLoading")
      var PageDotframeStartedLoading: js.Array[FrameStartedLoadingEvent]
      
      /**
        * Fired when frame has stopped loading.
        */
      @JSName("Page.frameStoppedLoading")
      var PageDotframeStoppedLoading: js.Array[FrameStoppedLoadingEvent]
      
      /**
        * Fired when interstitial page was hidden
        */
      @JSName("Page.interstitialHidden")
      var PageDotinterstitialHidden: js.Array[js.Any]
      
      /**
        * Fired when interstitial page was shown
        */
      @JSName("Page.interstitialShown")
      var PageDotinterstitialShown: js.Array[js.Any]
      
      /**
        * Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) has been
        * closed.
        */
      @JSName("Page.javascriptDialogClosed")
      var PageDotjavascriptDialogClosed: js.Array[JavascriptDialogClosedEvent]
      
      /**
        * Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) is about to
        * open.
        */
      @JSName("Page.javascriptDialogOpening")
      var PageDotjavascriptDialogOpening: js.Array[JavascriptDialogOpeningEvent]
      
      /**
        * Fired for top level page lifecycle events such as navigation, load, paint, etc.
        */
      @JSName("Page.lifecycleEvent")
      var PageDotlifecycleEvent: js.Array[LifecycleEventEvent]
      
      @JSName("Page.loadEventFired")
      var PageDotloadEventFired: js.Array[LoadEventFiredEvent]
      
      /**
        * Fired when same-document navigation happens, e.g. due to history API usage or anchor navigation.
        */
      @JSName("Page.navigatedWithinDocument")
      var PageDotnavigatedWithinDocument: js.Array[NavigatedWithinDocumentEvent]
      
      /**
        * Compressed image data requested by the `startScreencast`.
        */
      @JSName("Page.screencastFrame")
      var PageDotscreencastFrame: js.Array[ScreencastFrameEvent]
      
      /**
        * Fired when the page with currently enabled screencast was shown or hidden `.
        */
      @JSName("Page.screencastVisibilityChanged")
      var PageDotscreencastVisibilityChanged: js.Array[ScreencastVisibilityChangedEvent]
      
      /**
        * Fired when a new window is going to be opened, via window.open(), link click, form submission,
        * etc.
        */
      @JSName("Page.windowOpen")
      var PageDotwindowOpen: js.Array[WindowOpenEvent]
      
      /**
        * Current values of the metrics.
        */
      @JSName("Performance.metrics")
      var PerformanceDotmetrics: js.Array[MetricsEvent]
      
      @JSName("Profiler.consoleProfileFinished")
      var ProfilerDotconsoleProfileFinished: js.Array[ConsoleProfileFinishedEvent]
      
      /**
        * Sent when new profile recording is started using console.profile() call.
        */
      @JSName("Profiler.consoleProfileStarted")
      var ProfilerDotconsoleProfileStarted: js.Array[ConsoleProfileStartedEvent]
      
      /**
        * Reports coverage delta since the last poll (either from an event like this, or from
        * `takePreciseCoverage` for the current isolate. May only be sent if precise code
        * coverage has been started. This event can be trigged by the embedder to, for example,
        * trigger collection of coverage data immediatelly at a certain point in time.
        */
      @JSName("Profiler.preciseCoverageDeltaUpdate")
      var ProfilerDotpreciseCoverageDeltaUpdate: js.Array[PreciseCoverageDeltaUpdateEvent]
      
      /**
        * Notification is issued every time when binding is called.
        */
      @JSName("Runtime.bindingCalled")
      var RuntimeDotbindingCalled: js.Array[BindingCalledEvent]
      
      /**
        * Issued when console API was called.
        */
      @JSName("Runtime.consoleAPICalled")
      var RuntimeDotconsoleAPICalled: js.Array[ConsoleAPICalledEvent]
      
      /**
        * Issued when unhandled exception was revoked.
        */
      @JSName("Runtime.exceptionRevoked")
      var RuntimeDotexceptionRevoked: js.Array[ExceptionRevokedEvent]
      
      /**
        * Issued when exception was thrown and unhandled.
        */
      @JSName("Runtime.exceptionThrown")
      var RuntimeDotexceptionThrown: js.Array[ExceptionThrownEvent]
      
      /**
        * Issued when new execution context is created.
        */
      @JSName("Runtime.executionContextCreated")
      var RuntimeDotexecutionContextCreated: js.Array[ExecutionContextCreatedEvent]
      
      /**
        * Issued when execution context is destroyed.
        */
      @JSName("Runtime.executionContextDestroyed")
      var RuntimeDotexecutionContextDestroyed: js.Array[ExecutionContextDestroyedEvent]
      
      /**
        * Issued when all executionContexts were cleared in browser
        */
      @JSName("Runtime.executionContextsCleared")
      var RuntimeDotexecutionContextsCleared: js.Array[js.Any]
      
      /**
        * Issued when object should be inspected (for example, as a result of inspect() command line API
        * call).
        */
      @JSName("Runtime.inspectRequested")
      var RuntimeDotinspectRequested: js.Array[InspectRequestedEvent]
      
      /**
        * There is a certificate error. If overriding certificate errors is enabled, then it should be
        * handled with the `handleCertificateError` command. Note: this event does not fire if the
        * certificate error has been allowed internally. Only one client per target should override
        * certificate errors at the same time.
        */
      @JSName("Security.certificateError")
      var SecurityDotcertificateError: js.Array[CertificateErrorEvent]
      
      /**
        * The security state of the page changed.
        */
      @JSName("Security.securityStateChanged")
      var SecurityDotsecurityStateChanged: js.Array[SecurityStateChangedEvent]
      
      /**
        * The security state of the page changed.
        */
      @JSName("Security.visibleSecurityStateChanged")
      var SecurityDotvisibleSecurityStateChanged: js.Array[VisibleSecurityStateChangedEvent]
      
      @JSName("ServiceWorker.workerErrorReported")
      var ServiceWorkerDotworkerErrorReported: js.Array[WorkerErrorReportedEvent]
      
      @JSName("ServiceWorker.workerRegistrationUpdated")
      var ServiceWorkerDotworkerRegistrationUpdated: js.Array[WorkerRegistrationUpdatedEvent]
      
      @JSName("ServiceWorker.workerVersionUpdated")
      var ServiceWorkerDotworkerVersionUpdated: js.Array[WorkerVersionUpdatedEvent]
      
      /**
        * A cache's contents have been modified.
        */
      @JSName("Storage.cacheStorageContentUpdated")
      var StorageDotcacheStorageContentUpdated: js.Array[CacheStorageContentUpdatedEvent]
      
      /**
        * A cache has been added/deleted.
        */
      @JSName("Storage.cacheStorageListUpdated")
      var StorageDotcacheStorageListUpdated: js.Array[CacheStorageListUpdatedEvent]
      
      /**
        * The origin's IndexedDB object store has been modified.
        */
      @JSName("Storage.indexedDBContentUpdated")
      var StorageDotindexedDBContentUpdated: js.Array[IndexedDBContentUpdatedEvent]
      
      /**
        * The origin's IndexedDB database list has been modified.
        */
      @JSName("Storage.indexedDBListUpdated")
      var StorageDotindexedDBListUpdated: js.Array[IndexedDBListUpdatedEvent]
      
      /**
        * Issued when attached to target because of auto-attach or `attachToTarget` command.
        */
      @JSName("Target.attachedToTarget")
      var TargetDotattachedToTarget: js.Array[AttachedToTargetEvent]
      
      /**
        * Issued when detached from target for any reason (including `detachFromTarget` command). Can be
        * issued multiple times per target if multiple sessions have been attached to it.
        */
      @JSName("Target.detachedFromTarget")
      var TargetDotdetachedFromTarget: js.Array[DetachedFromTargetEvent]
      
      /**
        * Notifies about a new protocol message received from the session (as reported in
        * `attachedToTarget` event).
        */
      @JSName("Target.receivedMessageFromTarget")
      var TargetDotreceivedMessageFromTarget: js.Array[ReceivedMessageFromTargetEvent]
      
      /**
        * Issued when a target has crashed.
        */
      @JSName("Target.targetCrashed")
      var TargetDottargetCrashed: js.Array[TargetCrashedEvent]
      
      /**
        * Issued when a possible inspection target is created.
        */
      @JSName("Target.targetCreated")
      var TargetDottargetCreated: js.Array[TargetCreatedEvent]
      
      /**
        * Issued when a target is destroyed.
        */
      @JSName("Target.targetDestroyed")
      var TargetDottargetDestroyed: js.Array[TargetDestroyedEvent]
      
      /**
        * Issued when some information about a target has changed. This only happens between
        * `targetCreated` and `targetDestroyed`.
        */
      @JSName("Target.targetInfoChanged")
      var TargetDottargetInfoChanged: js.Array[TargetInfoChangedEvent]
      
      /**
        * Informs that port was successfully bound and got a specified connection id.
        */
      @JSName("Tethering.accepted")
      var TetheringDotaccepted: js.Array[AcceptedEvent]
      
      @JSName("Tracing.bufferUsage")
      var TracingDotbufferUsage: js.Array[BufferUsageEvent]
      
      /**
        * Contains an bucket of collected trace events. When tracing is stopped collected events will be
        * send as a sequence of dataCollected events followed by tracingComplete event.
        */
      @JSName("Tracing.dataCollected")
      var TracingDotdataCollected: js.Array[DataCollectedEvent]
      
      /**
        * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
        * delivered via dataCollected events.
        */
      @JSName("Tracing.tracingComplete")
      var TracingDottracingComplete: js.Array[TracingCompleteEvent]
      
      /**
        * Notifies that the construction of an AudioListener has finished.
        */
      @JSName("WebAudio.audioListenerCreated")
      var WebAudioDotaudioListenerCreated: js.Array[AudioListenerCreatedEvent]
      
      /**
        * Notifies that a new AudioListener has been created.
        */
      @JSName("WebAudio.audioListenerWillBeDestroyed")
      var WebAudioDotaudioListenerWillBeDestroyed: js.Array[AudioListenerWillBeDestroyedEvent]
      
      /**
        * Notifies that a new AudioNode has been created.
        */
      @JSName("WebAudio.audioNodeCreated")
      var WebAudioDotaudioNodeCreated: js.Array[AudioNodeCreatedEvent]
      
      /**
        * Notifies that an existing AudioNode has been destroyed.
        */
      @JSName("WebAudio.audioNodeWillBeDestroyed")
      var WebAudioDotaudioNodeWillBeDestroyed: js.Array[AudioNodeWillBeDestroyedEvent]
      
      /**
        * Notifies that a new AudioParam has been created.
        */
      @JSName("WebAudio.audioParamCreated")
      var WebAudioDotaudioParamCreated: js.Array[AudioParamCreatedEvent]
      
      /**
        * Notifies that an existing AudioParam has been destroyed.
        */
      @JSName("WebAudio.audioParamWillBeDestroyed")
      var WebAudioDotaudioParamWillBeDestroyed: js.Array[AudioParamWillBeDestroyedEvent]
      
      /**
        * Notifies that existing BaseAudioContext has changed some properties (id stays the same)..
        */
      @JSName("WebAudio.contextChanged")
      var WebAudioDotcontextChanged: js.Array[ContextChangedEvent]
      
      /**
        * Notifies that a new BaseAudioContext has been created.
        */
      @JSName("WebAudio.contextCreated")
      var WebAudioDotcontextCreated: js.Array[ContextCreatedEvent]
      
      /**
        * Notifies that an existing BaseAudioContext will be destroyed.
        */
      @JSName("WebAudio.contextWillBeDestroyed")
      var WebAudioDotcontextWillBeDestroyed: js.Array[ContextWillBeDestroyedEvent]
      
      /**
        * Notifies that an AudioNode is connected to an AudioParam.
        */
      @JSName("WebAudio.nodeParamConnected")
      var WebAudioDotnodeParamConnected: js.Array[NodeParamConnectedEvent]
      
      /**
        * Notifies that an AudioNode is disconnected to an AudioParam.
        */
      @JSName("WebAudio.nodeParamDisconnected")
      var WebAudioDotnodeParamDisconnected: js.Array[NodeParamDisconnectedEvent]
      
      /**
        * Notifies that two AudioNodes are connected.
        */
      @JSName("WebAudio.nodesConnected")
      var WebAudioDotnodesConnected: js.Array[NodesConnectedEvent]
      
      /**
        * Notifies that AudioNodes are disconnected. The destination can be null, and it means all the outgoing connections from the source are disconnected.
        */
      @JSName("WebAudio.nodesDisconnected")
      var WebAudioDotnodesDisconnected: js.Array[NodesDisconnectedEvent]
    }
    object Events {
      
      inline def apply(
        AnimationDotanimationCanceled: js.Array[AnimationCanceledEvent],
        AnimationDotanimationCreated: js.Array[AnimationCreatedEvent],
        AnimationDotanimationStarted: js.Array[AnimationStartedEvent],
        ApplicationCacheDotapplicationCacheStatusUpdated: js.Array[ApplicationCacheStatusUpdatedEvent],
        ApplicationCacheDotnetworkStateUpdated: js.Array[NetworkStateUpdatedEvent],
        AuditsDotissueAdded: js.Array[IssueAddedEvent],
        BackgroundServiceDotbackgroundServiceEventReceived: js.Array[BackgroundServiceEventReceivedEvent],
        BackgroundServiceDotrecordingStateChanged: js.Array[RecordingStateChangedEvent],
        CSSDotfontsUpdated: js.Array[FontsUpdatedEvent],
        CSSDotmediaQueryResultChanged: js.Array[js.Any],
        CSSDotstyleSheetAdded: js.Array[StyleSheetAddedEvent],
        CSSDotstyleSheetChanged: js.Array[StyleSheetChangedEvent],
        CSSDotstyleSheetRemoved: js.Array[StyleSheetRemovedEvent],
        CastDotissueUpdated: js.Array[IssueUpdatedEvent],
        CastDotsinksUpdated: js.Array[SinksUpdatedEvent],
        ConsoleDotmessageAdded: js.Array[MessageAddedEvent],
        DOMDotattributeModified: js.Array[AttributeModifiedEvent],
        DOMDotattributeRemoved: js.Array[AttributeRemovedEvent],
        DOMDotcharacterDataModified: js.Array[CharacterDataModifiedEvent],
        DOMDotchildNodeCountUpdated: js.Array[ChildNodeCountUpdatedEvent],
        DOMDotchildNodeInserted: js.Array[ChildNodeInsertedEvent],
        DOMDotchildNodeRemoved: js.Array[ChildNodeRemovedEvent],
        DOMDotdistributedNodesUpdated: js.Array[DistributedNodesUpdatedEvent],
        DOMDotdocumentUpdated: js.Array[js.Any],
        DOMDotinlineStyleInvalidated: js.Array[InlineStyleInvalidatedEvent],
        DOMDotpseudoElementAdded: js.Array[PseudoElementAddedEvent],
        DOMDotpseudoElementRemoved: js.Array[PseudoElementRemovedEvent],
        DOMDotsetChildNodes: js.Array[SetChildNodesEvent],
        DOMDotshadowRootPopped: js.Array[ShadowRootPoppedEvent],
        DOMDotshadowRootPushed: js.Array[ShadowRootPushedEvent],
        DOMStorageDotdomStorageItemAdded: js.Array[DomStorageItemAddedEvent],
        DOMStorageDotdomStorageItemRemoved: js.Array[DomStorageItemRemovedEvent],
        DOMStorageDotdomStorageItemUpdated: js.Array[DomStorageItemUpdatedEvent],
        DOMStorageDotdomStorageItemsCleared: js.Array[DomStorageItemsClearedEvent],
        DatabaseDotaddDatabase: js.Array[AddDatabaseEvent],
        DebuggerDotbreakpointResolved: js.Array[BreakpointResolvedEvent],
        DebuggerDotpaused: js.Array[PausedEvent],
        DebuggerDotresumed: js.Array[js.Any],
        DebuggerDotscriptFailedToParse: js.Array[ScriptFailedToParseEvent],
        DebuggerDotscriptParsed: js.Array[ScriptParsedEvent],
        EmulationDotvirtualTimeBudgetExpired: js.Array[js.Any],
        FetchDotauthRequired: js.Array[AuthRequiredEvent],
        FetchDotrequestPaused: js.Array[RequestPausedEvent],
        HeadlessExperimentalDotneedsBeginFramesChanged: js.Array[NeedsBeginFramesChangedEvent],
        HeapProfilerDotaddHeapSnapshotChunk: js.Array[AddHeapSnapshotChunkEvent],
        HeapProfilerDotheapStatsUpdate: js.Array[HeapStatsUpdateEvent],
        HeapProfilerDotlastSeenObjectId: js.Array[LastSeenObjectIdEvent],
        HeapProfilerDotreportHeapSnapshotProgress: js.Array[ReportHeapSnapshotProgressEvent],
        HeapProfilerDotresetProfiles: js.Array[js.Any],
        InspectorDotdetached: js.Array[DetachedEvent],
        InspectorDottargetCrashed: js.Array[js.Any],
        InspectorDottargetReloadedAfterCrash: js.Array[js.Any],
        LayerTreeDotlayerPainted: js.Array[LayerPaintedEvent],
        LayerTreeDotlayerTreeDidChange: js.Array[LayerTreeDidChangeEvent],
        LogDotentryAdded: js.Array[EntryAddedEvent],
        MediaDotplayerErrorsRaised: js.Array[PlayerErrorsRaisedEvent],
        MediaDotplayerEventsAdded: js.Array[PlayerEventsAddedEvent],
        MediaDotplayerMessagesLogged: js.Array[PlayerMessagesLoggedEvent],
        MediaDotplayerPropertiesChanged: js.Array[PlayerPropertiesChangedEvent],
        MediaDotplayersCreated: js.Array[PlayersCreatedEvent],
        NetworkDotdataReceived: js.Array[DataReceivedEvent],
        NetworkDoteventSourceMessageReceived: js.Array[EventSourceMessageReceivedEvent],
        NetworkDotloadingFailed: js.Array[LoadingFailedEvent],
        NetworkDotloadingFinished: js.Array[LoadingFinishedEvent],
        NetworkDotrequestIntercepted: js.Array[RequestInterceptedEvent],
        NetworkDotrequestServedFromCache: js.Array[RequestServedFromCacheEvent],
        NetworkDotrequestWillBeSent: js.Array[RequestWillBeSentEvent],
        NetworkDotrequestWillBeSentExtraInfo: js.Array[RequestWillBeSentExtraInfoEvent],
        NetworkDotresourceChangedPriority: js.Array[ResourceChangedPriorityEvent],
        NetworkDotresponseReceived: js.Array[ResponseReceivedEvent],
        NetworkDotresponseReceivedExtraInfo: js.Array[ResponseReceivedExtraInfoEvent],
        NetworkDotsignedExchangeReceived: js.Array[SignedExchangeReceivedEvent],
        NetworkDotwebSocketClosed: js.Array[WebSocketClosedEvent],
        NetworkDotwebSocketCreated: js.Array[WebSocketCreatedEvent],
        NetworkDotwebSocketFrameError: js.Array[WebSocketFrameErrorEvent],
        NetworkDotwebSocketFrameReceived: js.Array[WebSocketFrameReceivedEvent],
        NetworkDotwebSocketFrameSent: js.Array[WebSocketFrameSentEvent],
        NetworkDotwebSocketHandshakeResponseReceived: js.Array[WebSocketHandshakeResponseReceivedEvent],
        NetworkDotwebSocketWillSendHandshakeRequest: js.Array[WebSocketWillSendHandshakeRequestEvent],
        OverlayDotinspectModeCanceled: js.Array[js.Any],
        OverlayDotinspectNodeRequested: js.Array[InspectNodeRequestedEvent],
        OverlayDotnodeHighlightRequested: js.Array[NodeHighlightRequestedEvent],
        OverlayDotscreenshotRequested: js.Array[ScreenshotRequestedEvent],
        PageDotcompilationCacheProduced: js.Array[CompilationCacheProducedEvent],
        PageDotdomContentEventFired: js.Array[DomContentEventFiredEvent],
        PageDotdownloadProgress: js.Array[DownloadProgressEvent],
        PageDotdownloadWillBegin: js.Array[DownloadWillBeginEvent],
        PageDotfileChooserOpened: js.Array[FileChooserOpenedEvent],
        PageDotframeAttached: js.Array[FrameAttachedEvent],
        PageDotframeClearedScheduledNavigation: js.Array[FrameClearedScheduledNavigationEvent],
        PageDotframeDetached: js.Array[FrameDetachedEvent],
        PageDotframeNavigated: js.Array[FrameNavigatedEvent],
        PageDotframeRequestedNavigation: js.Array[FrameRequestedNavigationEvent],
        PageDotframeResized: js.Array[js.Any],
        PageDotframeScheduledNavigation: js.Array[FrameScheduledNavigationEvent],
        PageDotframeStartedLoading: js.Array[FrameStartedLoadingEvent],
        PageDotframeStoppedLoading: js.Array[FrameStoppedLoadingEvent],
        PageDotinterstitialHidden: js.Array[js.Any],
        PageDotinterstitialShown: js.Array[js.Any],
        PageDotjavascriptDialogClosed: js.Array[JavascriptDialogClosedEvent],
        PageDotjavascriptDialogOpening: js.Array[JavascriptDialogOpeningEvent],
        PageDotlifecycleEvent: js.Array[LifecycleEventEvent],
        PageDotloadEventFired: js.Array[LoadEventFiredEvent],
        PageDotnavigatedWithinDocument: js.Array[NavigatedWithinDocumentEvent],
        PageDotscreencastFrame: js.Array[ScreencastFrameEvent],
        PageDotscreencastVisibilityChanged: js.Array[ScreencastVisibilityChangedEvent],
        PageDotwindowOpen: js.Array[WindowOpenEvent],
        PerformanceDotmetrics: js.Array[MetricsEvent],
        ProfilerDotconsoleProfileFinished: js.Array[ConsoleProfileFinishedEvent],
        ProfilerDotconsoleProfileStarted: js.Array[ConsoleProfileStartedEvent],
        ProfilerDotpreciseCoverageDeltaUpdate: js.Array[PreciseCoverageDeltaUpdateEvent],
        RuntimeDotbindingCalled: js.Array[BindingCalledEvent],
        RuntimeDotconsoleAPICalled: js.Array[ConsoleAPICalledEvent],
        RuntimeDotexceptionRevoked: js.Array[ExceptionRevokedEvent],
        RuntimeDotexceptionThrown: js.Array[ExceptionThrownEvent],
        RuntimeDotexecutionContextCreated: js.Array[ExecutionContextCreatedEvent],
        RuntimeDotexecutionContextDestroyed: js.Array[ExecutionContextDestroyedEvent],
        RuntimeDotexecutionContextsCleared: js.Array[js.Any],
        RuntimeDotinspectRequested: js.Array[InspectRequestedEvent],
        SecurityDotcertificateError: js.Array[CertificateErrorEvent],
        SecurityDotsecurityStateChanged: js.Array[SecurityStateChangedEvent],
        SecurityDotvisibleSecurityStateChanged: js.Array[VisibleSecurityStateChangedEvent],
        ServiceWorkerDotworkerErrorReported: js.Array[WorkerErrorReportedEvent],
        ServiceWorkerDotworkerRegistrationUpdated: js.Array[WorkerRegistrationUpdatedEvent],
        ServiceWorkerDotworkerVersionUpdated: js.Array[WorkerVersionUpdatedEvent],
        StorageDotcacheStorageContentUpdated: js.Array[CacheStorageContentUpdatedEvent],
        StorageDotcacheStorageListUpdated: js.Array[CacheStorageListUpdatedEvent],
        StorageDotindexedDBContentUpdated: js.Array[IndexedDBContentUpdatedEvent],
        StorageDotindexedDBListUpdated: js.Array[IndexedDBListUpdatedEvent],
        TargetDotattachedToTarget: js.Array[AttachedToTargetEvent],
        TargetDotdetachedFromTarget: js.Array[DetachedFromTargetEvent],
        TargetDotreceivedMessageFromTarget: js.Array[ReceivedMessageFromTargetEvent],
        TargetDottargetCrashed: js.Array[TargetCrashedEvent],
        TargetDottargetCreated: js.Array[TargetCreatedEvent],
        TargetDottargetDestroyed: js.Array[TargetDestroyedEvent],
        TargetDottargetInfoChanged: js.Array[TargetInfoChangedEvent],
        TetheringDotaccepted: js.Array[AcceptedEvent],
        TracingDotbufferUsage: js.Array[BufferUsageEvent],
        TracingDotdataCollected: js.Array[DataCollectedEvent],
        TracingDottracingComplete: js.Array[TracingCompleteEvent],
        WebAudioDotaudioListenerCreated: js.Array[AudioListenerCreatedEvent],
        WebAudioDotaudioListenerWillBeDestroyed: js.Array[AudioListenerWillBeDestroyedEvent],
        WebAudioDotaudioNodeCreated: js.Array[AudioNodeCreatedEvent],
        WebAudioDotaudioNodeWillBeDestroyed: js.Array[AudioNodeWillBeDestroyedEvent],
        WebAudioDotaudioParamCreated: js.Array[AudioParamCreatedEvent],
        WebAudioDotaudioParamWillBeDestroyed: js.Array[AudioParamWillBeDestroyedEvent],
        WebAudioDotcontextChanged: js.Array[ContextChangedEvent],
        WebAudioDotcontextCreated: js.Array[ContextCreatedEvent],
        WebAudioDotcontextWillBeDestroyed: js.Array[ContextWillBeDestroyedEvent],
        WebAudioDotnodeParamConnected: js.Array[NodeParamConnectedEvent],
        WebAudioDotnodeParamDisconnected: js.Array[NodeParamDisconnectedEvent],
        WebAudioDotnodesConnected: js.Array[NodesConnectedEvent],
        WebAudioDotnodesDisconnected: js.Array[NodesDisconnectedEvent]
      ): Events = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("Animation.animationCanceled")(AnimationDotanimationCanceled.asInstanceOf[js.Any])
        __obj.updateDynamic("Animation.animationCreated")(AnimationDotanimationCreated.asInstanceOf[js.Any])
        __obj.updateDynamic("Animation.animationStarted")(AnimationDotanimationStarted.asInstanceOf[js.Any])
        __obj.updateDynamic("ApplicationCache.applicationCacheStatusUpdated")(ApplicationCacheDotapplicationCacheStatusUpdated.asInstanceOf[js.Any])
        __obj.updateDynamic("ApplicationCache.networkStateUpdated")(ApplicationCacheDotnetworkStateUpdated.asInstanceOf[js.Any])
        __obj.updateDynamic("Audits.issueAdded")(AuditsDotissueAdded.asInstanceOf[js.Any])
        __obj.updateDynamic("BackgroundService.backgroundServiceEventReceived")(BackgroundServiceDotbackgroundServiceEventReceived.asInstanceOf[js.Any])
        __obj.updateDynamic("BackgroundService.recordingStateChanged")(BackgroundServiceDotrecordingStateChanged.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.fontsUpdated")(CSSDotfontsUpdated.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.mediaQueryResultChanged")(CSSDotmediaQueryResultChanged.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.styleSheetAdded")(CSSDotstyleSheetAdded.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.styleSheetChanged")(CSSDotstyleSheetChanged.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.styleSheetRemoved")(CSSDotstyleSheetRemoved.asInstanceOf[js.Any])
        __obj.updateDynamic("Cast.issueUpdated")(CastDotissueUpdated.asInstanceOf[js.Any])
        __obj.updateDynamic("Cast.sinksUpdated")(CastDotsinksUpdated.asInstanceOf[js.Any])
        __obj.updateDynamic("Console.messageAdded")(ConsoleDotmessageAdded.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.attributeModified")(DOMDotattributeModified.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.attributeRemoved")(DOMDotattributeRemoved.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.characterDataModified")(DOMDotcharacterDataModified.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.childNodeCountUpdated")(DOMDotchildNodeCountUpdated.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.childNodeInserted")(DOMDotchildNodeInserted.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.childNodeRemoved")(DOMDotchildNodeRemoved.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.distributedNodesUpdated")(DOMDotdistributedNodesUpdated.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.documentUpdated")(DOMDotdocumentUpdated.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.inlineStyleInvalidated")(DOMDotinlineStyleInvalidated.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.pseudoElementAdded")(DOMDotpseudoElementAdded.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.pseudoElementRemoved")(DOMDotpseudoElementRemoved.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.setChildNodes")(DOMDotsetChildNodes.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.shadowRootPopped")(DOMDotshadowRootPopped.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.shadowRootPushed")(DOMDotshadowRootPushed.asInstanceOf[js.Any])
        __obj.updateDynamic("DOMStorage.domStorageItemAdded")(DOMStorageDotdomStorageItemAdded.asInstanceOf[js.Any])
        __obj.updateDynamic("DOMStorage.domStorageItemRemoved")(DOMStorageDotdomStorageItemRemoved.asInstanceOf[js.Any])
        __obj.updateDynamic("DOMStorage.domStorageItemUpdated")(DOMStorageDotdomStorageItemUpdated.asInstanceOf[js.Any])
        __obj.updateDynamic("DOMStorage.domStorageItemsCleared")(DOMStorageDotdomStorageItemsCleared.asInstanceOf[js.Any])
        __obj.updateDynamic("Database.addDatabase")(DatabaseDotaddDatabase.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.breakpointResolved")(DebuggerDotbreakpointResolved.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.paused")(DebuggerDotpaused.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.resumed")(DebuggerDotresumed.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.scriptFailedToParse")(DebuggerDotscriptFailedToParse.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.scriptParsed")(DebuggerDotscriptParsed.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.virtualTimeBudgetExpired")(EmulationDotvirtualTimeBudgetExpired.asInstanceOf[js.Any])
        __obj.updateDynamic("Fetch.authRequired")(FetchDotauthRequired.asInstanceOf[js.Any])
        __obj.updateDynamic("Fetch.requestPaused")(FetchDotrequestPaused.asInstanceOf[js.Any])
        __obj.updateDynamic("HeadlessExperimental.needsBeginFramesChanged")(HeadlessExperimentalDotneedsBeginFramesChanged.asInstanceOf[js.Any])
        __obj.updateDynamic("HeapProfiler.addHeapSnapshotChunk")(HeapProfilerDotaddHeapSnapshotChunk.asInstanceOf[js.Any])
        __obj.updateDynamic("HeapProfiler.heapStatsUpdate")(HeapProfilerDotheapStatsUpdate.asInstanceOf[js.Any])
        __obj.updateDynamic("HeapProfiler.lastSeenObjectId")(HeapProfilerDotlastSeenObjectId.asInstanceOf[js.Any])
        __obj.updateDynamic("HeapProfiler.reportHeapSnapshotProgress")(HeapProfilerDotreportHeapSnapshotProgress.asInstanceOf[js.Any])
        __obj.updateDynamic("HeapProfiler.resetProfiles")(HeapProfilerDotresetProfiles.asInstanceOf[js.Any])
        __obj.updateDynamic("Inspector.detached")(InspectorDotdetached.asInstanceOf[js.Any])
        __obj.updateDynamic("Inspector.targetCrashed")(InspectorDottargetCrashed.asInstanceOf[js.Any])
        __obj.updateDynamic("Inspector.targetReloadedAfterCrash")(InspectorDottargetReloadedAfterCrash.asInstanceOf[js.Any])
        __obj.updateDynamic("LayerTree.layerPainted")(LayerTreeDotlayerPainted.asInstanceOf[js.Any])
        __obj.updateDynamic("LayerTree.layerTreeDidChange")(LayerTreeDotlayerTreeDidChange.asInstanceOf[js.Any])
        __obj.updateDynamic("Log.entryAdded")(LogDotentryAdded.asInstanceOf[js.Any])
        __obj.updateDynamic("Media.playerErrorsRaised")(MediaDotplayerErrorsRaised.asInstanceOf[js.Any])
        __obj.updateDynamic("Media.playerEventsAdded")(MediaDotplayerEventsAdded.asInstanceOf[js.Any])
        __obj.updateDynamic("Media.playerMessagesLogged")(MediaDotplayerMessagesLogged.asInstanceOf[js.Any])
        __obj.updateDynamic("Media.playerPropertiesChanged")(MediaDotplayerPropertiesChanged.asInstanceOf[js.Any])
        __obj.updateDynamic("Media.playersCreated")(MediaDotplayersCreated.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.dataReceived")(NetworkDotdataReceived.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.eventSourceMessageReceived")(NetworkDoteventSourceMessageReceived.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.loadingFailed")(NetworkDotloadingFailed.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.loadingFinished")(NetworkDotloadingFinished.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.requestIntercepted")(NetworkDotrequestIntercepted.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.requestServedFromCache")(NetworkDotrequestServedFromCache.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.requestWillBeSent")(NetworkDotrequestWillBeSent.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.requestWillBeSentExtraInfo")(NetworkDotrequestWillBeSentExtraInfo.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.resourceChangedPriority")(NetworkDotresourceChangedPriority.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.responseReceived")(NetworkDotresponseReceived.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.responseReceivedExtraInfo")(NetworkDotresponseReceivedExtraInfo.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.signedExchangeReceived")(NetworkDotsignedExchangeReceived.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.webSocketClosed")(NetworkDotwebSocketClosed.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.webSocketCreated")(NetworkDotwebSocketCreated.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.webSocketFrameError")(NetworkDotwebSocketFrameError.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.webSocketFrameReceived")(NetworkDotwebSocketFrameReceived.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.webSocketFrameSent")(NetworkDotwebSocketFrameSent.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.webSocketHandshakeResponseReceived")(NetworkDotwebSocketHandshakeResponseReceived.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.webSocketWillSendHandshakeRequest")(NetworkDotwebSocketWillSendHandshakeRequest.asInstanceOf[js.Any])
        __obj.updateDynamic("Overlay.inspectModeCanceled")(OverlayDotinspectModeCanceled.asInstanceOf[js.Any])
        __obj.updateDynamic("Overlay.inspectNodeRequested")(OverlayDotinspectNodeRequested.asInstanceOf[js.Any])
        __obj.updateDynamic("Overlay.nodeHighlightRequested")(OverlayDotnodeHighlightRequested.asInstanceOf[js.Any])
        __obj.updateDynamic("Overlay.screenshotRequested")(OverlayDotscreenshotRequested.asInstanceOf[js.Any])
        __obj.updateDynamic("Page.compilationCacheProduced")(PageDotcompilationCacheProduced.asInstanceOf[js.Any])
        __obj.updateDynamic("Page.domContentEventFired")(PageDotdomContentEventFired.asInstanceOf[js.Any])
        __obj.updateDynamic("Page.downloadProgress")(PageDotdownloadProgress.asInstanceOf[js.Any])
        __obj.updateDynamic("Page.downloadWillBegin")(PageDotdownloadWillBegin.asInstanceOf[js.Any])
        __obj.updateDynamic("Page.fileChooserOpened")(PageDotfileChooserOpened.asInstanceOf[js.Any])
        __obj.updateDynamic("Page.frameAttached")(PageDotframeAttached.asInstanceOf[js.Any])
        __obj.updateDynamic("Page.frameClearedScheduledNavigation")(PageDotframeClearedScheduledNavigation.asInstanceOf[js.Any])
        __obj.updateDynamic("Page.frameDetached")(PageDotframeDetached.asInstanceOf[js.Any])
        __obj.updateDynamic("Page.frameNavigated")(PageDotframeNavigated.asInstanceOf[js.Any])
        __obj.updateDynamic("Page.frameRequestedNavigation")(PageDotframeRequestedNavigation.asInstanceOf[js.Any])
        __obj.updateDynamic("Page.frameResized")(PageDotframeResized.asInstanceOf[js.Any])
        __obj.updateDynamic("Page.frameScheduledNavigation")(PageDotframeScheduledNavigation.asInstanceOf[js.Any])
        __obj.updateDynamic("Page.frameStartedLoading")(PageDotframeStartedLoading.asInstanceOf[js.Any])
        __obj.updateDynamic("Page.frameStoppedLoading")(PageDotframeStoppedLoading.asInstanceOf[js.Any])
        __obj.updateDynamic("Page.interstitialHidden")(PageDotinterstitialHidden.asInstanceOf[js.Any])
        __obj.updateDynamic("Page.interstitialShown")(PageDotinterstitialShown.asInstanceOf[js.Any])
        __obj.updateDynamic("Page.javascriptDialogClosed")(PageDotjavascriptDialogClosed.asInstanceOf[js.Any])
        __obj.updateDynamic("Page.javascriptDialogOpening")(PageDotjavascriptDialogOpening.asInstanceOf[js.Any])
        __obj.updateDynamic("Page.lifecycleEvent")(PageDotlifecycleEvent.asInstanceOf[js.Any])
        __obj.updateDynamic("Page.loadEventFired")(PageDotloadEventFired.asInstanceOf[js.Any])
        __obj.updateDynamic("Page.navigatedWithinDocument")(PageDotnavigatedWithinDocument.asInstanceOf[js.Any])
        __obj.updateDynamic("Page.screencastFrame")(PageDotscreencastFrame.asInstanceOf[js.Any])
        __obj.updateDynamic("Page.screencastVisibilityChanged")(PageDotscreencastVisibilityChanged.asInstanceOf[js.Any])
        __obj.updateDynamic("Page.windowOpen")(PageDotwindowOpen.asInstanceOf[js.Any])
        __obj.updateDynamic("Performance.metrics")(PerformanceDotmetrics.asInstanceOf[js.Any])
        __obj.updateDynamic("Profiler.consoleProfileFinished")(ProfilerDotconsoleProfileFinished.asInstanceOf[js.Any])
        __obj.updateDynamic("Profiler.consoleProfileStarted")(ProfilerDotconsoleProfileStarted.asInstanceOf[js.Any])
        __obj.updateDynamic("Profiler.preciseCoverageDeltaUpdate")(ProfilerDotpreciseCoverageDeltaUpdate.asInstanceOf[js.Any])
        __obj.updateDynamic("Runtime.bindingCalled")(RuntimeDotbindingCalled.asInstanceOf[js.Any])
        __obj.updateDynamic("Runtime.consoleAPICalled")(RuntimeDotconsoleAPICalled.asInstanceOf[js.Any])
        __obj.updateDynamic("Runtime.exceptionRevoked")(RuntimeDotexceptionRevoked.asInstanceOf[js.Any])
        __obj.updateDynamic("Runtime.exceptionThrown")(RuntimeDotexceptionThrown.asInstanceOf[js.Any])
        __obj.updateDynamic("Runtime.executionContextCreated")(RuntimeDotexecutionContextCreated.asInstanceOf[js.Any])
        __obj.updateDynamic("Runtime.executionContextDestroyed")(RuntimeDotexecutionContextDestroyed.asInstanceOf[js.Any])
        __obj.updateDynamic("Runtime.executionContextsCleared")(RuntimeDotexecutionContextsCleared.asInstanceOf[js.Any])
        __obj.updateDynamic("Runtime.inspectRequested")(RuntimeDotinspectRequested.asInstanceOf[js.Any])
        __obj.updateDynamic("Security.certificateError")(SecurityDotcertificateError.asInstanceOf[js.Any])
        __obj.updateDynamic("Security.securityStateChanged")(SecurityDotsecurityStateChanged.asInstanceOf[js.Any])
        __obj.updateDynamic("Security.visibleSecurityStateChanged")(SecurityDotvisibleSecurityStateChanged.asInstanceOf[js.Any])
        __obj.updateDynamic("ServiceWorker.workerErrorReported")(ServiceWorkerDotworkerErrorReported.asInstanceOf[js.Any])
        __obj.updateDynamic("ServiceWorker.workerRegistrationUpdated")(ServiceWorkerDotworkerRegistrationUpdated.asInstanceOf[js.Any])
        __obj.updateDynamic("ServiceWorker.workerVersionUpdated")(ServiceWorkerDotworkerVersionUpdated.asInstanceOf[js.Any])
        __obj.updateDynamic("Storage.cacheStorageContentUpdated")(StorageDotcacheStorageContentUpdated.asInstanceOf[js.Any])
        __obj.updateDynamic("Storage.cacheStorageListUpdated")(StorageDotcacheStorageListUpdated.asInstanceOf[js.Any])
        __obj.updateDynamic("Storage.indexedDBContentUpdated")(StorageDotindexedDBContentUpdated.asInstanceOf[js.Any])
        __obj.updateDynamic("Storage.indexedDBListUpdated")(StorageDotindexedDBListUpdated.asInstanceOf[js.Any])
        __obj.updateDynamic("Target.attachedToTarget")(TargetDotattachedToTarget.asInstanceOf[js.Any])
        __obj.updateDynamic("Target.detachedFromTarget")(TargetDotdetachedFromTarget.asInstanceOf[js.Any])
        __obj.updateDynamic("Target.receivedMessageFromTarget")(TargetDotreceivedMessageFromTarget.asInstanceOf[js.Any])
        __obj.updateDynamic("Target.targetCrashed")(TargetDottargetCrashed.asInstanceOf[js.Any])
        __obj.updateDynamic("Target.targetCreated")(TargetDottargetCreated.asInstanceOf[js.Any])
        __obj.updateDynamic("Target.targetDestroyed")(TargetDottargetDestroyed.asInstanceOf[js.Any])
        __obj.updateDynamic("Target.targetInfoChanged")(TargetDottargetInfoChanged.asInstanceOf[js.Any])
        __obj.updateDynamic("Tethering.accepted")(TetheringDotaccepted.asInstanceOf[js.Any])
        __obj.updateDynamic("Tracing.bufferUsage")(TracingDotbufferUsage.asInstanceOf[js.Any])
        __obj.updateDynamic("Tracing.dataCollected")(TracingDotdataCollected.asInstanceOf[js.Any])
        __obj.updateDynamic("Tracing.tracingComplete")(TracingDottracingComplete.asInstanceOf[js.Any])
        __obj.updateDynamic("WebAudio.audioListenerCreated")(WebAudioDotaudioListenerCreated.asInstanceOf[js.Any])
        __obj.updateDynamic("WebAudio.audioListenerWillBeDestroyed")(WebAudioDotaudioListenerWillBeDestroyed.asInstanceOf[js.Any])
        __obj.updateDynamic("WebAudio.audioNodeCreated")(WebAudioDotaudioNodeCreated.asInstanceOf[js.Any])
        __obj.updateDynamic("WebAudio.audioNodeWillBeDestroyed")(WebAudioDotaudioNodeWillBeDestroyed.asInstanceOf[js.Any])
        __obj.updateDynamic("WebAudio.audioParamCreated")(WebAudioDotaudioParamCreated.asInstanceOf[js.Any])
        __obj.updateDynamic("WebAudio.audioParamWillBeDestroyed")(WebAudioDotaudioParamWillBeDestroyed.asInstanceOf[js.Any])
        __obj.updateDynamic("WebAudio.contextChanged")(WebAudioDotcontextChanged.asInstanceOf[js.Any])
        __obj.updateDynamic("WebAudio.contextCreated")(WebAudioDotcontextCreated.asInstanceOf[js.Any])
        __obj.updateDynamic("WebAudio.contextWillBeDestroyed")(WebAudioDotcontextWillBeDestroyed.asInstanceOf[js.Any])
        __obj.updateDynamic("WebAudio.nodeParamConnected")(WebAudioDotnodeParamConnected.asInstanceOf[js.Any])
        __obj.updateDynamic("WebAudio.nodeParamDisconnected")(WebAudioDotnodeParamDisconnected.asInstanceOf[js.Any])
        __obj.updateDynamic("WebAudio.nodesConnected")(WebAudioDotnodesConnected.asInstanceOf[js.Any])
        __obj.updateDynamic("WebAudio.nodesDisconnected")(WebAudioDotnodesDisconnected.asInstanceOf[js.Any])
        __obj.asInstanceOf[Events]
      }
      
      extension [Self <: Events](x: Self) {
        
        inline def setAnimationDotanimationCanceled(value: js.Array[AnimationCanceledEvent]): Self = StObject.set(x, "Animation.animationCanceled", value.asInstanceOf[js.Any])
        
        inline def setAnimationDotanimationCanceledVarargs(value: AnimationCanceledEvent*): Self = StObject.set(x, "Animation.animationCanceled", js.Array(value :_*))
        
        inline def setAnimationDotanimationCreated(value: js.Array[AnimationCreatedEvent]): Self = StObject.set(x, "Animation.animationCreated", value.asInstanceOf[js.Any])
        
        inline def setAnimationDotanimationCreatedVarargs(value: AnimationCreatedEvent*): Self = StObject.set(x, "Animation.animationCreated", js.Array(value :_*))
        
        inline def setAnimationDotanimationStarted(value: js.Array[AnimationStartedEvent]): Self = StObject.set(x, "Animation.animationStarted", value.asInstanceOf[js.Any])
        
        inline def setAnimationDotanimationStartedVarargs(value: AnimationStartedEvent*): Self = StObject.set(x, "Animation.animationStarted", js.Array(value :_*))
        
        inline def setApplicationCacheDotapplicationCacheStatusUpdated(value: js.Array[ApplicationCacheStatusUpdatedEvent]): Self = StObject.set(x, "ApplicationCache.applicationCacheStatusUpdated", value.asInstanceOf[js.Any])
        
        inline def setApplicationCacheDotapplicationCacheStatusUpdatedVarargs(value: ApplicationCacheStatusUpdatedEvent*): Self = StObject.set(x, "ApplicationCache.applicationCacheStatusUpdated", js.Array(value :_*))
        
        inline def setApplicationCacheDotnetworkStateUpdated(value: js.Array[NetworkStateUpdatedEvent]): Self = StObject.set(x, "ApplicationCache.networkStateUpdated", value.asInstanceOf[js.Any])
        
        inline def setApplicationCacheDotnetworkStateUpdatedVarargs(value: NetworkStateUpdatedEvent*): Self = StObject.set(x, "ApplicationCache.networkStateUpdated", js.Array(value :_*))
        
        inline def setAuditsDotissueAdded(value: js.Array[IssueAddedEvent]): Self = StObject.set(x, "Audits.issueAdded", value.asInstanceOf[js.Any])
        
        inline def setAuditsDotissueAddedVarargs(value: IssueAddedEvent*): Self = StObject.set(x, "Audits.issueAdded", js.Array(value :_*))
        
        inline def setBackgroundServiceDotbackgroundServiceEventReceived(value: js.Array[BackgroundServiceEventReceivedEvent]): Self = StObject.set(x, "BackgroundService.backgroundServiceEventReceived", value.asInstanceOf[js.Any])
        
        inline def setBackgroundServiceDotbackgroundServiceEventReceivedVarargs(value: BackgroundServiceEventReceivedEvent*): Self = StObject.set(x, "BackgroundService.backgroundServiceEventReceived", js.Array(value :_*))
        
        inline def setBackgroundServiceDotrecordingStateChanged(value: js.Array[RecordingStateChangedEvent]): Self = StObject.set(x, "BackgroundService.recordingStateChanged", value.asInstanceOf[js.Any])
        
        inline def setBackgroundServiceDotrecordingStateChangedVarargs(value: RecordingStateChangedEvent*): Self = StObject.set(x, "BackgroundService.recordingStateChanged", js.Array(value :_*))
        
        inline def setCSSDotfontsUpdated(value: js.Array[FontsUpdatedEvent]): Self = StObject.set(x, "CSS.fontsUpdated", value.asInstanceOf[js.Any])
        
        inline def setCSSDotfontsUpdatedVarargs(value: FontsUpdatedEvent*): Self = StObject.set(x, "CSS.fontsUpdated", js.Array(value :_*))
        
        inline def setCSSDotmediaQueryResultChanged(value: js.Array[js.Any]): Self = StObject.set(x, "CSS.mediaQueryResultChanged", value.asInstanceOf[js.Any])
        
        inline def setCSSDotmediaQueryResultChangedVarargs(value: js.Any*): Self = StObject.set(x, "CSS.mediaQueryResultChanged", js.Array(value :_*))
        
        inline def setCSSDotstyleSheetAdded(value: js.Array[StyleSheetAddedEvent]): Self = StObject.set(x, "CSS.styleSheetAdded", value.asInstanceOf[js.Any])
        
        inline def setCSSDotstyleSheetAddedVarargs(value: StyleSheetAddedEvent*): Self = StObject.set(x, "CSS.styleSheetAdded", js.Array(value :_*))
        
        inline def setCSSDotstyleSheetChanged(value: js.Array[StyleSheetChangedEvent]): Self = StObject.set(x, "CSS.styleSheetChanged", value.asInstanceOf[js.Any])
        
        inline def setCSSDotstyleSheetChangedVarargs(value: StyleSheetChangedEvent*): Self = StObject.set(x, "CSS.styleSheetChanged", js.Array(value :_*))
        
        inline def setCSSDotstyleSheetRemoved(value: js.Array[StyleSheetRemovedEvent]): Self = StObject.set(x, "CSS.styleSheetRemoved", value.asInstanceOf[js.Any])
        
        inline def setCSSDotstyleSheetRemovedVarargs(value: StyleSheetRemovedEvent*): Self = StObject.set(x, "CSS.styleSheetRemoved", js.Array(value :_*))
        
        inline def setCastDotissueUpdated(value: js.Array[IssueUpdatedEvent]): Self = StObject.set(x, "Cast.issueUpdated", value.asInstanceOf[js.Any])
        
        inline def setCastDotissueUpdatedVarargs(value: IssueUpdatedEvent*): Self = StObject.set(x, "Cast.issueUpdated", js.Array(value :_*))
        
        inline def setCastDotsinksUpdated(value: js.Array[SinksUpdatedEvent]): Self = StObject.set(x, "Cast.sinksUpdated", value.asInstanceOf[js.Any])
        
        inline def setCastDotsinksUpdatedVarargs(value: SinksUpdatedEvent*): Self = StObject.set(x, "Cast.sinksUpdated", js.Array(value :_*))
        
        inline def setConsoleDotmessageAdded(value: js.Array[MessageAddedEvent]): Self = StObject.set(x, "Console.messageAdded", value.asInstanceOf[js.Any])
        
        inline def setConsoleDotmessageAddedVarargs(value: MessageAddedEvent*): Self = StObject.set(x, "Console.messageAdded", js.Array(value :_*))
        
        inline def setDOMDotattributeModified(value: js.Array[AttributeModifiedEvent]): Self = StObject.set(x, "DOM.attributeModified", value.asInstanceOf[js.Any])
        
        inline def setDOMDotattributeModifiedVarargs(value: AttributeModifiedEvent*): Self = StObject.set(x, "DOM.attributeModified", js.Array(value :_*))
        
        inline def setDOMDotattributeRemoved(value: js.Array[AttributeRemovedEvent]): Self = StObject.set(x, "DOM.attributeRemoved", value.asInstanceOf[js.Any])
        
        inline def setDOMDotattributeRemovedVarargs(value: AttributeRemovedEvent*): Self = StObject.set(x, "DOM.attributeRemoved", js.Array(value :_*))
        
        inline def setDOMDotcharacterDataModified(value: js.Array[CharacterDataModifiedEvent]): Self = StObject.set(x, "DOM.characterDataModified", value.asInstanceOf[js.Any])
        
        inline def setDOMDotcharacterDataModifiedVarargs(value: CharacterDataModifiedEvent*): Self = StObject.set(x, "DOM.characterDataModified", js.Array(value :_*))
        
        inline def setDOMDotchildNodeCountUpdated(value: js.Array[ChildNodeCountUpdatedEvent]): Self = StObject.set(x, "DOM.childNodeCountUpdated", value.asInstanceOf[js.Any])
        
        inline def setDOMDotchildNodeCountUpdatedVarargs(value: ChildNodeCountUpdatedEvent*): Self = StObject.set(x, "DOM.childNodeCountUpdated", js.Array(value :_*))
        
        inline def setDOMDotchildNodeInserted(value: js.Array[ChildNodeInsertedEvent]): Self = StObject.set(x, "DOM.childNodeInserted", value.asInstanceOf[js.Any])
        
        inline def setDOMDotchildNodeInsertedVarargs(value: ChildNodeInsertedEvent*): Self = StObject.set(x, "DOM.childNodeInserted", js.Array(value :_*))
        
        inline def setDOMDotchildNodeRemoved(value: js.Array[ChildNodeRemovedEvent]): Self = StObject.set(x, "DOM.childNodeRemoved", value.asInstanceOf[js.Any])
        
        inline def setDOMDotchildNodeRemovedVarargs(value: ChildNodeRemovedEvent*): Self = StObject.set(x, "DOM.childNodeRemoved", js.Array(value :_*))
        
        inline def setDOMDotdistributedNodesUpdated(value: js.Array[DistributedNodesUpdatedEvent]): Self = StObject.set(x, "DOM.distributedNodesUpdated", value.asInstanceOf[js.Any])
        
        inline def setDOMDotdistributedNodesUpdatedVarargs(value: DistributedNodesUpdatedEvent*): Self = StObject.set(x, "DOM.distributedNodesUpdated", js.Array(value :_*))
        
        inline def setDOMDotdocumentUpdated(value: js.Array[js.Any]): Self = StObject.set(x, "DOM.documentUpdated", value.asInstanceOf[js.Any])
        
        inline def setDOMDotdocumentUpdatedVarargs(value: js.Any*): Self = StObject.set(x, "DOM.documentUpdated", js.Array(value :_*))
        
        inline def setDOMDotinlineStyleInvalidated(value: js.Array[InlineStyleInvalidatedEvent]): Self = StObject.set(x, "DOM.inlineStyleInvalidated", value.asInstanceOf[js.Any])
        
        inline def setDOMDotinlineStyleInvalidatedVarargs(value: InlineStyleInvalidatedEvent*): Self = StObject.set(x, "DOM.inlineStyleInvalidated", js.Array(value :_*))
        
        inline def setDOMDotpseudoElementAdded(value: js.Array[PseudoElementAddedEvent]): Self = StObject.set(x, "DOM.pseudoElementAdded", value.asInstanceOf[js.Any])
        
        inline def setDOMDotpseudoElementAddedVarargs(value: PseudoElementAddedEvent*): Self = StObject.set(x, "DOM.pseudoElementAdded", js.Array(value :_*))
        
        inline def setDOMDotpseudoElementRemoved(value: js.Array[PseudoElementRemovedEvent]): Self = StObject.set(x, "DOM.pseudoElementRemoved", value.asInstanceOf[js.Any])
        
        inline def setDOMDotpseudoElementRemovedVarargs(value: PseudoElementRemovedEvent*): Self = StObject.set(x, "DOM.pseudoElementRemoved", js.Array(value :_*))
        
        inline def setDOMDotsetChildNodes(value: js.Array[SetChildNodesEvent]): Self = StObject.set(x, "DOM.setChildNodes", value.asInstanceOf[js.Any])
        
        inline def setDOMDotsetChildNodesVarargs(value: SetChildNodesEvent*): Self = StObject.set(x, "DOM.setChildNodes", js.Array(value :_*))
        
        inline def setDOMDotshadowRootPopped(value: js.Array[ShadowRootPoppedEvent]): Self = StObject.set(x, "DOM.shadowRootPopped", value.asInstanceOf[js.Any])
        
        inline def setDOMDotshadowRootPoppedVarargs(value: ShadowRootPoppedEvent*): Self = StObject.set(x, "DOM.shadowRootPopped", js.Array(value :_*))
        
        inline def setDOMDotshadowRootPushed(value: js.Array[ShadowRootPushedEvent]): Self = StObject.set(x, "DOM.shadowRootPushed", value.asInstanceOf[js.Any])
        
        inline def setDOMDotshadowRootPushedVarargs(value: ShadowRootPushedEvent*): Self = StObject.set(x, "DOM.shadowRootPushed", js.Array(value :_*))
        
        inline def setDOMStorageDotdomStorageItemAdded(value: js.Array[DomStorageItemAddedEvent]): Self = StObject.set(x, "DOMStorage.domStorageItemAdded", value.asInstanceOf[js.Any])
        
        inline def setDOMStorageDotdomStorageItemAddedVarargs(value: DomStorageItemAddedEvent*): Self = StObject.set(x, "DOMStorage.domStorageItemAdded", js.Array(value :_*))
        
        inline def setDOMStorageDotdomStorageItemRemoved(value: js.Array[DomStorageItemRemovedEvent]): Self = StObject.set(x, "DOMStorage.domStorageItemRemoved", value.asInstanceOf[js.Any])
        
        inline def setDOMStorageDotdomStorageItemRemovedVarargs(value: DomStorageItemRemovedEvent*): Self = StObject.set(x, "DOMStorage.domStorageItemRemoved", js.Array(value :_*))
        
        inline def setDOMStorageDotdomStorageItemUpdated(value: js.Array[DomStorageItemUpdatedEvent]): Self = StObject.set(x, "DOMStorage.domStorageItemUpdated", value.asInstanceOf[js.Any])
        
        inline def setDOMStorageDotdomStorageItemUpdatedVarargs(value: DomStorageItemUpdatedEvent*): Self = StObject.set(x, "DOMStorage.domStorageItemUpdated", js.Array(value :_*))
        
        inline def setDOMStorageDotdomStorageItemsCleared(value: js.Array[DomStorageItemsClearedEvent]): Self = StObject.set(x, "DOMStorage.domStorageItemsCleared", value.asInstanceOf[js.Any])
        
        inline def setDOMStorageDotdomStorageItemsClearedVarargs(value: DomStorageItemsClearedEvent*): Self = StObject.set(x, "DOMStorage.domStorageItemsCleared", js.Array(value :_*))
        
        inline def setDatabaseDotaddDatabase(value: js.Array[AddDatabaseEvent]): Self = StObject.set(x, "Database.addDatabase", value.asInstanceOf[js.Any])
        
        inline def setDatabaseDotaddDatabaseVarargs(value: AddDatabaseEvent*): Self = StObject.set(x, "Database.addDatabase", js.Array(value :_*))
        
        inline def setDebuggerDotbreakpointResolved(value: js.Array[BreakpointResolvedEvent]): Self = StObject.set(x, "Debugger.breakpointResolved", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotbreakpointResolvedVarargs(value: BreakpointResolvedEvent*): Self = StObject.set(x, "Debugger.breakpointResolved", js.Array(value :_*))
        
        inline def setDebuggerDotpaused(value: js.Array[PausedEvent]): Self = StObject.set(x, "Debugger.paused", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotpausedVarargs(value: PausedEvent*): Self = StObject.set(x, "Debugger.paused", js.Array(value :_*))
        
        inline def setDebuggerDotresumed(value: js.Array[js.Any]): Self = StObject.set(x, "Debugger.resumed", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotresumedVarargs(value: js.Any*): Self = StObject.set(x, "Debugger.resumed", js.Array(value :_*))
        
        inline def setDebuggerDotscriptFailedToParse(value: js.Array[ScriptFailedToParseEvent]): Self = StObject.set(x, "Debugger.scriptFailedToParse", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotscriptFailedToParseVarargs(value: ScriptFailedToParseEvent*): Self = StObject.set(x, "Debugger.scriptFailedToParse", js.Array(value :_*))
        
        inline def setDebuggerDotscriptParsed(value: js.Array[ScriptParsedEvent]): Self = StObject.set(x, "Debugger.scriptParsed", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotscriptParsedVarargs(value: ScriptParsedEvent*): Self = StObject.set(x, "Debugger.scriptParsed", js.Array(value :_*))
        
        inline def setEmulationDotvirtualTimeBudgetExpired(value: js.Array[js.Any]): Self = StObject.set(x, "Emulation.virtualTimeBudgetExpired", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotvirtualTimeBudgetExpiredVarargs(value: js.Any*): Self = StObject.set(x, "Emulation.virtualTimeBudgetExpired", js.Array(value :_*))
        
        inline def setFetchDotauthRequired(value: js.Array[AuthRequiredEvent]): Self = StObject.set(x, "Fetch.authRequired", value.asInstanceOf[js.Any])
        
        inline def setFetchDotauthRequiredVarargs(value: AuthRequiredEvent*): Self = StObject.set(x, "Fetch.authRequired", js.Array(value :_*))
        
        inline def setFetchDotrequestPaused(value: js.Array[RequestPausedEvent]): Self = StObject.set(x, "Fetch.requestPaused", value.asInstanceOf[js.Any])
        
        inline def setFetchDotrequestPausedVarargs(value: RequestPausedEvent*): Self = StObject.set(x, "Fetch.requestPaused", js.Array(value :_*))
        
        inline def setHeadlessExperimentalDotneedsBeginFramesChanged(value: js.Array[NeedsBeginFramesChangedEvent]): Self = StObject.set(x, "HeadlessExperimental.needsBeginFramesChanged", value.asInstanceOf[js.Any])
        
        inline def setHeadlessExperimentalDotneedsBeginFramesChangedVarargs(value: NeedsBeginFramesChangedEvent*): Self = StObject.set(x, "HeadlessExperimental.needsBeginFramesChanged", js.Array(value :_*))
        
        inline def setHeapProfilerDotaddHeapSnapshotChunk(value: js.Array[AddHeapSnapshotChunkEvent]): Self = StObject.set(x, "HeapProfiler.addHeapSnapshotChunk", value.asInstanceOf[js.Any])
        
        inline def setHeapProfilerDotaddHeapSnapshotChunkVarargs(value: AddHeapSnapshotChunkEvent*): Self = StObject.set(x, "HeapProfiler.addHeapSnapshotChunk", js.Array(value :_*))
        
        inline def setHeapProfilerDotheapStatsUpdate(value: js.Array[HeapStatsUpdateEvent]): Self = StObject.set(x, "HeapProfiler.heapStatsUpdate", value.asInstanceOf[js.Any])
        
        inline def setHeapProfilerDotheapStatsUpdateVarargs(value: HeapStatsUpdateEvent*): Self = StObject.set(x, "HeapProfiler.heapStatsUpdate", js.Array(value :_*))
        
        inline def setHeapProfilerDotlastSeenObjectId(value: js.Array[LastSeenObjectIdEvent]): Self = StObject.set(x, "HeapProfiler.lastSeenObjectId", value.asInstanceOf[js.Any])
        
        inline def setHeapProfilerDotlastSeenObjectIdVarargs(value: LastSeenObjectIdEvent*): Self = StObject.set(x, "HeapProfiler.lastSeenObjectId", js.Array(value :_*))
        
        inline def setHeapProfilerDotreportHeapSnapshotProgress(value: js.Array[ReportHeapSnapshotProgressEvent]): Self = StObject.set(x, "HeapProfiler.reportHeapSnapshotProgress", value.asInstanceOf[js.Any])
        
        inline def setHeapProfilerDotreportHeapSnapshotProgressVarargs(value: ReportHeapSnapshotProgressEvent*): Self = StObject.set(x, "HeapProfiler.reportHeapSnapshotProgress", js.Array(value :_*))
        
        inline def setHeapProfilerDotresetProfiles(value: js.Array[js.Any]): Self = StObject.set(x, "HeapProfiler.resetProfiles", value.asInstanceOf[js.Any])
        
        inline def setHeapProfilerDotresetProfilesVarargs(value: js.Any*): Self = StObject.set(x, "HeapProfiler.resetProfiles", js.Array(value :_*))
        
        inline def setInspectorDotdetached(value: js.Array[DetachedEvent]): Self = StObject.set(x, "Inspector.detached", value.asInstanceOf[js.Any])
        
        inline def setInspectorDotdetachedVarargs(value: DetachedEvent*): Self = StObject.set(x, "Inspector.detached", js.Array(value :_*))
        
        inline def setInspectorDottargetCrashed(value: js.Array[js.Any]): Self = StObject.set(x, "Inspector.targetCrashed", value.asInstanceOf[js.Any])
        
        inline def setInspectorDottargetCrashedVarargs(value: js.Any*): Self = StObject.set(x, "Inspector.targetCrashed", js.Array(value :_*))
        
        inline def setInspectorDottargetReloadedAfterCrash(value: js.Array[js.Any]): Self = StObject.set(x, "Inspector.targetReloadedAfterCrash", value.asInstanceOf[js.Any])
        
        inline def setInspectorDottargetReloadedAfterCrashVarargs(value: js.Any*): Self = StObject.set(x, "Inspector.targetReloadedAfterCrash", js.Array(value :_*))
        
        inline def setLayerTreeDotlayerPainted(value: js.Array[LayerPaintedEvent]): Self = StObject.set(x, "LayerTree.layerPainted", value.asInstanceOf[js.Any])
        
        inline def setLayerTreeDotlayerPaintedVarargs(value: LayerPaintedEvent*): Self = StObject.set(x, "LayerTree.layerPainted", js.Array(value :_*))
        
        inline def setLayerTreeDotlayerTreeDidChange(value: js.Array[LayerTreeDidChangeEvent]): Self = StObject.set(x, "LayerTree.layerTreeDidChange", value.asInstanceOf[js.Any])
        
        inline def setLayerTreeDotlayerTreeDidChangeVarargs(value: LayerTreeDidChangeEvent*): Self = StObject.set(x, "LayerTree.layerTreeDidChange", js.Array(value :_*))
        
        inline def setLogDotentryAdded(value: js.Array[EntryAddedEvent]): Self = StObject.set(x, "Log.entryAdded", value.asInstanceOf[js.Any])
        
        inline def setLogDotentryAddedVarargs(value: EntryAddedEvent*): Self = StObject.set(x, "Log.entryAdded", js.Array(value :_*))
        
        inline def setMediaDotplayerErrorsRaised(value: js.Array[PlayerErrorsRaisedEvent]): Self = StObject.set(x, "Media.playerErrorsRaised", value.asInstanceOf[js.Any])
        
        inline def setMediaDotplayerErrorsRaisedVarargs(value: PlayerErrorsRaisedEvent*): Self = StObject.set(x, "Media.playerErrorsRaised", js.Array(value :_*))
        
        inline def setMediaDotplayerEventsAdded(value: js.Array[PlayerEventsAddedEvent]): Self = StObject.set(x, "Media.playerEventsAdded", value.asInstanceOf[js.Any])
        
        inline def setMediaDotplayerEventsAddedVarargs(value: PlayerEventsAddedEvent*): Self = StObject.set(x, "Media.playerEventsAdded", js.Array(value :_*))
        
        inline def setMediaDotplayerMessagesLogged(value: js.Array[PlayerMessagesLoggedEvent]): Self = StObject.set(x, "Media.playerMessagesLogged", value.asInstanceOf[js.Any])
        
        inline def setMediaDotplayerMessagesLoggedVarargs(value: PlayerMessagesLoggedEvent*): Self = StObject.set(x, "Media.playerMessagesLogged", js.Array(value :_*))
        
        inline def setMediaDotplayerPropertiesChanged(value: js.Array[PlayerPropertiesChangedEvent]): Self = StObject.set(x, "Media.playerPropertiesChanged", value.asInstanceOf[js.Any])
        
        inline def setMediaDotplayerPropertiesChangedVarargs(value: PlayerPropertiesChangedEvent*): Self = StObject.set(x, "Media.playerPropertiesChanged", js.Array(value :_*))
        
        inline def setMediaDotplayersCreated(value: js.Array[PlayersCreatedEvent]): Self = StObject.set(x, "Media.playersCreated", value.asInstanceOf[js.Any])
        
        inline def setMediaDotplayersCreatedVarargs(value: PlayersCreatedEvent*): Self = StObject.set(x, "Media.playersCreated", js.Array(value :_*))
        
        inline def setNetworkDotdataReceived(value: js.Array[DataReceivedEvent]): Self = StObject.set(x, "Network.dataReceived", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotdataReceivedVarargs(value: DataReceivedEvent*): Self = StObject.set(x, "Network.dataReceived", js.Array(value :_*))
        
        inline def setNetworkDoteventSourceMessageReceived(value: js.Array[EventSourceMessageReceivedEvent]): Self = StObject.set(x, "Network.eventSourceMessageReceived", value.asInstanceOf[js.Any])
        
        inline def setNetworkDoteventSourceMessageReceivedVarargs(value: EventSourceMessageReceivedEvent*): Self = StObject.set(x, "Network.eventSourceMessageReceived", js.Array(value :_*))
        
        inline def setNetworkDotloadingFailed(value: js.Array[LoadingFailedEvent]): Self = StObject.set(x, "Network.loadingFailed", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotloadingFailedVarargs(value: LoadingFailedEvent*): Self = StObject.set(x, "Network.loadingFailed", js.Array(value :_*))
        
        inline def setNetworkDotloadingFinished(value: js.Array[LoadingFinishedEvent]): Self = StObject.set(x, "Network.loadingFinished", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotloadingFinishedVarargs(value: LoadingFinishedEvent*): Self = StObject.set(x, "Network.loadingFinished", js.Array(value :_*))
        
        inline def setNetworkDotrequestIntercepted(value: js.Array[RequestInterceptedEvent]): Self = StObject.set(x, "Network.requestIntercepted", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotrequestInterceptedVarargs(value: RequestInterceptedEvent*): Self = StObject.set(x, "Network.requestIntercepted", js.Array(value :_*))
        
        inline def setNetworkDotrequestServedFromCache(value: js.Array[RequestServedFromCacheEvent]): Self = StObject.set(x, "Network.requestServedFromCache", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotrequestServedFromCacheVarargs(value: RequestServedFromCacheEvent*): Self = StObject.set(x, "Network.requestServedFromCache", js.Array(value :_*))
        
        inline def setNetworkDotrequestWillBeSent(value: js.Array[RequestWillBeSentEvent]): Self = StObject.set(x, "Network.requestWillBeSent", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotrequestWillBeSentExtraInfo(value: js.Array[RequestWillBeSentExtraInfoEvent]): Self = StObject.set(x, "Network.requestWillBeSentExtraInfo", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotrequestWillBeSentExtraInfoVarargs(value: RequestWillBeSentExtraInfoEvent*): Self = StObject.set(x, "Network.requestWillBeSentExtraInfo", js.Array(value :_*))
        
        inline def setNetworkDotrequestWillBeSentVarargs(value: RequestWillBeSentEvent*): Self = StObject.set(x, "Network.requestWillBeSent", js.Array(value :_*))
        
        inline def setNetworkDotresourceChangedPriority(value: js.Array[ResourceChangedPriorityEvent]): Self = StObject.set(x, "Network.resourceChangedPriority", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotresourceChangedPriorityVarargs(value: ResourceChangedPriorityEvent*): Self = StObject.set(x, "Network.resourceChangedPriority", js.Array(value :_*))
        
        inline def setNetworkDotresponseReceived(value: js.Array[ResponseReceivedEvent]): Self = StObject.set(x, "Network.responseReceived", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotresponseReceivedExtraInfo(value: js.Array[ResponseReceivedExtraInfoEvent]): Self = StObject.set(x, "Network.responseReceivedExtraInfo", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotresponseReceivedExtraInfoVarargs(value: ResponseReceivedExtraInfoEvent*): Self = StObject.set(x, "Network.responseReceivedExtraInfo", js.Array(value :_*))
        
        inline def setNetworkDotresponseReceivedVarargs(value: ResponseReceivedEvent*): Self = StObject.set(x, "Network.responseReceived", js.Array(value :_*))
        
        inline def setNetworkDotsignedExchangeReceived(value: js.Array[SignedExchangeReceivedEvent]): Self = StObject.set(x, "Network.signedExchangeReceived", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotsignedExchangeReceivedVarargs(value: SignedExchangeReceivedEvent*): Self = StObject.set(x, "Network.signedExchangeReceived", js.Array(value :_*))
        
        inline def setNetworkDotwebSocketClosed(value: js.Array[WebSocketClosedEvent]): Self = StObject.set(x, "Network.webSocketClosed", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotwebSocketClosedVarargs(value: WebSocketClosedEvent*): Self = StObject.set(x, "Network.webSocketClosed", js.Array(value :_*))
        
        inline def setNetworkDotwebSocketCreated(value: js.Array[WebSocketCreatedEvent]): Self = StObject.set(x, "Network.webSocketCreated", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotwebSocketCreatedVarargs(value: WebSocketCreatedEvent*): Self = StObject.set(x, "Network.webSocketCreated", js.Array(value :_*))
        
        inline def setNetworkDotwebSocketFrameError(value: js.Array[WebSocketFrameErrorEvent]): Self = StObject.set(x, "Network.webSocketFrameError", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotwebSocketFrameErrorVarargs(value: WebSocketFrameErrorEvent*): Self = StObject.set(x, "Network.webSocketFrameError", js.Array(value :_*))
        
        inline def setNetworkDotwebSocketFrameReceived(value: js.Array[WebSocketFrameReceivedEvent]): Self = StObject.set(x, "Network.webSocketFrameReceived", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotwebSocketFrameReceivedVarargs(value: WebSocketFrameReceivedEvent*): Self = StObject.set(x, "Network.webSocketFrameReceived", js.Array(value :_*))
        
        inline def setNetworkDotwebSocketFrameSent(value: js.Array[WebSocketFrameSentEvent]): Self = StObject.set(x, "Network.webSocketFrameSent", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotwebSocketFrameSentVarargs(value: WebSocketFrameSentEvent*): Self = StObject.set(x, "Network.webSocketFrameSent", js.Array(value :_*))
        
        inline def setNetworkDotwebSocketHandshakeResponseReceived(value: js.Array[WebSocketHandshakeResponseReceivedEvent]): Self = StObject.set(x, "Network.webSocketHandshakeResponseReceived", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotwebSocketHandshakeResponseReceivedVarargs(value: WebSocketHandshakeResponseReceivedEvent*): Self = StObject.set(x, "Network.webSocketHandshakeResponseReceived", js.Array(value :_*))
        
        inline def setNetworkDotwebSocketWillSendHandshakeRequest(value: js.Array[WebSocketWillSendHandshakeRequestEvent]): Self = StObject.set(x, "Network.webSocketWillSendHandshakeRequest", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotwebSocketWillSendHandshakeRequestVarargs(value: WebSocketWillSendHandshakeRequestEvent*): Self = StObject.set(x, "Network.webSocketWillSendHandshakeRequest", js.Array(value :_*))
        
        inline def setOverlayDotinspectModeCanceled(value: js.Array[js.Any]): Self = StObject.set(x, "Overlay.inspectModeCanceled", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotinspectModeCanceledVarargs(value: js.Any*): Self = StObject.set(x, "Overlay.inspectModeCanceled", js.Array(value :_*))
        
        inline def setOverlayDotinspectNodeRequested(value: js.Array[InspectNodeRequestedEvent]): Self = StObject.set(x, "Overlay.inspectNodeRequested", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotinspectNodeRequestedVarargs(value: InspectNodeRequestedEvent*): Self = StObject.set(x, "Overlay.inspectNodeRequested", js.Array(value :_*))
        
        inline def setOverlayDotnodeHighlightRequested(value: js.Array[NodeHighlightRequestedEvent]): Self = StObject.set(x, "Overlay.nodeHighlightRequested", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotnodeHighlightRequestedVarargs(value: NodeHighlightRequestedEvent*): Self = StObject.set(x, "Overlay.nodeHighlightRequested", js.Array(value :_*))
        
        inline def setOverlayDotscreenshotRequested(value: js.Array[ScreenshotRequestedEvent]): Self = StObject.set(x, "Overlay.screenshotRequested", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotscreenshotRequestedVarargs(value: ScreenshotRequestedEvent*): Self = StObject.set(x, "Overlay.screenshotRequested", js.Array(value :_*))
        
        inline def setPageDotcompilationCacheProduced(value: js.Array[CompilationCacheProducedEvent]): Self = StObject.set(x, "Page.compilationCacheProduced", value.asInstanceOf[js.Any])
        
        inline def setPageDotcompilationCacheProducedVarargs(value: CompilationCacheProducedEvent*): Self = StObject.set(x, "Page.compilationCacheProduced", js.Array(value :_*))
        
        inline def setPageDotdomContentEventFired(value: js.Array[DomContentEventFiredEvent]): Self = StObject.set(x, "Page.domContentEventFired", value.asInstanceOf[js.Any])
        
        inline def setPageDotdomContentEventFiredVarargs(value: DomContentEventFiredEvent*): Self = StObject.set(x, "Page.domContentEventFired", js.Array(value :_*))
        
        inline def setPageDotdownloadProgress(value: js.Array[DownloadProgressEvent]): Self = StObject.set(x, "Page.downloadProgress", value.asInstanceOf[js.Any])
        
        inline def setPageDotdownloadProgressVarargs(value: DownloadProgressEvent*): Self = StObject.set(x, "Page.downloadProgress", js.Array(value :_*))
        
        inline def setPageDotdownloadWillBegin(value: js.Array[DownloadWillBeginEvent]): Self = StObject.set(x, "Page.downloadWillBegin", value.asInstanceOf[js.Any])
        
        inline def setPageDotdownloadWillBeginVarargs(value: DownloadWillBeginEvent*): Self = StObject.set(x, "Page.downloadWillBegin", js.Array(value :_*))
        
        inline def setPageDotfileChooserOpened(value: js.Array[FileChooserOpenedEvent]): Self = StObject.set(x, "Page.fileChooserOpened", value.asInstanceOf[js.Any])
        
        inline def setPageDotfileChooserOpenedVarargs(value: FileChooserOpenedEvent*): Self = StObject.set(x, "Page.fileChooserOpened", js.Array(value :_*))
        
        inline def setPageDotframeAttached(value: js.Array[FrameAttachedEvent]): Self = StObject.set(x, "Page.frameAttached", value.asInstanceOf[js.Any])
        
        inline def setPageDotframeAttachedVarargs(value: FrameAttachedEvent*): Self = StObject.set(x, "Page.frameAttached", js.Array(value :_*))
        
        inline def setPageDotframeClearedScheduledNavigation(value: js.Array[FrameClearedScheduledNavigationEvent]): Self = StObject.set(x, "Page.frameClearedScheduledNavigation", value.asInstanceOf[js.Any])
        
        inline def setPageDotframeClearedScheduledNavigationVarargs(value: FrameClearedScheduledNavigationEvent*): Self = StObject.set(x, "Page.frameClearedScheduledNavigation", js.Array(value :_*))
        
        inline def setPageDotframeDetached(value: js.Array[FrameDetachedEvent]): Self = StObject.set(x, "Page.frameDetached", value.asInstanceOf[js.Any])
        
        inline def setPageDotframeDetachedVarargs(value: FrameDetachedEvent*): Self = StObject.set(x, "Page.frameDetached", js.Array(value :_*))
        
        inline def setPageDotframeNavigated(value: js.Array[FrameNavigatedEvent]): Self = StObject.set(x, "Page.frameNavigated", value.asInstanceOf[js.Any])
        
        inline def setPageDotframeNavigatedVarargs(value: FrameNavigatedEvent*): Self = StObject.set(x, "Page.frameNavigated", js.Array(value :_*))
        
        inline def setPageDotframeRequestedNavigation(value: js.Array[FrameRequestedNavigationEvent]): Self = StObject.set(x, "Page.frameRequestedNavigation", value.asInstanceOf[js.Any])
        
        inline def setPageDotframeRequestedNavigationVarargs(value: FrameRequestedNavigationEvent*): Self = StObject.set(x, "Page.frameRequestedNavigation", js.Array(value :_*))
        
        inline def setPageDotframeResized(value: js.Array[js.Any]): Self = StObject.set(x, "Page.frameResized", value.asInstanceOf[js.Any])
        
        inline def setPageDotframeResizedVarargs(value: js.Any*): Self = StObject.set(x, "Page.frameResized", js.Array(value :_*))
        
        inline def setPageDotframeScheduledNavigation(value: js.Array[FrameScheduledNavigationEvent]): Self = StObject.set(x, "Page.frameScheduledNavigation", value.asInstanceOf[js.Any])
        
        inline def setPageDotframeScheduledNavigationVarargs(value: FrameScheduledNavigationEvent*): Self = StObject.set(x, "Page.frameScheduledNavigation", js.Array(value :_*))
        
        inline def setPageDotframeStartedLoading(value: js.Array[FrameStartedLoadingEvent]): Self = StObject.set(x, "Page.frameStartedLoading", value.asInstanceOf[js.Any])
        
        inline def setPageDotframeStartedLoadingVarargs(value: FrameStartedLoadingEvent*): Self = StObject.set(x, "Page.frameStartedLoading", js.Array(value :_*))
        
        inline def setPageDotframeStoppedLoading(value: js.Array[FrameStoppedLoadingEvent]): Self = StObject.set(x, "Page.frameStoppedLoading", value.asInstanceOf[js.Any])
        
        inline def setPageDotframeStoppedLoadingVarargs(value: FrameStoppedLoadingEvent*): Self = StObject.set(x, "Page.frameStoppedLoading", js.Array(value :_*))
        
        inline def setPageDotinterstitialHidden(value: js.Array[js.Any]): Self = StObject.set(x, "Page.interstitialHidden", value.asInstanceOf[js.Any])
        
        inline def setPageDotinterstitialHiddenVarargs(value: js.Any*): Self = StObject.set(x, "Page.interstitialHidden", js.Array(value :_*))
        
        inline def setPageDotinterstitialShown(value: js.Array[js.Any]): Self = StObject.set(x, "Page.interstitialShown", value.asInstanceOf[js.Any])
        
        inline def setPageDotinterstitialShownVarargs(value: js.Any*): Self = StObject.set(x, "Page.interstitialShown", js.Array(value :_*))
        
        inline def setPageDotjavascriptDialogClosed(value: js.Array[JavascriptDialogClosedEvent]): Self = StObject.set(x, "Page.javascriptDialogClosed", value.asInstanceOf[js.Any])
        
        inline def setPageDotjavascriptDialogClosedVarargs(value: JavascriptDialogClosedEvent*): Self = StObject.set(x, "Page.javascriptDialogClosed", js.Array(value :_*))
        
        inline def setPageDotjavascriptDialogOpening(value: js.Array[JavascriptDialogOpeningEvent]): Self = StObject.set(x, "Page.javascriptDialogOpening", value.asInstanceOf[js.Any])
        
        inline def setPageDotjavascriptDialogOpeningVarargs(value: JavascriptDialogOpeningEvent*): Self = StObject.set(x, "Page.javascriptDialogOpening", js.Array(value :_*))
        
        inline def setPageDotlifecycleEvent(value: js.Array[LifecycleEventEvent]): Self = StObject.set(x, "Page.lifecycleEvent", value.asInstanceOf[js.Any])
        
        inline def setPageDotlifecycleEventVarargs(value: LifecycleEventEvent*): Self = StObject.set(x, "Page.lifecycleEvent", js.Array(value :_*))
        
        inline def setPageDotloadEventFired(value: js.Array[LoadEventFiredEvent]): Self = StObject.set(x, "Page.loadEventFired", value.asInstanceOf[js.Any])
        
        inline def setPageDotloadEventFiredVarargs(value: LoadEventFiredEvent*): Self = StObject.set(x, "Page.loadEventFired", js.Array(value :_*))
        
        inline def setPageDotnavigatedWithinDocument(value: js.Array[NavigatedWithinDocumentEvent]): Self = StObject.set(x, "Page.navigatedWithinDocument", value.asInstanceOf[js.Any])
        
        inline def setPageDotnavigatedWithinDocumentVarargs(value: NavigatedWithinDocumentEvent*): Self = StObject.set(x, "Page.navigatedWithinDocument", js.Array(value :_*))
        
        inline def setPageDotscreencastFrame(value: js.Array[ScreencastFrameEvent]): Self = StObject.set(x, "Page.screencastFrame", value.asInstanceOf[js.Any])
        
        inline def setPageDotscreencastFrameVarargs(value: ScreencastFrameEvent*): Self = StObject.set(x, "Page.screencastFrame", js.Array(value :_*))
        
        inline def setPageDotscreencastVisibilityChanged(value: js.Array[ScreencastVisibilityChangedEvent]): Self = StObject.set(x, "Page.screencastVisibilityChanged", value.asInstanceOf[js.Any])
        
        inline def setPageDotscreencastVisibilityChangedVarargs(value: ScreencastVisibilityChangedEvent*): Self = StObject.set(x, "Page.screencastVisibilityChanged", js.Array(value :_*))
        
        inline def setPageDotwindowOpen(value: js.Array[WindowOpenEvent]): Self = StObject.set(x, "Page.windowOpen", value.asInstanceOf[js.Any])
        
        inline def setPageDotwindowOpenVarargs(value: WindowOpenEvent*): Self = StObject.set(x, "Page.windowOpen", js.Array(value :_*))
        
        inline def setPerformanceDotmetrics(value: js.Array[MetricsEvent]): Self = StObject.set(x, "Performance.metrics", value.asInstanceOf[js.Any])
        
        inline def setPerformanceDotmetricsVarargs(value: MetricsEvent*): Self = StObject.set(x, "Performance.metrics", js.Array(value :_*))
        
        inline def setProfilerDotconsoleProfileFinished(value: js.Array[ConsoleProfileFinishedEvent]): Self = StObject.set(x, "Profiler.consoleProfileFinished", value.asInstanceOf[js.Any])
        
        inline def setProfilerDotconsoleProfileFinishedVarargs(value: ConsoleProfileFinishedEvent*): Self = StObject.set(x, "Profiler.consoleProfileFinished", js.Array(value :_*))
        
        inline def setProfilerDotconsoleProfileStarted(value: js.Array[ConsoleProfileStartedEvent]): Self = StObject.set(x, "Profiler.consoleProfileStarted", value.asInstanceOf[js.Any])
        
        inline def setProfilerDotconsoleProfileStartedVarargs(value: ConsoleProfileStartedEvent*): Self = StObject.set(x, "Profiler.consoleProfileStarted", js.Array(value :_*))
        
        inline def setProfilerDotpreciseCoverageDeltaUpdate(value: js.Array[PreciseCoverageDeltaUpdateEvent]): Self = StObject.set(x, "Profiler.preciseCoverageDeltaUpdate", value.asInstanceOf[js.Any])
        
        inline def setProfilerDotpreciseCoverageDeltaUpdateVarargs(value: PreciseCoverageDeltaUpdateEvent*): Self = StObject.set(x, "Profiler.preciseCoverageDeltaUpdate", js.Array(value :_*))
        
        inline def setRuntimeDotbindingCalled(value: js.Array[BindingCalledEvent]): Self = StObject.set(x, "Runtime.bindingCalled", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotbindingCalledVarargs(value: BindingCalledEvent*): Self = StObject.set(x, "Runtime.bindingCalled", js.Array(value :_*))
        
        inline def setRuntimeDotconsoleAPICalled(value: js.Array[ConsoleAPICalledEvent]): Self = StObject.set(x, "Runtime.consoleAPICalled", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotconsoleAPICalledVarargs(value: ConsoleAPICalledEvent*): Self = StObject.set(x, "Runtime.consoleAPICalled", js.Array(value :_*))
        
        inline def setRuntimeDotexceptionRevoked(value: js.Array[ExceptionRevokedEvent]): Self = StObject.set(x, "Runtime.exceptionRevoked", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotexceptionRevokedVarargs(value: ExceptionRevokedEvent*): Self = StObject.set(x, "Runtime.exceptionRevoked", js.Array(value :_*))
        
        inline def setRuntimeDotexceptionThrown(value: js.Array[ExceptionThrownEvent]): Self = StObject.set(x, "Runtime.exceptionThrown", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotexceptionThrownVarargs(value: ExceptionThrownEvent*): Self = StObject.set(x, "Runtime.exceptionThrown", js.Array(value :_*))
        
        inline def setRuntimeDotexecutionContextCreated(value: js.Array[ExecutionContextCreatedEvent]): Self = StObject.set(x, "Runtime.executionContextCreated", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotexecutionContextCreatedVarargs(value: ExecutionContextCreatedEvent*): Self = StObject.set(x, "Runtime.executionContextCreated", js.Array(value :_*))
        
        inline def setRuntimeDotexecutionContextDestroyed(value: js.Array[ExecutionContextDestroyedEvent]): Self = StObject.set(x, "Runtime.executionContextDestroyed", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotexecutionContextDestroyedVarargs(value: ExecutionContextDestroyedEvent*): Self = StObject.set(x, "Runtime.executionContextDestroyed", js.Array(value :_*))
        
        inline def setRuntimeDotexecutionContextsCleared(value: js.Array[js.Any]): Self = StObject.set(x, "Runtime.executionContextsCleared", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotexecutionContextsClearedVarargs(value: js.Any*): Self = StObject.set(x, "Runtime.executionContextsCleared", js.Array(value :_*))
        
        inline def setRuntimeDotinspectRequested(value: js.Array[InspectRequestedEvent]): Self = StObject.set(x, "Runtime.inspectRequested", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotinspectRequestedVarargs(value: InspectRequestedEvent*): Self = StObject.set(x, "Runtime.inspectRequested", js.Array(value :_*))
        
        inline def setSecurityDotcertificateError(value: js.Array[CertificateErrorEvent]): Self = StObject.set(x, "Security.certificateError", value.asInstanceOf[js.Any])
        
        inline def setSecurityDotcertificateErrorVarargs(value: CertificateErrorEvent*): Self = StObject.set(x, "Security.certificateError", js.Array(value :_*))
        
        inline def setSecurityDotsecurityStateChanged(value: js.Array[SecurityStateChangedEvent]): Self = StObject.set(x, "Security.securityStateChanged", value.asInstanceOf[js.Any])
        
        inline def setSecurityDotsecurityStateChangedVarargs(value: SecurityStateChangedEvent*): Self = StObject.set(x, "Security.securityStateChanged", js.Array(value :_*))
        
        inline def setSecurityDotvisibleSecurityStateChanged(value: js.Array[VisibleSecurityStateChangedEvent]): Self = StObject.set(x, "Security.visibleSecurityStateChanged", value.asInstanceOf[js.Any])
        
        inline def setSecurityDotvisibleSecurityStateChangedVarargs(value: VisibleSecurityStateChangedEvent*): Self = StObject.set(x, "Security.visibleSecurityStateChanged", js.Array(value :_*))
        
        inline def setServiceWorkerDotworkerErrorReported(value: js.Array[WorkerErrorReportedEvent]): Self = StObject.set(x, "ServiceWorker.workerErrorReported", value.asInstanceOf[js.Any])
        
        inline def setServiceWorkerDotworkerErrorReportedVarargs(value: WorkerErrorReportedEvent*): Self = StObject.set(x, "ServiceWorker.workerErrorReported", js.Array(value :_*))
        
        inline def setServiceWorkerDotworkerRegistrationUpdated(value: js.Array[WorkerRegistrationUpdatedEvent]): Self = StObject.set(x, "ServiceWorker.workerRegistrationUpdated", value.asInstanceOf[js.Any])
        
        inline def setServiceWorkerDotworkerRegistrationUpdatedVarargs(value: WorkerRegistrationUpdatedEvent*): Self = StObject.set(x, "ServiceWorker.workerRegistrationUpdated", js.Array(value :_*))
        
        inline def setServiceWorkerDotworkerVersionUpdated(value: js.Array[WorkerVersionUpdatedEvent]): Self = StObject.set(x, "ServiceWorker.workerVersionUpdated", value.asInstanceOf[js.Any])
        
        inline def setServiceWorkerDotworkerVersionUpdatedVarargs(value: WorkerVersionUpdatedEvent*): Self = StObject.set(x, "ServiceWorker.workerVersionUpdated", js.Array(value :_*))
        
        inline def setStorageDotcacheStorageContentUpdated(value: js.Array[CacheStorageContentUpdatedEvent]): Self = StObject.set(x, "Storage.cacheStorageContentUpdated", value.asInstanceOf[js.Any])
        
        inline def setStorageDotcacheStorageContentUpdatedVarargs(value: CacheStorageContentUpdatedEvent*): Self = StObject.set(x, "Storage.cacheStorageContentUpdated", js.Array(value :_*))
        
        inline def setStorageDotcacheStorageListUpdated(value: js.Array[CacheStorageListUpdatedEvent]): Self = StObject.set(x, "Storage.cacheStorageListUpdated", value.asInstanceOf[js.Any])
        
        inline def setStorageDotcacheStorageListUpdatedVarargs(value: CacheStorageListUpdatedEvent*): Self = StObject.set(x, "Storage.cacheStorageListUpdated", js.Array(value :_*))
        
        inline def setStorageDotindexedDBContentUpdated(value: js.Array[IndexedDBContentUpdatedEvent]): Self = StObject.set(x, "Storage.indexedDBContentUpdated", value.asInstanceOf[js.Any])
        
        inline def setStorageDotindexedDBContentUpdatedVarargs(value: IndexedDBContentUpdatedEvent*): Self = StObject.set(x, "Storage.indexedDBContentUpdated", js.Array(value :_*))
        
        inline def setStorageDotindexedDBListUpdated(value: js.Array[IndexedDBListUpdatedEvent]): Self = StObject.set(x, "Storage.indexedDBListUpdated", value.asInstanceOf[js.Any])
        
        inline def setStorageDotindexedDBListUpdatedVarargs(value: IndexedDBListUpdatedEvent*): Self = StObject.set(x, "Storage.indexedDBListUpdated", js.Array(value :_*))
        
        inline def setTargetDotattachedToTarget(value: js.Array[AttachedToTargetEvent]): Self = StObject.set(x, "Target.attachedToTarget", value.asInstanceOf[js.Any])
        
        inline def setTargetDotattachedToTargetVarargs(value: AttachedToTargetEvent*): Self = StObject.set(x, "Target.attachedToTarget", js.Array(value :_*))
        
        inline def setTargetDotdetachedFromTarget(value: js.Array[DetachedFromTargetEvent]): Self = StObject.set(x, "Target.detachedFromTarget", value.asInstanceOf[js.Any])
        
        inline def setTargetDotdetachedFromTargetVarargs(value: DetachedFromTargetEvent*): Self = StObject.set(x, "Target.detachedFromTarget", js.Array(value :_*))
        
        inline def setTargetDotreceivedMessageFromTarget(value: js.Array[ReceivedMessageFromTargetEvent]): Self = StObject.set(x, "Target.receivedMessageFromTarget", value.asInstanceOf[js.Any])
        
        inline def setTargetDotreceivedMessageFromTargetVarargs(value: ReceivedMessageFromTargetEvent*): Self = StObject.set(x, "Target.receivedMessageFromTarget", js.Array(value :_*))
        
        inline def setTargetDottargetCrashed(value: js.Array[TargetCrashedEvent]): Self = StObject.set(x, "Target.targetCrashed", value.asInstanceOf[js.Any])
        
        inline def setTargetDottargetCrashedVarargs(value: TargetCrashedEvent*): Self = StObject.set(x, "Target.targetCrashed", js.Array(value :_*))
        
        inline def setTargetDottargetCreated(value: js.Array[TargetCreatedEvent]): Self = StObject.set(x, "Target.targetCreated", value.asInstanceOf[js.Any])
        
        inline def setTargetDottargetCreatedVarargs(value: TargetCreatedEvent*): Self = StObject.set(x, "Target.targetCreated", js.Array(value :_*))
        
        inline def setTargetDottargetDestroyed(value: js.Array[TargetDestroyedEvent]): Self = StObject.set(x, "Target.targetDestroyed", value.asInstanceOf[js.Any])
        
        inline def setTargetDottargetDestroyedVarargs(value: TargetDestroyedEvent*): Self = StObject.set(x, "Target.targetDestroyed", js.Array(value :_*))
        
        inline def setTargetDottargetInfoChanged(value: js.Array[TargetInfoChangedEvent]): Self = StObject.set(x, "Target.targetInfoChanged", value.asInstanceOf[js.Any])
        
        inline def setTargetDottargetInfoChangedVarargs(value: TargetInfoChangedEvent*): Self = StObject.set(x, "Target.targetInfoChanged", js.Array(value :_*))
        
        inline def setTetheringDotaccepted(value: js.Array[AcceptedEvent]): Self = StObject.set(x, "Tethering.accepted", value.asInstanceOf[js.Any])
        
        inline def setTetheringDotacceptedVarargs(value: AcceptedEvent*): Self = StObject.set(x, "Tethering.accepted", js.Array(value :_*))
        
        inline def setTracingDotbufferUsage(value: js.Array[BufferUsageEvent]): Self = StObject.set(x, "Tracing.bufferUsage", value.asInstanceOf[js.Any])
        
        inline def setTracingDotbufferUsageVarargs(value: BufferUsageEvent*): Self = StObject.set(x, "Tracing.bufferUsage", js.Array(value :_*))
        
        inline def setTracingDotdataCollected(value: js.Array[DataCollectedEvent]): Self = StObject.set(x, "Tracing.dataCollected", value.asInstanceOf[js.Any])
        
        inline def setTracingDotdataCollectedVarargs(value: DataCollectedEvent*): Self = StObject.set(x, "Tracing.dataCollected", js.Array(value :_*))
        
        inline def setTracingDottracingComplete(value: js.Array[TracingCompleteEvent]): Self = StObject.set(x, "Tracing.tracingComplete", value.asInstanceOf[js.Any])
        
        inline def setTracingDottracingCompleteVarargs(value: TracingCompleteEvent*): Self = StObject.set(x, "Tracing.tracingComplete", js.Array(value :_*))
        
        inline def setWebAudioDotaudioListenerCreated(value: js.Array[AudioListenerCreatedEvent]): Self = StObject.set(x, "WebAudio.audioListenerCreated", value.asInstanceOf[js.Any])
        
        inline def setWebAudioDotaudioListenerCreatedVarargs(value: AudioListenerCreatedEvent*): Self = StObject.set(x, "WebAudio.audioListenerCreated", js.Array(value :_*))
        
        inline def setWebAudioDotaudioListenerWillBeDestroyed(value: js.Array[AudioListenerWillBeDestroyedEvent]): Self = StObject.set(x, "WebAudio.audioListenerWillBeDestroyed", value.asInstanceOf[js.Any])
        
        inline def setWebAudioDotaudioListenerWillBeDestroyedVarargs(value: AudioListenerWillBeDestroyedEvent*): Self = StObject.set(x, "WebAudio.audioListenerWillBeDestroyed", js.Array(value :_*))
        
        inline def setWebAudioDotaudioNodeCreated(value: js.Array[AudioNodeCreatedEvent]): Self = StObject.set(x, "WebAudio.audioNodeCreated", value.asInstanceOf[js.Any])
        
        inline def setWebAudioDotaudioNodeCreatedVarargs(value: AudioNodeCreatedEvent*): Self = StObject.set(x, "WebAudio.audioNodeCreated", js.Array(value :_*))
        
        inline def setWebAudioDotaudioNodeWillBeDestroyed(value: js.Array[AudioNodeWillBeDestroyedEvent]): Self = StObject.set(x, "WebAudio.audioNodeWillBeDestroyed", value.asInstanceOf[js.Any])
        
        inline def setWebAudioDotaudioNodeWillBeDestroyedVarargs(value: AudioNodeWillBeDestroyedEvent*): Self = StObject.set(x, "WebAudio.audioNodeWillBeDestroyed", js.Array(value :_*))
        
        inline def setWebAudioDotaudioParamCreated(value: js.Array[AudioParamCreatedEvent]): Self = StObject.set(x, "WebAudio.audioParamCreated", value.asInstanceOf[js.Any])
        
        inline def setWebAudioDotaudioParamCreatedVarargs(value: AudioParamCreatedEvent*): Self = StObject.set(x, "WebAudio.audioParamCreated", js.Array(value :_*))
        
        inline def setWebAudioDotaudioParamWillBeDestroyed(value: js.Array[AudioParamWillBeDestroyedEvent]): Self = StObject.set(x, "WebAudio.audioParamWillBeDestroyed", value.asInstanceOf[js.Any])
        
        inline def setWebAudioDotaudioParamWillBeDestroyedVarargs(value: AudioParamWillBeDestroyedEvent*): Self = StObject.set(x, "WebAudio.audioParamWillBeDestroyed", js.Array(value :_*))
        
        inline def setWebAudioDotcontextChanged(value: js.Array[ContextChangedEvent]): Self = StObject.set(x, "WebAudio.contextChanged", value.asInstanceOf[js.Any])
        
        inline def setWebAudioDotcontextChangedVarargs(value: ContextChangedEvent*): Self = StObject.set(x, "WebAudio.contextChanged", js.Array(value :_*))
        
        inline def setWebAudioDotcontextCreated(value: js.Array[ContextCreatedEvent]): Self = StObject.set(x, "WebAudio.contextCreated", value.asInstanceOf[js.Any])
        
        inline def setWebAudioDotcontextCreatedVarargs(value: ContextCreatedEvent*): Self = StObject.set(x, "WebAudio.contextCreated", js.Array(value :_*))
        
        inline def setWebAudioDotcontextWillBeDestroyed(value: js.Array[ContextWillBeDestroyedEvent]): Self = StObject.set(x, "WebAudio.contextWillBeDestroyed", value.asInstanceOf[js.Any])
        
        inline def setWebAudioDotcontextWillBeDestroyedVarargs(value: ContextWillBeDestroyedEvent*): Self = StObject.set(x, "WebAudio.contextWillBeDestroyed", js.Array(value :_*))
        
        inline def setWebAudioDotnodeParamConnected(value: js.Array[NodeParamConnectedEvent]): Self = StObject.set(x, "WebAudio.nodeParamConnected", value.asInstanceOf[js.Any])
        
        inline def setWebAudioDotnodeParamConnectedVarargs(value: NodeParamConnectedEvent*): Self = StObject.set(x, "WebAudio.nodeParamConnected", js.Array(value :_*))
        
        inline def setWebAudioDotnodeParamDisconnected(value: js.Array[NodeParamDisconnectedEvent]): Self = StObject.set(x, "WebAudio.nodeParamDisconnected", value.asInstanceOf[js.Any])
        
        inline def setWebAudioDotnodeParamDisconnectedVarargs(value: NodeParamDisconnectedEvent*): Self = StObject.set(x, "WebAudio.nodeParamDisconnected", js.Array(value :_*))
        
        inline def setWebAudioDotnodesConnected(value: js.Array[NodesConnectedEvent]): Self = StObject.set(x, "WebAudio.nodesConnected", value.asInstanceOf[js.Any])
        
        inline def setWebAudioDotnodesConnectedVarargs(value: NodesConnectedEvent*): Self = StObject.set(x, "WebAudio.nodesConnected", js.Array(value :_*))
        
        inline def setWebAudioDotnodesDisconnected(value: js.Array[NodesDisconnectedEvent]): Self = StObject.set(x, "WebAudio.nodesDisconnected", value.asInstanceOf[js.Any])
        
        inline def setWebAudioDotnodesDisconnectedVarargs(value: NodesDisconnectedEvent*): Self = StObject.set(x, "WebAudio.nodesDisconnected", js.Array(value :_*))
      }
    }
  }
}
