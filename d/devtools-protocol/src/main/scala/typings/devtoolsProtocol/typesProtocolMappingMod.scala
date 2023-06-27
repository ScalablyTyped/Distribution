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
import typings.devtoolsProtocol.anon.ReturnTypeCheckFormsIssuesResponse
import typings.devtoolsProtocol.anon.ReturnTypeClearTrustTokensResponse
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
import typings.devtoolsProtocol.anon.ReturnTypeDisassembleWasmModuleResponse
import typings.devtoolsProtocol.anon.ReturnTypeEvaluateOnCallFrameResponse
import typings.devtoolsProtocol.anon.ReturnTypeEvaluateResponse
import typings.devtoolsProtocol.anon.ReturnTypeExecuteSQLResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetAXNodeAndAncestorsResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetAdScriptIdResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetAllCookiesResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetAllTimeSamplingProfileResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetAppIdResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetAppManifestResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetAttributesResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetBackgroundColorsResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetBestEffortCoverageResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetBoxModelResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetBrowserCommandLineResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetBrowserContextsResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetBrowserSamplingProfileResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetCategoriesResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetCertificateResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetChildAXNodesResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetComputedStyleForNodeResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetContainerForNodeResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetContentQuadsResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetCookiesResponse
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
import typings.devtoolsProtocol.anon.ReturnTypeGetExceptionDetailsResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetFeatureStateResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetFileInfoResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetFlattenedDocumentResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetFrameOwnerResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetFrameTreeResponse
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
import typings.devtoolsProtocol.anon.ReturnTypeGetInterestGroupDetailsResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetIsolateIdResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetLayersForNodeResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetLayoutMetricsResponse
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
import typings.devtoolsProtocol.anon.ReturnTypeGetOriginTrialsResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetOuterHTMLResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetPartialAXTreeResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetPermissionsPolicyStateResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetPlatformFontsForNodeResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetPlaybackRateResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetPossibleBreakpointsResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetProcessInfoResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetPropertiesResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetQueryingDescendantsForContainerResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetRealtimeDataResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetRelayoutBoundaryResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetRequestPostDataResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetResourceContentResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetResourceTreeResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetResponseBodyForInterceptionResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetResponseBodyResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetRootAXNodeResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetSamplingProfileResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetScriptSourceResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetSearchResultsResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetSecurityIsolationStatusResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetSharedStorageEntriesResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetSharedStorageMetadataResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetSnapshotResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetSourceOrderHighlightObjectForTestResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetStackTraceResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetStorageKeyForFrameResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetStyleSheetTextResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetTargetInfoResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetTargetsResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetTopLayerElementsResponse
import typings.devtoolsProtocol.anon.ReturnTypeGetTrustTokensResponse
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
import typings.devtoolsProtocol.anon.ReturnTypeNextWasmDisassemblyChunkResponse
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
import typings.devtoolsProtocol.anon.ReturnTypeRunBounceTrackingMitigationsResponse
import typings.devtoolsProtocol.anon.ReturnTypeRunScriptResponse
import typings.devtoolsProtocol.anon.ReturnTypeSearchInContentResponse
import typings.devtoolsProtocol.anon.ReturnTypeSearchInResourceResponse
import typings.devtoolsProtocol.anon.ReturnTypeSearchInResponseBodyResponse
import typings.devtoolsProtocol.anon.ReturnTypeSetBreakpointByUrlResponse
import typings.devtoolsProtocol.anon.ReturnTypeSetBreakpointOnFunctionCallResponse
import typings.devtoolsProtocol.anon.ReturnTypeSetBreakpointResponse
import typings.devtoolsProtocol.anon.ReturnTypeSetContainerQueryTextResponse
import typings.devtoolsProtocol.anon.ReturnTypeSetCookieResponse
import typings.devtoolsProtocol.anon.ReturnTypeSetInstrumentationBreakpointResponse
import typings.devtoolsProtocol.anon.ReturnTypeSetKeyframeKeyResponse
import typings.devtoolsProtocol.anon.ReturnTypeSetMediaTextResponse
import typings.devtoolsProtocol.anon.ReturnTypeSetNodeNameResponse
import typings.devtoolsProtocol.anon.ReturnTypeSetRuleSelectorResponse
import typings.devtoolsProtocol.anon.ReturnTypeSetScopeTextResponse
import typings.devtoolsProtocol.anon.ReturnTypeSetScriptSourceResponse
import typings.devtoolsProtocol.anon.ReturnTypeSetStyleSheetTextResponse
import typings.devtoolsProtocol.anon.ReturnTypeSetStyleTextsResponse
import typings.devtoolsProtocol.anon.ReturnTypeSetSupportsTextResponse
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
import typings.devtoolsProtocol.anon.`213`
import typings.devtoolsProtocol.anon.`214`
import typings.devtoolsProtocol.anon.`215`
import typings.devtoolsProtocol.anon.`216`
import typings.devtoolsProtocol.anon.`217`
import typings.devtoolsProtocol.anon.`218`
import typings.devtoolsProtocol.anon.`219`
import typings.devtoolsProtocol.anon.`21`
import typings.devtoolsProtocol.anon.`220`
import typings.devtoolsProtocol.anon.`221`
import typings.devtoolsProtocol.anon.`222`
import typings.devtoolsProtocol.anon.`223`
import typings.devtoolsProtocol.anon.`224`
import typings.devtoolsProtocol.anon.`225`
import typings.devtoolsProtocol.anon.`226`
import typings.devtoolsProtocol.anon.`227`
import typings.devtoolsProtocol.anon.`228`
import typings.devtoolsProtocol.anon.`229`
import typings.devtoolsProtocol.anon.`22`
import typings.devtoolsProtocol.anon.`230`
import typings.devtoolsProtocol.anon.`231`
import typings.devtoolsProtocol.anon.`232`
import typings.devtoolsProtocol.anon.`233`
import typings.devtoolsProtocol.anon.`234`
import typings.devtoolsProtocol.anon.`235`
import typings.devtoolsProtocol.anon.`236`
import typings.devtoolsProtocol.anon.`237`
import typings.devtoolsProtocol.anon.`238`
import typings.devtoolsProtocol.anon.`239`
import typings.devtoolsProtocol.anon.`23`
import typings.devtoolsProtocol.anon.`240`
import typings.devtoolsProtocol.anon.`241`
import typings.devtoolsProtocol.anon.`242`
import typings.devtoolsProtocol.anon.`243`
import typings.devtoolsProtocol.anon.`244`
import typings.devtoolsProtocol.anon.`245`
import typings.devtoolsProtocol.anon.`246`
import typings.devtoolsProtocol.anon.`247`
import typings.devtoolsProtocol.anon.`248`
import typings.devtoolsProtocol.anon.`249`
import typings.devtoolsProtocol.anon.`24`
import typings.devtoolsProtocol.anon.`250`
import typings.devtoolsProtocol.anon.`251`
import typings.devtoolsProtocol.anon.`252`
import typings.devtoolsProtocol.anon.`253`
import typings.devtoolsProtocol.anon.`254`
import typings.devtoolsProtocol.anon.`255`
import typings.devtoolsProtocol.anon.`256`
import typings.devtoolsProtocol.anon.`257`
import typings.devtoolsProtocol.anon.`258`
import typings.devtoolsProtocol.anon.`259`
import typings.devtoolsProtocol.anon.`25`
import typings.devtoolsProtocol.anon.`260`
import typings.devtoolsProtocol.anon.`261`
import typings.devtoolsProtocol.anon.`262`
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
import typings.devtoolsProtocol.mod.Protocol.Accessibility.LoadCompleteEvent
import typings.devtoolsProtocol.mod.Protocol.Accessibility.NodesUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Animation.AnimationCanceledEvent
import typings.devtoolsProtocol.mod.Protocol.Animation.AnimationCreatedEvent
import typings.devtoolsProtocol.mod.Protocol.Animation.AnimationStartedEvent
import typings.devtoolsProtocol.mod.Protocol.Audits.IssueAddedEvent
import typings.devtoolsProtocol.mod.Protocol.BackgroundService.BackgroundServiceEventReceivedEvent
import typings.devtoolsProtocol.mod.Protocol.BackgroundService.RecordingStateChangedEvent
import typings.devtoolsProtocol.mod.Protocol.Browser.DownloadProgressEvent
import typings.devtoolsProtocol.mod.Protocol.Browser.DownloadWillBeginEvent
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
import typings.devtoolsProtocol.mod.Protocol.DeviceAccess.DeviceRequestPromptedEvent
import typings.devtoolsProtocol.mod.Protocol.FedCm.DialogShownEvent
import typings.devtoolsProtocol.mod.Protocol.Fetch.AuthRequiredEvent
import typings.devtoolsProtocol.mod.Protocol.Fetch.RequestPausedEvent
import typings.devtoolsProtocol.mod.Protocol.HeapProfiler.AddHeapSnapshotChunkEvent
import typings.devtoolsProtocol.mod.Protocol.HeapProfiler.HeapStatsUpdateEvent
import typings.devtoolsProtocol.mod.Protocol.HeapProfiler.LastSeenObjectIdEvent
import typings.devtoolsProtocol.mod.Protocol.HeapProfiler.ReportHeapSnapshotProgressEvent
import typings.devtoolsProtocol.mod.Protocol.Input.DragInterceptedEvent
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
import typings.devtoolsProtocol.mod.Protocol.Network.ReportingApiEndpointsChangedForOriginEvent
import typings.devtoolsProtocol.mod.Protocol.Network.ReportingApiReportAddedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.ReportingApiReportUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.RequestInterceptedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.RequestServedFromCacheEvent
import typings.devtoolsProtocol.mod.Protocol.Network.RequestWillBeSentEvent
import typings.devtoolsProtocol.mod.Protocol.Network.RequestWillBeSentExtraInfoEvent
import typings.devtoolsProtocol.mod.Protocol.Network.ResourceChangedPriorityEvent
import typings.devtoolsProtocol.mod.Protocol.Network.ResponseReceivedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.ResponseReceivedExtraInfoEvent
import typings.devtoolsProtocol.mod.Protocol.Network.SignedExchangeReceivedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.SubresourceWebBundleInnerResponseErrorEvent
import typings.devtoolsProtocol.mod.Protocol.Network.SubresourceWebBundleInnerResponseParsedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.SubresourceWebBundleMetadataErrorEvent
import typings.devtoolsProtocol.mod.Protocol.Network.SubresourceWebBundleMetadataReceivedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.TrustTokenOperationDoneEvent
import typings.devtoolsProtocol.mod.Protocol.Network.WebSocketClosedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.WebSocketCreatedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.WebSocketFrameErrorEvent
import typings.devtoolsProtocol.mod.Protocol.Network.WebSocketFrameReceivedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.WebSocketFrameSentEvent
import typings.devtoolsProtocol.mod.Protocol.Network.WebSocketHandshakeResponseReceivedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.WebSocketWillSendHandshakeRequestEvent
import typings.devtoolsProtocol.mod.Protocol.Network.WebTransportClosedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.WebTransportConnectionEstablishedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.WebTransportCreatedEvent
import typings.devtoolsProtocol.mod.Protocol.Overlay.InspectNodeRequestedEvent
import typings.devtoolsProtocol.mod.Protocol.Overlay.NodeHighlightRequestedEvent
import typings.devtoolsProtocol.mod.Protocol.Overlay.ScreenshotRequestedEvent
import typings.devtoolsProtocol.mod.Protocol.Page.BackForwardCacheNotUsedEvent
import typings.devtoolsProtocol.mod.Protocol.Page.CompilationCacheProducedEvent
import typings.devtoolsProtocol.mod.Protocol.Page.DocumentOpenedEvent
import typings.devtoolsProtocol.mod.Protocol.Page.DomContentEventFiredEvent
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
import typings.devtoolsProtocol.mod.Protocol.PerformanceTimeline.TimelineEventAddedEvent
import typings.devtoolsProtocol.mod.Protocol.Preload.PrefetchStatusUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Preload.PreloadEnabledStateUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Preload.PreloadingAttemptSourcesUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Preload.PrerenderAttemptCompletedEvent
import typings.devtoolsProtocol.mod.Protocol.Preload.PrerenderStatusUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Preload.RuleSetRemovedEvent
import typings.devtoolsProtocol.mod.Protocol.Preload.RuleSetUpdatedEvent
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
import typings.devtoolsProtocol.mod.Protocol.Storage.InterestGroupAccessedEvent
import typings.devtoolsProtocol.mod.Protocol.Storage.SharedStorageAccessedEvent
import typings.devtoolsProtocol.mod.Protocol.Storage.StorageBucketCreatedOrUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Storage.StorageBucketDeletedEvent
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
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.CredentialAddedEvent
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.CredentialAssertedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProtocolMappingMod {
  
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
        * Fetches a node and all ancestors up to and including the root.
        * Requires `enable()` to have been called previously.
        */
      @JSName("Accessibility.getAXNodeAndAncestors")
      var AccessibilityDotgetAXNodeAndAncestors: ReturnTypeGetAXNodeAndAncestorsResponse
      
      /**
        * Fetches a particular accessibility node by AXNodeId.
        * Requires `enable()` to have been called previously.
        */
      @JSName("Accessibility.getChildAXNodes")
      var AccessibilityDotgetChildAXNodes: ReturnTypeGetChildAXNodesResponse
      
      /**
        * Fetches the entire accessibility tree for the root Document
        */
      @JSName("Accessibility.getFullAXTree")
      var AccessibilityDotgetFullAXTree: ReturnTypeGetFullAXTreeResponse
      
      /**
        * Fetches the accessibility node and partial accessibility tree for this DOM node, if it exists.
        */
      @JSName("Accessibility.getPartialAXTree")
      var AccessibilityDotgetPartialAXTree: ReturnTypeGetPartialAXTreeResponse
      
      /**
        * Fetches the root node.
        * Requires `enable()` to have been called previously.
        */
      @JSName("Accessibility.getRootAXNode")
      var AccessibilityDotgetRootAXNode: ReturnTypeGetRootAXNodeResponse
      
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
        * Runs the contrast check for the target page. Found issues are reported
        * using Audits.issueAdded event.
        */
      @JSName("Audits.checkContrast")
      var AuditsDotcheckContrast: `29`
      
      /**
        * Runs the form issues check for the target page. Found issues are reported
        * using Audits.issueAdded event.
        */
      @JSName("Audits.checkFormsIssues")
      var AuditsDotcheckFormsIssues: ReturnTypeCheckFormsIssuesResponse
      
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
        * Set addresses so that developers can verify their forms implementation.
        */
      @JSName("Autofill.setAddresses")
      var AutofillDotsetAddresses: `31`
      
      /**
        * Trigger autofill on a form identified by the fieldId.
        * If the field and related form cannot be autofilled, returns an error.
        */
      @JSName("Autofill.trigger")
      var AutofillDottrigger: `30`
      
      /**
        * Clears all stored data for the service.
        */
      @JSName("BackgroundService.clearEvents")
      var BackgroundServiceDotclearEvents: `35`
      
      /**
        * Set the recording state for the service.
        */
      @JSName("BackgroundService.setRecording")
      var BackgroundServiceDotsetRecording: `34`
      
      /**
        * Enables event updates for the service.
        */
      @JSName("BackgroundService.startObserving")
      var BackgroundServiceDotstartObserving: `32`
      
      /**
        * Disables event updates for the service.
        */
      @JSName("BackgroundService.stopObserving")
      var BackgroundServiceDotstopObserving: `33`
      
      /**
        * Allows a site to use privacy sandbox features that require enrollment
        * without the site actually being enrolled. Only supported on page targets.
        */
      @JSName("Browser.addPrivacySandboxEnrollmentOverride")
      var BrowserDotaddPrivacySandboxEnrollmentOverride: `44`
      
      /**
        * Cancel a download if in progress
        */
      @JSName("Browser.cancelDownload")
      var BrowserDotcancelDownload: `40`
      
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
        * Invoke custom browser commands used by telemetry.
        */
      @JSName("Browser.executeBrowserCommand")
      var BrowserDotexecuteBrowserCommand: `43`
      
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
      var BrowserDotgrantPermissions: `37`
      
      /**
        * Reset all permission management for all origins.
        */
      @JSName("Browser.resetPermissions")
      var BrowserDotresetPermissions: `38`
      
      /**
        * Set dock tile details, platform-specific.
        */
      @JSName("Browser.setDockTile")
      var BrowserDotsetDockTile: `42`
      
      /**
        * Set the behavior when downloading a file.
        */
      @JSName("Browser.setDownloadBehavior")
      var BrowserDotsetDownloadBehavior: `39`
      
      /**
        * Set permission settings for given origin.
        */
      @JSName("Browser.setPermission")
      var BrowserDotsetPermission: `36`
      
      /**
        * Set position and/or size of the browser window.
        */
      @JSName("Browser.setWindowBounds")
      var BrowserDotsetWindowBounds: `41`
      
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
      var CSSDotforcePseudoState: `45`
      
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
        * Returns all layers parsed by the rendering engine for the tree scope of a node.
        * Given a DOM element identified by nodeId, getLayersForNode returns the root
        * layer for the nearest ancestor document or shadow root. The layer root contains
        * the full layer tree for the tree scope and their ordering.
        */
      @JSName("CSS.getLayersForNode")
      var CSSDotgetLayersForNode: ReturnTypeGetLayersForNodeResponse
      
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
        * Modifies the expression of a container query.
        */
      @JSName("CSS.setContainerQueryText")
      var CSSDotsetContainerQueryText: ReturnTypeSetContainerQueryTextResponse
      
      /**
        * Find a rule with the given active property for the given node and set the new value for this
        * property
        */
      @JSName("CSS.setEffectivePropertyValueForNode")
      var CSSDotsetEffectivePropertyValueForNode: `47`
      
      /**
        * Modifies the keyframe rule key text.
        */
      @JSName("CSS.setKeyframeKey")
      var CSSDotsetKeyframeKey: ReturnTypeSetKeyframeKeyResponse
      
      /**
        * Enables/disables rendering of local CSS fonts (enabled by default).
        */
      @JSName("CSS.setLocalFontsEnabled")
      var CSSDotsetLocalFontsEnabled: `48`
      
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
        * Modifies the expression of a scope at-rule.
        */
      @JSName("CSS.setScopeText")
      var CSSDotsetScopeText: ReturnTypeSetScopeTextResponse
      
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
        * Modifies the expression of a supports at-rule.
        */
      @JSName("CSS.setSupportsText")
      var CSSDotsetSupportsText: ReturnTypeSetSupportsTextResponse
      
      /**
        * Enables the selector recording.
        */
      @JSName("CSS.startRuleUsageTracking")
      var CSSDotstartRuleUsageTracking: ParamsType
      
      /**
        * Stop tracking rule usage and return the list of rules that were used since last call to
        * `takeCoverageDelta` (or since start of coverage instrumentation).
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
        * instrumentation).
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
      var CSSDottrackComputedStyleUpdates: `46`
      
      /**
        * Deletes a cache.
        */
      @JSName("CacheStorage.deleteCache")
      var CacheStorageDotdeleteCache: `49`
      
      /**
        * Deletes a cache entry.
        */
      @JSName("CacheStorage.deleteEntry")
      var CacheStorageDotdeleteEntry: `50`
      
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
      var CastDotenable: `51`
      
      /**
        * Sets a sink to be used when the web page requests the browser to choose a
        * sink via Presentation API, Remote Playback API, or Cast SDK.
        */
      @JSName("Cast.setSinkToUse")
      var CastDotsetSinkToUse: `52`
      
      /**
        * Starts mirroring the desktop to the sink.
        */
      @JSName("Cast.startDesktopMirroring")
      var CastDotstartDesktopMirroring: `53`
      
      /**
        * Starts mirroring the tab to the sink.
        */
      @JSName("Cast.startTabMirroring")
      var CastDotstartTabMirroring: `54`
      
      /**
        * Stops the active Cast session on the sink.
        */
      @JSName("Cast.stopCasting")
      var CastDotstopCasting: `55`
      
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
      var DOMDebuggerDotremoveDOMBreakpoint: `70`
      
      /**
        * Removes breakpoint on particular DOM event.
        */
      @JSName("DOMDebugger.removeEventListenerBreakpoint")
      var DOMDebuggerDotremoveEventListenerBreakpoint: `71`
      
      /**
        * Removes breakpoint on particular native event.
        */
      @JSName("DOMDebugger.removeInstrumentationBreakpoint")
      var DOMDebuggerDotremoveInstrumentationBreakpoint: `72`
      
      /**
        * Removes breakpoint from XMLHttpRequest.
        */
      @JSName("DOMDebugger.removeXHRBreakpoint")
      var DOMDebuggerDotremoveXHRBreakpoint: `73`
      
      /**
        * Sets breakpoint on particular CSP violations.
        */
      @JSName("DOMDebugger.setBreakOnCSPViolation")
      var DOMDebuggerDotsetBreakOnCSPViolation: `74`
      
      /**
        * Sets breakpoint on particular operation with DOM.
        */
      @JSName("DOMDebugger.setDOMBreakpoint")
      var DOMDebuggerDotsetDOMBreakpoint: `75`
      
      /**
        * Sets breakpoint on particular DOM event.
        */
      @JSName("DOMDebugger.setEventListenerBreakpoint")
      var DOMDebuggerDotsetEventListenerBreakpoint: `76`
      
      /**
        * Sets breakpoint on particular native event.
        */
      @JSName("DOMDebugger.setInstrumentationBreakpoint")
      var DOMDebuggerDotsetInstrumentationBreakpoint: `77`
      
      /**
        * Sets breakpoint on XMLHttpRequest.
        */
      @JSName("DOMDebugger.setXHRBreakpoint")
      var DOMDebuggerDotsetXHRBreakpoint: `78`
      
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
      var DOMDotdiscardSearchResults: `57`
      
      /**
        * Enables DOM agent for the given page.
        */
      @JSName("DOM.enable")
      var DOMDotenable: `58`
      
      /**
        * Focuses the given element.
        */
      @JSName("DOM.focus")
      var DOMDotfocus: `59`
      
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
        * Returns the query container of the given node based on container query
        * conditions: containerName, physical, and logical axes. If no axes are
        * provided, the style container is returned, which is the direct parent or the
        * closest element with a matching container-name.
        */
      @JSName("DOM.getContainerForNode")
      var DOMDotgetContainerForNode: ReturnTypeGetContainerForNodeResponse
      
      /**
        * Returns quads that describe node position on the page. This method
        * might return multiple quads for inline nodes.
        */
      @JSName("DOM.getContentQuads")
      var DOMDotgetContentQuads: ReturnTypeGetContentQuadsResponse
      
      /**
        * Returns the root DOM node (and optionally the subtree) to the caller.
        * Implicitly enables the DOM domain events for the current target.
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
        * Returns the descendants of a container query container that have
        * container queries against this container.
        */
      @JSName("DOM.getQueryingDescendantsForContainer")
      var DOMDotgetQueryingDescendantsForContainer: ReturnTypeGetQueryingDescendantsForContainerResponse
      
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
        * Returns NodeIds of current top layer elements.
        * Top layer is rendered closest to the user within a viewport, therefore its elements always
        * appear on top of all other content.
        */
      @JSName("DOM.getTopLayerElements")
      var DOMDotgetTopLayerElements: ReturnTypeGetTopLayerElementsResponse
      
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
      var DOMDotremoveAttribute: `60`
      
      /**
        * Removes node with given id.
        */
      @JSName("DOM.removeNode")
      var DOMDotremoveNode: `61`
      
      /**
        * Requests that children of the node with given id are returned to the caller in form of
        * `setChildNodes` events where not only immediate children are retrieved, but all children down to
        * the specified depth.
        */
      @JSName("DOM.requestChildNodes")
      var DOMDotrequestChildNodes: `62`
      
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
      var DOMDotscrollIntoViewIfNeeded: `56`
      
      /**
        * Sets attribute for an element with given id.
        */
      @JSName("DOM.setAttributeValue")
      var DOMDotsetAttributeValue: `63`
      
      /**
        * Sets attributes on element with given id. This method is useful when user edits some existing
        * attribute value and types in several attribute name/value pairs.
        */
      @JSName("DOM.setAttributesAsText")
      var DOMDotsetAttributesAsText: `64`
      
      /**
        * Sets files for the given file input element.
        */
      @JSName("DOM.setFileInputFiles")
      var DOMDotsetFileInputFiles: `65`
      
      /**
        * Enables console to refer to the node with given id via $x (see Command Line API for more details
        * $x functions).
        */
      @JSName("DOM.setInspectedNode")
      var DOMDotsetInspectedNode: `67`
      
      /**
        * Sets node name for a node with given id.
        */
      @JSName("DOM.setNodeName")
      var DOMDotsetNodeName: ReturnTypeSetNodeNameResponse
      
      /**
        * Sets if stack traces should be captured for Nodes. See `Node.getNodeStackTraces`. Default is disabled.
        */
      @JSName("DOM.setNodeStackTracesEnabled")
      var DOMDotsetNodeStackTracesEnabled: `66`
      
      /**
        * Sets node value for a node with given id.
        */
      @JSName("DOM.setNodeValue")
      var DOMDotsetNodeValue: `68`
      
      /**
        * Sets node HTML markup, returns new node id.
        */
      @JSName("DOM.setOuterHTML")
      var DOMDotsetOuterHTML: `69`
      
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
      var DOMStorageDotclear: `81`
      
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
      var DOMStorageDotremoveDOMStorageItem: `82`
      
      @JSName("DOMStorage.setDOMStorageItem")
      var DOMStorageDotsetDOMStorageItem: `83`
      
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
      
      @JSName("Debugger.disassembleWasmModule")
      var DebuggerDotdisassembleWasmModule: ReturnTypeDisassembleWasmModuleResponse
      
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
        * Disassemble the next chunk of lines for the module corresponding to the
        * stream. If disassembly is complete, this API will invalidate the streamId
        * and return an empty chunk. Any subsequent calls for the now invalid stream
        * will return errors.
        */
      @JSName("Debugger.nextWasmDisassemblyChunk")
      var DebuggerDotnextWasmDisassemblyChunk: ReturnTypeNextWasmDisassemblyChunkResponse
      
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
        * Restarts particular call frame from the beginning. The old, deprecated
        * behavior of `restartFrame` is to stay paused and allow further CDP commands
        * after a restart was scheduled. This can cause problems with restarting, so
        * we now continue execution immediatly after it has been scheduled until we
        * reach the beginning of the restarted frame.
        * 
        * To stay back-wards compatible, `restartFrame` now expects a `mode`
        * parameter to be present. If the `mode` parameter is missing, `restartFrame`
        * errors out.
        * 
        * The various return values are deprecated and `callFrames` is always empty.
        * Use the call frames from the `Debugger#paused` events instead, that fires
        * once V8 pauses at the beginning of the restarted function.
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
        * Defines pause on exceptions state. Can be set to stop on all exceptions, uncaught exceptions,
        * or caught exceptions, no exceptions. Initial pause on exceptions state is `none`.
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
        * 
        * In general, functions that are currently on the stack can not be edited with
        * a single exception: If the edited function is the top-most stack frame and
        * that is the only activation of that function on the stack. In this case
        * the live edit will be successful and a `Debugger.restartFrame` for the
        * top-most function is automatically triggered.
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
        * Cancel a prompt in response to a DeviceAccess.deviceRequestPrompted event.
        */
      @JSName("DeviceAccess.cancelPrompt")
      var DeviceAccessDotcancelPrompt: `259`
      
      /**
        * Disable events in this domain.
        */
      @JSName("DeviceAccess.disable")
      var DeviceAccessDotdisable: ParamsType
      
      /**
        * Enable events in this domain.
        */
      @JSName("DeviceAccess.enable")
      var DeviceAccessDotenable: ParamsType
      
      /**
        * Select a device in response to a DeviceAccess.deviceRequestPrompted event.
        */
      @JSName("DeviceAccess.selectPrompt")
      var DeviceAccessDotselectPrompt: `258`
      
      /**
        * Clears the overridden Device Orientation.
        */
      @JSName("DeviceOrientation.clearDeviceOrientationOverride")
      var DeviceOrientationDotclearDeviceOrientationOverride: ParamsType
      
      /**
        * Overrides the Device Orientation.
        */
      @JSName("DeviceOrientation.setDeviceOrientationOverride")
      var DeviceOrientationDotsetDeviceOrientationOverride: `84`
      
      /**
        * Tells whether emulation is supported.
        */
      @JSName("Emulation.canEmulate")
      var EmulationDotcanEmulate: ReturnTypeCanEmulateResponse
      
      /**
        * Clears the overridden device metrics.
        */
      @JSName("Emulation.clearDeviceMetricsOverride")
      var EmulationDotclearDeviceMetricsOverride: ParamsType
      
      /**
        * Clears the overridden Geolocation Position and Error.
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
        * Automatically render all web contents using a dark theme.
        */
      @JSName("Emulation.setAutoDarkModeOverride")
      var EmulationDotsetAutoDarkModeOverride: `86`
      
      /**
        * Allows overriding the automation flag.
        */
      @JSName("Emulation.setAutomationOverride")
      var EmulationDotsetAutomationOverride: `107`
      
      /**
        * Enables CPU throttling to emulate slow CPUs.
        */
      @JSName("Emulation.setCPUThrottlingRate")
      var EmulationDotsetCPUThrottlingRate: `87`
      
      /**
        * Sets or clears an override of the default background color of the frame. This override is used
        * if the content does not specify one.
        */
      @JSName("Emulation.setDefaultBackgroundColorOverride")
      var EmulationDotsetDefaultBackgroundColorOverride: `88`
      
      /**
        * Overrides the values of device screen dimensions (window.screen.width, window.screen.height,
        * window.innerWidth, window.innerHeight, and "device-width"/"device-height"-related CSS media
        * query results).
        */
      @JSName("Emulation.setDeviceMetricsOverride")
      var EmulationDotsetDeviceMetricsOverride: `89`
      
      @JSName("Emulation.setDisabledImageTypes")
      var EmulationDotsetDisabledImageTypes: `104`
      
      @JSName("Emulation.setDocumentCookieDisabled")
      var EmulationDotsetDocumentCookieDisabled: `91`
      
      @JSName("Emulation.setEmitTouchEventsForMouse")
      var EmulationDotsetEmitTouchEventsForMouse: `92`
      
      /**
        * Emulates the given media type or media feature for CSS media queries.
        */
      @JSName("Emulation.setEmulatedMedia")
      var EmulationDotsetEmulatedMedia: `93`
      
      /**
        * Emulates the given vision deficiency.
        */
      @JSName("Emulation.setEmulatedVisionDeficiency")
      var EmulationDotsetEmulatedVisionDeficiency: `94`
      
      /**
        * Enables or disables simulating a focused and active page.
        */
      @JSName("Emulation.setFocusEmulationEnabled")
      var EmulationDotsetFocusEmulationEnabled: `85`
      
      /**
        * Overrides the Geolocation Position or Error. Omitting any of the parameters emulates position
        * unavailable.
        */
      @JSName("Emulation.setGeolocationOverride")
      var EmulationDotsetGeolocationOverride: `95`
      
      @JSName("Emulation.setHardwareConcurrencyOverride")
      var EmulationDotsetHardwareConcurrencyOverride: `105`
      
      /**
        * Overrides the Idle state.
        */
      @JSName("Emulation.setIdleOverride")
      var EmulationDotsetIdleOverride: `96`
      
      /**
        * Overrides default host system locale with the specified one.
        */
      @JSName("Emulation.setLocaleOverride")
      var EmulationDotsetLocaleOverride: `101`
      
      /**
        * Overrides value returned by the javascript navigator object.
        */
      @JSName("Emulation.setNavigatorOverrides")
      var EmulationDotsetNavigatorOverrides: `97`
      
      /**
        * Sets a specified page scale factor.
        */
      @JSName("Emulation.setPageScaleFactor")
      var EmulationDotsetPageScaleFactor: `98`
      
      /**
        * Switches script execution in the page.
        */
      @JSName("Emulation.setScriptExecutionDisabled")
      var EmulationDotsetScriptExecutionDisabled: `99`
      
      @JSName("Emulation.setScrollbarsHidden")
      var EmulationDotsetScrollbarsHidden: `90`
      
      /**
        * Overrides default host system timezone with the specified one.
        */
      @JSName("Emulation.setTimezoneOverride")
      var EmulationDotsetTimezoneOverride: `102`
      
      /**
        * Enables touch on platforms which do not support them.
        */
      @JSName("Emulation.setTouchEmulationEnabled")
      var EmulationDotsetTouchEmulationEnabled: `100`
      
      /**
        * Allows overriding user agent with the given string.
        */
      @JSName("Emulation.setUserAgentOverride")
      var EmulationDotsetUserAgentOverride: `106`
      
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
      var EmulationDotsetVisibleSize: `103`
      
      /**
        * Removes breakpoint on particular native event.
        */
      @JSName("EventBreakpoints.removeInstrumentationBreakpoint")
      var EventBreakpointsDotremoveInstrumentationBreakpoint: `80`
      
      /**
        * Sets breakpoint on particular native event.
        */
      @JSName("EventBreakpoints.setInstrumentationBreakpoint")
      var EventBreakpointsDotsetInstrumentationBreakpoint: `79`
      
      @JSName("FedCm.disable")
      var FedCmDotdisable: ParamsType
      
      @JSName("FedCm.dismissDialog")
      var FedCmDotdismissDialog: `262`
      
      @JSName("FedCm.enable")
      var FedCmDotenable: `260`
      
      /**
        * Resets the cooldown time, if any, to allow the next FedCM call to show
        * a dialog even if one was recently dismissed by the user.
        */
      @JSName("FedCm.resetCooldown")
      var FedCmDotresetCooldown: ParamsType
      
      @JSName("FedCm.selectAccount")
      var FedCmDotselectAccount: `261`
      
      /**
        * Continues the request, optionally modifying some of its parameters.
        */
      @JSName("Fetch.continueRequest")
      var FetchDotcontinueRequest: `247`
      
      /**
        * Continues loading of the paused response, optionally modifying the
        * response headers. If either responseCode or headers are modified, all of them
        * must be present.
        */
      @JSName("Fetch.continueResponse")
      var FetchDotcontinueResponse: `249`
      
      /**
        * Continues a request supplying authChallengeResponse following authRequired event.
        */
      @JSName("Fetch.continueWithAuth")
      var FetchDotcontinueWithAuth: `248`
      
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
      var FetchDotenable: `244`
      
      /**
        * Causes the request to fail with specified reason.
        */
      @JSName("Fetch.failRequest")
      var FetchDotfailRequest: `245`
      
      /**
        * Provides response to the request.
        */
      @JSName("Fetch.fulfillRequest")
      var FetchDotfulfillRequest: `246`
      
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
        * https://goo.gle/chrome-headless-rendering for more background.
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
      var IODotclose: `108`
      
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
      var IndexedDBDotclearObjectStore: `109`
      
      /**
        * Deletes a database.
        */
      @JSName("IndexedDB.deleteDatabase")
      var IndexedDBDotdeleteDatabase: `110`
      
      /**
        * Delete a range of entries from an object store
        */
      @JSName("IndexedDB.deleteObjectStoreEntries")
      var IndexedDBDotdeleteObjectStoreEntries: `111`
      
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
        * Gets metadata of an object store.
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
        * Dispatches a drag event into the page.
        */
      @JSName("Input.dispatchDragEvent")
      var InputDotdispatchDragEvent: `112`
      
      /**
        * Dispatches a key event to the page.
        */
      @JSName("Input.dispatchKeyEvent")
      var InputDotdispatchKeyEvent: `113`
      
      /**
        * Dispatches a mouse event to the page.
        */
      @JSName("Input.dispatchMouseEvent")
      var InputDotdispatchMouseEvent: `116`
      
      /**
        * Dispatches a touch event to the page.
        */
      @JSName("Input.dispatchTouchEvent")
      var InputDotdispatchTouchEvent: `117`
      
      /**
        * Emulates touch event from the mouse event parameters.
        */
      @JSName("Input.emulateTouchFromMouseEvent")
      var InputDotemulateTouchFromMouseEvent: `118`
      
      /**
        * This method sets the current candidate text for ime.
        * Use imeCommitComposition to commit the final text.
        * Use imeSetComposition with empty string as text to cancel composition.
        */
      @JSName("Input.imeSetComposition")
      var InputDotimeSetComposition: `115`
      
      /**
        * This method emulates inserting text that doesn't come from a key press,
        * for example an emoji keyboard or an IME.
        */
      @JSName("Input.insertText")
      var InputDotinsertText: `114`
      
      /**
        * Ignores input events (useful while auditing page).
        */
      @JSName("Input.setIgnoreInputEvents")
      var InputDotsetIgnoreInputEvents: `119`
      
      /**
        * Prevents default drag and drop behavior and instead emits `Input.dragIntercepted` events.
        * Drag and drop behavior can be directly controlled via `Input.dispatchDragEvent`.
        */
      @JSName("Input.setInterceptDrags")
      var InputDotsetInterceptDrags: `120`
      
      /**
        * Synthesizes a pinch gesture over a time period by issuing appropriate touch events.
        */
      @JSName("Input.synthesizePinchGesture")
      var InputDotsynthesizePinchGesture: `121`
      
      /**
        * Synthesizes a scroll gesture over a time period by issuing appropriate touch events.
        */
      @JSName("Input.synthesizeScrollGesture")
      var InputDotsynthesizeScrollGesture: `122`
      
      /**
        * Synthesizes a tap gesture over a time period by issuing appropriate touch events.
        */
      @JSName("Input.synthesizeTapGesture")
      var InputDotsynthesizeTapGesture: `123`
      
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
      var LayerTreeDotreleaseSnapshot: `124`
      
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
      var LogDotstartViolationsReport: `125`
      
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
      var MemoryDotsetPressureNotificationsSuppressed: `126`
      
      /**
        * Simulate a memory pressure notification in all processes.
        */
      @JSName("Memory.simulatePressureNotification")
      var MemoryDotsimulatePressureNotification: `127`
      
      /**
        * Start collecting native memory profile.
        */
      @JSName("Memory.startSampling")
      var MemoryDotstartSampling: `128`
      
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
        * Clears accepted encodings set by setAcceptedEncodings
        */
      @JSName("Network.clearAcceptedEncodingsOverride")
      var NetworkDotclearAcceptedEncodingsOverride: ParamsType
      
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
      var NetworkDotcontinueInterceptedRequest: `130`
      
      /**
        * Deletes browser cookies with matching name and url or domain/path pair.
        */
      @JSName("Network.deleteCookies")
      var NetworkDotdeleteCookies: `131`
      
      /**
        * Disables network tracking, prevents network events from being sent to the client.
        */
      @JSName("Network.disable")
      var NetworkDotdisable: ParamsType
      
      /**
        * Activates emulation of network conditions.
        */
      @JSName("Network.emulateNetworkConditions")
      var NetworkDotemulateNetworkConditions: `132`
      
      /**
        * Enables network tracking, network events will now be delivered to the client.
        */
      @JSName("Network.enable")
      var NetworkDotenable: `133`
      
      /**
        * Enables tracking for the Reporting API, events generated by the Reporting API will now be delivered to the client.
        * Enabling triggers 'reportingApiReportAdded' for all existing reports.
        */
      @JSName("Network.enableReportingApi")
      var NetworkDotenableReportingApi: `143`
      
      /**
        * Returns all browser cookies. Depending on the backend support, will return detailed cookie
        * information in the `cookies` field.
        * Deprecated. Use Storage.getCookies instead.
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
      var NetworkDotreplayXHR: `134`
      
      /**
        * Searches for given string in response content.
        */
      @JSName("Network.searchInResponseBody")
      var NetworkDotsearchInResponseBody: ReturnTypeSearchInResponseBodyResponse
      
      /**
        * Sets a list of content encodings that will be accepted. Empty list means no encoding is accepted.
        */
      @JSName("Network.setAcceptedEncodings")
      var NetworkDotsetAcceptedEncodings: `129`
      
      /**
        * Specifies whether to attach a page script stack id in requests
        */
      @JSName("Network.setAttachDebugStack")
      var NetworkDotsetAttachDebugStack: `140`
      
      /**
        * Blocks URLs from loading.
        */
      @JSName("Network.setBlockedURLs")
      var NetworkDotsetBlockedURLs: `135`
      
      /**
        * Toggles ignoring of service worker for each request.
        */
      @JSName("Network.setBypassServiceWorker")
      var NetworkDotsetBypassServiceWorker: `136`
      
      /**
        * Toggles ignoring cache for each request. If `true`, cache will not be used.
        */
      @JSName("Network.setCacheDisabled")
      var NetworkDotsetCacheDisabled: `137`
      
      /**
        * Sets a cookie with the given cookie data; may overwrite equivalent cookies if they exist.
        */
      @JSName("Network.setCookie")
      var NetworkDotsetCookie: ReturnTypeSetCookieResponse
      
      /**
        * Sets given cookies.
        */
      @JSName("Network.setCookies")
      var NetworkDotsetCookies: `138`
      
      /**
        * Specifies whether to always send extra HTTP headers with the requests from this page.
        */
      @JSName("Network.setExtraHTTPHeaders")
      var NetworkDotsetExtraHTTPHeaders: `139`
      
      /**
        * Sets the requests to intercept that match the provided patterns and optionally resource types.
        * Deprecated, please use Fetch.enable instead.
        */
      @JSName("Network.setRequestInterception")
      var NetworkDotsetRequestInterception: `141`
      
      /**
        * Allows overriding user agent with the given string.
        */
      @JSName("Network.setUserAgentOverride")
      var NetworkDotsetUserAgentOverride: `142`
      
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
        * Deprecated: Doesn't work reliablity and cannot be fixed due to process
        * separatation (the owner node might be in a different process). Determine
        * the owner node in the client and use highlightNode.
        */
      @JSName("Overlay.highlightFrame")
      var OverlayDothighlightFrame: `144`
      
      /**
        * Highlights DOM node with given id or with the given JavaScript object wrapper. Either nodeId or
        * objectId must be specified.
        */
      @JSName("Overlay.highlightNode")
      var OverlayDothighlightNode: `145`
      
      /**
        * Highlights given quad. Coordinates are absolute with respect to the main frame viewport.
        */
      @JSName("Overlay.highlightQuad")
      var OverlayDothighlightQuad: `146`
      
      /**
        * Highlights given rectangle. Coordinates are absolute with respect to the main frame viewport.
        */
      @JSName("Overlay.highlightRect")
      var OverlayDothighlightRect: `147`
      
      /**
        * Highlights the source order of the children of the DOM node with given id or with the given
        * JavaScript object wrapper. Either nodeId or objectId must be specified.
        */
      @JSName("Overlay.highlightSourceOrder")
      var OverlayDothighlightSourceOrder: `148`
      
      /**
        * Enters the 'inspect' mode. In this mode, elements that user is hovering over are highlighted.
        * Backend then generates 'inspectNodeRequested' event upon element selection.
        */
      @JSName("Overlay.setInspectMode")
      var OverlayDotsetInspectMode: `149`
      
      @JSName("Overlay.setPausedInDebuggerMessage")
      var OverlayDotsetPausedInDebuggerMessage: `151`
      
      /**
        * Highlights owner element of all frames detected to be ads.
        */
      @JSName("Overlay.setShowAdHighlights")
      var OverlayDotsetShowAdHighlights: `150`
      
      @JSName("Overlay.setShowContainerQueryOverlays")
      var OverlayDotsetShowContainerQueryOverlays: `157`
      
      /**
        * Requests that backend shows debug borders on layers
        */
      @JSName("Overlay.setShowDebugBorders")
      var OverlayDotsetShowDebugBorders: `152`
      
      /**
        * Requests that backend shows the FPS counter
        */
      @JSName("Overlay.setShowFPSCounter")
      var OverlayDotsetShowFPSCounter: `153`
      
      @JSName("Overlay.setShowFlexOverlays")
      var OverlayDotsetShowFlexOverlays: `155`
      
      /**
        * Highlight multiple elements with the CSS Grid overlay.
        */
      @JSName("Overlay.setShowGridOverlays")
      var OverlayDotsetShowGridOverlays: `154`
      
      /**
        * Add a dual screen device hinge
        */
      @JSName("Overlay.setShowHinge")
      var OverlayDotsetShowHinge: `164`
      
      /**
        * Deprecated, no longer has any effect.
        */
      @JSName("Overlay.setShowHitTestBorders")
      var OverlayDotsetShowHitTestBorders: `161`
      
      /**
        * Show elements in isolation mode with overlays.
        */
      @JSName("Overlay.setShowIsolatedElements")
      var OverlayDotsetShowIsolatedElements: `165`
      
      /**
        * Requests that backend shows layout shift regions
        */
      @JSName("Overlay.setShowLayoutShiftRegions")
      var OverlayDotsetShowLayoutShiftRegions: `159`
      
      /**
        * Requests that backend shows paint rectangles
        */
      @JSName("Overlay.setShowPaintRects")
      var OverlayDotsetShowPaintRects: `158`
      
      /**
        * Requests that backend shows scroll bottleneck rects
        */
      @JSName("Overlay.setShowScrollBottleneckRects")
      var OverlayDotsetShowScrollBottleneckRects: `160`
      
      @JSName("Overlay.setShowScrollSnapOverlays")
      var OverlayDotsetShowScrollSnapOverlays: `156`
      
      /**
        * Paints viewport size upon main frame resize.
        */
      @JSName("Overlay.setShowViewportSizeOnResize")
      var OverlayDotsetShowViewportSizeOnResize: `163`
      
      /**
        * Request that backend shows an overlay with web vital metrics.
        */
      @JSName("Overlay.setShowWebVitals")
      var OverlayDotsetShowWebVitals: `162`
      
      /**
        * Seeds compilation cache for given url. Compilation cache does not survive
        * cross-process navigation.
        */
      @JSName("Page.addCompilationCache")
      var PageDotaddCompilationCache: `187`
      
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
        * Clears the overridden device metrics.
        */
      @JSName("Page.clearDeviceMetricsOverride")
      var PageDotclearDeviceMetricsOverride: ParamsType
      
      /**
        * Clears the overridden Device Orientation.
        */
      @JSName("Page.clearDeviceOrientationOverride")
      var PageDotclearDeviceOrientationOverride: ParamsType
      
      /**
        * Clears the overridden Geolocation Position and Error.
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
      var PageDotdeleteCookie: `166`
      
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
      var PageDotgenerateTestReport: `190`
      
      @JSName("Page.getAdScriptId")
      var PageDotgetAdScriptId: ReturnTypeGetAdScriptIdResponse
      
      /**
        * Returns the unique (PWA) app id.
        * Only returns values if the feature flag 'WebAppEnableManifestId' is enabled
        */
      @JSName("Page.getAppId")
      var PageDotgetAppId: ReturnTypeGetAppIdResponse
      
      @JSName("Page.getAppManifest")
      var PageDotgetAppManifest: ReturnTypeGetAppManifestResponse
      
      /**
        * Returns all browser cookies for the page and all of its subframes. Depending
        * on the backend support, will return detailed cookie information in the
        * `cookies` field.
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
      
      /**
        * Deprecated because it's not guaranteed that the returned icon is in fact the one used for PWA installation.
        */
      @JSName("Page.getManifestIcons")
      var PageDotgetManifestIcons: ReturnTypeGetManifestIconsResponse
      
      /**
        * Returns navigation history for the current page.
        */
      @JSName("Page.getNavigationHistory")
      var PageDotgetNavigationHistory: ReturnTypeGetNavigationHistoryResponse
      
      /**
        * Get Origin Trials on given frame.
        */
      @JSName("Page.getOriginTrials")
      var PageDotgetOriginTrials: ReturnTypeGetOriginTrialsResponse
      
      /**
        * Get Permissions Policy state on given frame.
        */
      @JSName("Page.getPermissionsPolicyState")
      var PageDotgetPermissionsPolicyState: ReturnTypeGetPermissionsPolicyStateResponse
      
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
      var PageDothandleJavaScriptDialog: `167`
      
      /**
        * Navigates current page to the given URL.
        */
      @JSName("Page.navigate")
      var PageDotnavigate: ReturnTypeNavigateResponse
      
      /**
        * Navigates current page to the given history entry.
        */
      @JSName("Page.navigateToHistoryEntry")
      var PageDotnavigateToHistoryEntry: `168`
      
      /**
        * Print page as PDF.
        */
      @JSName("Page.printToPDF")
      var PageDotprintToPDF: ReturnTypePrintToPDFResponse
      
      /**
        * Requests backend to produce compilation cache for the specified scripts.
        * `scripts` are appeneded to the list of scripts for which the cache
        * would be produced. The list may be reset during page navigation.
        * When script with a matching URL is encountered, the cache is optionally
        * produced upon backend discretion, based on internal heuristics.
        * See also: `Page.compilationCacheProduced`.
        */
      @JSName("Page.produceCompilationCache")
      var PageDotproduceCompilationCache: `186`
      
      /**
        * Reloads given page optionally ignoring the cache.
        */
      @JSName("Page.reload")
      var PageDotreload: `169`
      
      /**
        * Deprecated, please use removeScriptToEvaluateOnNewDocument instead.
        */
      @JSName("Page.removeScriptToEvaluateOnLoad")
      var PageDotremoveScriptToEvaluateOnLoad: `170`
      
      /**
        * Removes given script from the list.
        */
      @JSName("Page.removeScriptToEvaluateOnNewDocument")
      var PageDotremoveScriptToEvaluateOnNewDocument: `171`
      
      /**
        * Resets navigation history for the current page.
        */
      @JSName("Page.resetNavigationHistory")
      var PageDotresetNavigationHistory: ParamsType
      
      /**
        * Acknowledges that a screencast frame has been received by the frontend.
        */
      @JSName("Page.screencastFrameAck")
      var PageDotscreencastFrameAck: `172`
      
      /**
        * Searches for given string in resource content.
        */
      @JSName("Page.searchInResource")
      var PageDotsearchInResource: ReturnTypeSearchInResourceResponse
      
      /**
        * Enable Chrome's experimental ad filter on all sites.
        */
      @JSName("Page.setAdBlockingEnabled")
      var PageDotsetAdBlockingEnabled: `173`
      
      /**
        * Enable page Content Security Policy by-passing.
        */
      @JSName("Page.setBypassCSP")
      var PageDotsetBypassCSP: `174`
      
      /**
        * Overrides the values of device screen dimensions (window.screen.width, window.screen.height,
        * window.innerWidth, window.innerHeight, and "device-width"/"device-height"-related CSS media
        * query results).
        */
      @JSName("Page.setDeviceMetricsOverride")
      var PageDotsetDeviceMetricsOverride: `175`
      
      /**
        * Overrides the Device Orientation.
        */
      @JSName("Page.setDeviceOrientationOverride")
      var PageDotsetDeviceOrientationOverride: `176`
      
      /**
        * Sets given markup as the document's HTML.
        */
      @JSName("Page.setDocumentContent")
      var PageDotsetDocumentContent: `179`
      
      /**
        * Set the behavior when downloading a file.
        */
      @JSName("Page.setDownloadBehavior")
      var PageDotsetDownloadBehavior: `180`
      
      /**
        * Set generic font families.
        */
      @JSName("Page.setFontFamilies")
      var PageDotsetFontFamilies: `177`
      
      /**
        * Set default font sizes.
        */
      @JSName("Page.setFontSizes")
      var PageDotsetFontSizes: `178`
      
      /**
        * Overrides the Geolocation Position or Error. Omitting any of the parameters emulates position
        * unavailable.
        */
      @JSName("Page.setGeolocationOverride")
      var PageDotsetGeolocationOverride: `181`
      
      /**
        * Intercept file chooser requests and transfer control to protocol clients.
        * When file chooser interception is enabled, native file chooser dialog is not shown.
        * Instead, a protocol event `Page.fileChooserOpened` is emitted.
        */
      @JSName("Page.setInterceptFileChooserDialog")
      var PageDotsetInterceptFileChooserDialog: `191`
      
      /**
        * Controls whether page will emit lifecycle events.
        */
      @JSName("Page.setLifecycleEventsEnabled")
      var PageDotsetLifecycleEventsEnabled: `182`
      
      /**
        * Enable/disable prerendering manually.
        * 
        * This command is a short-term solution for https://crbug.com/1440085.
        * See https://docs.google.com/document/d/12HVmFxYj5Jc-eJr5OmWsa2bqTJsbgGLKI6ZIyx0_wpA
        * for more details.
        * 
        * TODO(https://crbug.com/1440085): Remove this once Puppeteer supports tab targets.
        */
      @JSName("Page.setPrerenderingAllowed")
      var PageDotsetPrerenderingAllowed: `192`
      
      /**
        * Extensions for Custom Handlers API:
        * https://html.spec.whatwg.org/multipage/system-state.html#rph-automation
        */
      @JSName("Page.setRPHRegistrationMode")
      var PageDotsetRPHRegistrationMode: `189`
      
      /**
        * Sets the Secure Payment Confirmation transaction mode.
        * https://w3c.github.io/secure-payment-confirmation/#sctn-automation-set-spc-transaction-mode
        */
      @JSName("Page.setSPCTransactionMode")
      var PageDotsetSPCTransactionMode: `188`
      
      /**
        * Toggles mouse event-based touch event emulation.
        */
      @JSName("Page.setTouchEmulationEnabled")
      var PageDotsetTouchEmulationEnabled: `183`
      
      /**
        * Tries to update the web lifecycle state of the page.
        * It will transition the page to the given state according to:
        * https://github.com/WICG/web-lifecycle/
        */
      @JSName("Page.setWebLifecycleState")
      var PageDotsetWebLifecycleState: `185`
      
      /**
        * Starts sending each frame using the `screencastFrame` event.
        */
      @JSName("Page.startScreencast")
      var PageDotstartScreencast: `184`
      
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
      var PerformanceDotenable: `193`
      
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
      var PerformanceDotsetTimeDomain: `194`
      
      /**
        * Previously buffered events would be reported before method returns.
        * See also: timelineEventAdded
        */
      @JSName("PerformanceTimeline.enable")
      var PerformanceTimelineDotenable: `195`
      
      @JSName("Preload.disable")
      var PreloadDotdisable: ParamsType
      
      @JSName("Preload.enable")
      var PreloadDotenable: ParamsType
      
      @JSName("Profiler.disable")
      var ProfilerDotdisable: ParamsType
      
      @JSName("Profiler.enable")
      var ProfilerDotenable: ParamsType
      
      /**
        * Collect coverage data for the current isolate. The coverage data may be incomplete due to
        * garbage collection.
        */
      @JSName("Profiler.getBestEffortCoverage")
      var ProfilerDotgetBestEffortCoverage: ReturnTypeGetBestEffortCoverageResponse
      
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
      
      @JSName("Profiler.stop")
      var ProfilerDotstop: ReturnTypeStopResponse
      
      /**
        * Disable precise code coverage. Disabling releases unnecessary execution count records and allows
        * executing optimized code.
        */
      @JSName("Profiler.stopPreciseCoverage")
      var ProfilerDotstopPreciseCoverage: ParamsType
      
      /**
        * Collect coverage data for the current isolate, and resets execution counters. Precise code
        * coverage needs to have started.
        */
      @JSName("Profiler.takePreciseCoverage")
      var ProfilerDottakePreciseCoverage: ReturnTypeTakePreciseCoverageResponse
      
      /**
        * If executionContextId is empty, adds binding with the given name on the
        * global objects of all inspected contexts, including those created later,
        * bindings survive reloads.
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
        * This method tries to lookup and populate exception details for a
        * JavaScript Error object.
        * Note that the stackTrace portion of the resulting exceptionDetails will
        * only be populated if the Runtime domain was enabled at the time when the
        * Error was thrown.
        */
      @JSName("Runtime.getExceptionDetails")
      var RuntimeDotgetExceptionDetails: ReturnTypeGetExceptionDetailsResponse
      
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
      var SecurityDothandleCertificateError: `197`
      
      /**
        * Enable/disable whether all certificate errors should be ignored.
        */
      @JSName("Security.setIgnoreCertificateErrors")
      var SecurityDotsetIgnoreCertificateErrors: `196`
      
      /**
        * Enable/disable overriding certificate errors. If enabled, all certificate error events need to
        * be handled by the DevTools client and should be answered with `handleCertificateError` commands.
        */
      @JSName("Security.setOverrideCertificateErrors")
      var SecurityDotsetOverrideCertificateErrors: `198`
      
      @JSName("ServiceWorker.deliverPushMessage")
      var ServiceWorkerDotdeliverPushMessage: `199`
      
      @JSName("ServiceWorker.disable")
      var ServiceWorkerDotdisable: ParamsType
      
      @JSName("ServiceWorker.dispatchPeriodicSyncEvent")
      var ServiceWorkerDotdispatchPeriodicSyncEvent: `201`
      
      @JSName("ServiceWorker.dispatchSyncEvent")
      var ServiceWorkerDotdispatchSyncEvent: `200`
      
      @JSName("ServiceWorker.enable")
      var ServiceWorkerDotenable: ParamsType
      
      @JSName("ServiceWorker.inspectWorker")
      var ServiceWorkerDotinspectWorker: `202`
      
      @JSName("ServiceWorker.setForceUpdateOnPageLoad")
      var ServiceWorkerDotsetForceUpdateOnPageLoad: `203`
      
      @JSName("ServiceWorker.skipWaiting")
      var ServiceWorkerDotskipWaiting: `204`
      
      @JSName("ServiceWorker.startWorker")
      var ServiceWorkerDotstartWorker: `205`
      
      @JSName("ServiceWorker.stopAllWorkers")
      var ServiceWorkerDotstopAllWorkers: ParamsType
      
      @JSName("ServiceWorker.stopWorker")
      var ServiceWorkerDotstopWorker: `206`
      
      @JSName("ServiceWorker.unregister")
      var ServiceWorkerDotunregister: `207`
      
      @JSName("ServiceWorker.updateRegistration")
      var ServiceWorkerDotupdateRegistration: `208`
      
      /**
        * Clears cookies.
        */
      @JSName("Storage.clearCookies")
      var StorageDotclearCookies: `213`
      
      /**
        * Clears storage for origin.
        */
      @JSName("Storage.clearDataForOrigin")
      var StorageDotclearDataForOrigin: `209`
      
      /**
        * Clears storage for storage key.
        */
      @JSName("Storage.clearDataForStorageKey")
      var StorageDotclearDataForStorageKey: `210`
      
      /**
        * Clears all entries for a given origin's shared storage.
        */
      @JSName("Storage.clearSharedStorageEntries")
      var StorageDotclearSharedStorageEntries: `226`
      
      /**
        * Removes all Trust Tokens issued by the provided issuerOrigin.
        * Leaves other stored data, including the issuer's Redemption Records, intact.
        */
      @JSName("Storage.clearTrustTokens")
      var StorageDotclearTrustTokens: ReturnTypeClearTrustTokensResponse
      
      /**
        * Deletes entry for `key` (if it exists) for a given origin's shared storage.
        */
      @JSName("Storage.deleteSharedStorageEntry")
      var StorageDotdeleteSharedStorageEntry: `225`
      
      /**
        * Deletes the Storage Bucket with the given storage key and bucket name.
        */
      @JSName("Storage.deleteStorageBucket")
      var StorageDotdeleteStorageBucket: `230`
      
      /**
        * Returns all browser cookies.
        */
      @JSName("Storage.getCookies")
      var StorageDotgetCookies: `211`
      
      /**
        * Gets details for a named interest group.
        */
      @JSName("Storage.getInterestGroupDetails")
      var StorageDotgetInterestGroupDetails: ReturnTypeGetInterestGroupDetailsResponse
      
      /**
        * Gets the entries in an given origin's shared storage.
        */
      @JSName("Storage.getSharedStorageEntries")
      var StorageDotgetSharedStorageEntries: ReturnTypeGetSharedStorageEntriesResponse
      
      /**
        * Gets metadata for an origin's shared storage.
        */
      @JSName("Storage.getSharedStorageMetadata")
      var StorageDotgetSharedStorageMetadata: ReturnTypeGetSharedStorageMetadataResponse
      
      /**
        * Returns a storage key given a frame id.
        */
      @JSName("Storage.getStorageKeyForFrame")
      var StorageDotgetStorageKeyForFrame: ReturnTypeGetStorageKeyForFrameResponse
      
      /**
        * Returns the number of stored Trust Tokens per issuer for the
        * current browsing context.
        */
      @JSName("Storage.getTrustTokens")
      var StorageDotgetTrustTokens: ReturnTypeGetTrustTokensResponse
      
      /**
        * Returns usage and quota in bytes.
        */
      @JSName("Storage.getUsageAndQuota")
      var StorageDotgetUsageAndQuota: ReturnTypeGetUsageAndQuotaResponse
      
      /**
        * Override quota for the specified origin
        */
      @JSName("Storage.overrideQuotaForOrigin")
      var StorageDotoverrideQuotaForOrigin: `214`
      
      /**
        * Resets the budget for `ownerOrigin` by clearing all budget withdrawals.
        */
      @JSName("Storage.resetSharedStorageBudget")
      var StorageDotresetSharedStorageBudget: `227`
      
      /**
        * Deletes state for sites identified as potential bounce trackers, immediately.
        */
      @JSName("Storage.runBounceTrackingMitigations")
      var StorageDotrunBounceTrackingMitigations: ReturnTypeRunBounceTrackingMitigationsResponse
      
      /**
        * Sets given cookies.
        */
      @JSName("Storage.setCookies")
      var StorageDotsetCookies: `212`
      
      /**
        * Enables/Disables issuing of interestGroupAccessed events.
        */
      @JSName("Storage.setInterestGroupTracking")
      var StorageDotsetInterestGroupTracking: `223`
      
      /**
        * Sets entry with `key` and `value` for a given origin's shared storage.
        */
      @JSName("Storage.setSharedStorageEntry")
      var StorageDotsetSharedStorageEntry: `224`
      
      /**
        * Enables/disables issuing of sharedStorageAccessed events.
        */
      @JSName("Storage.setSharedStorageTracking")
      var StorageDotsetSharedStorageTracking: `228`
      
      /**
        * Set tracking for a storage key's buckets.
        */
      @JSName("Storage.setStorageBucketTracking")
      var StorageDotsetStorageBucketTracking: `229`
      
      /**
        * Registers origin to be notified when an update occurs to its cache storage list.
        */
      @JSName("Storage.trackCacheStorageForOrigin")
      var StorageDottrackCacheStorageForOrigin: `215`
      
      /**
        * Registers storage key to be notified when an update occurs to its cache storage list.
        */
      @JSName("Storage.trackCacheStorageForStorageKey")
      var StorageDottrackCacheStorageForStorageKey: `216`
      
      /**
        * Registers origin to be notified when an update occurs to its IndexedDB.
        */
      @JSName("Storage.trackIndexedDBForOrigin")
      var StorageDottrackIndexedDBForOrigin: `217`
      
      /**
        * Registers storage key to be notified when an update occurs to its IndexedDB.
        */
      @JSName("Storage.trackIndexedDBForStorageKey")
      var StorageDottrackIndexedDBForStorageKey: `218`
      
      /**
        * Unregisters origin from receiving notifications for cache storage.
        */
      @JSName("Storage.untrackCacheStorageForOrigin")
      var StorageDotuntrackCacheStorageForOrigin: `219`
      
      /**
        * Unregisters storage key from receiving notifications for cache storage.
        */
      @JSName("Storage.untrackCacheStorageForStorageKey")
      var StorageDotuntrackCacheStorageForStorageKey: `220`
      
      /**
        * Unregisters origin from receiving notifications for IndexedDB.
        */
      @JSName("Storage.untrackIndexedDBForOrigin")
      var StorageDotuntrackIndexedDBForOrigin: `221`
      
      /**
        * Unregisters storage key from receiving notifications for IndexedDB.
        */
      @JSName("Storage.untrackIndexedDBForStorageKey")
      var StorageDotuntrackIndexedDBForStorageKey: `222`
      
      /**
        * Returns information about the feature state.
        */
      @JSName("SystemInfo.getFeatureState")
      var SystemInfoDotgetFeatureState: ReturnTypeGetFeatureStateResponse
      
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
      var TargetDotactivateTarget: `231`
      
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
        * Adds the specified target to the list of targets that will be monitored for any related target
        * creation (such as child frames, child workers and new versions of service worker) and reported
        * through `attachedToTarget`. The specified target is also auto-attached.
        * This cancels the effect of any previous `setAutoAttach` and is also cancelled by subsequent
        * `setAutoAttach`. Only available at the Browser target.
        */
      @JSName("Target.autoAttachRelated")
      var TargetDotautoAttachRelated: `237`
      
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
      var TargetDotdetachFromTarget: `233`
      
      /**
        * Deletes a BrowserContext. All the belonging pages will be closed without calling their
        * beforeunload hooks.
        */
      @JSName("Target.disposeBrowserContext")
      var TargetDotdisposeBrowserContext: `234`
      
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
      var TargetDotexposeDevToolsProtocol: `232`
      
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
      var TargetDotsendMessageToTarget: `235`
      
      /**
        * Controls whether to automatically attach to new targets which are considered to be related to
        * this one. When turned on, attaches to all existing related targets as well. When turned off,
        * automatically detaches from all currently attached targets.
        * This also clears all targets added by `autoAttachRelated` from the list of targets to watch
        * for creation of related targets.
        */
      @JSName("Target.setAutoAttach")
      var TargetDotsetAutoAttach: `236`
      
      /**
        * Controls whether to discover available targets and notify via
        * `targetCreated/targetInfoChanged/targetDestroyed` events.
        */
      @JSName("Target.setDiscoverTargets")
      var TargetDotsetDiscoverTargets: `238`
      
      /**
        * Enables target discovery for the specified locations, when `setDiscoverTargets` was set to
        * `true`.
        */
      @JSName("Target.setRemoteLocations")
      var TargetDotsetRemoteLocations: `239`
      
      /**
        * Request browser port binding.
        */
      @JSName("Tethering.bind")
      var TetheringDotbind: `240`
      
      /**
        * Request browser port unbinding.
        */
      @JSName("Tethering.unbind")
      var TetheringDotunbind: `241`
      
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
      var TracingDotrecordClockSyncMarker: `242`
      
      /**
        * Request a global memory dump.
        */
      @JSName("Tracing.requestMemoryDump")
      var TracingDotrequestMemoryDump: ReturnTypeRequestMemoryDumpResponse
      
      /**
        * Start trace events collection.
        */
      @JSName("Tracing.start")
      var TracingDotstart: `243`
      
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
      var WebAuthnDotaddCredential: `253`
      
      /**
        * Creates and adds a virtual authenticator.
        */
      @JSName("WebAuthn.addVirtualAuthenticator")
      var WebAuthnDotaddVirtualAuthenticator: ReturnTypeAddVirtualAuthenticatorResponse
      
      /**
        * Clears all the credentials from the specified device.
        */
      @JSName("WebAuthn.clearCredentials")
      var WebAuthnDotclearCredentials: `255`
      
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
      var WebAuthnDotenable: `250`
      
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
      var WebAuthnDotremoveCredential: `254`
      
      /**
        * Removes the given authenticator.
        */
      @JSName("WebAuthn.removeVirtualAuthenticator")
      var WebAuthnDotremoveVirtualAuthenticator: `252`
      
      /**
        * Sets whether tests of user presence will succeed immediately (if true) or fail to resolve (if false) for an authenticator.
        * The default is true.
        */
      @JSName("WebAuthn.setAutomaticPresenceSimulation")
      var WebAuthnDotsetAutomaticPresenceSimulation: `257`
      
      /**
        * Resets parameters isBogusSignature, isBadUV, isBadUP to false if they are not present.
        */
      @JSName("WebAuthn.setResponseOverrideBits")
      var WebAuthnDotsetResponseOverrideBits: `251`
      
      /**
        * Sets whether User Verification succeeds or fails for an authenticator.
        * The default is true.
        */
      @JSName("WebAuthn.setUserVerified")
      var WebAuthnDotsetUserVerified: `256`
    }
    object Commands {
      
      inline def apply(
        AccessibilityDotdisable: ParamsType,
        AccessibilityDotenable: ParamsType,
        AccessibilityDotgetAXNodeAndAncestors: ReturnTypeGetAXNodeAndAncestorsResponse,
        AccessibilityDotgetChildAXNodes: ReturnTypeGetChildAXNodesResponse,
        AccessibilityDotgetFullAXTree: ReturnTypeGetFullAXTreeResponse,
        AccessibilityDotgetPartialAXTree: ReturnTypeGetPartialAXTreeResponse,
        AccessibilityDotgetRootAXNode: ReturnTypeGetRootAXNodeResponse,
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
        AuditsDotcheckContrast: `29`,
        AuditsDotcheckFormsIssues: ReturnTypeCheckFormsIssuesResponse,
        AuditsDotdisable: ParamsType,
        AuditsDotenable: ParamsType,
        AuditsDotgetEncodedResponse: ReturnTypeGetEncodedResponseResponse,
        AutofillDotsetAddresses: `31`,
        AutofillDottrigger: `30`,
        BackgroundServiceDotclearEvents: `35`,
        BackgroundServiceDotsetRecording: `34`,
        BackgroundServiceDotstartObserving: `32`,
        BackgroundServiceDotstopObserving: `33`,
        BrowserDotaddPrivacySandboxEnrollmentOverride: `44`,
        BrowserDotcancelDownload: `40`,
        BrowserDotclose: ParamsType,
        BrowserDotcrash: ParamsType,
        BrowserDotcrashGpuProcess: ParamsType,
        BrowserDotexecuteBrowserCommand: `43`,
        BrowserDotgetBrowserCommandLine: ReturnTypeGetBrowserCommandLineResponse,
        BrowserDotgetHistogram: ReturnTypeGetHistogramResponse,
        BrowserDotgetHistograms: ReturnTypeGetHistogramsResponse,
        BrowserDotgetVersion: ReturnTypeGetVersionResponse,
        BrowserDotgetWindowBounds: ReturnTypeGetWindowBoundsResponse,
        BrowserDotgetWindowForTarget: ReturnTypeGetWindowForTargetResponse,
        BrowserDotgrantPermissions: `37`,
        BrowserDotresetPermissions: `38`,
        BrowserDotsetDockTile: `42`,
        BrowserDotsetDownloadBehavior: `39`,
        BrowserDotsetPermission: `36`,
        BrowserDotsetWindowBounds: `41`,
        CSSDotaddRule: ReturnTypeAddRuleResponse,
        CSSDotcollectClassNames: ReturnTypeCollectClassNamesResponse,
        CSSDotcreateStyleSheet: ReturnTypeCreateStyleSheetResponse,
        CSSDotdisable: ParamsType,
        CSSDotenable: ParamsType,
        CSSDotforcePseudoState: `45`,
        CSSDotgetBackgroundColors: ReturnTypeGetBackgroundColorsResponse,
        CSSDotgetComputedStyleForNode: ReturnTypeGetComputedStyleForNodeResponse,
        CSSDotgetInlineStylesForNode: ReturnTypeGetInlineStylesForNodeResponse,
        CSSDotgetLayersForNode: ReturnTypeGetLayersForNodeResponse,
        CSSDotgetMatchedStylesForNode: ReturnTypeGetMatchedStylesForNodeResponse,
        CSSDotgetMediaQueries: ReturnTypeGetMediaQueriesResponse,
        CSSDotgetPlatformFontsForNode: ReturnTypeGetPlatformFontsForNodeResponse,
        CSSDotgetStyleSheetText: ReturnTypeGetStyleSheetTextResponse,
        CSSDotsetContainerQueryText: ReturnTypeSetContainerQueryTextResponse,
        CSSDotsetEffectivePropertyValueForNode: `47`,
        CSSDotsetKeyframeKey: ReturnTypeSetKeyframeKeyResponse,
        CSSDotsetLocalFontsEnabled: `48`,
        CSSDotsetMediaText: ReturnTypeSetMediaTextResponse,
        CSSDotsetRuleSelector: ReturnTypeSetRuleSelectorResponse,
        CSSDotsetScopeText: ReturnTypeSetScopeTextResponse,
        CSSDotsetStyleSheetText: ReturnTypeSetStyleSheetTextResponse,
        CSSDotsetStyleTexts: ReturnTypeSetStyleTextsResponse,
        CSSDotsetSupportsText: ReturnTypeSetSupportsTextResponse,
        CSSDotstartRuleUsageTracking: ParamsType,
        CSSDotstopRuleUsageTracking: ReturnTypeStopRuleUsageTrackingResponse,
        CSSDottakeComputedStyleUpdates: ReturnTypeTakeComputedStyleUpdatesResponse,
        CSSDottakeCoverageDelta: ReturnTypeTakeCoverageDeltaResponse,
        CSSDottrackComputedStyleUpdates: `46`,
        CacheStorageDotdeleteCache: `49`,
        CacheStorageDotdeleteEntry: `50`,
        CacheStorageDotrequestCacheNames: ReturnTypeRequestCacheNamesResponse,
        CacheStorageDotrequestCachedResponse: ReturnTypeRequestCachedResponseResponse,
        CacheStorageDotrequestEntries: ReturnTypeRequestEntriesResponse,
        CastDotdisable: ParamsType,
        CastDotenable: `51`,
        CastDotsetSinkToUse: `52`,
        CastDotstartDesktopMirroring: `53`,
        CastDotstartTabMirroring: `54`,
        CastDotstopCasting: `55`,
        ConsoleDotclearMessages: ParamsType,
        ConsoleDotdisable: ParamsType,
        ConsoleDotenable: ParamsType,
        DOMDebuggerDotgetEventListeners: ReturnTypeGetEventListenersResponse,
        DOMDebuggerDotremoveDOMBreakpoint: `70`,
        DOMDebuggerDotremoveEventListenerBreakpoint: `71`,
        DOMDebuggerDotremoveInstrumentationBreakpoint: `72`,
        DOMDebuggerDotremoveXHRBreakpoint: `73`,
        DOMDebuggerDotsetBreakOnCSPViolation: `74`,
        DOMDebuggerDotsetDOMBreakpoint: `75`,
        DOMDebuggerDotsetEventListenerBreakpoint: `76`,
        DOMDebuggerDotsetInstrumentationBreakpoint: `77`,
        DOMDebuggerDotsetXHRBreakpoint: `78`,
        DOMDotcollectClassNamesFromSubtree: ReturnTypeCollectClassNamesFromSubtreeResponse,
        DOMDotcopyTo: ReturnTypeCopyToResponse,
        DOMDotdescribeNode: ReturnTypeDescribeNodeResponse,
        DOMDotdisable: ParamsType,
        DOMDotdiscardSearchResults: `57`,
        DOMDotenable: `58`,
        DOMDotfocus: `59`,
        DOMDotgetAttributes: ReturnTypeGetAttributesResponse,
        DOMDotgetBoxModel: ReturnTypeGetBoxModelResponse,
        DOMDotgetContainerForNode: ReturnTypeGetContainerForNodeResponse,
        DOMDotgetContentQuads: ReturnTypeGetContentQuadsResponse,
        DOMDotgetDocument: ReturnTypeGetDocumentResponse,
        DOMDotgetFileInfo: ReturnTypeGetFileInfoResponse,
        DOMDotgetFlattenedDocument: ReturnTypeGetFlattenedDocumentResponse,
        DOMDotgetFrameOwner: ReturnTypeGetFrameOwnerResponse,
        DOMDotgetNodeForLocation: ReturnTypeGetNodeForLocationResponse,
        DOMDotgetNodeStackTraces: ReturnTypeGetNodeStackTracesResponse,
        DOMDotgetNodesForSubtreeByStyle: ReturnTypeGetNodesForSubtreeByStyleResponse,
        DOMDotgetOuterHTML: ReturnTypeGetOuterHTMLResponse,
        DOMDotgetQueryingDescendantsForContainer: ReturnTypeGetQueryingDescendantsForContainerResponse,
        DOMDotgetRelayoutBoundary: ReturnTypeGetRelayoutBoundaryResponse,
        DOMDotgetSearchResults: ReturnTypeGetSearchResultsResponse,
        DOMDotgetTopLayerElements: ReturnTypeGetTopLayerElementsResponse,
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
        DOMDotremoveAttribute: `60`,
        DOMDotremoveNode: `61`,
        DOMDotrequestChildNodes: `62`,
        DOMDotrequestNode: ReturnTypeRequestNodeResponse,
        DOMDotresolveNode: ReturnTypeResolveNodeResponse,
        DOMDotscrollIntoViewIfNeeded: `56`,
        DOMDotsetAttributeValue: `63`,
        DOMDotsetAttributesAsText: `64`,
        DOMDotsetFileInputFiles: `65`,
        DOMDotsetInspectedNode: `67`,
        DOMDotsetNodeName: ReturnTypeSetNodeNameResponse,
        DOMDotsetNodeStackTracesEnabled: `66`,
        DOMDotsetNodeValue: `68`,
        DOMDotsetOuterHTML: `69`,
        DOMDotundo: ParamsType,
        DOMSnapshotDotcaptureSnapshot: ReturnTypeCaptureSnapshotResponse,
        DOMSnapshotDotdisable: ParamsType,
        DOMSnapshotDotenable: ParamsType,
        DOMSnapshotDotgetSnapshot: ReturnTypeGetSnapshotResponse,
        DOMStorageDotclear: `81`,
        DOMStorageDotdisable: ParamsType,
        DOMStorageDotenable: ParamsType,
        DOMStorageDotgetDOMStorageItems: ReturnTypeGetDOMStorageItemsResponse,
        DOMStorageDotremoveDOMStorageItem: `82`,
        DOMStorageDotsetDOMStorageItem: `83`,
        DatabaseDotdisable: ParamsType,
        DatabaseDotenable: ParamsType,
        DatabaseDotexecuteSQL: ReturnTypeExecuteSQLResponse,
        DatabaseDotgetDatabaseTableNames: ReturnTypeGetDatabaseTableNamesResponse,
        DebuggerDotcontinueToLocation: ReturnType,
        DebuggerDotdisable: ParamsType,
        DebuggerDotdisassembleWasmModule: ReturnTypeDisassembleWasmModuleResponse,
        DebuggerDotenable: ParamsTypeReturnType,
        DebuggerDotevaluateOnCallFrame: ReturnTypeEvaluateOnCallFrameResponse,
        DebuggerDotgetPossibleBreakpoints: ReturnTypeGetPossibleBreakpointsResponse,
        DebuggerDotgetScriptSource: ReturnTypeGetScriptSourceResponse,
        DebuggerDotgetStackTrace: ReturnTypeGetStackTraceResponse,
        DebuggerDotgetWasmBytecode: ReturnTypeGetWasmBytecodeResponse,
        DebuggerDotnextWasmDisassemblyChunk: ReturnTypeNextWasmDisassemblyChunkResponse,
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
        DeviceAccessDotcancelPrompt: `259`,
        DeviceAccessDotdisable: ParamsType,
        DeviceAccessDotenable: ParamsType,
        DeviceAccessDotselectPrompt: `258`,
        DeviceOrientationDotclearDeviceOrientationOverride: ParamsType,
        DeviceOrientationDotsetDeviceOrientationOverride: `84`,
        EmulationDotcanEmulate: ReturnTypeCanEmulateResponse,
        EmulationDotclearDeviceMetricsOverride: ParamsType,
        EmulationDotclearGeolocationOverride: ParamsType,
        EmulationDotclearIdleOverride: ParamsType,
        EmulationDotresetPageScaleFactor: ParamsType,
        EmulationDotsetAutoDarkModeOverride: `86`,
        EmulationDotsetAutomationOverride: `107`,
        EmulationDotsetCPUThrottlingRate: `87`,
        EmulationDotsetDefaultBackgroundColorOverride: `88`,
        EmulationDotsetDeviceMetricsOverride: `89`,
        EmulationDotsetDisabledImageTypes: `104`,
        EmulationDotsetDocumentCookieDisabled: `91`,
        EmulationDotsetEmitTouchEventsForMouse: `92`,
        EmulationDotsetEmulatedMedia: `93`,
        EmulationDotsetEmulatedVisionDeficiency: `94`,
        EmulationDotsetFocusEmulationEnabled: `85`,
        EmulationDotsetGeolocationOverride: `95`,
        EmulationDotsetHardwareConcurrencyOverride: `105`,
        EmulationDotsetIdleOverride: `96`,
        EmulationDotsetLocaleOverride: `101`,
        EmulationDotsetNavigatorOverrides: `97`,
        EmulationDotsetPageScaleFactor: `98`,
        EmulationDotsetScriptExecutionDisabled: `99`,
        EmulationDotsetScrollbarsHidden: `90`,
        EmulationDotsetTimezoneOverride: `102`,
        EmulationDotsetTouchEmulationEnabled: `100`,
        EmulationDotsetUserAgentOverride: `106`,
        EmulationDotsetVirtualTimePolicy: ReturnTypeSetVirtualTimePolicyResponse,
        EmulationDotsetVisibleSize: `103`,
        EventBreakpointsDotremoveInstrumentationBreakpoint: `80`,
        EventBreakpointsDotsetInstrumentationBreakpoint: `79`,
        FedCmDotdisable: ParamsType,
        FedCmDotdismissDialog: `262`,
        FedCmDotenable: `260`,
        FedCmDotresetCooldown: ParamsType,
        FedCmDotselectAccount: `261`,
        FetchDotcontinueRequest: `247`,
        FetchDotcontinueResponse: `249`,
        FetchDotcontinueWithAuth: `248`,
        FetchDotdisable: ParamsType,
        FetchDotenable: `244`,
        FetchDotfailRequest: `245`,
        FetchDotfulfillRequest: `246`,
        FetchDotgetResponseBody: ParamsTypeReturnTypeGetResponseBodyResponse,
        FetchDottakeResponseBodyAsStream: ReturnTypeTakeResponseBodyAsStreamResponse,
        HeadlessExperimentalDotbeginFrame: ReturnTypeBeginFrameResponse,
        HeadlessExperimentalDotdisable: ParamsType,
        HeadlessExperimentalDotenable: ParamsType,
        HeapProfilerDotaddInspectedHeapObject: `11`,
        HeapProfilerDotcollectGarbage: ParamsType,
        HeapProfilerDotdisable: ParamsType,
        HeapProfilerDotenable: ParamsType,
        HeapProfilerDotgetHeapObjectId: ReturnTypeGetHeapObjectIdResponse
      ): Commands = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("Accessibility.disable")(AccessibilityDotdisable.asInstanceOf[js.Any])
        __obj.updateDynamic("Accessibility.enable")(AccessibilityDotenable.asInstanceOf[js.Any])
        __obj.updateDynamic("Accessibility.getAXNodeAndAncestors")(AccessibilityDotgetAXNodeAndAncestors.asInstanceOf[js.Any])
        __obj.updateDynamic("Accessibility.getChildAXNodes")(AccessibilityDotgetChildAXNodes.asInstanceOf[js.Any])
        __obj.updateDynamic("Accessibility.getFullAXTree")(AccessibilityDotgetFullAXTree.asInstanceOf[js.Any])
        __obj.updateDynamic("Accessibility.getPartialAXTree")(AccessibilityDotgetPartialAXTree.asInstanceOf[js.Any])
        __obj.updateDynamic("Accessibility.getRootAXNode")(AccessibilityDotgetRootAXNode.asInstanceOf[js.Any])
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
        __obj.updateDynamic("Audits.checkContrast")(AuditsDotcheckContrast.asInstanceOf[js.Any])
        __obj.updateDynamic("Audits.checkFormsIssues")(AuditsDotcheckFormsIssues.asInstanceOf[js.Any])
        __obj.updateDynamic("Audits.disable")(AuditsDotdisable.asInstanceOf[js.Any])
        __obj.updateDynamic("Audits.enable")(AuditsDotenable.asInstanceOf[js.Any])
        __obj.updateDynamic("Audits.getEncodedResponse")(AuditsDotgetEncodedResponse.asInstanceOf[js.Any])
        __obj.updateDynamic("Autofill.setAddresses")(AutofillDotsetAddresses.asInstanceOf[js.Any])
        __obj.updateDynamic("Autofill.trigger")(AutofillDottrigger.asInstanceOf[js.Any])
        __obj.updateDynamic("BackgroundService.clearEvents")(BackgroundServiceDotclearEvents.asInstanceOf[js.Any])
        __obj.updateDynamic("BackgroundService.setRecording")(BackgroundServiceDotsetRecording.asInstanceOf[js.Any])
        __obj.updateDynamic("BackgroundService.startObserving")(BackgroundServiceDotstartObserving.asInstanceOf[js.Any])
        __obj.updateDynamic("BackgroundService.stopObserving")(BackgroundServiceDotstopObserving.asInstanceOf[js.Any])
        __obj.updateDynamic("Browser.addPrivacySandboxEnrollmentOverride")(BrowserDotaddPrivacySandboxEnrollmentOverride.asInstanceOf[js.Any])
        __obj.updateDynamic("Browser.cancelDownload")(BrowserDotcancelDownload.asInstanceOf[js.Any])
        __obj.updateDynamic("Browser.close")(BrowserDotclose.asInstanceOf[js.Any])
        __obj.updateDynamic("Browser.crash")(BrowserDotcrash.asInstanceOf[js.Any])
        __obj.updateDynamic("Browser.crashGpuProcess")(BrowserDotcrashGpuProcess.asInstanceOf[js.Any])
        __obj.updateDynamic("Browser.executeBrowserCommand")(BrowserDotexecuteBrowserCommand.asInstanceOf[js.Any])
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
        __obj.updateDynamic("CSS.getLayersForNode")(CSSDotgetLayersForNode.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.getMatchedStylesForNode")(CSSDotgetMatchedStylesForNode.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.getMediaQueries")(CSSDotgetMediaQueries.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.getPlatformFontsForNode")(CSSDotgetPlatformFontsForNode.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.getStyleSheetText")(CSSDotgetStyleSheetText.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.setContainerQueryText")(CSSDotsetContainerQueryText.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.setEffectivePropertyValueForNode")(CSSDotsetEffectivePropertyValueForNode.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.setKeyframeKey")(CSSDotsetKeyframeKey.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.setLocalFontsEnabled")(CSSDotsetLocalFontsEnabled.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.setMediaText")(CSSDotsetMediaText.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.setRuleSelector")(CSSDotsetRuleSelector.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.setScopeText")(CSSDotsetScopeText.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.setStyleSheetText")(CSSDotsetStyleSheetText.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.setStyleTexts")(CSSDotsetStyleTexts.asInstanceOf[js.Any])
        __obj.updateDynamic("CSS.setSupportsText")(CSSDotsetSupportsText.asInstanceOf[js.Any])
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
        __obj.updateDynamic("Cast.startDesktopMirroring")(CastDotstartDesktopMirroring.asInstanceOf[js.Any])
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
        __obj.updateDynamic("DOMDebugger.setBreakOnCSPViolation")(DOMDebuggerDotsetBreakOnCSPViolation.asInstanceOf[js.Any])
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
        __obj.updateDynamic("DOM.getContainerForNode")(DOMDotgetContainerForNode.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.getContentQuads")(DOMDotgetContentQuads.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.getDocument")(DOMDotgetDocument.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.getFileInfo")(DOMDotgetFileInfo.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.getFlattenedDocument")(DOMDotgetFlattenedDocument.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.getFrameOwner")(DOMDotgetFrameOwner.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.getNodeForLocation")(DOMDotgetNodeForLocation.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.getNodeStackTraces")(DOMDotgetNodeStackTraces.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.getNodesForSubtreeByStyle")(DOMDotgetNodesForSubtreeByStyle.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.getOuterHTML")(DOMDotgetOuterHTML.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.getQueryingDescendantsForContainer")(DOMDotgetQueryingDescendantsForContainer.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.getRelayoutBoundary")(DOMDotgetRelayoutBoundary.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.getSearchResults")(DOMDotgetSearchResults.asInstanceOf[js.Any])
        __obj.updateDynamic("DOM.getTopLayerElements")(DOMDotgetTopLayerElements.asInstanceOf[js.Any])
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
        __obj.updateDynamic("Debugger.disassembleWasmModule")(DebuggerDotdisassembleWasmModule.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.enable")(DebuggerDotenable.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.evaluateOnCallFrame")(DebuggerDotevaluateOnCallFrame.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.getPossibleBreakpoints")(DebuggerDotgetPossibleBreakpoints.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.getScriptSource")(DebuggerDotgetScriptSource.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.getStackTrace")(DebuggerDotgetStackTrace.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.getWasmBytecode")(DebuggerDotgetWasmBytecode.asInstanceOf[js.Any])
        __obj.updateDynamic("Debugger.nextWasmDisassemblyChunk")(DebuggerDotnextWasmDisassemblyChunk.asInstanceOf[js.Any])
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
        __obj.updateDynamic("DeviceAccess.cancelPrompt")(DeviceAccessDotcancelPrompt.asInstanceOf[js.Any])
        __obj.updateDynamic("DeviceAccess.disable")(DeviceAccessDotdisable.asInstanceOf[js.Any])
        __obj.updateDynamic("DeviceAccess.enable")(DeviceAccessDotenable.asInstanceOf[js.Any])
        __obj.updateDynamic("DeviceAccess.selectPrompt")(DeviceAccessDotselectPrompt.asInstanceOf[js.Any])
        __obj.updateDynamic("DeviceOrientation.clearDeviceOrientationOverride")(DeviceOrientationDotclearDeviceOrientationOverride.asInstanceOf[js.Any])
        __obj.updateDynamic("DeviceOrientation.setDeviceOrientationOverride")(DeviceOrientationDotsetDeviceOrientationOverride.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.canEmulate")(EmulationDotcanEmulate.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.clearDeviceMetricsOverride")(EmulationDotclearDeviceMetricsOverride.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.clearGeolocationOverride")(EmulationDotclearGeolocationOverride.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.clearIdleOverride")(EmulationDotclearIdleOverride.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.resetPageScaleFactor")(EmulationDotresetPageScaleFactor.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.setAutoDarkModeOverride")(EmulationDotsetAutoDarkModeOverride.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.setAutomationOverride")(EmulationDotsetAutomationOverride.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.setCPUThrottlingRate")(EmulationDotsetCPUThrottlingRate.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.setDefaultBackgroundColorOverride")(EmulationDotsetDefaultBackgroundColorOverride.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.setDeviceMetricsOverride")(EmulationDotsetDeviceMetricsOverride.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.setDisabledImageTypes")(EmulationDotsetDisabledImageTypes.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.setDocumentCookieDisabled")(EmulationDotsetDocumentCookieDisabled.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.setEmitTouchEventsForMouse")(EmulationDotsetEmitTouchEventsForMouse.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.setEmulatedMedia")(EmulationDotsetEmulatedMedia.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.setEmulatedVisionDeficiency")(EmulationDotsetEmulatedVisionDeficiency.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.setFocusEmulationEnabled")(EmulationDotsetFocusEmulationEnabled.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.setGeolocationOverride")(EmulationDotsetGeolocationOverride.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.setHardwareConcurrencyOverride")(EmulationDotsetHardwareConcurrencyOverride.asInstanceOf[js.Any])
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
        __obj.updateDynamic("EventBreakpoints.removeInstrumentationBreakpoint")(EventBreakpointsDotremoveInstrumentationBreakpoint.asInstanceOf[js.Any])
        __obj.updateDynamic("EventBreakpoints.setInstrumentationBreakpoint")(EventBreakpointsDotsetInstrumentationBreakpoint.asInstanceOf[js.Any])
        __obj.updateDynamic("FedCm.disable")(FedCmDotdisable.asInstanceOf[js.Any])
        __obj.updateDynamic("FedCm.dismissDialog")(FedCmDotdismissDialog.asInstanceOf[js.Any])
        __obj.updateDynamic("FedCm.enable")(FedCmDotenable.asInstanceOf[js.Any])
        __obj.updateDynamic("FedCm.resetCooldown")(FedCmDotresetCooldown.asInstanceOf[js.Any])
        __obj.updateDynamic("FedCm.selectAccount")(FedCmDotselectAccount.asInstanceOf[js.Any])
        __obj.updateDynamic("Fetch.continueRequest")(FetchDotcontinueRequest.asInstanceOf[js.Any])
        __obj.updateDynamic("Fetch.continueResponse")(FetchDotcontinueResponse.asInstanceOf[js.Any])
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
        __obj.asInstanceOf[Commands]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Commands] (val x: Self) extends AnyVal {
        
        inline def setAccessibilityDotdisable(value: ParamsType): Self = StObject.set(x, "Accessibility.disable", value.asInstanceOf[js.Any])
        
        inline def setAccessibilityDotenable(value: ParamsType): Self = StObject.set(x, "Accessibility.enable", value.asInstanceOf[js.Any])
        
        inline def setAccessibilityDotgetAXNodeAndAncestors(value: ReturnTypeGetAXNodeAndAncestorsResponse): Self = StObject.set(x, "Accessibility.getAXNodeAndAncestors", value.asInstanceOf[js.Any])
        
        inline def setAccessibilityDotgetChildAXNodes(value: ReturnTypeGetChildAXNodesResponse): Self = StObject.set(x, "Accessibility.getChildAXNodes", value.asInstanceOf[js.Any])
        
        inline def setAccessibilityDotgetFullAXTree(value: ReturnTypeGetFullAXTreeResponse): Self = StObject.set(x, "Accessibility.getFullAXTree", value.asInstanceOf[js.Any])
        
        inline def setAccessibilityDotgetPartialAXTree(value: ReturnTypeGetPartialAXTreeResponse): Self = StObject.set(x, "Accessibility.getPartialAXTree", value.asInstanceOf[js.Any])
        
        inline def setAccessibilityDotgetRootAXNode(value: ReturnTypeGetRootAXNodeResponse): Self = StObject.set(x, "Accessibility.getRootAXNode", value.asInstanceOf[js.Any])
        
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
        
        inline def setAuditsDotcheckContrast(value: `29`): Self = StObject.set(x, "Audits.checkContrast", value.asInstanceOf[js.Any])
        
        inline def setAuditsDotcheckFormsIssues(value: ReturnTypeCheckFormsIssuesResponse): Self = StObject.set(x, "Audits.checkFormsIssues", value.asInstanceOf[js.Any])
        
        inline def setAuditsDotdisable(value: ParamsType): Self = StObject.set(x, "Audits.disable", value.asInstanceOf[js.Any])
        
        inline def setAuditsDotenable(value: ParamsType): Self = StObject.set(x, "Audits.enable", value.asInstanceOf[js.Any])
        
        inline def setAuditsDotgetEncodedResponse(value: ReturnTypeGetEncodedResponseResponse): Self = StObject.set(x, "Audits.getEncodedResponse", value.asInstanceOf[js.Any])
        
        inline def setAutofillDotsetAddresses(value: `31`): Self = StObject.set(x, "Autofill.setAddresses", value.asInstanceOf[js.Any])
        
        inline def setAutofillDottrigger(value: `30`): Self = StObject.set(x, "Autofill.trigger", value.asInstanceOf[js.Any])
        
        inline def setBackgroundServiceDotclearEvents(value: `35`): Self = StObject.set(x, "BackgroundService.clearEvents", value.asInstanceOf[js.Any])
        
        inline def setBackgroundServiceDotsetRecording(value: `34`): Self = StObject.set(x, "BackgroundService.setRecording", value.asInstanceOf[js.Any])
        
        inline def setBackgroundServiceDotstartObserving(value: `32`): Self = StObject.set(x, "BackgroundService.startObserving", value.asInstanceOf[js.Any])
        
        inline def setBackgroundServiceDotstopObserving(value: `33`): Self = StObject.set(x, "BackgroundService.stopObserving", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotaddPrivacySandboxEnrollmentOverride(value: `44`): Self = StObject.set(x, "Browser.addPrivacySandboxEnrollmentOverride", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotcancelDownload(value: `40`): Self = StObject.set(x, "Browser.cancelDownload", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotclose(value: ParamsType): Self = StObject.set(x, "Browser.close", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotcrash(value: ParamsType): Self = StObject.set(x, "Browser.crash", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotcrashGpuProcess(value: ParamsType): Self = StObject.set(x, "Browser.crashGpuProcess", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotexecuteBrowserCommand(value: `43`): Self = StObject.set(x, "Browser.executeBrowserCommand", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotgetBrowserCommandLine(value: ReturnTypeGetBrowserCommandLineResponse): Self = StObject.set(x, "Browser.getBrowserCommandLine", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotgetHistogram(value: ReturnTypeGetHistogramResponse): Self = StObject.set(x, "Browser.getHistogram", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotgetHistograms(value: ReturnTypeGetHistogramsResponse): Self = StObject.set(x, "Browser.getHistograms", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotgetVersion(value: ReturnTypeGetVersionResponse): Self = StObject.set(x, "Browser.getVersion", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotgetWindowBounds(value: ReturnTypeGetWindowBoundsResponse): Self = StObject.set(x, "Browser.getWindowBounds", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotgetWindowForTarget(value: ReturnTypeGetWindowForTargetResponse): Self = StObject.set(x, "Browser.getWindowForTarget", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotgrantPermissions(value: `37`): Self = StObject.set(x, "Browser.grantPermissions", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotresetPermissions(value: `38`): Self = StObject.set(x, "Browser.resetPermissions", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotsetDockTile(value: `42`): Self = StObject.set(x, "Browser.setDockTile", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotsetDownloadBehavior(value: `39`): Self = StObject.set(x, "Browser.setDownloadBehavior", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotsetPermission(value: `36`): Self = StObject.set(x, "Browser.setPermission", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotsetWindowBounds(value: `41`): Self = StObject.set(x, "Browser.setWindowBounds", value.asInstanceOf[js.Any])
        
        inline def setCSSDotaddRule(value: ReturnTypeAddRuleResponse): Self = StObject.set(x, "CSS.addRule", value.asInstanceOf[js.Any])
        
        inline def setCSSDotcollectClassNames(value: ReturnTypeCollectClassNamesResponse): Self = StObject.set(x, "CSS.collectClassNames", value.asInstanceOf[js.Any])
        
        inline def setCSSDotcreateStyleSheet(value: ReturnTypeCreateStyleSheetResponse): Self = StObject.set(x, "CSS.createStyleSheet", value.asInstanceOf[js.Any])
        
        inline def setCSSDotdisable(value: ParamsType): Self = StObject.set(x, "CSS.disable", value.asInstanceOf[js.Any])
        
        inline def setCSSDotenable(value: ParamsType): Self = StObject.set(x, "CSS.enable", value.asInstanceOf[js.Any])
        
        inline def setCSSDotforcePseudoState(value: `45`): Self = StObject.set(x, "CSS.forcePseudoState", value.asInstanceOf[js.Any])
        
        inline def setCSSDotgetBackgroundColors(value: ReturnTypeGetBackgroundColorsResponse): Self = StObject.set(x, "CSS.getBackgroundColors", value.asInstanceOf[js.Any])
        
        inline def setCSSDotgetComputedStyleForNode(value: ReturnTypeGetComputedStyleForNodeResponse): Self = StObject.set(x, "CSS.getComputedStyleForNode", value.asInstanceOf[js.Any])
        
        inline def setCSSDotgetInlineStylesForNode(value: ReturnTypeGetInlineStylesForNodeResponse): Self = StObject.set(x, "CSS.getInlineStylesForNode", value.asInstanceOf[js.Any])
        
        inline def setCSSDotgetLayersForNode(value: ReturnTypeGetLayersForNodeResponse): Self = StObject.set(x, "CSS.getLayersForNode", value.asInstanceOf[js.Any])
        
        inline def setCSSDotgetMatchedStylesForNode(value: ReturnTypeGetMatchedStylesForNodeResponse): Self = StObject.set(x, "CSS.getMatchedStylesForNode", value.asInstanceOf[js.Any])
        
        inline def setCSSDotgetMediaQueries(value: ReturnTypeGetMediaQueriesResponse): Self = StObject.set(x, "CSS.getMediaQueries", value.asInstanceOf[js.Any])
        
        inline def setCSSDotgetPlatformFontsForNode(value: ReturnTypeGetPlatformFontsForNodeResponse): Self = StObject.set(x, "CSS.getPlatformFontsForNode", value.asInstanceOf[js.Any])
        
        inline def setCSSDotgetStyleSheetText(value: ReturnTypeGetStyleSheetTextResponse): Self = StObject.set(x, "CSS.getStyleSheetText", value.asInstanceOf[js.Any])
        
        inline def setCSSDotsetContainerQueryText(value: ReturnTypeSetContainerQueryTextResponse): Self = StObject.set(x, "CSS.setContainerQueryText", value.asInstanceOf[js.Any])
        
        inline def setCSSDotsetEffectivePropertyValueForNode(value: `47`): Self = StObject.set(x, "CSS.setEffectivePropertyValueForNode", value.asInstanceOf[js.Any])
        
        inline def setCSSDotsetKeyframeKey(value: ReturnTypeSetKeyframeKeyResponse): Self = StObject.set(x, "CSS.setKeyframeKey", value.asInstanceOf[js.Any])
        
        inline def setCSSDotsetLocalFontsEnabled(value: `48`): Self = StObject.set(x, "CSS.setLocalFontsEnabled", value.asInstanceOf[js.Any])
        
        inline def setCSSDotsetMediaText(value: ReturnTypeSetMediaTextResponse): Self = StObject.set(x, "CSS.setMediaText", value.asInstanceOf[js.Any])
        
        inline def setCSSDotsetRuleSelector(value: ReturnTypeSetRuleSelectorResponse): Self = StObject.set(x, "CSS.setRuleSelector", value.asInstanceOf[js.Any])
        
        inline def setCSSDotsetScopeText(value: ReturnTypeSetScopeTextResponse): Self = StObject.set(x, "CSS.setScopeText", value.asInstanceOf[js.Any])
        
        inline def setCSSDotsetStyleSheetText(value: ReturnTypeSetStyleSheetTextResponse): Self = StObject.set(x, "CSS.setStyleSheetText", value.asInstanceOf[js.Any])
        
        inline def setCSSDotsetStyleTexts(value: ReturnTypeSetStyleTextsResponse): Self = StObject.set(x, "CSS.setStyleTexts", value.asInstanceOf[js.Any])
        
        inline def setCSSDotsetSupportsText(value: ReturnTypeSetSupportsTextResponse): Self = StObject.set(x, "CSS.setSupportsText", value.asInstanceOf[js.Any])
        
        inline def setCSSDotstartRuleUsageTracking(value: ParamsType): Self = StObject.set(x, "CSS.startRuleUsageTracking", value.asInstanceOf[js.Any])
        
        inline def setCSSDotstopRuleUsageTracking(value: ReturnTypeStopRuleUsageTrackingResponse): Self = StObject.set(x, "CSS.stopRuleUsageTracking", value.asInstanceOf[js.Any])
        
        inline def setCSSDottakeComputedStyleUpdates(value: ReturnTypeTakeComputedStyleUpdatesResponse): Self = StObject.set(x, "CSS.takeComputedStyleUpdates", value.asInstanceOf[js.Any])
        
        inline def setCSSDottakeCoverageDelta(value: ReturnTypeTakeCoverageDeltaResponse): Self = StObject.set(x, "CSS.takeCoverageDelta", value.asInstanceOf[js.Any])
        
        inline def setCSSDottrackComputedStyleUpdates(value: `46`): Self = StObject.set(x, "CSS.trackComputedStyleUpdates", value.asInstanceOf[js.Any])
        
        inline def setCacheStorageDotdeleteCache(value: `49`): Self = StObject.set(x, "CacheStorage.deleteCache", value.asInstanceOf[js.Any])
        
        inline def setCacheStorageDotdeleteEntry(value: `50`): Self = StObject.set(x, "CacheStorage.deleteEntry", value.asInstanceOf[js.Any])
        
        inline def setCacheStorageDotrequestCacheNames(value: ReturnTypeRequestCacheNamesResponse): Self = StObject.set(x, "CacheStorage.requestCacheNames", value.asInstanceOf[js.Any])
        
        inline def setCacheStorageDotrequestCachedResponse(value: ReturnTypeRequestCachedResponseResponse): Self = StObject.set(x, "CacheStorage.requestCachedResponse", value.asInstanceOf[js.Any])
        
        inline def setCacheStorageDotrequestEntries(value: ReturnTypeRequestEntriesResponse): Self = StObject.set(x, "CacheStorage.requestEntries", value.asInstanceOf[js.Any])
        
        inline def setCastDotdisable(value: ParamsType): Self = StObject.set(x, "Cast.disable", value.asInstanceOf[js.Any])
        
        inline def setCastDotenable(value: `51`): Self = StObject.set(x, "Cast.enable", value.asInstanceOf[js.Any])
        
        inline def setCastDotsetSinkToUse(value: `52`): Self = StObject.set(x, "Cast.setSinkToUse", value.asInstanceOf[js.Any])
        
        inline def setCastDotstartDesktopMirroring(value: `53`): Self = StObject.set(x, "Cast.startDesktopMirroring", value.asInstanceOf[js.Any])
        
        inline def setCastDotstartTabMirroring(value: `54`): Self = StObject.set(x, "Cast.startTabMirroring", value.asInstanceOf[js.Any])
        
        inline def setCastDotstopCasting(value: `55`): Self = StObject.set(x, "Cast.stopCasting", value.asInstanceOf[js.Any])
        
        inline def setConsoleDotclearMessages(value: ParamsType): Self = StObject.set(x, "Console.clearMessages", value.asInstanceOf[js.Any])
        
        inline def setConsoleDotdisable(value: ParamsType): Self = StObject.set(x, "Console.disable", value.asInstanceOf[js.Any])
        
        inline def setConsoleDotenable(value: ParamsType): Self = StObject.set(x, "Console.enable", value.asInstanceOf[js.Any])
        
        inline def setDOMDebuggerDotgetEventListeners(value: ReturnTypeGetEventListenersResponse): Self = StObject.set(x, "DOMDebugger.getEventListeners", value.asInstanceOf[js.Any])
        
        inline def setDOMDebuggerDotremoveDOMBreakpoint(value: `70`): Self = StObject.set(x, "DOMDebugger.removeDOMBreakpoint", value.asInstanceOf[js.Any])
        
        inline def setDOMDebuggerDotremoveEventListenerBreakpoint(value: `71`): Self = StObject.set(x, "DOMDebugger.removeEventListenerBreakpoint", value.asInstanceOf[js.Any])
        
        inline def setDOMDebuggerDotremoveInstrumentationBreakpoint(value: `72`): Self = StObject.set(x, "DOMDebugger.removeInstrumentationBreakpoint", value.asInstanceOf[js.Any])
        
        inline def setDOMDebuggerDotremoveXHRBreakpoint(value: `73`): Self = StObject.set(x, "DOMDebugger.removeXHRBreakpoint", value.asInstanceOf[js.Any])
        
        inline def setDOMDebuggerDotsetBreakOnCSPViolation(value: `74`): Self = StObject.set(x, "DOMDebugger.setBreakOnCSPViolation", value.asInstanceOf[js.Any])
        
        inline def setDOMDebuggerDotsetDOMBreakpoint(value: `75`): Self = StObject.set(x, "DOMDebugger.setDOMBreakpoint", value.asInstanceOf[js.Any])
        
        inline def setDOMDebuggerDotsetEventListenerBreakpoint(value: `76`): Self = StObject.set(x, "DOMDebugger.setEventListenerBreakpoint", value.asInstanceOf[js.Any])
        
        inline def setDOMDebuggerDotsetInstrumentationBreakpoint(value: `77`): Self = StObject.set(x, "DOMDebugger.setInstrumentationBreakpoint", value.asInstanceOf[js.Any])
        
        inline def setDOMDebuggerDotsetXHRBreakpoint(value: `78`): Self = StObject.set(x, "DOMDebugger.setXHRBreakpoint", value.asInstanceOf[js.Any])
        
        inline def setDOMDotcollectClassNamesFromSubtree(value: ReturnTypeCollectClassNamesFromSubtreeResponse): Self = StObject.set(x, "DOM.collectClassNamesFromSubtree", value.asInstanceOf[js.Any])
        
        inline def setDOMDotcopyTo(value: ReturnTypeCopyToResponse): Self = StObject.set(x, "DOM.copyTo", value.asInstanceOf[js.Any])
        
        inline def setDOMDotdescribeNode(value: ReturnTypeDescribeNodeResponse): Self = StObject.set(x, "DOM.describeNode", value.asInstanceOf[js.Any])
        
        inline def setDOMDotdisable(value: ParamsType): Self = StObject.set(x, "DOM.disable", value.asInstanceOf[js.Any])
        
        inline def setDOMDotdiscardSearchResults(value: `57`): Self = StObject.set(x, "DOM.discardSearchResults", value.asInstanceOf[js.Any])
        
        inline def setDOMDotenable(value: `58`): Self = StObject.set(x, "DOM.enable", value.asInstanceOf[js.Any])
        
        inline def setDOMDotfocus(value: `59`): Self = StObject.set(x, "DOM.focus", value.asInstanceOf[js.Any])
        
        inline def setDOMDotgetAttributes(value: ReturnTypeGetAttributesResponse): Self = StObject.set(x, "DOM.getAttributes", value.asInstanceOf[js.Any])
        
        inline def setDOMDotgetBoxModel(value: ReturnTypeGetBoxModelResponse): Self = StObject.set(x, "DOM.getBoxModel", value.asInstanceOf[js.Any])
        
        inline def setDOMDotgetContainerForNode(value: ReturnTypeGetContainerForNodeResponse): Self = StObject.set(x, "DOM.getContainerForNode", value.asInstanceOf[js.Any])
        
        inline def setDOMDotgetContentQuads(value: ReturnTypeGetContentQuadsResponse): Self = StObject.set(x, "DOM.getContentQuads", value.asInstanceOf[js.Any])
        
        inline def setDOMDotgetDocument(value: ReturnTypeGetDocumentResponse): Self = StObject.set(x, "DOM.getDocument", value.asInstanceOf[js.Any])
        
        inline def setDOMDotgetFileInfo(value: ReturnTypeGetFileInfoResponse): Self = StObject.set(x, "DOM.getFileInfo", value.asInstanceOf[js.Any])
        
        inline def setDOMDotgetFlattenedDocument(value: ReturnTypeGetFlattenedDocumentResponse): Self = StObject.set(x, "DOM.getFlattenedDocument", value.asInstanceOf[js.Any])
        
        inline def setDOMDotgetFrameOwner(value: ReturnTypeGetFrameOwnerResponse): Self = StObject.set(x, "DOM.getFrameOwner", value.asInstanceOf[js.Any])
        
        inline def setDOMDotgetNodeForLocation(value: ReturnTypeGetNodeForLocationResponse): Self = StObject.set(x, "DOM.getNodeForLocation", value.asInstanceOf[js.Any])
        
        inline def setDOMDotgetNodeStackTraces(value: ReturnTypeGetNodeStackTracesResponse): Self = StObject.set(x, "DOM.getNodeStackTraces", value.asInstanceOf[js.Any])
        
        inline def setDOMDotgetNodesForSubtreeByStyle(value: ReturnTypeGetNodesForSubtreeByStyleResponse): Self = StObject.set(x, "DOM.getNodesForSubtreeByStyle", value.asInstanceOf[js.Any])
        
        inline def setDOMDotgetOuterHTML(value: ReturnTypeGetOuterHTMLResponse): Self = StObject.set(x, "DOM.getOuterHTML", value.asInstanceOf[js.Any])
        
        inline def setDOMDotgetQueryingDescendantsForContainer(value: ReturnTypeGetQueryingDescendantsForContainerResponse): Self = StObject.set(x, "DOM.getQueryingDescendantsForContainer", value.asInstanceOf[js.Any])
        
        inline def setDOMDotgetRelayoutBoundary(value: ReturnTypeGetRelayoutBoundaryResponse): Self = StObject.set(x, "DOM.getRelayoutBoundary", value.asInstanceOf[js.Any])
        
        inline def setDOMDotgetSearchResults(value: ReturnTypeGetSearchResultsResponse): Self = StObject.set(x, "DOM.getSearchResults", value.asInstanceOf[js.Any])
        
        inline def setDOMDotgetTopLayerElements(value: ReturnTypeGetTopLayerElementsResponse): Self = StObject.set(x, "DOM.getTopLayerElements", value.asInstanceOf[js.Any])
        
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
        
        inline def setDOMDotremoveAttribute(value: `60`): Self = StObject.set(x, "DOM.removeAttribute", value.asInstanceOf[js.Any])
        
        inline def setDOMDotremoveNode(value: `61`): Self = StObject.set(x, "DOM.removeNode", value.asInstanceOf[js.Any])
        
        inline def setDOMDotrequestChildNodes(value: `62`): Self = StObject.set(x, "DOM.requestChildNodes", value.asInstanceOf[js.Any])
        
        inline def setDOMDotrequestNode(value: ReturnTypeRequestNodeResponse): Self = StObject.set(x, "DOM.requestNode", value.asInstanceOf[js.Any])
        
        inline def setDOMDotresolveNode(value: ReturnTypeResolveNodeResponse): Self = StObject.set(x, "DOM.resolveNode", value.asInstanceOf[js.Any])
        
        inline def setDOMDotscrollIntoViewIfNeeded(value: `56`): Self = StObject.set(x, "DOM.scrollIntoViewIfNeeded", value.asInstanceOf[js.Any])
        
        inline def setDOMDotsetAttributeValue(value: `63`): Self = StObject.set(x, "DOM.setAttributeValue", value.asInstanceOf[js.Any])
        
        inline def setDOMDotsetAttributesAsText(value: `64`): Self = StObject.set(x, "DOM.setAttributesAsText", value.asInstanceOf[js.Any])
        
        inline def setDOMDotsetFileInputFiles(value: `65`): Self = StObject.set(x, "DOM.setFileInputFiles", value.asInstanceOf[js.Any])
        
        inline def setDOMDotsetInspectedNode(value: `67`): Self = StObject.set(x, "DOM.setInspectedNode", value.asInstanceOf[js.Any])
        
        inline def setDOMDotsetNodeName(value: ReturnTypeSetNodeNameResponse): Self = StObject.set(x, "DOM.setNodeName", value.asInstanceOf[js.Any])
        
        inline def setDOMDotsetNodeStackTracesEnabled(value: `66`): Self = StObject.set(x, "DOM.setNodeStackTracesEnabled", value.asInstanceOf[js.Any])
        
        inline def setDOMDotsetNodeValue(value: `68`): Self = StObject.set(x, "DOM.setNodeValue", value.asInstanceOf[js.Any])
        
        inline def setDOMDotsetOuterHTML(value: `69`): Self = StObject.set(x, "DOM.setOuterHTML", value.asInstanceOf[js.Any])
        
        inline def setDOMDotundo(value: ParamsType): Self = StObject.set(x, "DOM.undo", value.asInstanceOf[js.Any])
        
        inline def setDOMSnapshotDotcaptureSnapshot(value: ReturnTypeCaptureSnapshotResponse): Self = StObject.set(x, "DOMSnapshot.captureSnapshot", value.asInstanceOf[js.Any])
        
        inline def setDOMSnapshotDotdisable(value: ParamsType): Self = StObject.set(x, "DOMSnapshot.disable", value.asInstanceOf[js.Any])
        
        inline def setDOMSnapshotDotenable(value: ParamsType): Self = StObject.set(x, "DOMSnapshot.enable", value.asInstanceOf[js.Any])
        
        inline def setDOMSnapshotDotgetSnapshot(value: ReturnTypeGetSnapshotResponse): Self = StObject.set(x, "DOMSnapshot.getSnapshot", value.asInstanceOf[js.Any])
        
        inline def setDOMStorageDotclear(value: `81`): Self = StObject.set(x, "DOMStorage.clear", value.asInstanceOf[js.Any])
        
        inline def setDOMStorageDotdisable(value: ParamsType): Self = StObject.set(x, "DOMStorage.disable", value.asInstanceOf[js.Any])
        
        inline def setDOMStorageDotenable(value: ParamsType): Self = StObject.set(x, "DOMStorage.enable", value.asInstanceOf[js.Any])
        
        inline def setDOMStorageDotgetDOMStorageItems(value: ReturnTypeGetDOMStorageItemsResponse): Self = StObject.set(x, "DOMStorage.getDOMStorageItems", value.asInstanceOf[js.Any])
        
        inline def setDOMStorageDotremoveDOMStorageItem(value: `82`): Self = StObject.set(x, "DOMStorage.removeDOMStorageItem", value.asInstanceOf[js.Any])
        
        inline def setDOMStorageDotsetDOMStorageItem(value: `83`): Self = StObject.set(x, "DOMStorage.setDOMStorageItem", value.asInstanceOf[js.Any])
        
        inline def setDatabaseDotdisable(value: ParamsType): Self = StObject.set(x, "Database.disable", value.asInstanceOf[js.Any])
        
        inline def setDatabaseDotenable(value: ParamsType): Self = StObject.set(x, "Database.enable", value.asInstanceOf[js.Any])
        
        inline def setDatabaseDotexecuteSQL(value: ReturnTypeExecuteSQLResponse): Self = StObject.set(x, "Database.executeSQL", value.asInstanceOf[js.Any])
        
        inline def setDatabaseDotgetDatabaseTableNames(value: ReturnTypeGetDatabaseTableNamesResponse): Self = StObject.set(x, "Database.getDatabaseTableNames", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotcontinueToLocation(value: ReturnType): Self = StObject.set(x, "Debugger.continueToLocation", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotdisable(value: ParamsType): Self = StObject.set(x, "Debugger.disable", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotdisassembleWasmModule(value: ReturnTypeDisassembleWasmModuleResponse): Self = StObject.set(x, "Debugger.disassembleWasmModule", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotenable(value: ParamsTypeReturnType): Self = StObject.set(x, "Debugger.enable", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotevaluateOnCallFrame(value: ReturnTypeEvaluateOnCallFrameResponse): Self = StObject.set(x, "Debugger.evaluateOnCallFrame", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotgetPossibleBreakpoints(value: ReturnTypeGetPossibleBreakpointsResponse): Self = StObject.set(x, "Debugger.getPossibleBreakpoints", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotgetScriptSource(value: ReturnTypeGetScriptSourceResponse): Self = StObject.set(x, "Debugger.getScriptSource", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotgetStackTrace(value: ReturnTypeGetStackTraceResponse): Self = StObject.set(x, "Debugger.getStackTrace", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotgetWasmBytecode(value: ReturnTypeGetWasmBytecodeResponse): Self = StObject.set(x, "Debugger.getWasmBytecode", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotnextWasmDisassemblyChunk(value: ReturnTypeNextWasmDisassemblyChunkResponse): Self = StObject.set(x, "Debugger.nextWasmDisassemblyChunk", value.asInstanceOf[js.Any])
        
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
        
        inline def setDeviceAccessDotcancelPrompt(value: `259`): Self = StObject.set(x, "DeviceAccess.cancelPrompt", value.asInstanceOf[js.Any])
        
        inline def setDeviceAccessDotdisable(value: ParamsType): Self = StObject.set(x, "DeviceAccess.disable", value.asInstanceOf[js.Any])
        
        inline def setDeviceAccessDotenable(value: ParamsType): Self = StObject.set(x, "DeviceAccess.enable", value.asInstanceOf[js.Any])
        
        inline def setDeviceAccessDotselectPrompt(value: `258`): Self = StObject.set(x, "DeviceAccess.selectPrompt", value.asInstanceOf[js.Any])
        
        inline def setDeviceOrientationDotclearDeviceOrientationOverride(value: ParamsType): Self = StObject.set(x, "DeviceOrientation.clearDeviceOrientationOverride", value.asInstanceOf[js.Any])
        
        inline def setDeviceOrientationDotsetDeviceOrientationOverride(value: `84`): Self = StObject.set(x, "DeviceOrientation.setDeviceOrientationOverride", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotcanEmulate(value: ReturnTypeCanEmulateResponse): Self = StObject.set(x, "Emulation.canEmulate", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotclearDeviceMetricsOverride(value: ParamsType): Self = StObject.set(x, "Emulation.clearDeviceMetricsOverride", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotclearGeolocationOverride(value: ParamsType): Self = StObject.set(x, "Emulation.clearGeolocationOverride", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotclearIdleOverride(value: ParamsType): Self = StObject.set(x, "Emulation.clearIdleOverride", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotresetPageScaleFactor(value: ParamsType): Self = StObject.set(x, "Emulation.resetPageScaleFactor", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetAutoDarkModeOverride(value: `86`): Self = StObject.set(x, "Emulation.setAutoDarkModeOverride", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetAutomationOverride(value: `107`): Self = StObject.set(x, "Emulation.setAutomationOverride", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetCPUThrottlingRate(value: `87`): Self = StObject.set(x, "Emulation.setCPUThrottlingRate", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetDefaultBackgroundColorOverride(value: `88`): Self = StObject.set(x, "Emulation.setDefaultBackgroundColorOverride", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetDeviceMetricsOverride(value: `89`): Self = StObject.set(x, "Emulation.setDeviceMetricsOverride", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetDisabledImageTypes(value: `104`): Self = StObject.set(x, "Emulation.setDisabledImageTypes", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetDocumentCookieDisabled(value: `91`): Self = StObject.set(x, "Emulation.setDocumentCookieDisabled", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetEmitTouchEventsForMouse(value: `92`): Self = StObject.set(x, "Emulation.setEmitTouchEventsForMouse", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetEmulatedMedia(value: `93`): Self = StObject.set(x, "Emulation.setEmulatedMedia", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetEmulatedVisionDeficiency(value: `94`): Self = StObject.set(x, "Emulation.setEmulatedVisionDeficiency", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetFocusEmulationEnabled(value: `85`): Self = StObject.set(x, "Emulation.setFocusEmulationEnabled", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetGeolocationOverride(value: `95`): Self = StObject.set(x, "Emulation.setGeolocationOverride", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetHardwareConcurrencyOverride(value: `105`): Self = StObject.set(x, "Emulation.setHardwareConcurrencyOverride", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetIdleOverride(value: `96`): Self = StObject.set(x, "Emulation.setIdleOverride", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetLocaleOverride(value: `101`): Self = StObject.set(x, "Emulation.setLocaleOverride", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetNavigatorOverrides(value: `97`): Self = StObject.set(x, "Emulation.setNavigatorOverrides", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetPageScaleFactor(value: `98`): Self = StObject.set(x, "Emulation.setPageScaleFactor", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetScriptExecutionDisabled(value: `99`): Self = StObject.set(x, "Emulation.setScriptExecutionDisabled", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetScrollbarsHidden(value: `90`): Self = StObject.set(x, "Emulation.setScrollbarsHidden", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetTimezoneOverride(value: `102`): Self = StObject.set(x, "Emulation.setTimezoneOverride", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetTouchEmulationEnabled(value: `100`): Self = StObject.set(x, "Emulation.setTouchEmulationEnabled", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetUserAgentOverride(value: `106`): Self = StObject.set(x, "Emulation.setUserAgentOverride", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetVirtualTimePolicy(value: ReturnTypeSetVirtualTimePolicyResponse): Self = StObject.set(x, "Emulation.setVirtualTimePolicy", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotsetVisibleSize(value: `103`): Self = StObject.set(x, "Emulation.setVisibleSize", value.asInstanceOf[js.Any])
        
        inline def setEventBreakpointsDotremoveInstrumentationBreakpoint(value: `80`): Self = StObject.set(x, "EventBreakpoints.removeInstrumentationBreakpoint", value.asInstanceOf[js.Any])
        
        inline def setEventBreakpointsDotsetInstrumentationBreakpoint(value: `79`): Self = StObject.set(x, "EventBreakpoints.setInstrumentationBreakpoint", value.asInstanceOf[js.Any])
        
        inline def setFedCmDotdisable(value: ParamsType): Self = StObject.set(x, "FedCm.disable", value.asInstanceOf[js.Any])
        
        inline def setFedCmDotdismissDialog(value: `262`): Self = StObject.set(x, "FedCm.dismissDialog", value.asInstanceOf[js.Any])
        
        inline def setFedCmDotenable(value: `260`): Self = StObject.set(x, "FedCm.enable", value.asInstanceOf[js.Any])
        
        inline def setFedCmDotresetCooldown(value: ParamsType): Self = StObject.set(x, "FedCm.resetCooldown", value.asInstanceOf[js.Any])
        
        inline def setFedCmDotselectAccount(value: `261`): Self = StObject.set(x, "FedCm.selectAccount", value.asInstanceOf[js.Any])
        
        inline def setFetchDotcontinueRequest(value: `247`): Self = StObject.set(x, "Fetch.continueRequest", value.asInstanceOf[js.Any])
        
        inline def setFetchDotcontinueResponse(value: `249`): Self = StObject.set(x, "Fetch.continueResponse", value.asInstanceOf[js.Any])
        
        inline def setFetchDotcontinueWithAuth(value: `248`): Self = StObject.set(x, "Fetch.continueWithAuth", value.asInstanceOf[js.Any])
        
        inline def setFetchDotdisable(value: ParamsType): Self = StObject.set(x, "Fetch.disable", value.asInstanceOf[js.Any])
        
        inline def setFetchDotenable(value: `244`): Self = StObject.set(x, "Fetch.enable", value.asInstanceOf[js.Any])
        
        inline def setFetchDotfailRequest(value: `245`): Self = StObject.set(x, "Fetch.failRequest", value.asInstanceOf[js.Any])
        
        inline def setFetchDotfulfillRequest(value: `246`): Self = StObject.set(x, "Fetch.fulfillRequest", value.asInstanceOf[js.Any])
        
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
        
        inline def setIODotclose(value: `108`): Self = StObject.set(x, "IO.close", value.asInstanceOf[js.Any])
        
        inline def setIODotread(value: ReturnTypeReadResponse): Self = StObject.set(x, "IO.read", value.asInstanceOf[js.Any])
        
        inline def setIODotresolveBlob(value: ReturnTypeResolveBlobResponse): Self = StObject.set(x, "IO.resolveBlob", value.asInstanceOf[js.Any])
        
        inline def setIndexedDBDotclearObjectStore(value: `109`): Self = StObject.set(x, "IndexedDB.clearObjectStore", value.asInstanceOf[js.Any])
        
        inline def setIndexedDBDotdeleteDatabase(value: `110`): Self = StObject.set(x, "IndexedDB.deleteDatabase", value.asInstanceOf[js.Any])
        
        inline def setIndexedDBDotdeleteObjectStoreEntries(value: `111`): Self = StObject.set(x, "IndexedDB.deleteObjectStoreEntries", value.asInstanceOf[js.Any])
        
        inline def setIndexedDBDotdisable(value: ParamsType): Self = StObject.set(x, "IndexedDB.disable", value.asInstanceOf[js.Any])
        
        inline def setIndexedDBDotenable(value: ParamsType): Self = StObject.set(x, "IndexedDB.enable", value.asInstanceOf[js.Any])
        
        inline def setIndexedDBDotgetMetadata(value: ReturnTypeGetMetadataResponse): Self = StObject.set(x, "IndexedDB.getMetadata", value.asInstanceOf[js.Any])
        
        inline def setIndexedDBDotrequestData(value: ReturnTypeRequestDataResponse): Self = StObject.set(x, "IndexedDB.requestData", value.asInstanceOf[js.Any])
        
        inline def setIndexedDBDotrequestDatabase(value: ReturnTypeRequestDatabaseResponse): Self = StObject.set(x, "IndexedDB.requestDatabase", value.asInstanceOf[js.Any])
        
        inline def setIndexedDBDotrequestDatabaseNames(value: ReturnTypeRequestDatabaseNamesResponse): Self = StObject.set(x, "IndexedDB.requestDatabaseNames", value.asInstanceOf[js.Any])
        
        inline def setInputDotdispatchDragEvent(value: `112`): Self = StObject.set(x, "Input.dispatchDragEvent", value.asInstanceOf[js.Any])
        
        inline def setInputDotdispatchKeyEvent(value: `113`): Self = StObject.set(x, "Input.dispatchKeyEvent", value.asInstanceOf[js.Any])
        
        inline def setInputDotdispatchMouseEvent(value: `116`): Self = StObject.set(x, "Input.dispatchMouseEvent", value.asInstanceOf[js.Any])
        
        inline def setInputDotdispatchTouchEvent(value: `117`): Self = StObject.set(x, "Input.dispatchTouchEvent", value.asInstanceOf[js.Any])
        
        inline def setInputDotemulateTouchFromMouseEvent(value: `118`): Self = StObject.set(x, "Input.emulateTouchFromMouseEvent", value.asInstanceOf[js.Any])
        
        inline def setInputDotimeSetComposition(value: `115`): Self = StObject.set(x, "Input.imeSetComposition", value.asInstanceOf[js.Any])
        
        inline def setInputDotinsertText(value: `114`): Self = StObject.set(x, "Input.insertText", value.asInstanceOf[js.Any])
        
        inline def setInputDotsetIgnoreInputEvents(value: `119`): Self = StObject.set(x, "Input.setIgnoreInputEvents", value.asInstanceOf[js.Any])
        
        inline def setInputDotsetInterceptDrags(value: `120`): Self = StObject.set(x, "Input.setInterceptDrags", value.asInstanceOf[js.Any])
        
        inline def setInputDotsynthesizePinchGesture(value: `121`): Self = StObject.set(x, "Input.synthesizePinchGesture", value.asInstanceOf[js.Any])
        
        inline def setInputDotsynthesizeScrollGesture(value: `122`): Self = StObject.set(x, "Input.synthesizeScrollGesture", value.asInstanceOf[js.Any])
        
        inline def setInputDotsynthesizeTapGesture(value: `123`): Self = StObject.set(x, "Input.synthesizeTapGesture", value.asInstanceOf[js.Any])
        
        inline def setInspectorDotdisable(value: ParamsType): Self = StObject.set(x, "Inspector.disable", value.asInstanceOf[js.Any])
        
        inline def setInspectorDotenable(value: ParamsType): Self = StObject.set(x, "Inspector.enable", value.asInstanceOf[js.Any])
        
        inline def setLayerTreeDotcompositingReasons(value: ReturnTypeCompositingReasonsResponse): Self = StObject.set(x, "LayerTree.compositingReasons", value.asInstanceOf[js.Any])
        
        inline def setLayerTreeDotdisable(value: ParamsType): Self = StObject.set(x, "LayerTree.disable", value.asInstanceOf[js.Any])
        
        inline def setLayerTreeDotenable(value: ParamsType): Self = StObject.set(x, "LayerTree.enable", value.asInstanceOf[js.Any])
        
        inline def setLayerTreeDotloadSnapshot(value: ReturnTypeLoadSnapshotResponse): Self = StObject.set(x, "LayerTree.loadSnapshot", value.asInstanceOf[js.Any])
        
        inline def setLayerTreeDotmakeSnapshot(value: ReturnTypeMakeSnapshotResponse): Self = StObject.set(x, "LayerTree.makeSnapshot", value.asInstanceOf[js.Any])
        
        inline def setLayerTreeDotprofileSnapshot(value: ReturnTypeProfileSnapshotResponse): Self = StObject.set(x, "LayerTree.profileSnapshot", value.asInstanceOf[js.Any])
        
        inline def setLayerTreeDotreleaseSnapshot(value: `124`): Self = StObject.set(x, "LayerTree.releaseSnapshot", value.asInstanceOf[js.Any])
        
        inline def setLayerTreeDotreplaySnapshot(value: ReturnTypeReplaySnapshotResponse): Self = StObject.set(x, "LayerTree.replaySnapshot", value.asInstanceOf[js.Any])
        
        inline def setLayerTreeDotsnapshotCommandLog(value: ReturnTypeSnapshotCommandLogResponse): Self = StObject.set(x, "LayerTree.snapshotCommandLog", value.asInstanceOf[js.Any])
        
        inline def setLogDotclear(value: ParamsType): Self = StObject.set(x, "Log.clear", value.asInstanceOf[js.Any])
        
        inline def setLogDotdisable(value: ParamsType): Self = StObject.set(x, "Log.disable", value.asInstanceOf[js.Any])
        
        inline def setLogDotenable(value: ParamsType): Self = StObject.set(x, "Log.enable", value.asInstanceOf[js.Any])
        
        inline def setLogDotstartViolationsReport(value: `125`): Self = StObject.set(x, "Log.startViolationsReport", value.asInstanceOf[js.Any])
        
        inline def setLogDotstopViolationsReport(value: ParamsType): Self = StObject.set(x, "Log.stopViolationsReport", value.asInstanceOf[js.Any])
        
        inline def setMediaDotdisable(value: ParamsType): Self = StObject.set(x, "Media.disable", value.asInstanceOf[js.Any])
        
        inline def setMediaDotenable(value: ParamsType): Self = StObject.set(x, "Media.enable", value.asInstanceOf[js.Any])
        
        inline def setMemoryDotforciblyPurgeJavaScriptMemory(value: ParamsType): Self = StObject.set(x, "Memory.forciblyPurgeJavaScriptMemory", value.asInstanceOf[js.Any])
        
        inline def setMemoryDotgetAllTimeSamplingProfile(value: ReturnTypeGetAllTimeSamplingProfileResponse): Self = StObject.set(x, "Memory.getAllTimeSamplingProfile", value.asInstanceOf[js.Any])
        
        inline def setMemoryDotgetBrowserSamplingProfile(value: ReturnTypeGetBrowserSamplingProfileResponse): Self = StObject.set(x, "Memory.getBrowserSamplingProfile", value.asInstanceOf[js.Any])
        
        inline def setMemoryDotgetDOMCounters(value: ReturnTypeGetDOMCountersResponse): Self = StObject.set(x, "Memory.getDOMCounters", value.asInstanceOf[js.Any])
        
        inline def setMemoryDotgetSamplingProfile(value: ParamsTypeReturnTypeGetSamplingProfileResponse): Self = StObject.set(x, "Memory.getSamplingProfile", value.asInstanceOf[js.Any])
        
        inline def setMemoryDotprepareForLeakDetection(value: ParamsType): Self = StObject.set(x, "Memory.prepareForLeakDetection", value.asInstanceOf[js.Any])
        
        inline def setMemoryDotsetPressureNotificationsSuppressed(value: `126`): Self = StObject.set(x, "Memory.setPressureNotificationsSuppressed", value.asInstanceOf[js.Any])
        
        inline def setMemoryDotsimulatePressureNotification(value: `127`): Self = StObject.set(x, "Memory.simulatePressureNotification", value.asInstanceOf[js.Any])
        
        inline def setMemoryDotstartSampling(value: `128`): Self = StObject.set(x, "Memory.startSampling", value.asInstanceOf[js.Any])
        
        inline def setMemoryDotstopSampling(value: ParamsType): Self = StObject.set(x, "Memory.stopSampling", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotcanClearBrowserCache(value: ReturnTypeCanClearBrowserCacheResponse): Self = StObject.set(x, "Network.canClearBrowserCache", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotcanClearBrowserCookies(value: ReturnTypeCanClearBrowserCookiesResponse): Self = StObject.set(x, "Network.canClearBrowserCookies", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotcanEmulateNetworkConditions(value: ReturnTypeCanEmulateNetworkConditionsResponse): Self = StObject.set(x, "Network.canEmulateNetworkConditions", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotclearAcceptedEncodingsOverride(value: ParamsType): Self = StObject.set(x, "Network.clearAcceptedEncodingsOverride", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotclearBrowserCache(value: ParamsType): Self = StObject.set(x, "Network.clearBrowserCache", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotclearBrowserCookies(value: ParamsType): Self = StObject.set(x, "Network.clearBrowserCookies", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotcontinueInterceptedRequest(value: `130`): Self = StObject.set(x, "Network.continueInterceptedRequest", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotdeleteCookies(value: `131`): Self = StObject.set(x, "Network.deleteCookies", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotdisable(value: ParamsType): Self = StObject.set(x, "Network.disable", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotemulateNetworkConditions(value: `132`): Self = StObject.set(x, "Network.emulateNetworkConditions", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotenable(value: `133`): Self = StObject.set(x, "Network.enable", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotenableReportingApi(value: `143`): Self = StObject.set(x, "Network.enableReportingApi", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotgetAllCookies(value: ReturnTypeGetAllCookiesResponse): Self = StObject.set(x, "Network.getAllCookies", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotgetCertificate(value: ReturnTypeGetCertificateResponse): Self = StObject.set(x, "Network.getCertificate", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotgetCookies(value: ReturnTypeGetCookiesResponse): Self = StObject.set(x, "Network.getCookies", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotgetRequestPostData(value: ReturnTypeGetRequestPostDataResponse): Self = StObject.set(x, "Network.getRequestPostData", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotgetResponseBody(value: ReturnTypeGetResponseBodyResponse): Self = StObject.set(x, "Network.getResponseBody", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotgetResponseBodyForInterception(value: ReturnTypeGetResponseBodyForInterceptionResponse): Self = StObject.set(x, "Network.getResponseBodyForInterception", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotgetSecurityIsolationStatus(value: ReturnTypeGetSecurityIsolationStatusResponse): Self = StObject.set(x, "Network.getSecurityIsolationStatus", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotloadNetworkResource(value: ReturnTypeLoadNetworkResourceResponse): Self = StObject.set(x, "Network.loadNetworkResource", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotreplayXHR(value: `134`): Self = StObject.set(x, "Network.replayXHR", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotsearchInResponseBody(value: ReturnTypeSearchInResponseBodyResponse): Self = StObject.set(x, "Network.searchInResponseBody", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotsetAcceptedEncodings(value: `129`): Self = StObject.set(x, "Network.setAcceptedEncodings", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotsetAttachDebugStack(value: `140`): Self = StObject.set(x, "Network.setAttachDebugStack", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotsetBlockedURLs(value: `135`): Self = StObject.set(x, "Network.setBlockedURLs", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotsetBypassServiceWorker(value: `136`): Self = StObject.set(x, "Network.setBypassServiceWorker", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotsetCacheDisabled(value: `137`): Self = StObject.set(x, "Network.setCacheDisabled", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotsetCookie(value: ReturnTypeSetCookieResponse): Self = StObject.set(x, "Network.setCookie", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotsetCookies(value: `138`): Self = StObject.set(x, "Network.setCookies", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotsetExtraHTTPHeaders(value: `139`): Self = StObject.set(x, "Network.setExtraHTTPHeaders", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotsetRequestInterception(value: `141`): Self = StObject.set(x, "Network.setRequestInterception", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotsetUserAgentOverride(value: `142`): Self = StObject.set(x, "Network.setUserAgentOverride", value.asInstanceOf[js.Any])
        
        inline def setNetworkDottakeResponseBodyForInterceptionAsStream(value: ReturnTypeTakeResponseBodyForInterceptionAsStreamResponse): Self = StObject.set(x, "Network.takeResponseBodyForInterceptionAsStream", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotdisable(value: ParamsType): Self = StObject.set(x, "Overlay.disable", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotenable(value: ParamsType): Self = StObject.set(x, "Overlay.enable", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotgetGridHighlightObjectsForTest(value: ReturnTypeGetGridHighlightObjectsForTestResponse): Self = StObject.set(x, "Overlay.getGridHighlightObjectsForTest", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotgetHighlightObjectForTest(value: ReturnTypeGetHighlightObjectForTestResponse): Self = StObject.set(x, "Overlay.getHighlightObjectForTest", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotgetSourceOrderHighlightObjectForTest(value: ReturnTypeGetSourceOrderHighlightObjectForTestResponse): Self = StObject.set(x, "Overlay.getSourceOrderHighlightObjectForTest", value.asInstanceOf[js.Any])
        
        inline def setOverlayDothideHighlight(value: ParamsType): Self = StObject.set(x, "Overlay.hideHighlight", value.asInstanceOf[js.Any])
        
        inline def setOverlayDothighlightFrame(value: `144`): Self = StObject.set(x, "Overlay.highlightFrame", value.asInstanceOf[js.Any])
        
        inline def setOverlayDothighlightNode(value: `145`): Self = StObject.set(x, "Overlay.highlightNode", value.asInstanceOf[js.Any])
        
        inline def setOverlayDothighlightQuad(value: `146`): Self = StObject.set(x, "Overlay.highlightQuad", value.asInstanceOf[js.Any])
        
        inline def setOverlayDothighlightRect(value: `147`): Self = StObject.set(x, "Overlay.highlightRect", value.asInstanceOf[js.Any])
        
        inline def setOverlayDothighlightSourceOrder(value: `148`): Self = StObject.set(x, "Overlay.highlightSourceOrder", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotsetInspectMode(value: `149`): Self = StObject.set(x, "Overlay.setInspectMode", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotsetPausedInDebuggerMessage(value: `151`): Self = StObject.set(x, "Overlay.setPausedInDebuggerMessage", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotsetShowAdHighlights(value: `150`): Self = StObject.set(x, "Overlay.setShowAdHighlights", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotsetShowContainerQueryOverlays(value: `157`): Self = StObject.set(x, "Overlay.setShowContainerQueryOverlays", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotsetShowDebugBorders(value: `152`): Self = StObject.set(x, "Overlay.setShowDebugBorders", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotsetShowFPSCounter(value: `153`): Self = StObject.set(x, "Overlay.setShowFPSCounter", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotsetShowFlexOverlays(value: `155`): Self = StObject.set(x, "Overlay.setShowFlexOverlays", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotsetShowGridOverlays(value: `154`): Self = StObject.set(x, "Overlay.setShowGridOverlays", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotsetShowHinge(value: `164`): Self = StObject.set(x, "Overlay.setShowHinge", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotsetShowHitTestBorders(value: `161`): Self = StObject.set(x, "Overlay.setShowHitTestBorders", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotsetShowIsolatedElements(value: `165`): Self = StObject.set(x, "Overlay.setShowIsolatedElements", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotsetShowLayoutShiftRegions(value: `159`): Self = StObject.set(x, "Overlay.setShowLayoutShiftRegions", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotsetShowPaintRects(value: `158`): Self = StObject.set(x, "Overlay.setShowPaintRects", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotsetShowScrollBottleneckRects(value: `160`): Self = StObject.set(x, "Overlay.setShowScrollBottleneckRects", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotsetShowScrollSnapOverlays(value: `156`): Self = StObject.set(x, "Overlay.setShowScrollSnapOverlays", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotsetShowViewportSizeOnResize(value: `163`): Self = StObject.set(x, "Overlay.setShowViewportSizeOnResize", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotsetShowWebVitals(value: `162`): Self = StObject.set(x, "Overlay.setShowWebVitals", value.asInstanceOf[js.Any])
        
        inline def setPageDotaddCompilationCache(value: `187`): Self = StObject.set(x, "Page.addCompilationCache", value.asInstanceOf[js.Any])
        
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
        
        inline def setPageDotdeleteCookie(value: `166`): Self = StObject.set(x, "Page.deleteCookie", value.asInstanceOf[js.Any])
        
        inline def setPageDotdisable(value: ParamsType): Self = StObject.set(x, "Page.disable", value.asInstanceOf[js.Any])
        
        inline def setPageDotenable(value: ParamsType): Self = StObject.set(x, "Page.enable", value.asInstanceOf[js.Any])
        
        inline def setPageDotgenerateTestReport(value: `190`): Self = StObject.set(x, "Page.generateTestReport", value.asInstanceOf[js.Any])
        
        inline def setPageDotgetAdScriptId(value: ReturnTypeGetAdScriptIdResponse): Self = StObject.set(x, "Page.getAdScriptId", value.asInstanceOf[js.Any])
        
        inline def setPageDotgetAppId(value: ReturnTypeGetAppIdResponse): Self = StObject.set(x, "Page.getAppId", value.asInstanceOf[js.Any])
        
        inline def setPageDotgetAppManifest(value: ReturnTypeGetAppManifestResponse): Self = StObject.set(x, "Page.getAppManifest", value.asInstanceOf[js.Any])
        
        inline def setPageDotgetCookies(value: ParamsTypeReturnTypeGetCookiesResponse): Self = StObject.set(x, "Page.getCookies", value.asInstanceOf[js.Any])
        
        inline def setPageDotgetFrameTree(value: ReturnTypeGetFrameTreeResponse): Self = StObject.set(x, "Page.getFrameTree", value.asInstanceOf[js.Any])
        
        inline def setPageDotgetInstallabilityErrors(value: ReturnTypeGetInstallabilityErrorsResponse): Self = StObject.set(x, "Page.getInstallabilityErrors", value.asInstanceOf[js.Any])
        
        inline def setPageDotgetLayoutMetrics(value: ReturnTypeGetLayoutMetricsResponse): Self = StObject.set(x, "Page.getLayoutMetrics", value.asInstanceOf[js.Any])
        
        inline def setPageDotgetManifestIcons(value: ReturnTypeGetManifestIconsResponse): Self = StObject.set(x, "Page.getManifestIcons", value.asInstanceOf[js.Any])
        
        inline def setPageDotgetNavigationHistory(value: ReturnTypeGetNavigationHistoryResponse): Self = StObject.set(x, "Page.getNavigationHistory", value.asInstanceOf[js.Any])
        
        inline def setPageDotgetOriginTrials(value: ReturnTypeGetOriginTrialsResponse): Self = StObject.set(x, "Page.getOriginTrials", value.asInstanceOf[js.Any])
        
        inline def setPageDotgetPermissionsPolicyState(value: ReturnTypeGetPermissionsPolicyStateResponse): Self = StObject.set(x, "Page.getPermissionsPolicyState", value.asInstanceOf[js.Any])
        
        inline def setPageDotgetResourceContent(value: ReturnTypeGetResourceContentResponse): Self = StObject.set(x, "Page.getResourceContent", value.asInstanceOf[js.Any])
        
        inline def setPageDotgetResourceTree(value: ReturnTypeGetResourceTreeResponse): Self = StObject.set(x, "Page.getResourceTree", value.asInstanceOf[js.Any])
        
        inline def setPageDothandleJavaScriptDialog(value: `167`): Self = StObject.set(x, "Page.handleJavaScriptDialog", value.asInstanceOf[js.Any])
        
        inline def setPageDotnavigate(value: ReturnTypeNavigateResponse): Self = StObject.set(x, "Page.navigate", value.asInstanceOf[js.Any])
        
        inline def setPageDotnavigateToHistoryEntry(value: `168`): Self = StObject.set(x, "Page.navigateToHistoryEntry", value.asInstanceOf[js.Any])
        
        inline def setPageDotprintToPDF(value: ReturnTypePrintToPDFResponse): Self = StObject.set(x, "Page.printToPDF", value.asInstanceOf[js.Any])
        
        inline def setPageDotproduceCompilationCache(value: `186`): Self = StObject.set(x, "Page.produceCompilationCache", value.asInstanceOf[js.Any])
        
        inline def setPageDotreload(value: `169`): Self = StObject.set(x, "Page.reload", value.asInstanceOf[js.Any])
        
        inline def setPageDotremoveScriptToEvaluateOnLoad(value: `170`): Self = StObject.set(x, "Page.removeScriptToEvaluateOnLoad", value.asInstanceOf[js.Any])
        
        inline def setPageDotremoveScriptToEvaluateOnNewDocument(value: `171`): Self = StObject.set(x, "Page.removeScriptToEvaluateOnNewDocument", value.asInstanceOf[js.Any])
        
        inline def setPageDotresetNavigationHistory(value: ParamsType): Self = StObject.set(x, "Page.resetNavigationHistory", value.asInstanceOf[js.Any])
        
        inline def setPageDotscreencastFrameAck(value: `172`): Self = StObject.set(x, "Page.screencastFrameAck", value.asInstanceOf[js.Any])
        
        inline def setPageDotsearchInResource(value: ReturnTypeSearchInResourceResponse): Self = StObject.set(x, "Page.searchInResource", value.asInstanceOf[js.Any])
        
        inline def setPageDotsetAdBlockingEnabled(value: `173`): Self = StObject.set(x, "Page.setAdBlockingEnabled", value.asInstanceOf[js.Any])
        
        inline def setPageDotsetBypassCSP(value: `174`): Self = StObject.set(x, "Page.setBypassCSP", value.asInstanceOf[js.Any])
        
        inline def setPageDotsetDeviceMetricsOverride(value: `175`): Self = StObject.set(x, "Page.setDeviceMetricsOverride", value.asInstanceOf[js.Any])
        
        inline def setPageDotsetDeviceOrientationOverride(value: `176`): Self = StObject.set(x, "Page.setDeviceOrientationOverride", value.asInstanceOf[js.Any])
        
        inline def setPageDotsetDocumentContent(value: `179`): Self = StObject.set(x, "Page.setDocumentContent", value.asInstanceOf[js.Any])
        
        inline def setPageDotsetDownloadBehavior(value: `180`): Self = StObject.set(x, "Page.setDownloadBehavior", value.asInstanceOf[js.Any])
        
        inline def setPageDotsetFontFamilies(value: `177`): Self = StObject.set(x, "Page.setFontFamilies", value.asInstanceOf[js.Any])
        
        inline def setPageDotsetFontSizes(value: `178`): Self = StObject.set(x, "Page.setFontSizes", value.asInstanceOf[js.Any])
        
        inline def setPageDotsetGeolocationOverride(value: `181`): Self = StObject.set(x, "Page.setGeolocationOverride", value.asInstanceOf[js.Any])
        
        inline def setPageDotsetInterceptFileChooserDialog(value: `191`): Self = StObject.set(x, "Page.setInterceptFileChooserDialog", value.asInstanceOf[js.Any])
        
        inline def setPageDotsetLifecycleEventsEnabled(value: `182`): Self = StObject.set(x, "Page.setLifecycleEventsEnabled", value.asInstanceOf[js.Any])
        
        inline def setPageDotsetPrerenderingAllowed(value: `192`): Self = StObject.set(x, "Page.setPrerenderingAllowed", value.asInstanceOf[js.Any])
        
        inline def setPageDotsetRPHRegistrationMode(value: `189`): Self = StObject.set(x, "Page.setRPHRegistrationMode", value.asInstanceOf[js.Any])
        
        inline def setPageDotsetSPCTransactionMode(value: `188`): Self = StObject.set(x, "Page.setSPCTransactionMode", value.asInstanceOf[js.Any])
        
        inline def setPageDotsetTouchEmulationEnabled(value: `183`): Self = StObject.set(x, "Page.setTouchEmulationEnabled", value.asInstanceOf[js.Any])
        
        inline def setPageDotsetWebLifecycleState(value: `185`): Self = StObject.set(x, "Page.setWebLifecycleState", value.asInstanceOf[js.Any])
        
        inline def setPageDotstartScreencast(value: `184`): Self = StObject.set(x, "Page.startScreencast", value.asInstanceOf[js.Any])
        
        inline def setPageDotstopLoading(value: ParamsType): Self = StObject.set(x, "Page.stopLoading", value.asInstanceOf[js.Any])
        
        inline def setPageDotstopScreencast(value: ParamsType): Self = StObject.set(x, "Page.stopScreencast", value.asInstanceOf[js.Any])
        
        inline def setPageDotwaitForDebugger(value: ParamsType): Self = StObject.set(x, "Page.waitForDebugger", value.asInstanceOf[js.Any])
        
        inline def setPerformanceDotdisable(value: ParamsType): Self = StObject.set(x, "Performance.disable", value.asInstanceOf[js.Any])
        
        inline def setPerformanceDotenable(value: `193`): Self = StObject.set(x, "Performance.enable", value.asInstanceOf[js.Any])
        
        inline def setPerformanceDotgetMetrics(value: ReturnTypeGetMetricsResponse): Self = StObject.set(x, "Performance.getMetrics", value.asInstanceOf[js.Any])
        
        inline def setPerformanceDotsetTimeDomain(value: `194`): Self = StObject.set(x, "Performance.setTimeDomain", value.asInstanceOf[js.Any])
        
        inline def setPerformanceTimelineDotenable(value: `195`): Self = StObject.set(x, "PerformanceTimeline.enable", value.asInstanceOf[js.Any])
        
        inline def setPreloadDotdisable(value: ParamsType): Self = StObject.set(x, "Preload.disable", value.asInstanceOf[js.Any])
        
        inline def setPreloadDotenable(value: ParamsType): Self = StObject.set(x, "Preload.enable", value.asInstanceOf[js.Any])
        
        inline def setProfilerDotdisable(value: ParamsType): Self = StObject.set(x, "Profiler.disable", value.asInstanceOf[js.Any])
        
        inline def setProfilerDotenable(value: ParamsType): Self = StObject.set(x, "Profiler.enable", value.asInstanceOf[js.Any])
        
        inline def setProfilerDotgetBestEffortCoverage(value: ReturnTypeGetBestEffortCoverageResponse): Self = StObject.set(x, "Profiler.getBestEffortCoverage", value.asInstanceOf[js.Any])
        
        inline def setProfilerDotsetSamplingInterval(value: `16`): Self = StObject.set(x, "Profiler.setSamplingInterval", value.asInstanceOf[js.Any])
        
        inline def setProfilerDotstart(value: ParamsType): Self = StObject.set(x, "Profiler.start", value.asInstanceOf[js.Any])
        
        inline def setProfilerDotstartPreciseCoverage(value: ReturnTypeStartPreciseCoverageResponse): Self = StObject.set(x, "Profiler.startPreciseCoverage", value.asInstanceOf[js.Any])
        
        inline def setProfilerDotstop(value: ReturnTypeStopResponse): Self = StObject.set(x, "Profiler.stop", value.asInstanceOf[js.Any])
        
        inline def setProfilerDotstopPreciseCoverage(value: ParamsType): Self = StObject.set(x, "Profiler.stopPreciseCoverage", value.asInstanceOf[js.Any])
        
        inline def setProfilerDottakePreciseCoverage(value: ReturnTypeTakePreciseCoverageResponse): Self = StObject.set(x, "Profiler.takePreciseCoverage", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotaddBinding(value: `22`): Self = StObject.set(x, "Runtime.addBinding", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotawaitPromise(value: ReturnTypeAwaitPromiseResponse): Self = StObject.set(x, "Runtime.awaitPromise", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotcallFunctionOn(value: ReturnTypeCallFunctionOnResponse): Self = StObject.set(x, "Runtime.callFunctionOn", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotcompileScript(value: ReturnTypeCompileScriptResponse): Self = StObject.set(x, "Runtime.compileScript", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotdisable(value: ParamsType): Self = StObject.set(x, "Runtime.disable", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotdiscardConsoleEntries(value: ParamsType): Self = StObject.set(x, "Runtime.discardConsoleEntries", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotenable(value: ParamsType): Self = StObject.set(x, "Runtime.enable", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotevaluate(value: ReturnTypeEvaluateResponse): Self = StObject.set(x, "Runtime.evaluate", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotgetExceptionDetails(value: ReturnTypeGetExceptionDetailsResponse): Self = StObject.set(x, "Runtime.getExceptionDetails", value.asInstanceOf[js.Any])
        
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
        
        inline def setSecurityDothandleCertificateError(value: `197`): Self = StObject.set(x, "Security.handleCertificateError", value.asInstanceOf[js.Any])
        
        inline def setSecurityDotsetIgnoreCertificateErrors(value: `196`): Self = StObject.set(x, "Security.setIgnoreCertificateErrors", value.asInstanceOf[js.Any])
        
        inline def setSecurityDotsetOverrideCertificateErrors(value: `198`): Self = StObject.set(x, "Security.setOverrideCertificateErrors", value.asInstanceOf[js.Any])
        
        inline def setServiceWorkerDotdeliverPushMessage(value: `199`): Self = StObject.set(x, "ServiceWorker.deliverPushMessage", value.asInstanceOf[js.Any])
        
        inline def setServiceWorkerDotdisable(value: ParamsType): Self = StObject.set(x, "ServiceWorker.disable", value.asInstanceOf[js.Any])
        
        inline def setServiceWorkerDotdispatchPeriodicSyncEvent(value: `201`): Self = StObject.set(x, "ServiceWorker.dispatchPeriodicSyncEvent", value.asInstanceOf[js.Any])
        
        inline def setServiceWorkerDotdispatchSyncEvent(value: `200`): Self = StObject.set(x, "ServiceWorker.dispatchSyncEvent", value.asInstanceOf[js.Any])
        
        inline def setServiceWorkerDotenable(value: ParamsType): Self = StObject.set(x, "ServiceWorker.enable", value.asInstanceOf[js.Any])
        
        inline def setServiceWorkerDotinspectWorker(value: `202`): Self = StObject.set(x, "ServiceWorker.inspectWorker", value.asInstanceOf[js.Any])
        
        inline def setServiceWorkerDotsetForceUpdateOnPageLoad(value: `203`): Self = StObject.set(x, "ServiceWorker.setForceUpdateOnPageLoad", value.asInstanceOf[js.Any])
        
        inline def setServiceWorkerDotskipWaiting(value: `204`): Self = StObject.set(x, "ServiceWorker.skipWaiting", value.asInstanceOf[js.Any])
        
        inline def setServiceWorkerDotstartWorker(value: `205`): Self = StObject.set(x, "ServiceWorker.startWorker", value.asInstanceOf[js.Any])
        
        inline def setServiceWorkerDotstopAllWorkers(value: ParamsType): Self = StObject.set(x, "ServiceWorker.stopAllWorkers", value.asInstanceOf[js.Any])
        
        inline def setServiceWorkerDotstopWorker(value: `206`): Self = StObject.set(x, "ServiceWorker.stopWorker", value.asInstanceOf[js.Any])
        
        inline def setServiceWorkerDotunregister(value: `207`): Self = StObject.set(x, "ServiceWorker.unregister", value.asInstanceOf[js.Any])
        
        inline def setServiceWorkerDotupdateRegistration(value: `208`): Self = StObject.set(x, "ServiceWorker.updateRegistration", value.asInstanceOf[js.Any])
        
        inline def setStorageDotclearCookies(value: `213`): Self = StObject.set(x, "Storage.clearCookies", value.asInstanceOf[js.Any])
        
        inline def setStorageDotclearDataForOrigin(value: `209`): Self = StObject.set(x, "Storage.clearDataForOrigin", value.asInstanceOf[js.Any])
        
        inline def setStorageDotclearDataForStorageKey(value: `210`): Self = StObject.set(x, "Storage.clearDataForStorageKey", value.asInstanceOf[js.Any])
        
        inline def setStorageDotclearSharedStorageEntries(value: `226`): Self = StObject.set(x, "Storage.clearSharedStorageEntries", value.asInstanceOf[js.Any])
        
        inline def setStorageDotclearTrustTokens(value: ReturnTypeClearTrustTokensResponse): Self = StObject.set(x, "Storage.clearTrustTokens", value.asInstanceOf[js.Any])
        
        inline def setStorageDotdeleteSharedStorageEntry(value: `225`): Self = StObject.set(x, "Storage.deleteSharedStorageEntry", value.asInstanceOf[js.Any])
        
        inline def setStorageDotdeleteStorageBucket(value: `230`): Self = StObject.set(x, "Storage.deleteStorageBucket", value.asInstanceOf[js.Any])
        
        inline def setStorageDotgetCookies(value: `211`): Self = StObject.set(x, "Storage.getCookies", value.asInstanceOf[js.Any])
        
        inline def setStorageDotgetInterestGroupDetails(value: ReturnTypeGetInterestGroupDetailsResponse): Self = StObject.set(x, "Storage.getInterestGroupDetails", value.asInstanceOf[js.Any])
        
        inline def setStorageDotgetSharedStorageEntries(value: ReturnTypeGetSharedStorageEntriesResponse): Self = StObject.set(x, "Storage.getSharedStorageEntries", value.asInstanceOf[js.Any])
        
        inline def setStorageDotgetSharedStorageMetadata(value: ReturnTypeGetSharedStorageMetadataResponse): Self = StObject.set(x, "Storage.getSharedStorageMetadata", value.asInstanceOf[js.Any])
        
        inline def setStorageDotgetStorageKeyForFrame(value: ReturnTypeGetStorageKeyForFrameResponse): Self = StObject.set(x, "Storage.getStorageKeyForFrame", value.asInstanceOf[js.Any])
        
        inline def setStorageDotgetTrustTokens(value: ReturnTypeGetTrustTokensResponse): Self = StObject.set(x, "Storage.getTrustTokens", value.asInstanceOf[js.Any])
        
        inline def setStorageDotgetUsageAndQuota(value: ReturnTypeGetUsageAndQuotaResponse): Self = StObject.set(x, "Storage.getUsageAndQuota", value.asInstanceOf[js.Any])
        
        inline def setStorageDotoverrideQuotaForOrigin(value: `214`): Self = StObject.set(x, "Storage.overrideQuotaForOrigin", value.asInstanceOf[js.Any])
        
        inline def setStorageDotresetSharedStorageBudget(value: `227`): Self = StObject.set(x, "Storage.resetSharedStorageBudget", value.asInstanceOf[js.Any])
        
        inline def setStorageDotrunBounceTrackingMitigations(value: ReturnTypeRunBounceTrackingMitigationsResponse): Self = StObject.set(x, "Storage.runBounceTrackingMitigations", value.asInstanceOf[js.Any])
        
        inline def setStorageDotsetCookies(value: `212`): Self = StObject.set(x, "Storage.setCookies", value.asInstanceOf[js.Any])
        
        inline def setStorageDotsetInterestGroupTracking(value: `223`): Self = StObject.set(x, "Storage.setInterestGroupTracking", value.asInstanceOf[js.Any])
        
        inline def setStorageDotsetSharedStorageEntry(value: `224`): Self = StObject.set(x, "Storage.setSharedStorageEntry", value.asInstanceOf[js.Any])
        
        inline def setStorageDotsetSharedStorageTracking(value: `228`): Self = StObject.set(x, "Storage.setSharedStorageTracking", value.asInstanceOf[js.Any])
        
        inline def setStorageDotsetStorageBucketTracking(value: `229`): Self = StObject.set(x, "Storage.setStorageBucketTracking", value.asInstanceOf[js.Any])
        
        inline def setStorageDottrackCacheStorageForOrigin(value: `215`): Self = StObject.set(x, "Storage.trackCacheStorageForOrigin", value.asInstanceOf[js.Any])
        
        inline def setStorageDottrackCacheStorageForStorageKey(value: `216`): Self = StObject.set(x, "Storage.trackCacheStorageForStorageKey", value.asInstanceOf[js.Any])
        
        inline def setStorageDottrackIndexedDBForOrigin(value: `217`): Self = StObject.set(x, "Storage.trackIndexedDBForOrigin", value.asInstanceOf[js.Any])
        
        inline def setStorageDottrackIndexedDBForStorageKey(value: `218`): Self = StObject.set(x, "Storage.trackIndexedDBForStorageKey", value.asInstanceOf[js.Any])
        
        inline def setStorageDotuntrackCacheStorageForOrigin(value: `219`): Self = StObject.set(x, "Storage.untrackCacheStorageForOrigin", value.asInstanceOf[js.Any])
        
        inline def setStorageDotuntrackCacheStorageForStorageKey(value: `220`): Self = StObject.set(x, "Storage.untrackCacheStorageForStorageKey", value.asInstanceOf[js.Any])
        
        inline def setStorageDotuntrackIndexedDBForOrigin(value: `221`): Self = StObject.set(x, "Storage.untrackIndexedDBForOrigin", value.asInstanceOf[js.Any])
        
        inline def setStorageDotuntrackIndexedDBForStorageKey(value: `222`): Self = StObject.set(x, "Storage.untrackIndexedDBForStorageKey", value.asInstanceOf[js.Any])
        
        inline def setSystemInfoDotgetFeatureState(value: ReturnTypeGetFeatureStateResponse): Self = StObject.set(x, "SystemInfo.getFeatureState", value.asInstanceOf[js.Any])
        
        inline def setSystemInfoDotgetInfo(value: ReturnTypeGetInfoResponse): Self = StObject.set(x, "SystemInfo.getInfo", value.asInstanceOf[js.Any])
        
        inline def setSystemInfoDotgetProcessInfo(value: ReturnTypeGetProcessInfoResponse): Self = StObject.set(x, "SystemInfo.getProcessInfo", value.asInstanceOf[js.Any])
        
        inline def setTargetDotactivateTarget(value: `231`): Self = StObject.set(x, "Target.activateTarget", value.asInstanceOf[js.Any])
        
        inline def setTargetDotattachToBrowserTarget(value: ReturnTypeAttachToBrowserTargetResponse): Self = StObject.set(x, "Target.attachToBrowserTarget", value.asInstanceOf[js.Any])
        
        inline def setTargetDotattachToTarget(value: ReturnTypeAttachToTargetResponse): Self = StObject.set(x, "Target.attachToTarget", value.asInstanceOf[js.Any])
        
        inline def setTargetDotautoAttachRelated(value: `237`): Self = StObject.set(x, "Target.autoAttachRelated", value.asInstanceOf[js.Any])
        
        inline def setTargetDotcloseTarget(value: ReturnTypeCloseTargetResponse): Self = StObject.set(x, "Target.closeTarget", value.asInstanceOf[js.Any])
        
        inline def setTargetDotcreateBrowserContext(value: ReturnTypeCreateBrowserContextResponse): Self = StObject.set(x, "Target.createBrowserContext", value.asInstanceOf[js.Any])
        
        inline def setTargetDotcreateTarget(value: ReturnTypeCreateTargetResponse): Self = StObject.set(x, "Target.createTarget", value.asInstanceOf[js.Any])
        
        inline def setTargetDotdetachFromTarget(value: `233`): Self = StObject.set(x, "Target.detachFromTarget", value.asInstanceOf[js.Any])
        
        inline def setTargetDotdisposeBrowserContext(value: `234`): Self = StObject.set(x, "Target.disposeBrowserContext", value.asInstanceOf[js.Any])
        
        inline def setTargetDotexposeDevToolsProtocol(value: `232`): Self = StObject.set(x, "Target.exposeDevToolsProtocol", value.asInstanceOf[js.Any])
        
        inline def setTargetDotgetBrowserContexts(value: ReturnTypeGetBrowserContextsResponse): Self = StObject.set(x, "Target.getBrowserContexts", value.asInstanceOf[js.Any])
        
        inline def setTargetDotgetTargetInfo(value: ReturnTypeGetTargetInfoResponse): Self = StObject.set(x, "Target.getTargetInfo", value.asInstanceOf[js.Any])
        
        inline def setTargetDotgetTargets(value: ReturnTypeGetTargetsResponse): Self = StObject.set(x, "Target.getTargets", value.asInstanceOf[js.Any])
        
        inline def setTargetDotsendMessageToTarget(value: `235`): Self = StObject.set(x, "Target.sendMessageToTarget", value.asInstanceOf[js.Any])
        
        inline def setTargetDotsetAutoAttach(value: `236`): Self = StObject.set(x, "Target.setAutoAttach", value.asInstanceOf[js.Any])
        
        inline def setTargetDotsetDiscoverTargets(value: `238`): Self = StObject.set(x, "Target.setDiscoverTargets", value.asInstanceOf[js.Any])
        
        inline def setTargetDotsetRemoteLocations(value: `239`): Self = StObject.set(x, "Target.setRemoteLocations", value.asInstanceOf[js.Any])
        
        inline def setTetheringDotbind(value: `240`): Self = StObject.set(x, "Tethering.bind", value.asInstanceOf[js.Any])
        
        inline def setTetheringDotunbind(value: `241`): Self = StObject.set(x, "Tethering.unbind", value.asInstanceOf[js.Any])
        
        inline def setTracingDotend(value: ParamsType): Self = StObject.set(x, "Tracing.end", value.asInstanceOf[js.Any])
        
        inline def setTracingDotgetCategories(value: ReturnTypeGetCategoriesResponse): Self = StObject.set(x, "Tracing.getCategories", value.asInstanceOf[js.Any])
        
        inline def setTracingDotrecordClockSyncMarker(value: `242`): Self = StObject.set(x, "Tracing.recordClockSyncMarker", value.asInstanceOf[js.Any])
        
        inline def setTracingDotrequestMemoryDump(value: ReturnTypeRequestMemoryDumpResponse): Self = StObject.set(x, "Tracing.requestMemoryDump", value.asInstanceOf[js.Any])
        
        inline def setTracingDotstart(value: `243`): Self = StObject.set(x, "Tracing.start", value.asInstanceOf[js.Any])
        
        inline def setWebAudioDotdisable(value: ParamsType): Self = StObject.set(x, "WebAudio.disable", value.asInstanceOf[js.Any])
        
        inline def setWebAudioDotenable(value: ParamsType): Self = StObject.set(x, "WebAudio.enable", value.asInstanceOf[js.Any])
        
        inline def setWebAudioDotgetRealtimeData(value: ReturnTypeGetRealtimeDataResponse): Self = StObject.set(x, "WebAudio.getRealtimeData", value.asInstanceOf[js.Any])
        
        inline def setWebAuthnDotaddCredential(value: `253`): Self = StObject.set(x, "WebAuthn.addCredential", value.asInstanceOf[js.Any])
        
        inline def setWebAuthnDotaddVirtualAuthenticator(value: ReturnTypeAddVirtualAuthenticatorResponse): Self = StObject.set(x, "WebAuthn.addVirtualAuthenticator", value.asInstanceOf[js.Any])
        
        inline def setWebAuthnDotclearCredentials(value: `255`): Self = StObject.set(x, "WebAuthn.clearCredentials", value.asInstanceOf[js.Any])
        
        inline def setWebAuthnDotdisable(value: ParamsType): Self = StObject.set(x, "WebAuthn.disable", value.asInstanceOf[js.Any])
        
        inline def setWebAuthnDotenable(value: `250`): Self = StObject.set(x, "WebAuthn.enable", value.asInstanceOf[js.Any])
        
        inline def setWebAuthnDotgetCredential(value: ReturnTypeGetCredentialResponse): Self = StObject.set(x, "WebAuthn.getCredential", value.asInstanceOf[js.Any])
        
        inline def setWebAuthnDotgetCredentials(value: ReturnTypeGetCredentialsResponse): Self = StObject.set(x, "WebAuthn.getCredentials", value.asInstanceOf[js.Any])
        
        inline def setWebAuthnDotremoveCredential(value: `254`): Self = StObject.set(x, "WebAuthn.removeCredential", value.asInstanceOf[js.Any])
        
        inline def setWebAuthnDotremoveVirtualAuthenticator(value: `252`): Self = StObject.set(x, "WebAuthn.removeVirtualAuthenticator", value.asInstanceOf[js.Any])
        
        inline def setWebAuthnDotsetAutomaticPresenceSimulation(value: `257`): Self = StObject.set(x, "WebAuthn.setAutomaticPresenceSimulation", value.asInstanceOf[js.Any])
        
        inline def setWebAuthnDotsetResponseOverrideBits(value: `251`): Self = StObject.set(x, "WebAuthn.setResponseOverrideBits", value.asInstanceOf[js.Any])
        
        inline def setWebAuthnDotsetUserVerified(value: `256`): Self = StObject.set(x, "WebAuthn.setUserVerified", value.asInstanceOf[js.Any])
      }
    }
    
    trait Events extends StObject {
      
      /**
        * The loadComplete event mirrors the load complete event sent by the browser to assistive
        * technology when the web page has finished loading.
        */
      @JSName("Accessibility.loadComplete")
      var AccessibilityDotloadComplete: js.Array[LoadCompleteEvent]
      
      /**
        * The nodesUpdated event is sent every time a previously requested node has changed the in tree.
        */
      @JSName("Accessibility.nodesUpdated")
      var AccessibilityDotnodesUpdated: js.Array[NodesUpdatedEvent]
      
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
        * Fired when download makes progress. Last call has |done| == true.
        */
      @JSName("Browser.downloadProgress")
      var BrowserDotdownloadProgress: js.Array[DownloadProgressEvent]
      
      /**
        * Fired when page is about to start a download.
        */
      @JSName("Browser.downloadWillBegin")
      var BrowserDotdownloadWillBegin: js.Array[DownloadWillBeginEvent]
      
      /**
        * Fires whenever a web font is updated.  A non-empty font parameter indicates a successfully loaded
        * web font.
        */
      @JSName("CSS.fontsUpdated")
      var CSSDotfontsUpdated: js.Array[FontsUpdatedEvent]
      
      /**
        * Fires whenever a MediaQuery result changes (for example, after a browser window has been
        * resized.) The current implementation considers only viewport-dependent media features.
        */
      @JSName("CSS.mediaQueryResultChanged")
      var CSSDotmediaQueryResultChanged: js.Array[Any]
      
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
        * Called when distribution is changed.
        */
      @JSName("DOM.distributedNodesUpdated")
      var DOMDotdistributedNodesUpdated: js.Array[DistributedNodesUpdatedEvent]
      
      /**
        * Fired when `Document` has been totally updated. Node ids are no longer valid.
        */
      @JSName("DOM.documentUpdated")
      var DOMDotdocumentUpdated: js.Array[Any]
      
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
      
      /**
        * Called when top layer elements are changed.
        */
      @JSName("DOM.topLayerElementsUpdated")
      var DOMDottopLayerElementsUpdated: js.Array[Any]
      
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
      var DebuggerDotresumed: js.Array[Any]
      
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
        * A device request opened a user prompt to select a device. Respond with the
        * selectPrompt or cancelPrompt command.
        */
      @JSName("DeviceAccess.deviceRequestPrompted")
      var DeviceAccessDotdeviceRequestPrompted: js.Array[DeviceRequestPromptedEvent]
      
      /**
        * Notification sent after the virtual time budget for the current VirtualTimePolicy has run out.
        */
      @JSName("Emulation.virtualTimeBudgetExpired")
      var EmulationDotvirtualTimeBudgetExpired: js.Array[Any]
      
      @JSName("FedCm.dialogShown")
      var FedCmDotdialogShown: js.Array[DialogShownEvent]
      
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
      var HeapProfilerDotresetProfiles: js.Array[Any]
      
      /**
        * Emitted only when `Input.setInterceptDrags` is enabled. Use this data with `Input.dispatchDragEvent` to
        * restore normal drag and drop behavior.
        */
      @JSName("Input.dragIntercepted")
      var InputDotdragIntercepted: js.Array[DragInterceptedEvent]
      
      /**
        * Fired when remote debugging connection is about to be terminated. Contains detach reason.
        */
      @JSName("Inspector.detached")
      var InspectorDotdetached: js.Array[DetachedEvent]
      
      /**
        * Fired when debugging target has crashed
        */
      @JSName("Inspector.targetCrashed")
      var InspectorDottargetCrashed: js.Array[Any]
      
      /**
        * Fired when debugging target has reloaded after crash
        */
      @JSName("Inspector.targetReloadedAfterCrash")
      var InspectorDottargetReloadedAfterCrash: js.Array[Any]
      
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
        * Called whenever a player is created, or when a new agent joins and receives
        * a list of active players. If an agent is restored, it will receive the full
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
      
      @JSName("Network.reportingApiEndpointsChangedForOrigin")
      var NetworkDotreportingApiEndpointsChangedForOrigin: js.Array[ReportingApiEndpointsChangedForOriginEvent]
      
      /**
        * Is sent whenever a new report is added.
        * And after 'enableReportingApi' for all existing reports.
        */
      @JSName("Network.reportingApiReportAdded")
      var NetworkDotreportingApiReportAdded: js.Array[ReportingApiReportAddedEvent]
      
      @JSName("Network.reportingApiReportUpdated")
      var NetworkDotreportingApiReportUpdated: js.Array[ReportingApiReportUpdatedEvent]
      
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
        * Fired when request for resources within a .wbn file failed.
        */
      @JSName("Network.subresourceWebBundleInnerResponseError")
      var NetworkDotsubresourceWebBundleInnerResponseError: js.Array[SubresourceWebBundleInnerResponseErrorEvent]
      
      /**
        * Fired when handling requests for resources within a .wbn file.
        * Note: this will only be fired for resources that are requested by the webpage.
        */
      @JSName("Network.subresourceWebBundleInnerResponseParsed")
      var NetworkDotsubresourceWebBundleInnerResponseParsed: js.Array[SubresourceWebBundleInnerResponseParsedEvent]
      
      /**
        * Fired once when parsing the .wbn file has failed.
        */
      @JSName("Network.subresourceWebBundleMetadataError")
      var NetworkDotsubresourceWebBundleMetadataError: js.Array[SubresourceWebBundleMetadataErrorEvent]
      
      /**
        * Fired once when parsing the .wbn file has succeeded.
        * The event contains the information about the web bundle contents.
        */
      @JSName("Network.subresourceWebBundleMetadataReceived")
      var NetworkDotsubresourceWebBundleMetadataReceived: js.Array[SubresourceWebBundleMetadataReceivedEvent]
      
      /**
        * Fired exactly once for each Trust Token operation. Depending on
        * the type of the operation and whether the operation succeeded or
        * failed, the event is fired before the corresponding request was sent
        * or after the response was received.
        */
      @JSName("Network.trustTokenOperationDone")
      var NetworkDottrustTokenOperationDone: js.Array[TrustTokenOperationDoneEvent]
      
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
        * Fired when WebTransport is disposed.
        */
      @JSName("Network.webTransportClosed")
      var NetworkDotwebTransportClosed: js.Array[WebTransportClosedEvent]
      
      /**
        * Fired when WebTransport handshake is finished.
        */
      @JSName("Network.webTransportConnectionEstablished")
      var NetworkDotwebTransportConnectionEstablished: js.Array[WebTransportConnectionEstablishedEvent]
      
      /**
        * Fired upon WebTransport creation.
        */
      @JSName("Network.webTransportCreated")
      var NetworkDotwebTransportCreated: js.Array[WebTransportCreatedEvent]
      
      /**
        * Fired when user cancels the inspect mode.
        */
      @JSName("Overlay.inspectModeCanceled")
      var OverlayDotinspectModeCanceled: js.Array[Any]
      
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
        * Fired for failed bfcache history navigations if BackForwardCache feature is enabled. Do
        * not assume any ordering with the Page.frameNavigated event. This event is fired only for
        * main-frame history navigation where the document changes (non-same-document navigations),
        * when bfcache navigation fails.
        */
      @JSName("Page.backForwardCacheNotUsed")
      var PageDotbackForwardCacheNotUsed: js.Array[BackForwardCacheNotUsedEvent]
      
      /**
        * Issued for every compilation cache generated. Is only available
        * if Page.setGenerateCompilationCache is enabled.
        */
      @JSName("Page.compilationCacheProduced")
      var PageDotcompilationCacheProduced: js.Array[CompilationCacheProducedEvent]
      
      /**
        * Fired when opening document to write to.
        */
      @JSName("Page.documentOpened")
      var PageDotdocumentOpened: js.Array[DocumentOpenedEvent]
      
      @JSName("Page.domContentEventFired")
      var PageDotdomContentEventFired: js.Array[DomContentEventFiredEvent]
      
      /**
        * Fired when download makes progress. Last call has |done| == true.
        * Deprecated. Use Browser.downloadProgress instead.
        */
      @JSName("Page.downloadProgress")
      var PageDotdownloadProgress: js.Array[typings.devtoolsProtocol.mod.Protocol.Page.DownloadProgressEvent]
      
      /**
        * Fired when page is about to start a download.
        * Deprecated. Use Browser.downloadWillBegin instead.
        */
      @JSName("Page.downloadWillBegin")
      var PageDotdownloadWillBegin: js.Array[typings.devtoolsProtocol.mod.Protocol.Page.DownloadWillBeginEvent]
      
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
      var PageDotframeResized: js.Array[Any]
      
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
      var PageDotinterstitialHidden: js.Array[Any]
      
      /**
        * Fired when interstitial page was shown
        */
      @JSName("Page.interstitialShown")
      var PageDotinterstitialShown: js.Array[Any]
      
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
      
      /**
        * Sent when a performance timeline event is added. See reportPerformanceTimeline method.
        */
      @JSName("PerformanceTimeline.timelineEventAdded")
      var PerformanceTimelineDottimelineEventAdded: js.Array[TimelineEventAddedEvent]
      
      /**
        * Fired when a prefetch attempt is updated.
        */
      @JSName("Preload.prefetchStatusUpdated")
      var PreloadDotprefetchStatusUpdated: js.Array[PrefetchStatusUpdatedEvent]
      
      /**
        * Fired when a preload enabled state is updated.
        */
      @JSName("Preload.preloadEnabledStateUpdated")
      var PreloadDotpreloadEnabledStateUpdated: js.Array[PreloadEnabledStateUpdatedEvent]
      
      /**
        * Send a list of sources for all preloading attempts in a document.
        */
      @JSName("Preload.preloadingAttemptSourcesUpdated")
      var PreloadDotpreloadingAttemptSourcesUpdated: js.Array[PreloadingAttemptSourcesUpdatedEvent]
      
      /**
        * Fired when a prerender attempt is completed.
        */
      @JSName("Preload.prerenderAttemptCompleted")
      var PreloadDotprerenderAttemptCompleted: js.Array[PrerenderAttemptCompletedEvent]
      
      /**
        * Fired when a prerender attempt is updated.
        */
      @JSName("Preload.prerenderStatusUpdated")
      var PreloadDotprerenderStatusUpdated: js.Array[PrerenderStatusUpdatedEvent]
      
      @JSName("Preload.ruleSetRemoved")
      var PreloadDotruleSetRemoved: js.Array[RuleSetRemovedEvent]
      
      /**
        * Upsert. Currently, it is only emitted when a rule set added.
        */
      @JSName("Preload.ruleSetUpdated")
      var PreloadDotruleSetUpdated: js.Array[RuleSetUpdatedEvent]
      
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
        * trigger collection of coverage data immediately at a certain point in time.
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
      var RuntimeDotexecutionContextsCleared: js.Array[Any]
      
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
        * The security state of the page changed. No longer being sent.
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
        * One of the interest groups was accessed by the associated page.
        */
      @JSName("Storage.interestGroupAccessed")
      var StorageDotinterestGroupAccessed: js.Array[InterestGroupAccessedEvent]
      
      /**
        * Shared storage was accessed by the associated page.
        * The following parameters are included in all events.
        */
      @JSName("Storage.sharedStorageAccessed")
      var StorageDotsharedStorageAccessed: js.Array[SharedStorageAccessedEvent]
      
      @JSName("Storage.storageBucketCreatedOrUpdated")
      var StorageDotstorageBucketCreatedOrUpdated: js.Array[StorageBucketCreatedOrUpdatedEvent]
      
      @JSName("Storage.storageBucketDeleted")
      var StorageDotstorageBucketDeleted: js.Array[StorageBucketDeletedEvent]
      
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
        * Contains a bucket of collected trace events. When tracing is stopped collected events will be
        * sent as a sequence of dataCollected events followed by tracingComplete event.
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
      
      /**
        * Triggered when a credential is added to an authenticator.
        */
      @JSName("WebAuthn.credentialAdded")
      var WebAuthnDotcredentialAdded: js.Array[CredentialAddedEvent]
      
      /**
        * Triggered when a credential is used in a webauthn assertion.
        */
      @JSName("WebAuthn.credentialAsserted")
      var WebAuthnDotcredentialAsserted: js.Array[CredentialAssertedEvent]
    }
    object Events {
      
      inline def apply(
        AccessibilityDotloadComplete: js.Array[LoadCompleteEvent],
        AccessibilityDotnodesUpdated: js.Array[NodesUpdatedEvent],
        AnimationDotanimationCanceled: js.Array[AnimationCanceledEvent],
        AnimationDotanimationCreated: js.Array[AnimationCreatedEvent],
        AnimationDotanimationStarted: js.Array[AnimationStartedEvent],
        AuditsDotissueAdded: js.Array[IssueAddedEvent],
        BackgroundServiceDotbackgroundServiceEventReceived: js.Array[BackgroundServiceEventReceivedEvent],
        BackgroundServiceDotrecordingStateChanged: js.Array[RecordingStateChangedEvent],
        BrowserDotdownloadProgress: js.Array[DownloadProgressEvent],
        BrowserDotdownloadWillBegin: js.Array[DownloadWillBeginEvent],
        CSSDotfontsUpdated: js.Array[FontsUpdatedEvent],
        CSSDotmediaQueryResultChanged: js.Array[Any],
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
        DOMDotdocumentUpdated: js.Array[Any],
        DOMDotinlineStyleInvalidated: js.Array[InlineStyleInvalidatedEvent],
        DOMDotpseudoElementAdded: js.Array[PseudoElementAddedEvent],
        DOMDotpseudoElementRemoved: js.Array[PseudoElementRemovedEvent],
        DOMDotsetChildNodes: js.Array[SetChildNodesEvent],
        DOMDotshadowRootPopped: js.Array[ShadowRootPoppedEvent],
        DOMDotshadowRootPushed: js.Array[ShadowRootPushedEvent],
        DOMDottopLayerElementsUpdated: js.Array[Any],
        DOMStorageDotdomStorageItemAdded: js.Array[DomStorageItemAddedEvent],
        DOMStorageDotdomStorageItemRemoved: js.Array[DomStorageItemRemovedEvent],
        DOMStorageDotdomStorageItemUpdated: js.Array[DomStorageItemUpdatedEvent],
        DOMStorageDotdomStorageItemsCleared: js.Array[DomStorageItemsClearedEvent],
        DatabaseDotaddDatabase: js.Array[AddDatabaseEvent],
        DebuggerDotbreakpointResolved: js.Array[BreakpointResolvedEvent],
        DebuggerDotpaused: js.Array[PausedEvent],
        DebuggerDotresumed: js.Array[Any],
        DebuggerDotscriptFailedToParse: js.Array[ScriptFailedToParseEvent],
        DebuggerDotscriptParsed: js.Array[ScriptParsedEvent],
        DeviceAccessDotdeviceRequestPrompted: js.Array[DeviceRequestPromptedEvent],
        EmulationDotvirtualTimeBudgetExpired: js.Array[Any],
        FedCmDotdialogShown: js.Array[DialogShownEvent],
        FetchDotauthRequired: js.Array[AuthRequiredEvent],
        FetchDotrequestPaused: js.Array[RequestPausedEvent],
        HeapProfilerDotaddHeapSnapshotChunk: js.Array[AddHeapSnapshotChunkEvent],
        HeapProfilerDotheapStatsUpdate: js.Array[HeapStatsUpdateEvent],
        HeapProfilerDotlastSeenObjectId: js.Array[LastSeenObjectIdEvent],
        HeapProfilerDotreportHeapSnapshotProgress: js.Array[ReportHeapSnapshotProgressEvent],
        HeapProfilerDotresetProfiles: js.Array[Any],
        InputDotdragIntercepted: js.Array[DragInterceptedEvent],
        InspectorDotdetached: js.Array[DetachedEvent],
        InspectorDottargetCrashed: js.Array[Any],
        InspectorDottargetReloadedAfterCrash: js.Array[Any],
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
        NetworkDotreportingApiEndpointsChangedForOrigin: js.Array[ReportingApiEndpointsChangedForOriginEvent],
        NetworkDotreportingApiReportAdded: js.Array[ReportingApiReportAddedEvent],
        NetworkDotreportingApiReportUpdated: js.Array[ReportingApiReportUpdatedEvent],
        NetworkDotrequestIntercepted: js.Array[RequestInterceptedEvent],
        NetworkDotrequestServedFromCache: js.Array[RequestServedFromCacheEvent],
        NetworkDotrequestWillBeSent: js.Array[RequestWillBeSentEvent],
        NetworkDotrequestWillBeSentExtraInfo: js.Array[RequestWillBeSentExtraInfoEvent],
        NetworkDotresourceChangedPriority: js.Array[ResourceChangedPriorityEvent],
        NetworkDotresponseReceived: js.Array[ResponseReceivedEvent],
        NetworkDotresponseReceivedExtraInfo: js.Array[ResponseReceivedExtraInfoEvent],
        NetworkDotsignedExchangeReceived: js.Array[SignedExchangeReceivedEvent],
        NetworkDotsubresourceWebBundleInnerResponseError: js.Array[SubresourceWebBundleInnerResponseErrorEvent],
        NetworkDotsubresourceWebBundleInnerResponseParsed: js.Array[SubresourceWebBundleInnerResponseParsedEvent],
        NetworkDotsubresourceWebBundleMetadataError: js.Array[SubresourceWebBundleMetadataErrorEvent],
        NetworkDotsubresourceWebBundleMetadataReceived: js.Array[SubresourceWebBundleMetadataReceivedEvent],
        NetworkDottrustTokenOperationDone: js.Array[TrustTokenOperationDoneEvent],
        NetworkDotwebSocketClosed: js.Array[WebSocketClosedEvent],
        NetworkDotwebSocketCreated: js.Array[WebSocketCreatedEvent],
        NetworkDotwebSocketFrameError: js.Array[WebSocketFrameErrorEvent],
        NetworkDotwebSocketFrameReceived: js.Array[WebSocketFrameReceivedEvent],
        NetworkDotwebSocketFrameSent: js.Array[WebSocketFrameSentEvent],
        NetworkDotwebSocketHandshakeResponseReceived: js.Array[WebSocketHandshakeResponseReceivedEvent],
        NetworkDotwebSocketWillSendHandshakeRequest: js.Array[WebSocketWillSendHandshakeRequestEvent],
        NetworkDotwebTransportClosed: js.Array[WebTransportClosedEvent],
        NetworkDotwebTransportConnectionEstablished: js.Array[WebTransportConnectionEstablishedEvent],
        NetworkDotwebTransportCreated: js.Array[WebTransportCreatedEvent],
        OverlayDotinspectModeCanceled: js.Array[Any],
        OverlayDotinspectNodeRequested: js.Array[InspectNodeRequestedEvent],
        OverlayDotnodeHighlightRequested: js.Array[NodeHighlightRequestedEvent],
        OverlayDotscreenshotRequested: js.Array[ScreenshotRequestedEvent],
        PageDotbackForwardCacheNotUsed: js.Array[BackForwardCacheNotUsedEvent],
        PageDotcompilationCacheProduced: js.Array[CompilationCacheProducedEvent],
        PageDotdocumentOpened: js.Array[DocumentOpenedEvent],
        PageDotdomContentEventFired: js.Array[DomContentEventFiredEvent],
        PageDotdownloadProgress: js.Array[typings.devtoolsProtocol.mod.Protocol.Page.DownloadProgressEvent],
        PageDotdownloadWillBegin: js.Array[typings.devtoolsProtocol.mod.Protocol.Page.DownloadWillBeginEvent],
        PageDotfileChooserOpened: js.Array[FileChooserOpenedEvent],
        PageDotframeAttached: js.Array[FrameAttachedEvent],
        PageDotframeClearedScheduledNavigation: js.Array[FrameClearedScheduledNavigationEvent],
        PageDotframeDetached: js.Array[FrameDetachedEvent],
        PageDotframeNavigated: js.Array[FrameNavigatedEvent],
        PageDotframeRequestedNavigation: js.Array[FrameRequestedNavigationEvent],
        PageDotframeResized: js.Array[Any],
        PageDotframeScheduledNavigation: js.Array[FrameScheduledNavigationEvent],
        PageDotframeStartedLoading: js.Array[FrameStartedLoadingEvent],
        PageDotframeStoppedLoading: js.Array[FrameStoppedLoadingEvent],
        PageDotinterstitialHidden: js.Array[Any],
        PageDotinterstitialShown: js.Array[Any],
        PageDotjavascriptDialogClosed: js.Array[JavascriptDialogClosedEvent],
        PageDotjavascriptDialogOpening: js.Array[JavascriptDialogOpeningEvent],
        PageDotlifecycleEvent: js.Array[LifecycleEventEvent],
        PageDotloadEventFired: js.Array[LoadEventFiredEvent],
        PageDotnavigatedWithinDocument: js.Array[NavigatedWithinDocumentEvent],
        PageDotscreencastFrame: js.Array[ScreencastFrameEvent],
        PageDotscreencastVisibilityChanged: js.Array[ScreencastVisibilityChangedEvent],
        PageDotwindowOpen: js.Array[WindowOpenEvent],
        PerformanceDotmetrics: js.Array[MetricsEvent],
        PerformanceTimelineDottimelineEventAdded: js.Array[TimelineEventAddedEvent],
        PreloadDotprefetchStatusUpdated: js.Array[PrefetchStatusUpdatedEvent],
        PreloadDotpreloadEnabledStateUpdated: js.Array[PreloadEnabledStateUpdatedEvent],
        PreloadDotpreloadingAttemptSourcesUpdated: js.Array[PreloadingAttemptSourcesUpdatedEvent],
        PreloadDotprerenderAttemptCompleted: js.Array[PrerenderAttemptCompletedEvent],
        PreloadDotprerenderStatusUpdated: js.Array[PrerenderStatusUpdatedEvent],
        PreloadDotruleSetRemoved: js.Array[RuleSetRemovedEvent],
        PreloadDotruleSetUpdated: js.Array[RuleSetUpdatedEvent],
        ProfilerDotconsoleProfileFinished: js.Array[ConsoleProfileFinishedEvent],
        ProfilerDotconsoleProfileStarted: js.Array[ConsoleProfileStartedEvent],
        ProfilerDotpreciseCoverageDeltaUpdate: js.Array[PreciseCoverageDeltaUpdateEvent],
        RuntimeDotbindingCalled: js.Array[BindingCalledEvent],
        RuntimeDotconsoleAPICalled: js.Array[ConsoleAPICalledEvent],
        RuntimeDotexceptionRevoked: js.Array[ExceptionRevokedEvent],
        RuntimeDotexceptionThrown: js.Array[ExceptionThrownEvent],
        RuntimeDotexecutionContextCreated: js.Array[ExecutionContextCreatedEvent],
        RuntimeDotexecutionContextDestroyed: js.Array[ExecutionContextDestroyedEvent],
        RuntimeDotexecutionContextsCleared: js.Array[Any],
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
        StorageDotinterestGroupAccessed: js.Array[InterestGroupAccessedEvent],
        StorageDotsharedStorageAccessed: js.Array[SharedStorageAccessedEvent],
        StorageDotstorageBucketCreatedOrUpdated: js.Array[StorageBucketCreatedOrUpdatedEvent],
        StorageDotstorageBucketDeleted: js.Array[StorageBucketDeletedEvent],
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
        WebAudioDotnodesDisconnected: js.Array[NodesDisconnectedEvent],
        WebAuthnDotcredentialAdded: js.Array[CredentialAddedEvent],
        WebAuthnDotcredentialAsserted: js.Array[CredentialAssertedEvent]
      ): Events = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("Accessibility.loadComplete")(AccessibilityDotloadComplete.asInstanceOf[js.Any])
        __obj.updateDynamic("Accessibility.nodesUpdated")(AccessibilityDotnodesUpdated.asInstanceOf[js.Any])
        __obj.updateDynamic("Animation.animationCanceled")(AnimationDotanimationCanceled.asInstanceOf[js.Any])
        __obj.updateDynamic("Animation.animationCreated")(AnimationDotanimationCreated.asInstanceOf[js.Any])
        __obj.updateDynamic("Animation.animationStarted")(AnimationDotanimationStarted.asInstanceOf[js.Any])
        __obj.updateDynamic("Audits.issueAdded")(AuditsDotissueAdded.asInstanceOf[js.Any])
        __obj.updateDynamic("BackgroundService.backgroundServiceEventReceived")(BackgroundServiceDotbackgroundServiceEventReceived.asInstanceOf[js.Any])
        __obj.updateDynamic("BackgroundService.recordingStateChanged")(BackgroundServiceDotrecordingStateChanged.asInstanceOf[js.Any])
        __obj.updateDynamic("Browser.downloadProgress")(BrowserDotdownloadProgress.asInstanceOf[js.Any])
        __obj.updateDynamic("Browser.downloadWillBegin")(BrowserDotdownloadWillBegin.asInstanceOf[js.Any])
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
        __obj.updateDynamic("DOM.topLayerElementsUpdated")(DOMDottopLayerElementsUpdated.asInstanceOf[js.Any])
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
        __obj.updateDynamic("DeviceAccess.deviceRequestPrompted")(DeviceAccessDotdeviceRequestPrompted.asInstanceOf[js.Any])
        __obj.updateDynamic("Emulation.virtualTimeBudgetExpired")(EmulationDotvirtualTimeBudgetExpired.asInstanceOf[js.Any])
        __obj.updateDynamic("FedCm.dialogShown")(FedCmDotdialogShown.asInstanceOf[js.Any])
        __obj.updateDynamic("Fetch.authRequired")(FetchDotauthRequired.asInstanceOf[js.Any])
        __obj.updateDynamic("Fetch.requestPaused")(FetchDotrequestPaused.asInstanceOf[js.Any])
        __obj.updateDynamic("HeapProfiler.addHeapSnapshotChunk")(HeapProfilerDotaddHeapSnapshotChunk.asInstanceOf[js.Any])
        __obj.updateDynamic("HeapProfiler.heapStatsUpdate")(HeapProfilerDotheapStatsUpdate.asInstanceOf[js.Any])
        __obj.updateDynamic("HeapProfiler.lastSeenObjectId")(HeapProfilerDotlastSeenObjectId.asInstanceOf[js.Any])
        __obj.updateDynamic("HeapProfiler.reportHeapSnapshotProgress")(HeapProfilerDotreportHeapSnapshotProgress.asInstanceOf[js.Any])
        __obj.updateDynamic("HeapProfiler.resetProfiles")(HeapProfilerDotresetProfiles.asInstanceOf[js.Any])
        __obj.updateDynamic("Input.dragIntercepted")(InputDotdragIntercepted.asInstanceOf[js.Any])
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
        __obj.updateDynamic("Network.reportingApiEndpointsChangedForOrigin")(NetworkDotreportingApiEndpointsChangedForOrigin.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.reportingApiReportAdded")(NetworkDotreportingApiReportAdded.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.reportingApiReportUpdated")(NetworkDotreportingApiReportUpdated.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.requestIntercepted")(NetworkDotrequestIntercepted.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.requestServedFromCache")(NetworkDotrequestServedFromCache.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.requestWillBeSent")(NetworkDotrequestWillBeSent.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.requestWillBeSentExtraInfo")(NetworkDotrequestWillBeSentExtraInfo.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.resourceChangedPriority")(NetworkDotresourceChangedPriority.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.responseReceived")(NetworkDotresponseReceived.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.responseReceivedExtraInfo")(NetworkDotresponseReceivedExtraInfo.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.signedExchangeReceived")(NetworkDotsignedExchangeReceived.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.subresourceWebBundleInnerResponseError")(NetworkDotsubresourceWebBundleInnerResponseError.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.subresourceWebBundleInnerResponseParsed")(NetworkDotsubresourceWebBundleInnerResponseParsed.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.subresourceWebBundleMetadataError")(NetworkDotsubresourceWebBundleMetadataError.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.subresourceWebBundleMetadataReceived")(NetworkDotsubresourceWebBundleMetadataReceived.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.trustTokenOperationDone")(NetworkDottrustTokenOperationDone.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.webSocketClosed")(NetworkDotwebSocketClosed.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.webSocketCreated")(NetworkDotwebSocketCreated.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.webSocketFrameError")(NetworkDotwebSocketFrameError.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.webSocketFrameReceived")(NetworkDotwebSocketFrameReceived.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.webSocketFrameSent")(NetworkDotwebSocketFrameSent.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.webSocketHandshakeResponseReceived")(NetworkDotwebSocketHandshakeResponseReceived.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.webSocketWillSendHandshakeRequest")(NetworkDotwebSocketWillSendHandshakeRequest.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.webTransportClosed")(NetworkDotwebTransportClosed.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.webTransportConnectionEstablished")(NetworkDotwebTransportConnectionEstablished.asInstanceOf[js.Any])
        __obj.updateDynamic("Network.webTransportCreated")(NetworkDotwebTransportCreated.asInstanceOf[js.Any])
        __obj.updateDynamic("Overlay.inspectModeCanceled")(OverlayDotinspectModeCanceled.asInstanceOf[js.Any])
        __obj.updateDynamic("Overlay.inspectNodeRequested")(OverlayDotinspectNodeRequested.asInstanceOf[js.Any])
        __obj.updateDynamic("Overlay.nodeHighlightRequested")(OverlayDotnodeHighlightRequested.asInstanceOf[js.Any])
        __obj.updateDynamic("Overlay.screenshotRequested")(OverlayDotscreenshotRequested.asInstanceOf[js.Any])
        __obj.updateDynamic("Page.backForwardCacheNotUsed")(PageDotbackForwardCacheNotUsed.asInstanceOf[js.Any])
        __obj.updateDynamic("Page.compilationCacheProduced")(PageDotcompilationCacheProduced.asInstanceOf[js.Any])
        __obj.updateDynamic("Page.documentOpened")(PageDotdocumentOpened.asInstanceOf[js.Any])
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
        __obj.updateDynamic("PerformanceTimeline.timelineEventAdded")(PerformanceTimelineDottimelineEventAdded.asInstanceOf[js.Any])
        __obj.updateDynamic("Preload.prefetchStatusUpdated")(PreloadDotprefetchStatusUpdated.asInstanceOf[js.Any])
        __obj.updateDynamic("Preload.preloadEnabledStateUpdated")(PreloadDotpreloadEnabledStateUpdated.asInstanceOf[js.Any])
        __obj.updateDynamic("Preload.preloadingAttemptSourcesUpdated")(PreloadDotpreloadingAttemptSourcesUpdated.asInstanceOf[js.Any])
        __obj.updateDynamic("Preload.prerenderAttemptCompleted")(PreloadDotprerenderAttemptCompleted.asInstanceOf[js.Any])
        __obj.updateDynamic("Preload.prerenderStatusUpdated")(PreloadDotprerenderStatusUpdated.asInstanceOf[js.Any])
        __obj.updateDynamic("Preload.ruleSetRemoved")(PreloadDotruleSetRemoved.asInstanceOf[js.Any])
        __obj.updateDynamic("Preload.ruleSetUpdated")(PreloadDotruleSetUpdated.asInstanceOf[js.Any])
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
        __obj.updateDynamic("Storage.interestGroupAccessed")(StorageDotinterestGroupAccessed.asInstanceOf[js.Any])
        __obj.updateDynamic("Storage.sharedStorageAccessed")(StorageDotsharedStorageAccessed.asInstanceOf[js.Any])
        __obj.updateDynamic("Storage.storageBucketCreatedOrUpdated")(StorageDotstorageBucketCreatedOrUpdated.asInstanceOf[js.Any])
        __obj.updateDynamic("Storage.storageBucketDeleted")(StorageDotstorageBucketDeleted.asInstanceOf[js.Any])
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
        __obj.updateDynamic("WebAuthn.credentialAdded")(WebAuthnDotcredentialAdded.asInstanceOf[js.Any])
        __obj.updateDynamic("WebAuthn.credentialAsserted")(WebAuthnDotcredentialAsserted.asInstanceOf[js.Any])
        __obj.asInstanceOf[Events]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Events] (val x: Self) extends AnyVal {
        
        inline def setAccessibilityDotloadComplete(value: js.Array[LoadCompleteEvent]): Self = StObject.set(x, "Accessibility.loadComplete", value.asInstanceOf[js.Any])
        
        inline def setAccessibilityDotloadCompleteVarargs(value: LoadCompleteEvent*): Self = StObject.set(x, "Accessibility.loadComplete", js.Array(value*))
        
        inline def setAccessibilityDotnodesUpdated(value: js.Array[NodesUpdatedEvent]): Self = StObject.set(x, "Accessibility.nodesUpdated", value.asInstanceOf[js.Any])
        
        inline def setAccessibilityDotnodesUpdatedVarargs(value: NodesUpdatedEvent*): Self = StObject.set(x, "Accessibility.nodesUpdated", js.Array(value*))
        
        inline def setAnimationDotanimationCanceled(value: js.Array[AnimationCanceledEvent]): Self = StObject.set(x, "Animation.animationCanceled", value.asInstanceOf[js.Any])
        
        inline def setAnimationDotanimationCanceledVarargs(value: AnimationCanceledEvent*): Self = StObject.set(x, "Animation.animationCanceled", js.Array(value*))
        
        inline def setAnimationDotanimationCreated(value: js.Array[AnimationCreatedEvent]): Self = StObject.set(x, "Animation.animationCreated", value.asInstanceOf[js.Any])
        
        inline def setAnimationDotanimationCreatedVarargs(value: AnimationCreatedEvent*): Self = StObject.set(x, "Animation.animationCreated", js.Array(value*))
        
        inline def setAnimationDotanimationStarted(value: js.Array[AnimationStartedEvent]): Self = StObject.set(x, "Animation.animationStarted", value.asInstanceOf[js.Any])
        
        inline def setAnimationDotanimationStartedVarargs(value: AnimationStartedEvent*): Self = StObject.set(x, "Animation.animationStarted", js.Array(value*))
        
        inline def setAuditsDotissueAdded(value: js.Array[IssueAddedEvent]): Self = StObject.set(x, "Audits.issueAdded", value.asInstanceOf[js.Any])
        
        inline def setAuditsDotissueAddedVarargs(value: IssueAddedEvent*): Self = StObject.set(x, "Audits.issueAdded", js.Array(value*))
        
        inline def setBackgroundServiceDotbackgroundServiceEventReceived(value: js.Array[BackgroundServiceEventReceivedEvent]): Self = StObject.set(x, "BackgroundService.backgroundServiceEventReceived", value.asInstanceOf[js.Any])
        
        inline def setBackgroundServiceDotbackgroundServiceEventReceivedVarargs(value: BackgroundServiceEventReceivedEvent*): Self = StObject.set(x, "BackgroundService.backgroundServiceEventReceived", js.Array(value*))
        
        inline def setBackgroundServiceDotrecordingStateChanged(value: js.Array[RecordingStateChangedEvent]): Self = StObject.set(x, "BackgroundService.recordingStateChanged", value.asInstanceOf[js.Any])
        
        inline def setBackgroundServiceDotrecordingStateChangedVarargs(value: RecordingStateChangedEvent*): Self = StObject.set(x, "BackgroundService.recordingStateChanged", js.Array(value*))
        
        inline def setBrowserDotdownloadProgress(value: js.Array[DownloadProgressEvent]): Self = StObject.set(x, "Browser.downloadProgress", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotdownloadProgressVarargs(value: DownloadProgressEvent*): Self = StObject.set(x, "Browser.downloadProgress", js.Array(value*))
        
        inline def setBrowserDotdownloadWillBegin(value: js.Array[DownloadWillBeginEvent]): Self = StObject.set(x, "Browser.downloadWillBegin", value.asInstanceOf[js.Any])
        
        inline def setBrowserDotdownloadWillBeginVarargs(value: DownloadWillBeginEvent*): Self = StObject.set(x, "Browser.downloadWillBegin", js.Array(value*))
        
        inline def setCSSDotfontsUpdated(value: js.Array[FontsUpdatedEvent]): Self = StObject.set(x, "CSS.fontsUpdated", value.asInstanceOf[js.Any])
        
        inline def setCSSDotfontsUpdatedVarargs(value: FontsUpdatedEvent*): Self = StObject.set(x, "CSS.fontsUpdated", js.Array(value*))
        
        inline def setCSSDotmediaQueryResultChanged(value: js.Array[Any]): Self = StObject.set(x, "CSS.mediaQueryResultChanged", value.asInstanceOf[js.Any])
        
        inline def setCSSDotmediaQueryResultChangedVarargs(value: Any*): Self = StObject.set(x, "CSS.mediaQueryResultChanged", js.Array(value*))
        
        inline def setCSSDotstyleSheetAdded(value: js.Array[StyleSheetAddedEvent]): Self = StObject.set(x, "CSS.styleSheetAdded", value.asInstanceOf[js.Any])
        
        inline def setCSSDotstyleSheetAddedVarargs(value: StyleSheetAddedEvent*): Self = StObject.set(x, "CSS.styleSheetAdded", js.Array(value*))
        
        inline def setCSSDotstyleSheetChanged(value: js.Array[StyleSheetChangedEvent]): Self = StObject.set(x, "CSS.styleSheetChanged", value.asInstanceOf[js.Any])
        
        inline def setCSSDotstyleSheetChangedVarargs(value: StyleSheetChangedEvent*): Self = StObject.set(x, "CSS.styleSheetChanged", js.Array(value*))
        
        inline def setCSSDotstyleSheetRemoved(value: js.Array[StyleSheetRemovedEvent]): Self = StObject.set(x, "CSS.styleSheetRemoved", value.asInstanceOf[js.Any])
        
        inline def setCSSDotstyleSheetRemovedVarargs(value: StyleSheetRemovedEvent*): Self = StObject.set(x, "CSS.styleSheetRemoved", js.Array(value*))
        
        inline def setCastDotissueUpdated(value: js.Array[IssueUpdatedEvent]): Self = StObject.set(x, "Cast.issueUpdated", value.asInstanceOf[js.Any])
        
        inline def setCastDotissueUpdatedVarargs(value: IssueUpdatedEvent*): Self = StObject.set(x, "Cast.issueUpdated", js.Array(value*))
        
        inline def setCastDotsinksUpdated(value: js.Array[SinksUpdatedEvent]): Self = StObject.set(x, "Cast.sinksUpdated", value.asInstanceOf[js.Any])
        
        inline def setCastDotsinksUpdatedVarargs(value: SinksUpdatedEvent*): Self = StObject.set(x, "Cast.sinksUpdated", js.Array(value*))
        
        inline def setConsoleDotmessageAdded(value: js.Array[MessageAddedEvent]): Self = StObject.set(x, "Console.messageAdded", value.asInstanceOf[js.Any])
        
        inline def setConsoleDotmessageAddedVarargs(value: MessageAddedEvent*): Self = StObject.set(x, "Console.messageAdded", js.Array(value*))
        
        inline def setDOMDotattributeModified(value: js.Array[AttributeModifiedEvent]): Self = StObject.set(x, "DOM.attributeModified", value.asInstanceOf[js.Any])
        
        inline def setDOMDotattributeModifiedVarargs(value: AttributeModifiedEvent*): Self = StObject.set(x, "DOM.attributeModified", js.Array(value*))
        
        inline def setDOMDotattributeRemoved(value: js.Array[AttributeRemovedEvent]): Self = StObject.set(x, "DOM.attributeRemoved", value.asInstanceOf[js.Any])
        
        inline def setDOMDotattributeRemovedVarargs(value: AttributeRemovedEvent*): Self = StObject.set(x, "DOM.attributeRemoved", js.Array(value*))
        
        inline def setDOMDotcharacterDataModified(value: js.Array[CharacterDataModifiedEvent]): Self = StObject.set(x, "DOM.characterDataModified", value.asInstanceOf[js.Any])
        
        inline def setDOMDotcharacterDataModifiedVarargs(value: CharacterDataModifiedEvent*): Self = StObject.set(x, "DOM.characterDataModified", js.Array(value*))
        
        inline def setDOMDotchildNodeCountUpdated(value: js.Array[ChildNodeCountUpdatedEvent]): Self = StObject.set(x, "DOM.childNodeCountUpdated", value.asInstanceOf[js.Any])
        
        inline def setDOMDotchildNodeCountUpdatedVarargs(value: ChildNodeCountUpdatedEvent*): Self = StObject.set(x, "DOM.childNodeCountUpdated", js.Array(value*))
        
        inline def setDOMDotchildNodeInserted(value: js.Array[ChildNodeInsertedEvent]): Self = StObject.set(x, "DOM.childNodeInserted", value.asInstanceOf[js.Any])
        
        inline def setDOMDotchildNodeInsertedVarargs(value: ChildNodeInsertedEvent*): Self = StObject.set(x, "DOM.childNodeInserted", js.Array(value*))
        
        inline def setDOMDotchildNodeRemoved(value: js.Array[ChildNodeRemovedEvent]): Self = StObject.set(x, "DOM.childNodeRemoved", value.asInstanceOf[js.Any])
        
        inline def setDOMDotchildNodeRemovedVarargs(value: ChildNodeRemovedEvent*): Self = StObject.set(x, "DOM.childNodeRemoved", js.Array(value*))
        
        inline def setDOMDotdistributedNodesUpdated(value: js.Array[DistributedNodesUpdatedEvent]): Self = StObject.set(x, "DOM.distributedNodesUpdated", value.asInstanceOf[js.Any])
        
        inline def setDOMDotdistributedNodesUpdatedVarargs(value: DistributedNodesUpdatedEvent*): Self = StObject.set(x, "DOM.distributedNodesUpdated", js.Array(value*))
        
        inline def setDOMDotdocumentUpdated(value: js.Array[Any]): Self = StObject.set(x, "DOM.documentUpdated", value.asInstanceOf[js.Any])
        
        inline def setDOMDotdocumentUpdatedVarargs(value: Any*): Self = StObject.set(x, "DOM.documentUpdated", js.Array(value*))
        
        inline def setDOMDotinlineStyleInvalidated(value: js.Array[InlineStyleInvalidatedEvent]): Self = StObject.set(x, "DOM.inlineStyleInvalidated", value.asInstanceOf[js.Any])
        
        inline def setDOMDotinlineStyleInvalidatedVarargs(value: InlineStyleInvalidatedEvent*): Self = StObject.set(x, "DOM.inlineStyleInvalidated", js.Array(value*))
        
        inline def setDOMDotpseudoElementAdded(value: js.Array[PseudoElementAddedEvent]): Self = StObject.set(x, "DOM.pseudoElementAdded", value.asInstanceOf[js.Any])
        
        inline def setDOMDotpseudoElementAddedVarargs(value: PseudoElementAddedEvent*): Self = StObject.set(x, "DOM.pseudoElementAdded", js.Array(value*))
        
        inline def setDOMDotpseudoElementRemoved(value: js.Array[PseudoElementRemovedEvent]): Self = StObject.set(x, "DOM.pseudoElementRemoved", value.asInstanceOf[js.Any])
        
        inline def setDOMDotpseudoElementRemovedVarargs(value: PseudoElementRemovedEvent*): Self = StObject.set(x, "DOM.pseudoElementRemoved", js.Array(value*))
        
        inline def setDOMDotsetChildNodes(value: js.Array[SetChildNodesEvent]): Self = StObject.set(x, "DOM.setChildNodes", value.asInstanceOf[js.Any])
        
        inline def setDOMDotsetChildNodesVarargs(value: SetChildNodesEvent*): Self = StObject.set(x, "DOM.setChildNodes", js.Array(value*))
        
        inline def setDOMDotshadowRootPopped(value: js.Array[ShadowRootPoppedEvent]): Self = StObject.set(x, "DOM.shadowRootPopped", value.asInstanceOf[js.Any])
        
        inline def setDOMDotshadowRootPoppedVarargs(value: ShadowRootPoppedEvent*): Self = StObject.set(x, "DOM.shadowRootPopped", js.Array(value*))
        
        inline def setDOMDotshadowRootPushed(value: js.Array[ShadowRootPushedEvent]): Self = StObject.set(x, "DOM.shadowRootPushed", value.asInstanceOf[js.Any])
        
        inline def setDOMDotshadowRootPushedVarargs(value: ShadowRootPushedEvent*): Self = StObject.set(x, "DOM.shadowRootPushed", js.Array(value*))
        
        inline def setDOMDottopLayerElementsUpdated(value: js.Array[Any]): Self = StObject.set(x, "DOM.topLayerElementsUpdated", value.asInstanceOf[js.Any])
        
        inline def setDOMDottopLayerElementsUpdatedVarargs(value: Any*): Self = StObject.set(x, "DOM.topLayerElementsUpdated", js.Array(value*))
        
        inline def setDOMStorageDotdomStorageItemAdded(value: js.Array[DomStorageItemAddedEvent]): Self = StObject.set(x, "DOMStorage.domStorageItemAdded", value.asInstanceOf[js.Any])
        
        inline def setDOMStorageDotdomStorageItemAddedVarargs(value: DomStorageItemAddedEvent*): Self = StObject.set(x, "DOMStorage.domStorageItemAdded", js.Array(value*))
        
        inline def setDOMStorageDotdomStorageItemRemoved(value: js.Array[DomStorageItemRemovedEvent]): Self = StObject.set(x, "DOMStorage.domStorageItemRemoved", value.asInstanceOf[js.Any])
        
        inline def setDOMStorageDotdomStorageItemRemovedVarargs(value: DomStorageItemRemovedEvent*): Self = StObject.set(x, "DOMStorage.domStorageItemRemoved", js.Array(value*))
        
        inline def setDOMStorageDotdomStorageItemUpdated(value: js.Array[DomStorageItemUpdatedEvent]): Self = StObject.set(x, "DOMStorage.domStorageItemUpdated", value.asInstanceOf[js.Any])
        
        inline def setDOMStorageDotdomStorageItemUpdatedVarargs(value: DomStorageItemUpdatedEvent*): Self = StObject.set(x, "DOMStorage.domStorageItemUpdated", js.Array(value*))
        
        inline def setDOMStorageDotdomStorageItemsCleared(value: js.Array[DomStorageItemsClearedEvent]): Self = StObject.set(x, "DOMStorage.domStorageItemsCleared", value.asInstanceOf[js.Any])
        
        inline def setDOMStorageDotdomStorageItemsClearedVarargs(value: DomStorageItemsClearedEvent*): Self = StObject.set(x, "DOMStorage.domStorageItemsCleared", js.Array(value*))
        
        inline def setDatabaseDotaddDatabase(value: js.Array[AddDatabaseEvent]): Self = StObject.set(x, "Database.addDatabase", value.asInstanceOf[js.Any])
        
        inline def setDatabaseDotaddDatabaseVarargs(value: AddDatabaseEvent*): Self = StObject.set(x, "Database.addDatabase", js.Array(value*))
        
        inline def setDebuggerDotbreakpointResolved(value: js.Array[BreakpointResolvedEvent]): Self = StObject.set(x, "Debugger.breakpointResolved", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotbreakpointResolvedVarargs(value: BreakpointResolvedEvent*): Self = StObject.set(x, "Debugger.breakpointResolved", js.Array(value*))
        
        inline def setDebuggerDotpaused(value: js.Array[PausedEvent]): Self = StObject.set(x, "Debugger.paused", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotpausedVarargs(value: PausedEvent*): Self = StObject.set(x, "Debugger.paused", js.Array(value*))
        
        inline def setDebuggerDotresumed(value: js.Array[Any]): Self = StObject.set(x, "Debugger.resumed", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotresumedVarargs(value: Any*): Self = StObject.set(x, "Debugger.resumed", js.Array(value*))
        
        inline def setDebuggerDotscriptFailedToParse(value: js.Array[ScriptFailedToParseEvent]): Self = StObject.set(x, "Debugger.scriptFailedToParse", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotscriptFailedToParseVarargs(value: ScriptFailedToParseEvent*): Self = StObject.set(x, "Debugger.scriptFailedToParse", js.Array(value*))
        
        inline def setDebuggerDotscriptParsed(value: js.Array[ScriptParsedEvent]): Self = StObject.set(x, "Debugger.scriptParsed", value.asInstanceOf[js.Any])
        
        inline def setDebuggerDotscriptParsedVarargs(value: ScriptParsedEvent*): Self = StObject.set(x, "Debugger.scriptParsed", js.Array(value*))
        
        inline def setDeviceAccessDotdeviceRequestPrompted(value: js.Array[DeviceRequestPromptedEvent]): Self = StObject.set(x, "DeviceAccess.deviceRequestPrompted", value.asInstanceOf[js.Any])
        
        inline def setDeviceAccessDotdeviceRequestPromptedVarargs(value: DeviceRequestPromptedEvent*): Self = StObject.set(x, "DeviceAccess.deviceRequestPrompted", js.Array(value*))
        
        inline def setEmulationDotvirtualTimeBudgetExpired(value: js.Array[Any]): Self = StObject.set(x, "Emulation.virtualTimeBudgetExpired", value.asInstanceOf[js.Any])
        
        inline def setEmulationDotvirtualTimeBudgetExpiredVarargs(value: Any*): Self = StObject.set(x, "Emulation.virtualTimeBudgetExpired", js.Array(value*))
        
        inline def setFedCmDotdialogShown(value: js.Array[DialogShownEvent]): Self = StObject.set(x, "FedCm.dialogShown", value.asInstanceOf[js.Any])
        
        inline def setFedCmDotdialogShownVarargs(value: DialogShownEvent*): Self = StObject.set(x, "FedCm.dialogShown", js.Array(value*))
        
        inline def setFetchDotauthRequired(value: js.Array[AuthRequiredEvent]): Self = StObject.set(x, "Fetch.authRequired", value.asInstanceOf[js.Any])
        
        inline def setFetchDotauthRequiredVarargs(value: AuthRequiredEvent*): Self = StObject.set(x, "Fetch.authRequired", js.Array(value*))
        
        inline def setFetchDotrequestPaused(value: js.Array[RequestPausedEvent]): Self = StObject.set(x, "Fetch.requestPaused", value.asInstanceOf[js.Any])
        
        inline def setFetchDotrequestPausedVarargs(value: RequestPausedEvent*): Self = StObject.set(x, "Fetch.requestPaused", js.Array(value*))
        
        inline def setHeapProfilerDotaddHeapSnapshotChunk(value: js.Array[AddHeapSnapshotChunkEvent]): Self = StObject.set(x, "HeapProfiler.addHeapSnapshotChunk", value.asInstanceOf[js.Any])
        
        inline def setHeapProfilerDotaddHeapSnapshotChunkVarargs(value: AddHeapSnapshotChunkEvent*): Self = StObject.set(x, "HeapProfiler.addHeapSnapshotChunk", js.Array(value*))
        
        inline def setHeapProfilerDotheapStatsUpdate(value: js.Array[HeapStatsUpdateEvent]): Self = StObject.set(x, "HeapProfiler.heapStatsUpdate", value.asInstanceOf[js.Any])
        
        inline def setHeapProfilerDotheapStatsUpdateVarargs(value: HeapStatsUpdateEvent*): Self = StObject.set(x, "HeapProfiler.heapStatsUpdate", js.Array(value*))
        
        inline def setHeapProfilerDotlastSeenObjectId(value: js.Array[LastSeenObjectIdEvent]): Self = StObject.set(x, "HeapProfiler.lastSeenObjectId", value.asInstanceOf[js.Any])
        
        inline def setHeapProfilerDotlastSeenObjectIdVarargs(value: LastSeenObjectIdEvent*): Self = StObject.set(x, "HeapProfiler.lastSeenObjectId", js.Array(value*))
        
        inline def setHeapProfilerDotreportHeapSnapshotProgress(value: js.Array[ReportHeapSnapshotProgressEvent]): Self = StObject.set(x, "HeapProfiler.reportHeapSnapshotProgress", value.asInstanceOf[js.Any])
        
        inline def setHeapProfilerDotreportHeapSnapshotProgressVarargs(value: ReportHeapSnapshotProgressEvent*): Self = StObject.set(x, "HeapProfiler.reportHeapSnapshotProgress", js.Array(value*))
        
        inline def setHeapProfilerDotresetProfiles(value: js.Array[Any]): Self = StObject.set(x, "HeapProfiler.resetProfiles", value.asInstanceOf[js.Any])
        
        inline def setHeapProfilerDotresetProfilesVarargs(value: Any*): Self = StObject.set(x, "HeapProfiler.resetProfiles", js.Array(value*))
        
        inline def setInputDotdragIntercepted(value: js.Array[DragInterceptedEvent]): Self = StObject.set(x, "Input.dragIntercepted", value.asInstanceOf[js.Any])
        
        inline def setInputDotdragInterceptedVarargs(value: DragInterceptedEvent*): Self = StObject.set(x, "Input.dragIntercepted", js.Array(value*))
        
        inline def setInspectorDotdetached(value: js.Array[DetachedEvent]): Self = StObject.set(x, "Inspector.detached", value.asInstanceOf[js.Any])
        
        inline def setInspectorDotdetachedVarargs(value: DetachedEvent*): Self = StObject.set(x, "Inspector.detached", js.Array(value*))
        
        inline def setInspectorDottargetCrashed(value: js.Array[Any]): Self = StObject.set(x, "Inspector.targetCrashed", value.asInstanceOf[js.Any])
        
        inline def setInspectorDottargetCrashedVarargs(value: Any*): Self = StObject.set(x, "Inspector.targetCrashed", js.Array(value*))
        
        inline def setInspectorDottargetReloadedAfterCrash(value: js.Array[Any]): Self = StObject.set(x, "Inspector.targetReloadedAfterCrash", value.asInstanceOf[js.Any])
        
        inline def setInspectorDottargetReloadedAfterCrashVarargs(value: Any*): Self = StObject.set(x, "Inspector.targetReloadedAfterCrash", js.Array(value*))
        
        inline def setLayerTreeDotlayerPainted(value: js.Array[LayerPaintedEvent]): Self = StObject.set(x, "LayerTree.layerPainted", value.asInstanceOf[js.Any])
        
        inline def setLayerTreeDotlayerPaintedVarargs(value: LayerPaintedEvent*): Self = StObject.set(x, "LayerTree.layerPainted", js.Array(value*))
        
        inline def setLayerTreeDotlayerTreeDidChange(value: js.Array[LayerTreeDidChangeEvent]): Self = StObject.set(x, "LayerTree.layerTreeDidChange", value.asInstanceOf[js.Any])
        
        inline def setLayerTreeDotlayerTreeDidChangeVarargs(value: LayerTreeDidChangeEvent*): Self = StObject.set(x, "LayerTree.layerTreeDidChange", js.Array(value*))
        
        inline def setLogDotentryAdded(value: js.Array[EntryAddedEvent]): Self = StObject.set(x, "Log.entryAdded", value.asInstanceOf[js.Any])
        
        inline def setLogDotentryAddedVarargs(value: EntryAddedEvent*): Self = StObject.set(x, "Log.entryAdded", js.Array(value*))
        
        inline def setMediaDotplayerErrorsRaised(value: js.Array[PlayerErrorsRaisedEvent]): Self = StObject.set(x, "Media.playerErrorsRaised", value.asInstanceOf[js.Any])
        
        inline def setMediaDotplayerErrorsRaisedVarargs(value: PlayerErrorsRaisedEvent*): Self = StObject.set(x, "Media.playerErrorsRaised", js.Array(value*))
        
        inline def setMediaDotplayerEventsAdded(value: js.Array[PlayerEventsAddedEvent]): Self = StObject.set(x, "Media.playerEventsAdded", value.asInstanceOf[js.Any])
        
        inline def setMediaDotplayerEventsAddedVarargs(value: PlayerEventsAddedEvent*): Self = StObject.set(x, "Media.playerEventsAdded", js.Array(value*))
        
        inline def setMediaDotplayerMessagesLogged(value: js.Array[PlayerMessagesLoggedEvent]): Self = StObject.set(x, "Media.playerMessagesLogged", value.asInstanceOf[js.Any])
        
        inline def setMediaDotplayerMessagesLoggedVarargs(value: PlayerMessagesLoggedEvent*): Self = StObject.set(x, "Media.playerMessagesLogged", js.Array(value*))
        
        inline def setMediaDotplayerPropertiesChanged(value: js.Array[PlayerPropertiesChangedEvent]): Self = StObject.set(x, "Media.playerPropertiesChanged", value.asInstanceOf[js.Any])
        
        inline def setMediaDotplayerPropertiesChangedVarargs(value: PlayerPropertiesChangedEvent*): Self = StObject.set(x, "Media.playerPropertiesChanged", js.Array(value*))
        
        inline def setMediaDotplayersCreated(value: js.Array[PlayersCreatedEvent]): Self = StObject.set(x, "Media.playersCreated", value.asInstanceOf[js.Any])
        
        inline def setMediaDotplayersCreatedVarargs(value: PlayersCreatedEvent*): Self = StObject.set(x, "Media.playersCreated", js.Array(value*))
        
        inline def setNetworkDotdataReceived(value: js.Array[DataReceivedEvent]): Self = StObject.set(x, "Network.dataReceived", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotdataReceivedVarargs(value: DataReceivedEvent*): Self = StObject.set(x, "Network.dataReceived", js.Array(value*))
        
        inline def setNetworkDoteventSourceMessageReceived(value: js.Array[EventSourceMessageReceivedEvent]): Self = StObject.set(x, "Network.eventSourceMessageReceived", value.asInstanceOf[js.Any])
        
        inline def setNetworkDoteventSourceMessageReceivedVarargs(value: EventSourceMessageReceivedEvent*): Self = StObject.set(x, "Network.eventSourceMessageReceived", js.Array(value*))
        
        inline def setNetworkDotloadingFailed(value: js.Array[LoadingFailedEvent]): Self = StObject.set(x, "Network.loadingFailed", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotloadingFailedVarargs(value: LoadingFailedEvent*): Self = StObject.set(x, "Network.loadingFailed", js.Array(value*))
        
        inline def setNetworkDotloadingFinished(value: js.Array[LoadingFinishedEvent]): Self = StObject.set(x, "Network.loadingFinished", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotloadingFinishedVarargs(value: LoadingFinishedEvent*): Self = StObject.set(x, "Network.loadingFinished", js.Array(value*))
        
        inline def setNetworkDotreportingApiEndpointsChangedForOrigin(value: js.Array[ReportingApiEndpointsChangedForOriginEvent]): Self = StObject.set(x, "Network.reportingApiEndpointsChangedForOrigin", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotreportingApiEndpointsChangedForOriginVarargs(value: ReportingApiEndpointsChangedForOriginEvent*): Self = StObject.set(x, "Network.reportingApiEndpointsChangedForOrigin", js.Array(value*))
        
        inline def setNetworkDotreportingApiReportAdded(value: js.Array[ReportingApiReportAddedEvent]): Self = StObject.set(x, "Network.reportingApiReportAdded", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotreportingApiReportAddedVarargs(value: ReportingApiReportAddedEvent*): Self = StObject.set(x, "Network.reportingApiReportAdded", js.Array(value*))
        
        inline def setNetworkDotreportingApiReportUpdated(value: js.Array[ReportingApiReportUpdatedEvent]): Self = StObject.set(x, "Network.reportingApiReportUpdated", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotreportingApiReportUpdatedVarargs(value: ReportingApiReportUpdatedEvent*): Self = StObject.set(x, "Network.reportingApiReportUpdated", js.Array(value*))
        
        inline def setNetworkDotrequestIntercepted(value: js.Array[RequestInterceptedEvent]): Self = StObject.set(x, "Network.requestIntercepted", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotrequestInterceptedVarargs(value: RequestInterceptedEvent*): Self = StObject.set(x, "Network.requestIntercepted", js.Array(value*))
        
        inline def setNetworkDotrequestServedFromCache(value: js.Array[RequestServedFromCacheEvent]): Self = StObject.set(x, "Network.requestServedFromCache", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotrequestServedFromCacheVarargs(value: RequestServedFromCacheEvent*): Self = StObject.set(x, "Network.requestServedFromCache", js.Array(value*))
        
        inline def setNetworkDotrequestWillBeSent(value: js.Array[RequestWillBeSentEvent]): Self = StObject.set(x, "Network.requestWillBeSent", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotrequestWillBeSentExtraInfo(value: js.Array[RequestWillBeSentExtraInfoEvent]): Self = StObject.set(x, "Network.requestWillBeSentExtraInfo", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotrequestWillBeSentExtraInfoVarargs(value: RequestWillBeSentExtraInfoEvent*): Self = StObject.set(x, "Network.requestWillBeSentExtraInfo", js.Array(value*))
        
        inline def setNetworkDotrequestWillBeSentVarargs(value: RequestWillBeSentEvent*): Self = StObject.set(x, "Network.requestWillBeSent", js.Array(value*))
        
        inline def setNetworkDotresourceChangedPriority(value: js.Array[ResourceChangedPriorityEvent]): Self = StObject.set(x, "Network.resourceChangedPriority", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotresourceChangedPriorityVarargs(value: ResourceChangedPriorityEvent*): Self = StObject.set(x, "Network.resourceChangedPriority", js.Array(value*))
        
        inline def setNetworkDotresponseReceived(value: js.Array[ResponseReceivedEvent]): Self = StObject.set(x, "Network.responseReceived", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotresponseReceivedExtraInfo(value: js.Array[ResponseReceivedExtraInfoEvent]): Self = StObject.set(x, "Network.responseReceivedExtraInfo", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotresponseReceivedExtraInfoVarargs(value: ResponseReceivedExtraInfoEvent*): Self = StObject.set(x, "Network.responseReceivedExtraInfo", js.Array(value*))
        
        inline def setNetworkDotresponseReceivedVarargs(value: ResponseReceivedEvent*): Self = StObject.set(x, "Network.responseReceived", js.Array(value*))
        
        inline def setNetworkDotsignedExchangeReceived(value: js.Array[SignedExchangeReceivedEvent]): Self = StObject.set(x, "Network.signedExchangeReceived", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotsignedExchangeReceivedVarargs(value: SignedExchangeReceivedEvent*): Self = StObject.set(x, "Network.signedExchangeReceived", js.Array(value*))
        
        inline def setNetworkDotsubresourceWebBundleInnerResponseError(value: js.Array[SubresourceWebBundleInnerResponseErrorEvent]): Self = StObject.set(x, "Network.subresourceWebBundleInnerResponseError", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotsubresourceWebBundleInnerResponseErrorVarargs(value: SubresourceWebBundleInnerResponseErrorEvent*): Self = StObject.set(x, "Network.subresourceWebBundleInnerResponseError", js.Array(value*))
        
        inline def setNetworkDotsubresourceWebBundleInnerResponseParsed(value: js.Array[SubresourceWebBundleInnerResponseParsedEvent]): Self = StObject.set(x, "Network.subresourceWebBundleInnerResponseParsed", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotsubresourceWebBundleInnerResponseParsedVarargs(value: SubresourceWebBundleInnerResponseParsedEvent*): Self = StObject.set(x, "Network.subresourceWebBundleInnerResponseParsed", js.Array(value*))
        
        inline def setNetworkDotsubresourceWebBundleMetadataError(value: js.Array[SubresourceWebBundleMetadataErrorEvent]): Self = StObject.set(x, "Network.subresourceWebBundleMetadataError", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotsubresourceWebBundleMetadataErrorVarargs(value: SubresourceWebBundleMetadataErrorEvent*): Self = StObject.set(x, "Network.subresourceWebBundleMetadataError", js.Array(value*))
        
        inline def setNetworkDotsubresourceWebBundleMetadataReceived(value: js.Array[SubresourceWebBundleMetadataReceivedEvent]): Self = StObject.set(x, "Network.subresourceWebBundleMetadataReceived", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotsubresourceWebBundleMetadataReceivedVarargs(value: SubresourceWebBundleMetadataReceivedEvent*): Self = StObject.set(x, "Network.subresourceWebBundleMetadataReceived", js.Array(value*))
        
        inline def setNetworkDottrustTokenOperationDone(value: js.Array[TrustTokenOperationDoneEvent]): Self = StObject.set(x, "Network.trustTokenOperationDone", value.asInstanceOf[js.Any])
        
        inline def setNetworkDottrustTokenOperationDoneVarargs(value: TrustTokenOperationDoneEvent*): Self = StObject.set(x, "Network.trustTokenOperationDone", js.Array(value*))
        
        inline def setNetworkDotwebSocketClosed(value: js.Array[WebSocketClosedEvent]): Self = StObject.set(x, "Network.webSocketClosed", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotwebSocketClosedVarargs(value: WebSocketClosedEvent*): Self = StObject.set(x, "Network.webSocketClosed", js.Array(value*))
        
        inline def setNetworkDotwebSocketCreated(value: js.Array[WebSocketCreatedEvent]): Self = StObject.set(x, "Network.webSocketCreated", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotwebSocketCreatedVarargs(value: WebSocketCreatedEvent*): Self = StObject.set(x, "Network.webSocketCreated", js.Array(value*))
        
        inline def setNetworkDotwebSocketFrameError(value: js.Array[WebSocketFrameErrorEvent]): Self = StObject.set(x, "Network.webSocketFrameError", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotwebSocketFrameErrorVarargs(value: WebSocketFrameErrorEvent*): Self = StObject.set(x, "Network.webSocketFrameError", js.Array(value*))
        
        inline def setNetworkDotwebSocketFrameReceived(value: js.Array[WebSocketFrameReceivedEvent]): Self = StObject.set(x, "Network.webSocketFrameReceived", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotwebSocketFrameReceivedVarargs(value: WebSocketFrameReceivedEvent*): Self = StObject.set(x, "Network.webSocketFrameReceived", js.Array(value*))
        
        inline def setNetworkDotwebSocketFrameSent(value: js.Array[WebSocketFrameSentEvent]): Self = StObject.set(x, "Network.webSocketFrameSent", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotwebSocketFrameSentVarargs(value: WebSocketFrameSentEvent*): Self = StObject.set(x, "Network.webSocketFrameSent", js.Array(value*))
        
        inline def setNetworkDotwebSocketHandshakeResponseReceived(value: js.Array[WebSocketHandshakeResponseReceivedEvent]): Self = StObject.set(x, "Network.webSocketHandshakeResponseReceived", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotwebSocketHandshakeResponseReceivedVarargs(value: WebSocketHandshakeResponseReceivedEvent*): Self = StObject.set(x, "Network.webSocketHandshakeResponseReceived", js.Array(value*))
        
        inline def setNetworkDotwebSocketWillSendHandshakeRequest(value: js.Array[WebSocketWillSendHandshakeRequestEvent]): Self = StObject.set(x, "Network.webSocketWillSendHandshakeRequest", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotwebSocketWillSendHandshakeRequestVarargs(value: WebSocketWillSendHandshakeRequestEvent*): Self = StObject.set(x, "Network.webSocketWillSendHandshakeRequest", js.Array(value*))
        
        inline def setNetworkDotwebTransportClosed(value: js.Array[WebTransportClosedEvent]): Self = StObject.set(x, "Network.webTransportClosed", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotwebTransportClosedVarargs(value: WebTransportClosedEvent*): Self = StObject.set(x, "Network.webTransportClosed", js.Array(value*))
        
        inline def setNetworkDotwebTransportConnectionEstablished(value: js.Array[WebTransportConnectionEstablishedEvent]): Self = StObject.set(x, "Network.webTransportConnectionEstablished", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotwebTransportConnectionEstablishedVarargs(value: WebTransportConnectionEstablishedEvent*): Self = StObject.set(x, "Network.webTransportConnectionEstablished", js.Array(value*))
        
        inline def setNetworkDotwebTransportCreated(value: js.Array[WebTransportCreatedEvent]): Self = StObject.set(x, "Network.webTransportCreated", value.asInstanceOf[js.Any])
        
        inline def setNetworkDotwebTransportCreatedVarargs(value: WebTransportCreatedEvent*): Self = StObject.set(x, "Network.webTransportCreated", js.Array(value*))
        
        inline def setOverlayDotinspectModeCanceled(value: js.Array[Any]): Self = StObject.set(x, "Overlay.inspectModeCanceled", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotinspectModeCanceledVarargs(value: Any*): Self = StObject.set(x, "Overlay.inspectModeCanceled", js.Array(value*))
        
        inline def setOverlayDotinspectNodeRequested(value: js.Array[InspectNodeRequestedEvent]): Self = StObject.set(x, "Overlay.inspectNodeRequested", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotinspectNodeRequestedVarargs(value: InspectNodeRequestedEvent*): Self = StObject.set(x, "Overlay.inspectNodeRequested", js.Array(value*))
        
        inline def setOverlayDotnodeHighlightRequested(value: js.Array[NodeHighlightRequestedEvent]): Self = StObject.set(x, "Overlay.nodeHighlightRequested", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotnodeHighlightRequestedVarargs(value: NodeHighlightRequestedEvent*): Self = StObject.set(x, "Overlay.nodeHighlightRequested", js.Array(value*))
        
        inline def setOverlayDotscreenshotRequested(value: js.Array[ScreenshotRequestedEvent]): Self = StObject.set(x, "Overlay.screenshotRequested", value.asInstanceOf[js.Any])
        
        inline def setOverlayDotscreenshotRequestedVarargs(value: ScreenshotRequestedEvent*): Self = StObject.set(x, "Overlay.screenshotRequested", js.Array(value*))
        
        inline def setPageDotbackForwardCacheNotUsed(value: js.Array[BackForwardCacheNotUsedEvent]): Self = StObject.set(x, "Page.backForwardCacheNotUsed", value.asInstanceOf[js.Any])
        
        inline def setPageDotbackForwardCacheNotUsedVarargs(value: BackForwardCacheNotUsedEvent*): Self = StObject.set(x, "Page.backForwardCacheNotUsed", js.Array(value*))
        
        inline def setPageDotcompilationCacheProduced(value: js.Array[CompilationCacheProducedEvent]): Self = StObject.set(x, "Page.compilationCacheProduced", value.asInstanceOf[js.Any])
        
        inline def setPageDotcompilationCacheProducedVarargs(value: CompilationCacheProducedEvent*): Self = StObject.set(x, "Page.compilationCacheProduced", js.Array(value*))
        
        inline def setPageDotdocumentOpened(value: js.Array[DocumentOpenedEvent]): Self = StObject.set(x, "Page.documentOpened", value.asInstanceOf[js.Any])
        
        inline def setPageDotdocumentOpenedVarargs(value: DocumentOpenedEvent*): Self = StObject.set(x, "Page.documentOpened", js.Array(value*))
        
        inline def setPageDotdomContentEventFired(value: js.Array[DomContentEventFiredEvent]): Self = StObject.set(x, "Page.domContentEventFired", value.asInstanceOf[js.Any])
        
        inline def setPageDotdomContentEventFiredVarargs(value: DomContentEventFiredEvent*): Self = StObject.set(x, "Page.domContentEventFired", js.Array(value*))
        
        inline def setPageDotdownloadProgress(value: js.Array[typings.devtoolsProtocol.mod.Protocol.Page.DownloadProgressEvent]): Self = StObject.set(x, "Page.downloadProgress", value.asInstanceOf[js.Any])
        
        inline def setPageDotdownloadProgressVarargs(value: typings.devtoolsProtocol.mod.Protocol.Page.DownloadProgressEvent*): Self = StObject.set(x, "Page.downloadProgress", js.Array(value*))
        
        inline def setPageDotdownloadWillBegin(value: js.Array[typings.devtoolsProtocol.mod.Protocol.Page.DownloadWillBeginEvent]): Self = StObject.set(x, "Page.downloadWillBegin", value.asInstanceOf[js.Any])
        
        inline def setPageDotdownloadWillBeginVarargs(value: typings.devtoolsProtocol.mod.Protocol.Page.DownloadWillBeginEvent*): Self = StObject.set(x, "Page.downloadWillBegin", js.Array(value*))
        
        inline def setPageDotfileChooserOpened(value: js.Array[FileChooserOpenedEvent]): Self = StObject.set(x, "Page.fileChooserOpened", value.asInstanceOf[js.Any])
        
        inline def setPageDotfileChooserOpenedVarargs(value: FileChooserOpenedEvent*): Self = StObject.set(x, "Page.fileChooserOpened", js.Array(value*))
        
        inline def setPageDotframeAttached(value: js.Array[FrameAttachedEvent]): Self = StObject.set(x, "Page.frameAttached", value.asInstanceOf[js.Any])
        
        inline def setPageDotframeAttachedVarargs(value: FrameAttachedEvent*): Self = StObject.set(x, "Page.frameAttached", js.Array(value*))
        
        inline def setPageDotframeClearedScheduledNavigation(value: js.Array[FrameClearedScheduledNavigationEvent]): Self = StObject.set(x, "Page.frameClearedScheduledNavigation", value.asInstanceOf[js.Any])
        
        inline def setPageDotframeClearedScheduledNavigationVarargs(value: FrameClearedScheduledNavigationEvent*): Self = StObject.set(x, "Page.frameClearedScheduledNavigation", js.Array(value*))
        
        inline def setPageDotframeDetached(value: js.Array[FrameDetachedEvent]): Self = StObject.set(x, "Page.frameDetached", value.asInstanceOf[js.Any])
        
        inline def setPageDotframeDetachedVarargs(value: FrameDetachedEvent*): Self = StObject.set(x, "Page.frameDetached", js.Array(value*))
        
        inline def setPageDotframeNavigated(value: js.Array[FrameNavigatedEvent]): Self = StObject.set(x, "Page.frameNavigated", value.asInstanceOf[js.Any])
        
        inline def setPageDotframeNavigatedVarargs(value: FrameNavigatedEvent*): Self = StObject.set(x, "Page.frameNavigated", js.Array(value*))
        
        inline def setPageDotframeRequestedNavigation(value: js.Array[FrameRequestedNavigationEvent]): Self = StObject.set(x, "Page.frameRequestedNavigation", value.asInstanceOf[js.Any])
        
        inline def setPageDotframeRequestedNavigationVarargs(value: FrameRequestedNavigationEvent*): Self = StObject.set(x, "Page.frameRequestedNavigation", js.Array(value*))
        
        inline def setPageDotframeResized(value: js.Array[Any]): Self = StObject.set(x, "Page.frameResized", value.asInstanceOf[js.Any])
        
        inline def setPageDotframeResizedVarargs(value: Any*): Self = StObject.set(x, "Page.frameResized", js.Array(value*))
        
        inline def setPageDotframeScheduledNavigation(value: js.Array[FrameScheduledNavigationEvent]): Self = StObject.set(x, "Page.frameScheduledNavigation", value.asInstanceOf[js.Any])
        
        inline def setPageDotframeScheduledNavigationVarargs(value: FrameScheduledNavigationEvent*): Self = StObject.set(x, "Page.frameScheduledNavigation", js.Array(value*))
        
        inline def setPageDotframeStartedLoading(value: js.Array[FrameStartedLoadingEvent]): Self = StObject.set(x, "Page.frameStartedLoading", value.asInstanceOf[js.Any])
        
        inline def setPageDotframeStartedLoadingVarargs(value: FrameStartedLoadingEvent*): Self = StObject.set(x, "Page.frameStartedLoading", js.Array(value*))
        
        inline def setPageDotframeStoppedLoading(value: js.Array[FrameStoppedLoadingEvent]): Self = StObject.set(x, "Page.frameStoppedLoading", value.asInstanceOf[js.Any])
        
        inline def setPageDotframeStoppedLoadingVarargs(value: FrameStoppedLoadingEvent*): Self = StObject.set(x, "Page.frameStoppedLoading", js.Array(value*))
        
        inline def setPageDotinterstitialHidden(value: js.Array[Any]): Self = StObject.set(x, "Page.interstitialHidden", value.asInstanceOf[js.Any])
        
        inline def setPageDotinterstitialHiddenVarargs(value: Any*): Self = StObject.set(x, "Page.interstitialHidden", js.Array(value*))
        
        inline def setPageDotinterstitialShown(value: js.Array[Any]): Self = StObject.set(x, "Page.interstitialShown", value.asInstanceOf[js.Any])
        
        inline def setPageDotinterstitialShownVarargs(value: Any*): Self = StObject.set(x, "Page.interstitialShown", js.Array(value*))
        
        inline def setPageDotjavascriptDialogClosed(value: js.Array[JavascriptDialogClosedEvent]): Self = StObject.set(x, "Page.javascriptDialogClosed", value.asInstanceOf[js.Any])
        
        inline def setPageDotjavascriptDialogClosedVarargs(value: JavascriptDialogClosedEvent*): Self = StObject.set(x, "Page.javascriptDialogClosed", js.Array(value*))
        
        inline def setPageDotjavascriptDialogOpening(value: js.Array[JavascriptDialogOpeningEvent]): Self = StObject.set(x, "Page.javascriptDialogOpening", value.asInstanceOf[js.Any])
        
        inline def setPageDotjavascriptDialogOpeningVarargs(value: JavascriptDialogOpeningEvent*): Self = StObject.set(x, "Page.javascriptDialogOpening", js.Array(value*))
        
        inline def setPageDotlifecycleEvent(value: js.Array[LifecycleEventEvent]): Self = StObject.set(x, "Page.lifecycleEvent", value.asInstanceOf[js.Any])
        
        inline def setPageDotlifecycleEventVarargs(value: LifecycleEventEvent*): Self = StObject.set(x, "Page.lifecycleEvent", js.Array(value*))
        
        inline def setPageDotloadEventFired(value: js.Array[LoadEventFiredEvent]): Self = StObject.set(x, "Page.loadEventFired", value.asInstanceOf[js.Any])
        
        inline def setPageDotloadEventFiredVarargs(value: LoadEventFiredEvent*): Self = StObject.set(x, "Page.loadEventFired", js.Array(value*))
        
        inline def setPageDotnavigatedWithinDocument(value: js.Array[NavigatedWithinDocumentEvent]): Self = StObject.set(x, "Page.navigatedWithinDocument", value.asInstanceOf[js.Any])
        
        inline def setPageDotnavigatedWithinDocumentVarargs(value: NavigatedWithinDocumentEvent*): Self = StObject.set(x, "Page.navigatedWithinDocument", js.Array(value*))
        
        inline def setPageDotscreencastFrame(value: js.Array[ScreencastFrameEvent]): Self = StObject.set(x, "Page.screencastFrame", value.asInstanceOf[js.Any])
        
        inline def setPageDotscreencastFrameVarargs(value: ScreencastFrameEvent*): Self = StObject.set(x, "Page.screencastFrame", js.Array(value*))
        
        inline def setPageDotscreencastVisibilityChanged(value: js.Array[ScreencastVisibilityChangedEvent]): Self = StObject.set(x, "Page.screencastVisibilityChanged", value.asInstanceOf[js.Any])
        
        inline def setPageDotscreencastVisibilityChangedVarargs(value: ScreencastVisibilityChangedEvent*): Self = StObject.set(x, "Page.screencastVisibilityChanged", js.Array(value*))
        
        inline def setPageDotwindowOpen(value: js.Array[WindowOpenEvent]): Self = StObject.set(x, "Page.windowOpen", value.asInstanceOf[js.Any])
        
        inline def setPageDotwindowOpenVarargs(value: WindowOpenEvent*): Self = StObject.set(x, "Page.windowOpen", js.Array(value*))
        
        inline def setPerformanceDotmetrics(value: js.Array[MetricsEvent]): Self = StObject.set(x, "Performance.metrics", value.asInstanceOf[js.Any])
        
        inline def setPerformanceDotmetricsVarargs(value: MetricsEvent*): Self = StObject.set(x, "Performance.metrics", js.Array(value*))
        
        inline def setPerformanceTimelineDottimelineEventAdded(value: js.Array[TimelineEventAddedEvent]): Self = StObject.set(x, "PerformanceTimeline.timelineEventAdded", value.asInstanceOf[js.Any])
        
        inline def setPerformanceTimelineDottimelineEventAddedVarargs(value: TimelineEventAddedEvent*): Self = StObject.set(x, "PerformanceTimeline.timelineEventAdded", js.Array(value*))
        
        inline def setPreloadDotprefetchStatusUpdated(value: js.Array[PrefetchStatusUpdatedEvent]): Self = StObject.set(x, "Preload.prefetchStatusUpdated", value.asInstanceOf[js.Any])
        
        inline def setPreloadDotprefetchStatusUpdatedVarargs(value: PrefetchStatusUpdatedEvent*): Self = StObject.set(x, "Preload.prefetchStatusUpdated", js.Array(value*))
        
        inline def setPreloadDotpreloadEnabledStateUpdated(value: js.Array[PreloadEnabledStateUpdatedEvent]): Self = StObject.set(x, "Preload.preloadEnabledStateUpdated", value.asInstanceOf[js.Any])
        
        inline def setPreloadDotpreloadEnabledStateUpdatedVarargs(value: PreloadEnabledStateUpdatedEvent*): Self = StObject.set(x, "Preload.preloadEnabledStateUpdated", js.Array(value*))
        
        inline def setPreloadDotpreloadingAttemptSourcesUpdated(value: js.Array[PreloadingAttemptSourcesUpdatedEvent]): Self = StObject.set(x, "Preload.preloadingAttemptSourcesUpdated", value.asInstanceOf[js.Any])
        
        inline def setPreloadDotpreloadingAttemptSourcesUpdatedVarargs(value: PreloadingAttemptSourcesUpdatedEvent*): Self = StObject.set(x, "Preload.preloadingAttemptSourcesUpdated", js.Array(value*))
        
        inline def setPreloadDotprerenderAttemptCompleted(value: js.Array[PrerenderAttemptCompletedEvent]): Self = StObject.set(x, "Preload.prerenderAttemptCompleted", value.asInstanceOf[js.Any])
        
        inline def setPreloadDotprerenderAttemptCompletedVarargs(value: PrerenderAttemptCompletedEvent*): Self = StObject.set(x, "Preload.prerenderAttemptCompleted", js.Array(value*))
        
        inline def setPreloadDotprerenderStatusUpdated(value: js.Array[PrerenderStatusUpdatedEvent]): Self = StObject.set(x, "Preload.prerenderStatusUpdated", value.asInstanceOf[js.Any])
        
        inline def setPreloadDotprerenderStatusUpdatedVarargs(value: PrerenderStatusUpdatedEvent*): Self = StObject.set(x, "Preload.prerenderStatusUpdated", js.Array(value*))
        
        inline def setPreloadDotruleSetRemoved(value: js.Array[RuleSetRemovedEvent]): Self = StObject.set(x, "Preload.ruleSetRemoved", value.asInstanceOf[js.Any])
        
        inline def setPreloadDotruleSetRemovedVarargs(value: RuleSetRemovedEvent*): Self = StObject.set(x, "Preload.ruleSetRemoved", js.Array(value*))
        
        inline def setPreloadDotruleSetUpdated(value: js.Array[RuleSetUpdatedEvent]): Self = StObject.set(x, "Preload.ruleSetUpdated", value.asInstanceOf[js.Any])
        
        inline def setPreloadDotruleSetUpdatedVarargs(value: RuleSetUpdatedEvent*): Self = StObject.set(x, "Preload.ruleSetUpdated", js.Array(value*))
        
        inline def setProfilerDotconsoleProfileFinished(value: js.Array[ConsoleProfileFinishedEvent]): Self = StObject.set(x, "Profiler.consoleProfileFinished", value.asInstanceOf[js.Any])
        
        inline def setProfilerDotconsoleProfileFinishedVarargs(value: ConsoleProfileFinishedEvent*): Self = StObject.set(x, "Profiler.consoleProfileFinished", js.Array(value*))
        
        inline def setProfilerDotconsoleProfileStarted(value: js.Array[ConsoleProfileStartedEvent]): Self = StObject.set(x, "Profiler.consoleProfileStarted", value.asInstanceOf[js.Any])
        
        inline def setProfilerDotconsoleProfileStartedVarargs(value: ConsoleProfileStartedEvent*): Self = StObject.set(x, "Profiler.consoleProfileStarted", js.Array(value*))
        
        inline def setProfilerDotpreciseCoverageDeltaUpdate(value: js.Array[PreciseCoverageDeltaUpdateEvent]): Self = StObject.set(x, "Profiler.preciseCoverageDeltaUpdate", value.asInstanceOf[js.Any])
        
        inline def setProfilerDotpreciseCoverageDeltaUpdateVarargs(value: PreciseCoverageDeltaUpdateEvent*): Self = StObject.set(x, "Profiler.preciseCoverageDeltaUpdate", js.Array(value*))
        
        inline def setRuntimeDotbindingCalled(value: js.Array[BindingCalledEvent]): Self = StObject.set(x, "Runtime.bindingCalled", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotbindingCalledVarargs(value: BindingCalledEvent*): Self = StObject.set(x, "Runtime.bindingCalled", js.Array(value*))
        
        inline def setRuntimeDotconsoleAPICalled(value: js.Array[ConsoleAPICalledEvent]): Self = StObject.set(x, "Runtime.consoleAPICalled", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotconsoleAPICalledVarargs(value: ConsoleAPICalledEvent*): Self = StObject.set(x, "Runtime.consoleAPICalled", js.Array(value*))
        
        inline def setRuntimeDotexceptionRevoked(value: js.Array[ExceptionRevokedEvent]): Self = StObject.set(x, "Runtime.exceptionRevoked", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotexceptionRevokedVarargs(value: ExceptionRevokedEvent*): Self = StObject.set(x, "Runtime.exceptionRevoked", js.Array(value*))
        
        inline def setRuntimeDotexceptionThrown(value: js.Array[ExceptionThrownEvent]): Self = StObject.set(x, "Runtime.exceptionThrown", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotexceptionThrownVarargs(value: ExceptionThrownEvent*): Self = StObject.set(x, "Runtime.exceptionThrown", js.Array(value*))
        
        inline def setRuntimeDotexecutionContextCreated(value: js.Array[ExecutionContextCreatedEvent]): Self = StObject.set(x, "Runtime.executionContextCreated", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotexecutionContextCreatedVarargs(value: ExecutionContextCreatedEvent*): Self = StObject.set(x, "Runtime.executionContextCreated", js.Array(value*))
        
        inline def setRuntimeDotexecutionContextDestroyed(value: js.Array[ExecutionContextDestroyedEvent]): Self = StObject.set(x, "Runtime.executionContextDestroyed", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotexecutionContextDestroyedVarargs(value: ExecutionContextDestroyedEvent*): Self = StObject.set(x, "Runtime.executionContextDestroyed", js.Array(value*))
        
        inline def setRuntimeDotexecutionContextsCleared(value: js.Array[Any]): Self = StObject.set(x, "Runtime.executionContextsCleared", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotexecutionContextsClearedVarargs(value: Any*): Self = StObject.set(x, "Runtime.executionContextsCleared", js.Array(value*))
        
        inline def setRuntimeDotinspectRequested(value: js.Array[InspectRequestedEvent]): Self = StObject.set(x, "Runtime.inspectRequested", value.asInstanceOf[js.Any])
        
        inline def setRuntimeDotinspectRequestedVarargs(value: InspectRequestedEvent*): Self = StObject.set(x, "Runtime.inspectRequested", js.Array(value*))
        
        inline def setSecurityDotcertificateError(value: js.Array[CertificateErrorEvent]): Self = StObject.set(x, "Security.certificateError", value.asInstanceOf[js.Any])
        
        inline def setSecurityDotcertificateErrorVarargs(value: CertificateErrorEvent*): Self = StObject.set(x, "Security.certificateError", js.Array(value*))
        
        inline def setSecurityDotsecurityStateChanged(value: js.Array[SecurityStateChangedEvent]): Self = StObject.set(x, "Security.securityStateChanged", value.asInstanceOf[js.Any])
        
        inline def setSecurityDotsecurityStateChangedVarargs(value: SecurityStateChangedEvent*): Self = StObject.set(x, "Security.securityStateChanged", js.Array(value*))
        
        inline def setSecurityDotvisibleSecurityStateChanged(value: js.Array[VisibleSecurityStateChangedEvent]): Self = StObject.set(x, "Security.visibleSecurityStateChanged", value.asInstanceOf[js.Any])
        
        inline def setSecurityDotvisibleSecurityStateChangedVarargs(value: VisibleSecurityStateChangedEvent*): Self = StObject.set(x, "Security.visibleSecurityStateChanged", js.Array(value*))
        
        inline def setServiceWorkerDotworkerErrorReported(value: js.Array[WorkerErrorReportedEvent]): Self = StObject.set(x, "ServiceWorker.workerErrorReported", value.asInstanceOf[js.Any])
        
        inline def setServiceWorkerDotworkerErrorReportedVarargs(value: WorkerErrorReportedEvent*): Self = StObject.set(x, "ServiceWorker.workerErrorReported", js.Array(value*))
        
        inline def setServiceWorkerDotworkerRegistrationUpdated(value: js.Array[WorkerRegistrationUpdatedEvent]): Self = StObject.set(x, "ServiceWorker.workerRegistrationUpdated", value.asInstanceOf[js.Any])
        
        inline def setServiceWorkerDotworkerRegistrationUpdatedVarargs(value: WorkerRegistrationUpdatedEvent*): Self = StObject.set(x, "ServiceWorker.workerRegistrationUpdated", js.Array(value*))
        
        inline def setServiceWorkerDotworkerVersionUpdated(value: js.Array[WorkerVersionUpdatedEvent]): Self = StObject.set(x, "ServiceWorker.workerVersionUpdated", value.asInstanceOf[js.Any])
        
        inline def setServiceWorkerDotworkerVersionUpdatedVarargs(value: WorkerVersionUpdatedEvent*): Self = StObject.set(x, "ServiceWorker.workerVersionUpdated", js.Array(value*))
        
        inline def setStorageDotcacheStorageContentUpdated(value: js.Array[CacheStorageContentUpdatedEvent]): Self = StObject.set(x, "Storage.cacheStorageContentUpdated", value.asInstanceOf[js.Any])
        
        inline def setStorageDotcacheStorageContentUpdatedVarargs(value: CacheStorageContentUpdatedEvent*): Self = StObject.set(x, "Storage.cacheStorageContentUpdated", js.Array(value*))
        
        inline def setStorageDotcacheStorageListUpdated(value: js.Array[CacheStorageListUpdatedEvent]): Self = StObject.set(x, "Storage.cacheStorageListUpdated", value.asInstanceOf[js.Any])
        
        inline def setStorageDotcacheStorageListUpdatedVarargs(value: CacheStorageListUpdatedEvent*): Self = StObject.set(x, "Storage.cacheStorageListUpdated", js.Array(value*))
        
        inline def setStorageDotindexedDBContentUpdated(value: js.Array[IndexedDBContentUpdatedEvent]): Self = StObject.set(x, "Storage.indexedDBContentUpdated", value.asInstanceOf[js.Any])
        
        inline def setStorageDotindexedDBContentUpdatedVarargs(value: IndexedDBContentUpdatedEvent*): Self = StObject.set(x, "Storage.indexedDBContentUpdated", js.Array(value*))
        
        inline def setStorageDotindexedDBListUpdated(value: js.Array[IndexedDBListUpdatedEvent]): Self = StObject.set(x, "Storage.indexedDBListUpdated", value.asInstanceOf[js.Any])
        
        inline def setStorageDotindexedDBListUpdatedVarargs(value: IndexedDBListUpdatedEvent*): Self = StObject.set(x, "Storage.indexedDBListUpdated", js.Array(value*))
        
        inline def setStorageDotinterestGroupAccessed(value: js.Array[InterestGroupAccessedEvent]): Self = StObject.set(x, "Storage.interestGroupAccessed", value.asInstanceOf[js.Any])
        
        inline def setStorageDotinterestGroupAccessedVarargs(value: InterestGroupAccessedEvent*): Self = StObject.set(x, "Storage.interestGroupAccessed", js.Array(value*))
        
        inline def setStorageDotsharedStorageAccessed(value: js.Array[SharedStorageAccessedEvent]): Self = StObject.set(x, "Storage.sharedStorageAccessed", value.asInstanceOf[js.Any])
        
        inline def setStorageDotsharedStorageAccessedVarargs(value: SharedStorageAccessedEvent*): Self = StObject.set(x, "Storage.sharedStorageAccessed", js.Array(value*))
        
        inline def setStorageDotstorageBucketCreatedOrUpdated(value: js.Array[StorageBucketCreatedOrUpdatedEvent]): Self = StObject.set(x, "Storage.storageBucketCreatedOrUpdated", value.asInstanceOf[js.Any])
        
        inline def setStorageDotstorageBucketCreatedOrUpdatedVarargs(value: StorageBucketCreatedOrUpdatedEvent*): Self = StObject.set(x, "Storage.storageBucketCreatedOrUpdated", js.Array(value*))
        
        inline def setStorageDotstorageBucketDeleted(value: js.Array[StorageBucketDeletedEvent]): Self = StObject.set(x, "Storage.storageBucketDeleted", value.asInstanceOf[js.Any])
        
        inline def setStorageDotstorageBucketDeletedVarargs(value: StorageBucketDeletedEvent*): Self = StObject.set(x, "Storage.storageBucketDeleted", js.Array(value*))
        
        inline def setTargetDotattachedToTarget(value: js.Array[AttachedToTargetEvent]): Self = StObject.set(x, "Target.attachedToTarget", value.asInstanceOf[js.Any])
        
        inline def setTargetDotattachedToTargetVarargs(value: AttachedToTargetEvent*): Self = StObject.set(x, "Target.attachedToTarget", js.Array(value*))
        
        inline def setTargetDotdetachedFromTarget(value: js.Array[DetachedFromTargetEvent]): Self = StObject.set(x, "Target.detachedFromTarget", value.asInstanceOf[js.Any])
        
        inline def setTargetDotdetachedFromTargetVarargs(value: DetachedFromTargetEvent*): Self = StObject.set(x, "Target.detachedFromTarget", js.Array(value*))
        
        inline def setTargetDotreceivedMessageFromTarget(value: js.Array[ReceivedMessageFromTargetEvent]): Self = StObject.set(x, "Target.receivedMessageFromTarget", value.asInstanceOf[js.Any])
        
        inline def setTargetDotreceivedMessageFromTargetVarargs(value: ReceivedMessageFromTargetEvent*): Self = StObject.set(x, "Target.receivedMessageFromTarget", js.Array(value*))
        
        inline def setTargetDottargetCrashed(value: js.Array[TargetCrashedEvent]): Self = StObject.set(x, "Target.targetCrashed", value.asInstanceOf[js.Any])
        
        inline def setTargetDottargetCrashedVarargs(value: TargetCrashedEvent*): Self = StObject.set(x, "Target.targetCrashed", js.Array(value*))
        
        inline def setTargetDottargetCreated(value: js.Array[TargetCreatedEvent]): Self = StObject.set(x, "Target.targetCreated", value.asInstanceOf[js.Any])
        
        inline def setTargetDottargetCreatedVarargs(value: TargetCreatedEvent*): Self = StObject.set(x, "Target.targetCreated", js.Array(value*))
        
        inline def setTargetDottargetDestroyed(value: js.Array[TargetDestroyedEvent]): Self = StObject.set(x, "Target.targetDestroyed", value.asInstanceOf[js.Any])
        
        inline def setTargetDottargetDestroyedVarargs(value: TargetDestroyedEvent*): Self = StObject.set(x, "Target.targetDestroyed", js.Array(value*))
        
        inline def setTargetDottargetInfoChanged(value: js.Array[TargetInfoChangedEvent]): Self = StObject.set(x, "Target.targetInfoChanged", value.asInstanceOf[js.Any])
        
        inline def setTargetDottargetInfoChangedVarargs(value: TargetInfoChangedEvent*): Self = StObject.set(x, "Target.targetInfoChanged", js.Array(value*))
        
        inline def setTetheringDotaccepted(value: js.Array[AcceptedEvent]): Self = StObject.set(x, "Tethering.accepted", value.asInstanceOf[js.Any])
        
        inline def setTetheringDotacceptedVarargs(value: AcceptedEvent*): Self = StObject.set(x, "Tethering.accepted", js.Array(value*))
        
        inline def setTracingDotbufferUsage(value: js.Array[BufferUsageEvent]): Self = StObject.set(x, "Tracing.bufferUsage", value.asInstanceOf[js.Any])
        
        inline def setTracingDotbufferUsageVarargs(value: BufferUsageEvent*): Self = StObject.set(x, "Tracing.bufferUsage", js.Array(value*))
        
        inline def setTracingDotdataCollected(value: js.Array[DataCollectedEvent]): Self = StObject.set(x, "Tracing.dataCollected", value.asInstanceOf[js.Any])
        
        inline def setTracingDotdataCollectedVarargs(value: DataCollectedEvent*): Self = StObject.set(x, "Tracing.dataCollected", js.Array(value*))
        
        inline def setTracingDottracingComplete(value: js.Array[TracingCompleteEvent]): Self = StObject.set(x, "Tracing.tracingComplete", value.asInstanceOf[js.Any])
        
        inline def setTracingDottracingCompleteVarargs(value: TracingCompleteEvent*): Self = StObject.set(x, "Tracing.tracingComplete", js.Array(value*))
        
        inline def setWebAudioDotaudioListenerCreated(value: js.Array[AudioListenerCreatedEvent]): Self = StObject.set(x, "WebAudio.audioListenerCreated", value.asInstanceOf[js.Any])
        
        inline def setWebAudioDotaudioListenerCreatedVarargs(value: AudioListenerCreatedEvent*): Self = StObject.set(x, "WebAudio.audioListenerCreated", js.Array(value*))
        
        inline def setWebAudioDotaudioListenerWillBeDestroyed(value: js.Array[AudioListenerWillBeDestroyedEvent]): Self = StObject.set(x, "WebAudio.audioListenerWillBeDestroyed", value.asInstanceOf[js.Any])
        
        inline def setWebAudioDotaudioListenerWillBeDestroyedVarargs(value: AudioListenerWillBeDestroyedEvent*): Self = StObject.set(x, "WebAudio.audioListenerWillBeDestroyed", js.Array(value*))
        
        inline def setWebAudioDotaudioNodeCreated(value: js.Array[AudioNodeCreatedEvent]): Self = StObject.set(x, "WebAudio.audioNodeCreated", value.asInstanceOf[js.Any])
        
        inline def setWebAudioDotaudioNodeCreatedVarargs(value: AudioNodeCreatedEvent*): Self = StObject.set(x, "WebAudio.audioNodeCreated", js.Array(value*))
        
        inline def setWebAudioDotaudioNodeWillBeDestroyed(value: js.Array[AudioNodeWillBeDestroyedEvent]): Self = StObject.set(x, "WebAudio.audioNodeWillBeDestroyed", value.asInstanceOf[js.Any])
        
        inline def setWebAudioDotaudioNodeWillBeDestroyedVarargs(value: AudioNodeWillBeDestroyedEvent*): Self = StObject.set(x, "WebAudio.audioNodeWillBeDestroyed", js.Array(value*))
        
        inline def setWebAudioDotaudioParamCreated(value: js.Array[AudioParamCreatedEvent]): Self = StObject.set(x, "WebAudio.audioParamCreated", value.asInstanceOf[js.Any])
        
        inline def setWebAudioDotaudioParamCreatedVarargs(value: AudioParamCreatedEvent*): Self = StObject.set(x, "WebAudio.audioParamCreated", js.Array(value*))
        
        inline def setWebAudioDotaudioParamWillBeDestroyed(value: js.Array[AudioParamWillBeDestroyedEvent]): Self = StObject.set(x, "WebAudio.audioParamWillBeDestroyed", value.asInstanceOf[js.Any])
        
        inline def setWebAudioDotaudioParamWillBeDestroyedVarargs(value: AudioParamWillBeDestroyedEvent*): Self = StObject.set(x, "WebAudio.audioParamWillBeDestroyed", js.Array(value*))
        
        inline def setWebAudioDotcontextChanged(value: js.Array[ContextChangedEvent]): Self = StObject.set(x, "WebAudio.contextChanged", value.asInstanceOf[js.Any])
        
        inline def setWebAudioDotcontextChangedVarargs(value: ContextChangedEvent*): Self = StObject.set(x, "WebAudio.contextChanged", js.Array(value*))
        
        inline def setWebAudioDotcontextCreated(value: js.Array[ContextCreatedEvent]): Self = StObject.set(x, "WebAudio.contextCreated", value.asInstanceOf[js.Any])
        
        inline def setWebAudioDotcontextCreatedVarargs(value: ContextCreatedEvent*): Self = StObject.set(x, "WebAudio.contextCreated", js.Array(value*))
        
        inline def setWebAudioDotcontextWillBeDestroyed(value: js.Array[ContextWillBeDestroyedEvent]): Self = StObject.set(x, "WebAudio.contextWillBeDestroyed", value.asInstanceOf[js.Any])
        
        inline def setWebAudioDotcontextWillBeDestroyedVarargs(value: ContextWillBeDestroyedEvent*): Self = StObject.set(x, "WebAudio.contextWillBeDestroyed", js.Array(value*))
        
        inline def setWebAudioDotnodeParamConnected(value: js.Array[NodeParamConnectedEvent]): Self = StObject.set(x, "WebAudio.nodeParamConnected", value.asInstanceOf[js.Any])
        
        inline def setWebAudioDotnodeParamConnectedVarargs(value: NodeParamConnectedEvent*): Self = StObject.set(x, "WebAudio.nodeParamConnected", js.Array(value*))
        
        inline def setWebAudioDotnodeParamDisconnected(value: js.Array[NodeParamDisconnectedEvent]): Self = StObject.set(x, "WebAudio.nodeParamDisconnected", value.asInstanceOf[js.Any])
        
        inline def setWebAudioDotnodeParamDisconnectedVarargs(value: NodeParamDisconnectedEvent*): Self = StObject.set(x, "WebAudio.nodeParamDisconnected", js.Array(value*))
        
        inline def setWebAudioDotnodesConnected(value: js.Array[NodesConnectedEvent]): Self = StObject.set(x, "WebAudio.nodesConnected", value.asInstanceOf[js.Any])
        
        inline def setWebAudioDotnodesConnectedVarargs(value: NodesConnectedEvent*): Self = StObject.set(x, "WebAudio.nodesConnected", js.Array(value*))
        
        inline def setWebAudioDotnodesDisconnected(value: js.Array[NodesDisconnectedEvent]): Self = StObject.set(x, "WebAudio.nodesDisconnected", value.asInstanceOf[js.Any])
        
        inline def setWebAudioDotnodesDisconnectedVarargs(value: NodesDisconnectedEvent*): Self = StObject.set(x, "WebAudio.nodesDisconnected", js.Array(value*))
        
        inline def setWebAuthnDotcredentialAdded(value: js.Array[CredentialAddedEvent]): Self = StObject.set(x, "WebAuthn.credentialAdded", value.asInstanceOf[js.Any])
        
        inline def setWebAuthnDotcredentialAddedVarargs(value: CredentialAddedEvent*): Self = StObject.set(x, "WebAuthn.credentialAdded", js.Array(value*))
        
        inline def setWebAuthnDotcredentialAsserted(value: js.Array[CredentialAssertedEvent]): Self = StObject.set(x, "WebAuthn.credentialAsserted", value.asInstanceOf[js.Any])
        
        inline def setWebAuthnDotcredentialAssertedVarargs(value: CredentialAssertedEvent*): Self = StObject.set(x, "WebAuthn.credentialAsserted", js.Array(value*))
      }
    }
  }
}
